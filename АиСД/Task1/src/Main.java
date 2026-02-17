import javax.lang.model.element.Element;
import java.util.Random;

void main(String[] args) {

    Random random = new Random();
    PriorityQueue queue = new PriorityQueue();

    System.out.println("Char test");
    for (int i = 0; i < 10; i++) {
        queue.insert(random.nextInt(10), (char) ((int) 'a' + random.nextInt(10)));
    }
    int a = queue.length();
    for (int i = 0; i < a; i++) {
        System.out.println(queue.extract_minimum());
    }
    System.out.println();

    System.out.println("Int test");
    for (int i = 0; i < 10; i++) {
        queue.insert(random.nextInt(10), random.nextInt(10));
    }
    a = queue.length();
    for (int i = 0; i < a; i++) {
        System.out.println(queue.extract_minimum());
    }
    System.out.println();

    System.out.println("Float test");
    for (int i = 0; i < 10; i++) {
        queue.insert(random.nextInt(10), random.nextFloat(10));
    }
    a = queue.length();
    for (int i = 0; i < a; i++) {
        System.out.println(queue.extract_minimum());
    }
    System.out.println();

    System.out.println("Random elements test");
    for (int i = 0; i < 10; i++) {
        int b = random.nextInt(3);
        switch (b) {
            case 0:
                queue.insert(random.nextInt(10), random.nextInt(10));
                break;
            case 1:
                queue.insert(random.nextInt(10), (char) ((int) 'a' + random.nextInt(10)));
                break;
            case 2:
                queue.insert(random.nextInt(10), random.nextFloat());
                break;
        }
    }
    a = queue.length();
    for (int i = 0; i < a; i++) {
        System.out.println(queue.extract_minimum());
    }
}
