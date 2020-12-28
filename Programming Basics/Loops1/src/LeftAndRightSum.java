import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int left = 0, right = 0;
        for(int i = 0 ; i < n; i++)
            left += Integer.parseInt(scanner.nextLine());
        for(int i = 0;  i < n; i++)
            right += Integer.parseInt(scanner.nextLine());
        System.out.println(left == right ? ("Yes, sum = " + left) : ("No, diff = " + Math.abs(left-right)));
    }
}