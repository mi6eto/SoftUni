import java.util.Scanner;

public class worldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());

        double totalTime = distance * time;
        double addTime = Math.floor(distance / 15) * 12.5;
        double finishTime = totalTime + addTime;
        double timeNeeds = finishTime - record;

        if (record < finishTime) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeNeeds);

        } else if (record > finishTime) {
            double newRecord = totalTime + addTime;
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", newRecord);
        }

    }
}