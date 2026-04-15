import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.Random;

public class TaskLogic {
    static class SortByAverageTime implements Comparator{
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
    static final Comparator comparator = new SortByAverageTime();
    
    
    static void addBuyer(Integer id, Integer s, Integer t, Integer n){
        buyers.addLast(new Buyer(id, s, t, n));
    }

    static void solve(Deque<Buyer> queue) {
        // Добавляем элементы в стек
        Random random = new Random();
        for(int i = 0; i < 5; i++){
            buyers.addLast(new Buyer(i, random.nextInt(10), random.nextInt(10), random.nextInt(10)));
        }
        buyers.sort(comparator);

        for(int i = 0; i < 5; i++){
            queue.add(buyers.get(i));
        }

        // Удаляем и выводим элементы из очереди
        for(int i = 0; i < 5; i++){
            System.out.println("Queue poll: " + queue.poll());
        }
    }
}
