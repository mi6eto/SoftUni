import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int actors = Integer.parseInt(scanner.nextLine());
        double pricePerCostume = Double.parseDouble(scanner.nextLine());

        double costumesTotal = actors * pricePerCostume;
        double decor = 0.1 * budget;

        if (actors > 150) {
            costumesTotal = costumesTotal * 0.9;
        }
        double totalExpences = decor + costumesTotal;
        if (budget < totalExpences) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", totalExpences - budget);

        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", budget - totalExpences);
        }
    }
}
