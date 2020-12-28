import java.util.Scanner;

public class SumNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            int currentInput = Integer.parseInt(input);
            sum += currentInput;
            input = scanner.nextLine();

        }
        System.out.println(sum);
    }
}
