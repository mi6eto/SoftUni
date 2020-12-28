import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //за всяко едно внасаяне
        //повтаряме: 1. прочетем колко пари внасяме
        // 2. проверка ако е < 0 -> принт и приключим, ако е > 0 принт и продължаваме към следващото внасяне
        //стоп: броя на внасянията == общия брой внясяния
        //продължаваме: броя на внасянията != общия брой внясяния
        int totalIncomesCount = Integer.parseInt(scanner.nextLine());
        int countIncomes = 1;
        double totalMoney = 0;
        while (countIncomes <= totalIncomesCount){
            double money = Double.parseDouble(scanner.nextLine());
            if (money < 0){
                System.out.println("Invalid operation!");
                break;
            } else {
                totalMoney += money;
                System.out.printf("Increase: %.2f%n", money);
            }
            countIncomes++;
        }

        System.out.printf("Total: %.2f",totalMoney);


       /* for (int incomes = 1; incomes <= totalIncomesCount ; incomes++) {
            double money = Double.parseDouble(scanner.nextLine());
            if (money < 0){
                System.out.println("Invalid operation!");
                break;
            } else {
                totalMoney += money;
                System.out.println("Increase: " + money);
            }
        }*/
    }
}