import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        drawFigure(w,h);
    }

    public static void drawFigure(int w, int h) {
        int directChangeId;
        directChangeId = h / 2;
        char inFigure;
        boolean directWasChanged;
        boolean spaceSlashCondition;
        for (int i = 0; i < h; i++) {
            if (i == 0 || i == h - 1) {
                for (int x = 0; x < w; x++) {
                    if (x == 0 || x == w - 1) {
                        System.out.print('*');
                    } else {
                        System.out.print('-');
                    }
                }
            } else {
                for (int x = 0; x < w; x++) {
                    directWasChanged = i >= directChangeId;
                    spaceSlashCondition = x % 2 == 0 && i % 2 != 0 || x % 2 != 0 && i % 2 == 0;
                    if (x == 0 || x == w - 1) {
                        System.out.print('|');
                    } else {
                        if (!directWasChanged && spaceSlashCondition || directWasChanged && !spaceSlashCondition) {
                            inFigure = ' ';
                        } else if (!directWasChanged) {
                            inFigure = '\\';
                        } else {
                            inFigure = '/';
                        }
                        System.out.print(inFigure);
                    }
                }
            }
            System.out.println();
        }
    }
}
