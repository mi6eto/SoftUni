import java.util.Scanner;

public class EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double bookingPrice = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double partyCake = budget * 0.1;
        double totalBudget = 0;
        if (guests < 10) {
            totalBudget = guests * bookingPrice + partyCake;
        } else if (guests > 20) {
            bookingPrice = bookingPrice - 0.25 * bookingPrice;
            totalBudget = guests * bookingPrice + partyCake;
        } else if (guests <= 15 && guests > 9) {
            bookingPrice = bookingPrice - 0.15 * bookingPrice;
            totalBudget = guests * bookingPrice + partyCake;
        } else if (guests <= 20 && guests > 15) {
            bookingPrice = bookingPrice - 0.2 * bookingPrice;
            totalBudget = guests * bookingPrice + partyCake;
        }
        if (totalBudget < budget) {
            totalBudget = Math.abs(totalBudget - budget);
            System.out.printf("It is party time! %.2f leva left.", totalBudget);
        } else {
            totalBudget = Math.abs(totalBudget - budget);
            System.out.printf("No party! %.2f leva needed.", totalBudget);
        }

    }
}
