import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String eggSize = scanner.nextLine();
        String eggColour = scanner.nextLine();
        double eggBox = Double.parseDouble(scanner.nextLine());
        double spending = 0;
        if (eggSize.equals("Large")) {
            if (eggColour.equals("Red")) {
                eggBox = eggBox * 16;
                spending = eggBox * 0.35;
                eggBox = eggBox - spending;
                System.out.printf("%.2f leva.", eggBox);
            } else if (eggColour.equals("Green")) {
                eggBox = eggBox * 12;
                spending = eggBox * 0.35;
                eggBox = eggBox - spending;
                System.out.printf("%.2f leva.", eggBox);
            } else if (eggColour.equals("Yellow")) {
                eggBox = eggBox * 9;
                spending = eggBox * 0.35;
                eggBox = eggBox - spending;
                System.out.printf("%.2f leva.", eggBox);
            }
        }
        if (eggSize.equals("Medium")) {
            if (eggColour.equals("Red")) {
                eggBox = eggBox * 13;
                spending = eggBox * 0.35;
                eggBox = eggBox - spending;
                System.out.printf("%.2f leva.", eggBox);
            } else if (eggColour.equals("Green")) {
                eggBox = eggBox * 9;
                spending = eggBox * 0.35;
                eggBox = eggBox - spending;
                System.out.printf("%.2f leva.", eggBox);
            } else if (eggColour.equals("Yellow")) {
                eggBox = eggBox * 7;
                spending = eggBox * 0.35;
                eggBox = eggBox - spending;
                System.out.printf("%.2f leva.", eggBox);
            }
        }
        if (eggSize.equals("Small")) {
            if (eggColour.equals("Red")) {
                eggBox = eggBox * 9;
                spending = eggBox * 0.35;
                eggBox = eggBox - spending;
                System.out.printf("%.2f leva.", eggBox);
            } else if (eggColour.equals("Green")) {
                eggBox = eggBox * 8;
                spending = eggBox * 0.35;
                eggBox = eggBox - spending;
                System.out.printf("%.2f leva.", eggBox);
            } else if (eggColour.equals("Yellow")) {
                eggBox = eggBox * 5;
                spending = eggBox * 0.35;
                eggBox = eggBox - spending;
                System.out.printf("%.2f leva.", eggBox);
            }
        }
    }
}
