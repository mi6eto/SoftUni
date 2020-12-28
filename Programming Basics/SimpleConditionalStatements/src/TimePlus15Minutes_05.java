import java.util.Scanner;

public class TimePlus15Minutes_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        //превръщаме в минути
        int hourInMinutes = hours * 60 + minutes;
        int hourAfterFifteenMinutes = hourInMinutes + 15;

        //преобразуваме часове:минути
        int endHours = hourAfterFifteenMinutes / 60;
        int endMinutes = hourAfterFifteenMinutes % 60;
        if (endHours >= 24) {
            endHours = endHours - 24;
        }
        System.out.printf("%d:%02d", endHours, endMinutes);
    }
}
