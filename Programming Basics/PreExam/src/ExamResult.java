import java.util.Scanner;

public class ExamResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String studentName = scanner.nextLine();
        boolean isNegative = false;
        while (!studentName.equals("Midnight")) {
            double studentScore = 0;
            double finalScore = 0;
            for (int points = 1; points <= 6; points++) {
                int examPoints = Integer.parseInt(scanner.nextLine());
                if (examPoints < 0) {
                    isNegative = true;
                    break;
                }
                finalScore += examPoints;
                studentScore = Math.floor(finalScore / 600 * 100);
                studentScore = studentScore * 0.06;
            }
            if (isNegative){
                System.out.printf("%s was cheating!%n", studentName);
                isNegative = false;
            }else if (studentScore >= 5) {
                System.out.println("===================");
                System.out.println("|   CERTIFICATE   |");
                System.out.printf( "|    %.2f/6.00    |%n",studentScore);
                System.out.println("===================");
                System.out.printf("Issued to %s",studentName);
            } else if (studentScore < 5) {
                if (studentScore < 3){
                    studentScore = 2.00;
                }
                System.out.printf("%s - %.2f%n", studentName, studentScore);
            }

            studentName = scanner.nextLine();
        }
    }
}
