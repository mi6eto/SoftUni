import java.util.Scanner;

public class BeehiveDefense {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //битката завършва или с откраднат мед, или с бягаща мечка
        int countOfBees = Integer.parseInt(scanner.nextLine());
        int bearsHealth = Integer.parseInt(scanner.nextLine());
        int attack = Integer.parseInt(scanner.nextLine());
        int currentAttacks = 0;
        int currentBees = countOfBees;
        int currentBearsHealth = 0;
        boolean isSmaller = false;
        while (bearsHealth >= 0) {

            currentBees = countOfBees - attack;
            currentBearsHealth = bearsHealth - currentBees * 5;
            bearsHealth = currentBearsHealth;
            countOfBees = currentBees;
            currentAttacks++;
            if (currentBees < 100) {
                if (currentBees < 0){
                    currentBees = 0;
                }
                break;
            }
        }
        if (currentBees > 100) {
            System.out.printf("Beehive won! Bees left %d.", currentBees);
        } else if (currentBees < 100) {
            System.out.printf("The bear stole the honey! Bees left %d.", currentBees);
        }

    }
}
