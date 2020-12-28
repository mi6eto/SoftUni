import javax.swing.*;
import java.util.Scanner;

public class EsterEggBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfEggs1 = Integer.parseInt(scanner.nextLine());
        int countOfEggs2 = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        while (!command.equals("End of battle")) {


            if (command.equals("one")) {
                countOfEggs2--;
            } else if (command.equals("two")) {
                countOfEggs1--;
            }
            if (countOfEggs1 == 0) {
                System.out.printf("Player one is out of eggs. Player two has %d eggs left.%n", countOfEggs2);
                break;
            } else if (countOfEggs2 == 0) {
                System.out.printf("Player two is out of eggs. Player one has %d eggs left.", countOfEggs1);
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("End of battle")) {
            System.out.printf("Player one has %d eggs left.%n", countOfEggs1);
            System.out.printf("Player two has %d eggs left.", countOfEggs2);
        }
    }
}