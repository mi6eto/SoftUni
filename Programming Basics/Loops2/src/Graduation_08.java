import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double yearGrade = 0;
        int year = 0;
        while (year < 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4.0) {
                yearGrade += grade;
                year++;
            }
        }
        double avgGrade = yearGrade / 12;
        System.out.printf("%s graduated. Average grade: %.2f", name, avgGrade);
    }
}
