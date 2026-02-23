import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class PriorityQueue<T> {
    static class SortByPriority implements Comparator {
        public int compare(Object o1, Object o2) {
            Element element1 = (Element) o1;
            Element element2 = (Element) o2;

            if (o1 == null) {
                return 1;
            }
            if (o2 == null) {
                return -1;
            }

            if (element1.order == element2.order) return 0;
            return element1.order > element2.order ? 1 : -1;
        }
    }


    private static class Element<D> {
        public int order;
        D data;

        public Element(int o, D d) {
            this.order = o;
            this.data = d;
        }

        public D getData() {
            return data;
        }

        public String toString() {
            return this.order + ": " + this.data;
        }
    }

    private final Comparator comparator = new SortByPriority();
    private int lastIndex = 0;
    int queueCapacity = 8;
    private Element[] queue = new Element[queueCapacity];


    public void printThisQueue() {
        for (Element i : this.queue) {
            System.out.println(i.toString());
        }
    }


    public void insert(int priority, T data) {
        int low = 0;
        int high = lastIndex - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (this.queue[mid].order < priority) {
                low = mid + 1;
            } else if (this.queue[mid].order > priority) {
                high = mid - 1;
            } else if (this.queue[mid].order == priority) {
//                System.out.println("Priority is in queue.");
                return;
            }
        }
        this.queue[lastIndex] = new Element(priority, data);
        Arrays.sort(queue, comparator);
        lastIndex++;
        if (queueCapacity == lastIndex) {
            queueCapacity *= 2;
            queue = Arrays.copyOf(queue, queueCapacity);
        }
    }

    public T extract_minimum() {
        if (lastIndex == 0) {
            return null;
        } else {
            lastIndex--;
            Element i = this.queue[0];
            this.queue[0] = null;
            Arrays.sort(queue, comparator);
            return (T) i.getData();
        }
    }

    public int length() {
        return lastIndex;
    }
}
