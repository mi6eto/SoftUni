import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double neededMoney = Double.parseDouble(scanner.nextLine());
        double availableMoney = Double.parseDouble(scanner.nextLine());
        int daysCounter = 0;
        int spendCounter = 0;
        while (availableMoney < neededMoney)
        {
            daysCounter ++;
            String action = scanner.nextLine();
            if (action.equals("spend"))
            {
                if (spendCounter == 4)
                {
                    System.out.printf("You can't save the money.%n%d", daysCounter);
                    break;
                }
                spendCounter++;
                double spendMoney = Double.parseDouble(scanner.nextLine());
                availableMoney = availableMoney - spendMoney;
                if (availableMoney < 0)
                {
                    availableMoney = 0;
                }

            }
            else if (action.equals("save"))
            {
                spendCounter = 0;
                double saveMoney = Double.parseDouble(scanner.nextLine());
                availableMoney = availableMoney + saveMoney;
            }

        }
        if (spendCounter != 4) {
            System.out.printf("You saved the money for %d days.", daysCounter);
        }
    }
}