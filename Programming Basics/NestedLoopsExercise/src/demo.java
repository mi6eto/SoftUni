import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeNumbersSum = 0;
        int nonPrimeNumbersSum = 0;
        String inputNumberString = scanner.nextLine();
        while (!inputNumberString.equals("stop")) {
            int inputNumber = Integer.parseInt(inputNumberString);
            if (inputNumber < 0) {
                System.out.println("Number is negative.");
            } else if (inputNumber == 0 || inputNumber == 1) {
                nonPrimeNumbersSum += inputNumber;
            } else if (inputNumber == 2) {
                primeNumbersSum += inputNumber;
            } else {
                boolean isNotPrime = false;
                for (int i = 2; i < inputNumber; i++) {
                    if (inputNumber % i == 0) {
                        nonPrimeNumbersSum += inputNumber;
                        isNotPrime = true;
                        break;
                    }
                }
                if (!isNotPrime) {
                    primeNumbersSum += inputNumber;
                }
            }
            inputNumberString = scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + primeNumbersSum);
        System.out.println("Sum of all non prime numbers is: " + nonPrimeNumbersSum);
    }
}