import java.util.Deque;

public class TaskLogic {

    // Метод который решает вашу задачу
    // Демонстрация работы со стеком и очередью
    static void solve(Deque<Integer> queue) {
        // Добавляем элементы в очередь
        queue.add(100);
        queue.add(200);
        queue.add(300);

        // Удаляем и выводим элементы из очереди
        System.out.println("Queue poll: " + queue.poll());
        System.out.println("Queue poll: " + queue.poll());
    }
}
