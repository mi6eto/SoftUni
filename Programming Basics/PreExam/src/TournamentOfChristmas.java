import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentDays = Integer.parseInt(scanner.nextLine());

        int totalWinGames = 0;
        int totalLoseGames = 0;
        double totalEarnedMoney = 0;

        for (int days = 1; days <= tournamentDays; days++) {
            String command = scanner.nextLine();
            int winGames = 0;
            int lostGames = 0;
            double earnedMoneyPerDay = 0;
            while (!command.equals("Finish")) {
                command = scanner.nextLine();
                if (command.equals("win")) {
                    winGames++;
                    totalWinGames++;
                    earnedMoneyPerDay += 20;
                } else if (command.equals("lose")) {
                    earnedMoneyPerDay += 0;
                    lostGames++;
                    totalLoseGames++;
                }
                command = scanner.nextLine();
            }
            if (command.equals("Finish")) {
                if (winGames > lostGames) {
                    earnedMoneyPerDay = earnedMoneyPerDay + 0.1 * earnedMoneyPerDay;
                    totalEarnedMoney += earnedMoneyPerDay;
                }else {
                    totalEarnedMoney += earnedMoneyPerDay;
                }
            }
        }
        if (totalWinGames > totalLoseGames) {
            totalEarnedMoney = totalEarnedMoney + 0.20 * totalEarnedMoney;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalEarnedMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalEarnedMoney);
        }

    }
}
