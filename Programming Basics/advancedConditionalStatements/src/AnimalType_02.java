import java.util.Scanner;

public class AnimalType_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animalName = scanner.nextLine();
        //dog - mammal
        //crocodile, tortoise, snake - reptile
        //others -unknown

        switch (animalName) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }
    }
}
