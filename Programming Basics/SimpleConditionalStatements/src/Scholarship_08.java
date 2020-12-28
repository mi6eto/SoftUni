import java.util.Scanner;

public class Scholarship_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageSuccess = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double socialScholarship = Math.floor(0.35 * minSalary);
        double excellentScholarship = Math.floor(averageSuccess * 25);

        if (averageSuccess < 4.5) {
            System.out.printf("You cannot get a scholarship!");
        } else if (income <= minSalary && averageSuccess > 4.50) {
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
        } else if (averageSuccess > 5.50) {
            System.out.printf("You get a Social scholarship %.0f BGN");
        }else if (excellentScholarship > socialScholarship){
            
        }




    }
}
