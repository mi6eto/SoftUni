import java.util.Scanner;

public class NewHouse_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double pricePerFlower = 0;
        switch (flowerType) {
            case "Roses":
                pricePerFlower = 5;
                break;
            case "Dahlias":
                pricePerFlower = 3.80;
                break;
            case "Tulips":
                pricePerFlower = 2.80;
                break;
            case "Narcissus":
                pricePerFlower = 3;
                break;
            case "Gladiolus":
                pricePerFlower = 2.50;
        }
        double price = pricePerFlower * flowerCount;
        if (flowerCount > 80 && flowerType.equals("Roses")) {
            price = price - 0.1 * price;
        } else if (flowerCount > 90 && flowerType.equals("Dahlias")) {
            price = 0.85 * price;
        } else if (flowerCount > 80 && flowerType.equals("Tulips")) {
            price = 0.85 * price;
        } else if (flowerCount < 120 && flowerType.equals("Narcissus")) {
            price = price + 0.15 * price;
        } else if (flowerCount < 80 && flowerType.equals("Gladiolus")) {
            price = price + 0.20 * price;
        }
        if (budget < price) {
            double needMoney = price - budget;
            System.out.printf("Not enough money, you need %.2f leva more.", needMoney);
        } else {
            double leftMoney = budget - price;
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowerType, leftMoney);
        }

    }
}
