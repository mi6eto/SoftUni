import java.util.Scanner;

public class HoneyCombs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numBees = Integer.parseInt(scanner.nextLine());
        int numFlowers = Integer.parseInt(scanner.nextLine());

        double totalHoney = numBees*numFlowers*0.21;
        double honeyCombs = totalHoney/100;
        double honeyCombs2 = Math.floor(honeyCombs);
        double leftHoney = (honeyCombs-honeyCombs2)*100;
        System.out.printf("%.0f honeycombs filled.%n",honeyCombs2);
        System.out.printf("%.2f grams of honey left.",leftHoney);

    }
}
