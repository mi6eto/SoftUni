import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int meagerResults = Integer.parseInt(scanner.nextLine());
        String problem = scanner.nextLine();
        double resultSum = 0;
        int numberOfProblems = 0;
        int countMeagerResults =0;
        String lastProblem = "";

        while (!problem.equalsIgnoreCase("enough")) {

            int result = Integer.parseInt(scanner.nextLine());
            numberOfProblems++;
            resultSum += result;

            if (result <= 4) {
                countMeagerResults++;
                if (countMeagerResults == meagerResults) {
                    System.out.printf("You need a break, %d poor grades.", countMeagerResults);
                    break;
                }
            }

            lastProblem = problem;
            problem = scanner.nextLine();
        }

        double averageSum = resultSum / numberOfProblems * 1.0;

        if (problem.equalsIgnoreCase("enough")) {

            System.out.printf("Average score: %.2f%n", averageSum);
            System.out.printf("Number of problems: %d%n", numberOfProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}