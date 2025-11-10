public class Program {

    public static void main(String[] args) {
        calcPifNum();
    }

    public static void calcPifNum() {
        for (int a = 1; a < 19; a++) {
            for (int b = 1; b < a; b++) {
                double c = (Math.pow(a, 2) + Math.pow(b, 2));
                if (Math.pow(c, 0.5) % 1 == 0 && Math.pow(c, 0.5) <= 20)
                    System.out.println(a + " + " + b + " = " + Math.pow(c, 0.5));
            }
        }
    }
}