import java.util.Scanner;

public class Graduation2_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int counter = 0;
        double sum = 0;
        int excluded = 0;
        boolean isExcluded = false;

        while (counter < 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4.00) {
                sum += grade;
                counter++;
            } else {
                excluded++;
            }

            if (excluded >= 2) {
                isExcluded = true;
                break;
            }
        }
        if (isExcluded == false) {
            double average = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, average);
        } else {
            System.out.printf("%s has been excluded at %d grade", name, counter + 1);
        }
    }
}