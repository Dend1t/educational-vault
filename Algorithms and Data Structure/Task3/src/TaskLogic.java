import javax.swing.JTextArea;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.Random;

public class TaskLogic {
    static class SortByArrival implements Comparator {
        public int compare(Object o1, Object o2) {
            Buyer b1 = (Buyer) o1;
            Buyer b2 = (Buyer) o2;

            if (o1 == null) {
                return 1;
            }
            if (o2 == null) {
                return -1;
            }

            if (b1.a == b2.a)
                return 0;
            return b1.a > b2.a ? 1 : -1;
        }
    }

    static public ArrayList<Buyer> buyers = new ArrayList<Buyer>();

    static void addBuyer(Integer id, Integer s, Integer t, Integer n){
        buyers.add(new Buyer(id, s, t, n));
    }

    static void solve(Deque<Buyer> queue, JTextArea textArea) {
        buyers.sort(new SortByArrival());

        queue.addAll(buyers);
        buyers.clear();

        int currentTime = 0;

        while (!queue.isEmpty()) {
            Buyer currentBuyer = queue.poll();

            int startTime = Math.max(currentBuyer.a, currentTime);

            currentBuyer.q = startTime + currentBuyer.n;
            currentTime = currentBuyer.q;

            textArea.append(currentBuyer + "\n");
            textArea.append("--------------------------------\n");
        }
    }
}