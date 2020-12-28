import java.util.Scanner;

public class HoneyWinterReserves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double honeyForTheWinter = Double.parseDouble(scanner.nextLine());
        double honeyHarvested = 0;

        String beeName = scanner.nextLine();
        while (!beeName.equals("Winter has come")) {
            double currHoney = 0;
            for (int i = 1; i <= 6; i++) {
                double honey = Double.parseDouble(scanner.nextLine());

                currHoney += honey;

                honeyHarvested += currHoney;
            }
            if (currHoney < 0) {
                System.out.printf("%s was banished for gluttony", beeName);
            }
            beeName = scanner.nextLine();
        }

        if (beeName.equals("Winter has come")) {
            if (honeyHarvested >= honeyForTheWinter) {
                double honeyLeft = honeyHarvested - honeyForTheWinter;
                System.out.printf("Well done! Honey surplus %.2f.", honeyLeft);
            } else {
                double honeyNeeded = Math.abs(honeyForTheWinter - honeyHarvested);
                System.out.printf("Hard Winter! Honey needed %.2f.", honeyNeeded);
            }
            if (honeyHarvested < honeyForTheWinter) {
                double honeyNeeded = honeyForTheWinter - honeyHarvested;
                System.out.printf("Hard Winter! Honey needed %.2f.", honeyNeeded);
            }
        }
    }
}