import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;

public class PriorityQueue {
    static class SortByPriority implements Comparator {
        public int compare(Object o1, Object o2) {
            Element element1 = (Element) o1;
            Element element2 = (Element) o2;

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

        public String toString() {
            return this.order + ": " + this.data;
        }
    }

    private final Comparator comparator = new SortByPriority();
    private Element[] queue = new Element[0];

    public void printThisQueue() {
        for (Element i : this.queue) {
            System.out.println(i.toString());
        }
    }


    public void insert(int priority, Object data) {
        for (Element i : this.queue) {
            if (i.order == priority) {
                //System.out.println("Priority is in queue.");
                return;
            }
        }
        this.queue = Arrays.copyOf(queue,queue.length+1);
        this.queue[queue.length-1] = new Element(priority,data);
        Arrays.sort(queue, comparator);
    }

    public String extract_minimum() {
        if (this.queue.length == 0) {
            return "Queue is empty.";
        } else {
            Element i = this.queue[0];
            this.queue = Arrays.copyOfRange(queue,1,queue.length);
            return i.toString();
        }
    }

    public int length() {
        return this.queue.length;
    }
}
