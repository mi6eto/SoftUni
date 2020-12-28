import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numbers = Integer.parseInt(scanner.nextLine());
        String command = numbers + "";
        int prime = 0;
        int nonPrime = 0;
        boolean isPrime = true;
        while (!command.equals("stop")) {
            if (numbers > 2) {
                if (numbers % 2 == 0) {
                    nonPrime += numbers;

                } else {
                    prime += numbers;
                }
                if (numbers < 0) {
                    System.out.print("Number is negative.");
                }
                numbers = Integer.parseInt(scanner.nextLine());
            }

        }
        System.out.printf("Sum of all prime numbers is: %d", prime);
        System.out.printf("Sum of all non prime numbers is: %d", nonPrime);
    }
}
