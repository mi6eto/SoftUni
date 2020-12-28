import java.util.Scanner;

public class MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        double distanceInMetres = Double.parseDouble(scanner.nextLine());
        double timeInSeconds = Double.parseDouble(scanner.nextLine());

        double hisTime = distanceInMetres * timeInSeconds;
        double slowerTime = Math.floor(distanceInMetres / 50) * 30;
        double totalTimeInSeconds = slowerTime + hisTime;

        double needsTime = totalTimeInSeconds - recordInSeconds;
        if (recordInSeconds <= totalTimeInSeconds) {
            System.out.printf("No! He was %.2f seconds slower.", needsTime);
        } else if (recordInSeconds > totalTimeInSeconds) {
            System.out.printf("Yes! The new record is %.2f seconds.", totalTimeInSeconds);
        }
    }
}
