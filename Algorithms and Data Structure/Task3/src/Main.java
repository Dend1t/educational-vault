import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Deque<Buyer> standardQueue = new ArrayDeque<Buyer>();

        Deque<Buyer> myQueue = new SimpleDeque<Buyer>();

        // Теперь можем передавать в один и тот же метод и стандартные и свои
        // реализации. Метод не знает что именно мы ему передали, т.к. работает через
        // интерфейс
        TaskLogic.solve(standardQueue);
        TaskLogic.solve(myQueue);
        
        new Buyer(2, 2, 2, 2).print();
    }
}
