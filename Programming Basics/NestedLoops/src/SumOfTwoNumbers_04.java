import java.util.Scanner;

public class SumOfTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        int countCombination = 0;
        int totalCountCombinations = 0;
        boolean yes = true;
        for (int combination = number1; combination <= number2; combination++) {
            for (int combination2 = number1; combination2 <= number2; combination2++) {
                totalCountCombinations++;
                if (combination + combination2 == magicNumber) {
                    countCombination++;
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", totalCountCombinations, combination, combination2, magicNumber);
                    yes = false;
                    break;
                }
            }
            if (!yes) {
                break;
            }

        }
        if (countCombination == 0) {
            System.out.printf("%d combinations - neither equals %d", totalCountCombinations, magicNumber);
        }
    }
}