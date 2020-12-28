import java.util.Scanner;

public class EasterShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int eggsInShop = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int boughtOrFilledEggs = Integer.parseInt(scanner.nextLine());

        while (!command.equals("Close")) {
            int currentEgssInShop = eggsInShop;
            if (command.equals("Buy")) {
                eggsInShop = eggsInShop - boughtOrFilledEggs;
            } else if (command.equals("Fill")) {
               currentEgssInShop = eggsInShop + boughtOrFilledEggs;
            }
            if (boughtOrFilledEggs < eggsInShop) {
                System.out.printf("Not enough eggs in store!%n");
                System.out.printf("You can buy only %d.", eggsInShop);

            }
            command = scanner.nextLine();
        }
        if (command.equals("Close")) {
            System.out.printf("Store is closed!%n");
            System.out.printf("%d eggs sold.", eggsInShop);
        }
    }
}
