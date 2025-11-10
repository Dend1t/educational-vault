import java.util.Scanner;
public class Program {
    static class SumOfSeries {
        double nItems = 0;
        double greaterE = 0;
        double greaterE10 = 0;
        double formula = 0;
    }
    public static void main(String[] args) {
        // Реализуйте ввод и вывод данных для пользователя. Вызывайте функцию calcSum
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter numbers x, n, e: ");
        double x = scanner.nextDouble();
        int n = scanner.nextInt();
        double e = scanner.nextDouble();
        SumOfSeries result = calcSum(x,n,e);
        System.out.println("1) " + result.nItems);
        System.out.println("2) " + result.greaterE);
        System.out.println("3) " + result.greaterE10);
        System.out.println("4) " + result.formula);
    }

    static SumOfSeries calcSum(double x, int n, double e) {
        // Напишите код вычисления суммы
        double e10 = e/10;
        SumOfSeries result = new SumOfSeries();
        result.nItems = 0;
        result.greaterE = 0;
        result.greaterE10 = 0;
        int i = 0;
        double term = (i*(i+1)/2)*Math.pow(-x,i-1);
        for(i = 0; n>=i-1 || Math.abs(term)>e || Math.abs(term)>e/10 || i<100000; i++){
            if(n >= i-1){
                result.nItems+=term;
            }
            if(Math.abs(term)>e){
                result.greaterE+=term;
            }

            if(Math.abs(term)>e/10) {
                result.greaterE10 += term;
            }
            term = (i*(i+1)/2)*Math.pow(-x,i-1);
            if(i>10000) {
                result.formula = 1/Math.pow(1+x, 3);
                return result;
            }
        }
        return result;
    }
}

    }
}

