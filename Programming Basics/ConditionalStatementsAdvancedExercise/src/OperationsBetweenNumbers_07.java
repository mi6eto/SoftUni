import java.util.Scanner;

public class OperationsBetweenNumbers_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        char symbol = scanner.nextLine().charAt(0);

        switch (symbol) {
            case '+':
                int sum = n1 + n2;
                if (sum % 2 == 0) {
                    System.out.printf("%d %c %d = %d - even", n1, symbol, n2, sum);
                } else {
                    System.out.printf("%d %c %d = %d - odd", n1, symbol, n2, sum);
                }
                break;
            case '-':
                int result = n1 - n2;
                if (result % 2 == 0) {
                    System.out.printf("%d %c %d = %d - even", n1, symbol, n2, result);
                } else {
                    System.out.printf("%d %c %d = %d - odd", n1, symbol, n2, result);
                }
                break;
            case '*':
                int multiplication = n1 * n2;
                if (multiplication % 2 == 0) {
                    System.out.printf("%d %c %d = %d - even", n1, symbol, n2, multiplication);
                } else {
                    System.out.printf("%d %c %d = %d - odd", n1, symbol, n2, multiplication);
                }
                break;
            case '/':
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    double division = 1.0 * n1 / n2;
                    System.out.printf("%d / %d = %.2f", n1, n2, division);
                }
                break;
            case '%':
                if (n2 == 0) {
                    System.out.printf("Cannot divide %d by zero", n1);
                } else {
                    int left = n1 % n2;
                    System.out.printf("%d %% %d = %d", n1, n2, left);
                }
        }
    }
}
