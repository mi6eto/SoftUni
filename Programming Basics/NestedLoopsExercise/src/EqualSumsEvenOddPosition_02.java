import java.util.Scanner;

public class EqualSumsEvenOddPosition_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 = Integer.parseInt(scanner.nextLine());
        for (int i = number1; i <= number2 ; i++) {
            int evenSum = 0;
            int oddSum = 0;
            int currentNumber = i;
            boolean isEvenPposition = true;
            while (currentNumber > 0){
                int currentDigit = currentNumber % 10;
                currentNumber = currentNumber / 10;
                if (isEvenPposition){
                    evenSum += currentDigit;
                }else {
                    oddSum += currentDigit;
                }
                isEvenPposition = !isEvenPposition;
            }
            if (evenSum == oddSum){
                System.out.printf("%d ",i);
            }
        }
    }
}
