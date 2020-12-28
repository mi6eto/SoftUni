import java.util.Scanner;

public class BeehivePopulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double startPopulation = Double.parseDouble(scanner.nextLine());
        int years = Integer.parseInt(scanner.nextLine());

        double newBees = 0;
        double deadBees = 0;


        for (int i = 1; i <= years; i++) {
            newBees = Math.floor(startPopulation / 10) * 2;
            deadBees = Math.floor((startPopulation + newBees) / 20) * 2;
            startPopulation = startPopulation + newBees - deadBees;

            if (i % 5 == 0) {
                startPopulation = startPopulation+deadBees-newBees;
                double year5Population = Math.floor (startPopulation / 10) * 2 + startPopulation;
                double migratedBees = Math.floor(year5Population / 50) * 5;
                double diedYear5 = Math.floor((year5Population - migratedBees) / 20) * 2;
                startPopulation = year5Population - migratedBees - diedYear5;

            }

        }
        System.out.printf("Beehive population: %.0f", startPopulation);

    }
}