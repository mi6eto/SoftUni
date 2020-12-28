import java.util.Scanner;

public class ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double bitCoin = Integer.parseInt(scanner.nextLine());
        double chinaYen = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double BGN = 1;
        commission = (0.01 * commission);
        bitCoin = bitCoin * 1168;
        double USD = BGN * 1.76;
        chinaYen = chinaYen * 0.15 * USD;
        double totalSumInBGN = bitCoin + chinaYen;
        double totalSumInEU = totalSumInBGN / 1.95;
        double totalSumafter = commission * totalSumInEU;
        totalSumInEU = totalSumInEU - totalSumafter;
        System.out.printf("%.2f", totalSumInEU);
    }
}


