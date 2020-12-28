import java.util.Scanner;

public class CharityCampaign{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfDays = Integer.parseInt(scanner.nextLine());
        int countOfConfectioner = Integer.parseInt(scanner.nextLine());
        int countOfCakes = Integer.parseInt(scanner.nextLine());
        double countOfWaflles = Double.parseDouble(scanner.nextLine());
        double cpuntOfPancakes = Double.parseDouble(scanner.nextLine());

        int cakes = countOfCakes * 45;
        double waflles = countOfWaflles * 5.80;
        double pancakes = cpuntOfPancakes * 3.20;

        double sumForDay = (cakes + waflles + pancakes) * countOfConfectioner;
        double sumForCampaign = (sumForDay * countOfDays);
        double sumForTax = (sumForCampaign * 1) / 8;
        double sumAfterTax = sumForCampaign - sumForTax;
        System.out.printf("%.2f",sumAfterTax);


    }
}