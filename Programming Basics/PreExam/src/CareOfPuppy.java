import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int food = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        food = food * 1000;
        int totalFoodPerDay = 0;
        while (!command.equals("Adopted")) {
            int foodPerDay = 0;
            foodPerDay = Integer.parseInt(command);
            totalFoodPerDay += foodPerDay;

            command = scanner.nextLine();
        }
        if (food >= totalFoodPerDay){
            int leftFood = 0;
            leftFood = food - totalFoodPerDay;
            System.out.printf("Food is enough! Leftovers: %d grams.",leftFood);
        }else if (food < totalFoodPerDay){
            int neededFood = 0;
            neededFood = Math.abs(food - totalFoodPerDay);
            System.out.printf("Food is not enough. You need %d grams more.",neededFood);
        }
    }
}
