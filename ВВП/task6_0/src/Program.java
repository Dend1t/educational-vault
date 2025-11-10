import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers x, n, e: ");
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        double e = scanner.nextDouble();
        double e10 = e/10;

        float res1 = 0;
        float res2 = 0;
        float res3 = 0;
        int i = 1;
        double term = (i*(i+1)/2)*Math.pow(-x,i-1);
        System.out.println(term);
        while(Math.abs(term)>e/10 || n>=i || Math.abs(term)>e || i<100000){
            if(n >= i){
                res1+=term;
            }
            if(Math.abs(term)>e){
                res2+=term;
            }

            if(Math.abs(term)>e/10) {
                res3 += term;
            }
            i++;
            term = (i*(i+1)/2)*Math.pow(-x,i-1);
            System.out.println(term);
        }
        i
        double res4 = 1/Math.pow(1+x, 3);
        System.out.println("1) " + res1);
        System.out.println("2) " + res2);
        System.out.println("3) " + res3);
        System.out.println("4) " + res4);
    }
}
