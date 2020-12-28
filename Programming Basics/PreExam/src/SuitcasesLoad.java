import java.util.Locale;
import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double capacity = Double.parseDouble(scanner.nextLine());
        String command = scanner.nextLine();

        double totalCapacity = capacity;
        int countOfLoadedSuitcases = 0;
        double currentSuitcases = 0;
        while (!command.equals("End")) {
            currentSuitcases = Double.parseDouble(command);
            if (currentSuitcases > totalCapacity) {
                System.out.printf("No more space!%n");
                System.out.printf("Statistic: %d suitcases loaded.", countOfLoadedSuitcases);
                break;
            }
            countOfLoadedSuitcases++;
            if (countOfLoadedSuitcases == 3) {
                currentSuitcases = currentSuitcases + 0.1 * currentSuitcases;
            }
            totalCapacity -= currentSuitcases;command = scanner.nextLine();

        }
        if (command.equals("End")) {
            if (totalCapacity < capacity) {
                System.out.printf("Congratulations! All suitcases are loaded!%n");
                System.out.printf("Statistic: %d suitcases loaded.", countOfLoadedSuitcases);
            }
        }

    }
}
