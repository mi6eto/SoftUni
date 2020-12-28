import java.util.Scanner;

public class CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesPerDay = Integer.parseInt(scanner.nextLine());
        int countOfWalkingPerDay = Integer.parseInt(scanner.nextLine());
        int caloriesPerDay = Integer.parseInt(scanner.nextLine());

        int totalMinutesWalking = countOfWalkingPerDay * minutesPerDay;
        int totalBurntCalories = totalMinutesWalking * 5;
        double enoughtCalories = caloriesPerDay - 0.5 * caloriesPerDay;
        if (totalBurntCalories >= enoughtCalories) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.", totalBurntCalories);
        } else if (totalBurntCalories < enoughtCalories) {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.", totalBurntCalories);

        }
    }
}
