import java.util.Scanner;

public class SmallShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        if ("Sofia".equals(town)) {
            if ("coffee".equals(product)) {
                System.out.println(quantity * 0.50);
            } else if ("water".equals(product)) {
                System.out.println(quantity * 0.80);
            } else if ("beer".equals(product)) {
                System.out.println(quantity * 1.20);
            } else if ("sweets".equals(product)) {
                System.out.println(quantity * 1.45);
            } else if ("peanuts".equals(product)) {
                System.out.println(quantity * 1.60);
            }
        } else if ("Plovdiv".equals(town)) {
            if (product.equals("coffee")) {
                System.out.println(quantity * 0.40);
            } else if (product.equals("water")) {
                System.out.println(quantity * 0.70);
            } else if (product.equals("beer")) {
                System.out.println(quantity * 1.15);
            } else if (product.equals("sweets")) {
                System.out.println(quantity * 1.30);
            } else if (product.equals("peanuts")) {
                System.out.println(quantity * 1.50);
            }
        } else if ("Varna".equals(town)) {
            if (product.equals("coffee")) {
                System.out.println(quantity * 0.45);
            } else if (product.equals("water")) {
                System.out.println(quantity * 0.70);
            } else if (product.equals("beer")) {
                System.out.println(quantity * 1.10);
            } else if (product.equals("sweets")) {
                System.out.println(quantity * 1.35);
            } else if (product.equals("peanuts")) {
                System.out.println(quantity * 1.55);
            }
        }
    }
}
