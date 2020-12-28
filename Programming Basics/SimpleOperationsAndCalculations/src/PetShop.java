import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dogs = Double.parseDouble(scanner.nextLine());
        int animals = Integer.parseInt(scanner.nextLine());
        double total = ((dogs * 2.50) + (animals *4));

        System.out.printf("%.2f" + " " + "lv.", total);

    }
}
