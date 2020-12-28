import java.util.Scanner;

public class AlchoholMarket {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double priceOfwhiskey = Double.parseDouble(scanner.nextLine());
        double litresBeer = Double.parseDouble(scanner.nextLine());
        double litresWine = Double.parseDouble(scanner.nextLine());
        double litresRakia = Double.parseDouble(scanner.nextLine());
        double litresWhiskey = Double.parseDouble(scanner.nextLine());


        double priceOfrakia = priceOfwhiskey / 2;
        double priceOfwine = 0.6 * priceOfrakia;
        double priceOfbeer = 0.2 * priceOfrakia;

        double totalWhiskey = litresWhiskey* priceOfwhiskey;
        double totalBeer = litresBeer * priceOfbeer;
        double totalRakia = litresRakia * priceOfrakia;
        double totalWine = litresWine * priceOfwine;

        double totalSum = totalWhiskey + totalBeer + totalRakia + totalWine;
        System.out.printf("%.2f", totalSum);


    }
}
