import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;

        /*for (int number = 1; number <= n ; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            if(value > max) {
                max = value;
            }
        }

        System.out.println(max);*/
        int number = 1;

        while (number <= n) {
            int value = Integer.parseInt(scanner.nextLine());
            if(value > max) {
                max = value;
            }
            number++;
        }

        System.out.println(max);

    }
}