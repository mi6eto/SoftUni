import java.util.Scanner;

public class MultiplicationTable_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int number1 = 1; number1 <= 10; number1++) {
            for (int number = 1; number <= 10 ; number++) {
                System.out.printf("%d * %d = %d%n",number1 ,number,number1 * number);
            }
        }
    }
}
