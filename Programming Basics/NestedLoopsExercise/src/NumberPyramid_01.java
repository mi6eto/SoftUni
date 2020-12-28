import java.util.Scanner;

public class NumberPyramid_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int currentNum = 1;
        boolean isBigger = false;
        for (int rows = 0; rows < n; rows++) {
            for (int colons = 0; colons <= rows; colons++) {
                System.out.printf("%d ",currentNum);
                currentNum++;
                if (currentNum > n) {
                    isBigger = true;
                    break;
                }
            }
            if (isBigger) {
                break;
            }
            System.out.println();
        }
    }
}
