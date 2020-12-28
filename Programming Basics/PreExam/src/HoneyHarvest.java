import java.util.Scanner;

public class HoneyHarvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flower = scanner.nextLine();
        int numFlower = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double totalHoneyHarvested = 0;

        if (flower.equals("Sunflower") && season.equals("Spring")) {
            totalHoneyHarvested = numFlower * 10;
        }else if (flower.equals("Sunflower")&& season.equals("Summer")){
            totalHoneyHarvested = (numFlower*8)*1.1;
        }else if (flower.equals("Sunflower")&& season.equals("Autumn")){
            totalHoneyHarvested = (numFlower*12)*0.95;
        }

        if (flower.equals("Daisy") && season.equals("Spring")) {
            totalHoneyHarvested = (numFlower * 12)*1.1;
        }else if (flower.equals("Daisy")&& season.equals("Summer")){
            totalHoneyHarvested = (numFlower*8)*1.1;
        }else if (flower.equals("Daisy")&& season.equals("Autumn")){
            totalHoneyHarvested = (numFlower*6)*0.95;
        }


        if (flower.equals("Lavender") && season.equals("Spring")) {
            totalHoneyHarvested = numFlower * 12;
        }else if (flower.equals("Lavender")&& season.equals("Summer")){
            totalHoneyHarvested = (numFlower*8)*1.1;
        }else if (flower.equals("Lavender")&& season.equals("Autumn")){
            totalHoneyHarvested = (numFlower*6)*0.95;
        }


        if (flower.equals("Mint") && season.equals("Spring")) {
            totalHoneyHarvested = (numFlower * 10)*1.1;
        }else if (flower.equals("Mint")&& season.equals("Summer")){
            totalHoneyHarvested = (numFlower*12)*1.1;
        }else if (flower.equals("Mint")&& season.equals("Autumn")){
            totalHoneyHarvested = (numFlower*6)*0.95;
        }
        System.out.printf("Total honey harvested: %.2f",totalHoneyHarvested);

    }
}
