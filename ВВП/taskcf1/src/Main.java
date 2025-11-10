import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            candy(scanner.nextInt());
        }
    }


    public static void candy(int t) {
        int a = 0;
        while ((t+a) % 3 != 0) {
            a++;
        }
        System.out.println(a);
    }
}
