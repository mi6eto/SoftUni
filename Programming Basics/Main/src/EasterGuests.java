import java.util.Scanner;

public class EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double guests = Integer.parseInt(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double lubosBudget = 0;
        double egg = 0.45;
        double totalEasterCakes = 1.0 * (guests / 3);
        totalEasterCakes = Math.ceil(totalEasterCakes);
        double totalEggs = guests * 2;
        lubosBudget = (totalEasterCakes * 4) + (totalEggs * 0.45);
        if (lubosBudget <= budget) {
            budget = budget - lubosBudget;
            Math.abs(budget);
            System.out.printf("Lyubo bought %.0f Easter bread and %.0f eggs.%n", totalEasterCakes, totalEggs);
            System.out.printf("He has %.2f lv. left.", budget);
        } else if (lubosBudget > budget) {
            lubosBudget = lubosBudget - budget;
            Math.abs(lubosBudget);
            System.out.printf("Lyubo doesn't have enough money.%n");
            System.out.printf("He needs %.2f lv. more.", lubosBudget);
        }
    }
}
