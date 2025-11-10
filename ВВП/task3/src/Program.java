import java.util.Scanner;

public class Program {
    // Соответствуют первому варианту задачи
    public static final VerticalParabola P1 = new VerticalParabola(-3, -3, 0.5);
    public static final VerticalParabola P2 = new VerticalParabola(-6, 4, -0.25);
    public static final Circle C1 = new Circle(1, -3, 3);
    public static final Circle C2 = new Circle(0, -3, 5);



    public static SimpleColor getColor(double x, double y) {


        if (P1.isPointUnder(x, y)) {
            if (C2.isPointIn(x, y)& !C1.isPointIn(x, y) & !P2.isPointUnder(x, y)){
                return SimpleColor.GRAY;}
            else if (C2.isPointIn(x, y) & C1.isPointIn(x, y) & P2.isPointUnder(x, y)){
                return SimpleColor.BLUE ;
            }
            else if (!C2.isPointIn(x, y) & !C1.isPointIn(x, y) & !P2.isPointUnder(x, y)){
                return SimpleColor.ORANGE;
            }
        }
        else {
            if (C2.isPointIn(x, y) & C1.isPointIn(x, y) & P2.isPointUnder(x, y)){
                return SimpleColor.ORANGE ;
            }
            else if (C2.isPointIn(x, y) & !C1.isPointIn(x, y) & P2.isPointUnder(x, y)){
                return SimpleColor.GREEN;
            }
            else if (!C2.isPointIn(x, y) & !C1.isPointIn(x, y) & P2.isPointUnder(x, y)){
                return SimpleColor.ORANGE;
            }
            else if (C2.isPointIn(x, y) & C1.isPointIn(x, y) & !P2.isPointUnder(x, y)){
                return SimpleColor.GREEN;
            }
            else if (C2.isPointIn(x, y) & !C1.isPointIn(x, y) & !P2.isPointUnder(x, y)){
                return SimpleColor.BLUE;
            }
            else if (!C2.isPointIn(x, y) & !C1.isPointIn(x, y) & !P2.isPointUnder(x, y)){
                if(x>-1){
                    return SimpleColor.BLUE;
                }
                else {return SimpleColor.WHITE;}
            }

        }
        return SimpleColor.WHITE;

    }

    public static void printColorForPoint(double x, double y) {
        SimpleColor color = getColor(x,y);
            System.out.printf("(%.4f, %.4f) -> %s%n", x, y, color);
    }
//
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        printColorForPoint(10,1); //Blue
        printColorForPoint(-1,8); //Orange
        printColorForPoint(1,-3); //Green
        printColorForPoint(-1,1); //Gray
        printColorForPoint(-3,0); //White

        double x = scan.nextDouble();
        double y = scan.nextDouble();

        printColorForPoint(x,y);
    }
}
