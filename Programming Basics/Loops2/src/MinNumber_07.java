import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;

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
            if(value < min) {
                min = value;
            }
            number++;
        }

        System.out.println(min);

    }
}