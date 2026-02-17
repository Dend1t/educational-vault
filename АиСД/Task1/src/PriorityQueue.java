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

    static class Element {
        public int order;
        public Object data;

        public Element(int o, Object d) {
            this.order = o;
            this.data = d;
        }

        public String toString() {
            return this.order + ": " + this.data;
        }
    }

    private final Comparator comparator = new SortByPriority();
    private LinkedList<Element> queue = new LinkedList<Element>();

    public void printThisQueue() {
        for (Element i : this.queue) {
            System.out.println();
        }
    }


    public void insert(int priority, Object data) {
        for (Element i : this.queue) {
            if (i.order == priority) {
                //System.out.println("Priority is in queue.");
                return;
            }
        }
        this.queue.add(new Element(priority, data));
        this.queue.sort(comparator);
    }

    public String extract_minimum() {
        if (this.queue.isEmpty()) {
            return "Queue is empty.";
        } else {
            Element i = this.queue.getFirst();
            this.queue.removeFirst();
            return i.toString();
        }
    }

    public int length() {
        return this.queue.size();
    }
}
