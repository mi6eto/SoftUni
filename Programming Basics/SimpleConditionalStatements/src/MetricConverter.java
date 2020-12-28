import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number = Double.parseDouble(scanner.nextLine());
        String unit1 = scanner.nextLine();
        String unit2 = scanner.nextLine();

        if (unit1.equals("mm")) {
            if (unit2.equals("m")) {
                System.out.printf("%.3f", number / 1000);
            } else if (unit2.equals("cm")) {
                System.out.printf("%.3f", number / 10);
            }
        }
        if (unit1.equals("m")) {
            if (unit2.equals("cm")) {
                System.out.printf("%.3f", number * 100);
            } else if (unit2.equals("mm")) {
                System.out.printf("%.3f", number * 1000);
            }
        }
        if (unit1.equals("cm")) {
            if (unit2.equals("mm")) {
                System.out.printf("%.3f", number * 10);
            } else if (unit2.equals("m")) {
                System.out.printf("%.3f", number / 100);
            }
        }


    }
}