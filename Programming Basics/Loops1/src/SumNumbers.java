import java.util.Scanner;

public class SumNumbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine()); //брой на числата
        //за всяко едно число от 1 до n
        //повтаряме: четем стойност; сумираме
        int sum = 0;
        for (int number = 1; number <= n; number++) {
            int value = Integer.parseInt(scanner.nextLine());
            sum += value;
        }

        System.out.println(sum);


    }
}


