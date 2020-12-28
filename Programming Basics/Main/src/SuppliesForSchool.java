import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        double litreMaterial = Double.parseDouble(scanner.nextLine());
        double commission = Integer.parseInt(scanner.nextLine());

        double totalPens = pens * 5.80;
        double totalMarkers = markers * 7.20;
        double totalMaterial = litreMaterial * 1.20;
        commission = (0.01 * commission);
        double totalSum = totalPens + totalMarkers + totalMaterial;
        double totalSumAfterCommission = totalSum - (totalSum * commission);
        System.out.printf("%.3f", totalSumAfterCommission);
    }
}
