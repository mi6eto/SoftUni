import java.util.Scanner;

public class SkiTrip_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        double pricePerNight = 0;
        String roomType = scanner.nextLine();
        //room for one person; apartment; president apartment
        String grade = scanner.nextLine(); //positive или negative

        int nights = days - 1;

        switch (roomType) {
            case "room for one person":
                pricePerNight = 18;
                break;
            case "apartment":
                pricePerNight = 25;
                break;
            case "president apartment":
                pricePerNight = 35;
        }
        double totalPrice = nights * pricePerNight;
        if (roomType.equals("apartment")) {
            if (days < 10) {
                totalPrice = totalPrice - 0.3 * totalPrice;
            } else if (days >= 10 && days <= 15) {
                totalPrice = totalPrice - 0.35 * totalPrice;
            } else if (days > 15) {
                totalPrice = totalPrice - 0.5 * totalPrice;
            }
        }
        if (roomType.equals("president apartment")) {
            if (days < 10) {
                totalPrice = totalPrice - 0.1 * totalPrice;
            } else if (days >= 10 && days <= 15) {
                totalPrice = totalPrice - 0.15 * totalPrice;
            } else if (days > 15) {
                totalPrice = totalPrice - 0.2 * totalPrice;
            }
        }
        if (grade.equals("positive")) {
            totalPrice = totalPrice + 0.25 * totalPrice;
        } else if (grade.equals("negative")) {
            totalPrice = totalPrice - 0.1 * totalPrice;
        }
        System.out.printf("%.2f", totalPrice);

    }
}
