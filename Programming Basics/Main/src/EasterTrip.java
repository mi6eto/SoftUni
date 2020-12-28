import java.util.Scanner;

public class EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        double nights = Integer.parseInt(scanner.nextLine());


        if (destination.equals("France")) {
            if (dates.equals("21-23")) {
                nights = nights * 30;
                System.out.printf("Easter trip to %s : %.2f leva.", destination, nights);
            } else if (dates.equals("24-27")) {
                nights = nights * 35;
                System.out.printf("Easter trip to %s : %.2f leva.", destination, nights);
            } else if (dates.equals("28-31")) {
                nights = nights * 40;
                System.out.printf("Easter trip to %s : %.2f leva.", destination, nights);
            }
        }
        if (destination.equals("Italy")) {
            if (dates.equals("21-23")) {
                nights = nights * 28;
                System.out.printf("Easter trip to %s : %.2f leva.", destination, nights);
            } else if (dates.equals("24-27")) {
                nights = nights * 32;
                System.out.printf("Easter trip to %s : %.2f leva.", destination, nights);
            } else if (dates.equals("28-31")) {
                nights = nights * 39;
                System.out.printf("Easter trip to %s : %.2f leva.", destination, nights);
            }
        }

        if (destination.equals("Germany")) {
            if (dates.equals("21-23")) {
                nights = nights * 32;
                System.out.printf("Easter trip to %s : %.2f leva.", destination, nights);
            } else if (dates.equals("24-27")) {
                nights = nights * 37;
                System.out.printf("Easter trip to %s : %.2f leva.", destination, nights);

            } else if (dates.equals("28-31")) {
                nights = nights * 43;

                System.out.printf("Easter trip to %s : %.2f leva.", destination, nights);

            }
        }
    }
}
