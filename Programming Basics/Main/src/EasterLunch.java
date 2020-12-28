import java.util.Scanner;

public class EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int easterCakes = Integer.parseInt(scanner.nextLine());
        int eggs = Integer.parseInt(scanner.nextLine());
        int cookies = Integer.parseInt(scanner.nextLine());

        double totalCakes = easterCakes * 3.20;
        double totalEggs = eggs * 4.35;
        double totalCookies = cookies * 5.40;
        double eggsPaint = eggs * 12 * 0.15;
        double totalSum = totalCakes + totalEggs + totalCookies + eggsPaint;
        System.out.printf("%.2f",totalSum);
    }
}
