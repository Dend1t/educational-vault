import java.util.Scanner;

public class Program {
    public static int n = 5;

    public static void main(String[] args) {
        for (int r = 0; r < n; r++) {
            if (r == 0 || r == n - 1) {
                for (int c = 0; c < n; c++) {
                    if (c == 0 || c == n - 1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print("-");
                    }
                }
            }
            else {
                for (int c = 0; c < n; c++) {
                    if (c == 0 || c == n - 1) {
                        System.out.print("|");
                    }
                    else if(c == n-1 - r){
                        System.out.print("/");
                    }
                    else if(c > n-1 - r){
                        System.out.print("a");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}