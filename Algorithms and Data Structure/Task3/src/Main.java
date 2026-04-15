import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Deque<Integer> standardQueue = new ArrayDeque<Integer>();

        Deque<Integer> myQueue = new SimpleDeque<Integer>();

        // Теперь можем передавать в один и тот же метод и стандартные и свои
        // реализации. Метод не знает что именно мы ему передали, т.к. работает через
        // интерфейс
        TaskLogic.solve(standardQueue);
        TaskLogic.solve(myQueue);
        new Buyer(2, 2, 2, 2).print();

        // Теперь можем передавать в один и тот же метод и стандартные и свои
        // реализации. Метод не знает что именно мы ему передали, т.к. работает через
        // интерфейс
        TaskLogic.solve(standardQueue);
        TaskLogic.solve(myQueue);
    }
}
