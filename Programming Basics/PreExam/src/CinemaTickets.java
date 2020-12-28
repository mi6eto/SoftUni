import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();
        int totalTickets = 0;
        int studentTickets = 0;
        int standartTicket = 0;
        int kidTicket = 0;
        boolean isFinish = false;
        while (!command.equals("Finish")) {
            int totalSpaces = Integer.parseInt(scanner.nextLine());
            int ticketsPerMovie = 0;
            int usedSpaces = 0;
            String ticketType = scanner.nextLine();
            while (!ticketType.equals("End")) {
                totalTickets++;
                ticketsPerMovie++;
                if (command.equals("Finish")) {
                    isFinish = true;
                    break;
                }
                if (usedSpaces >= totalSpaces) {
                    double purcentFul = ((ticketsPerMovie * 1.0) / totalSpaces) * 100;
                    System.out.printf("%s - %.2f%% full.%n", command,purcentFul);
                    break;
                }
                if ("standard".equals(ticketType)) {
                    standartTicket++;
                    usedSpaces++;
                } else if ("student".equals(ticketType)) {
                    standartTicket++;
                    usedSpaces++;
                } else if ("kid".equals(ticketType)) {
                    kidTicket++;
                    usedSpaces++;
                }
                ticketType = scanner.nextLine();
            }
            if (isFinish) {
                break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d", totalTickets);

        double standartTicketPercent = 100 / totalTickets * standartTicket;
        double studentTicketsPercent = 100 / 12 * studentTickets;
        double kidTicketPercent = 100 / totalTickets * kidTicket;
        System.out.printf("%.2f%% student tickets.%n", studentTicketsPercent);
        System.out.printf("%.2f%% standard tickets.%n", standartTicketPercent);
        System.out.printf("%.2f%% kids tickets.", kidTicketPercent);

    }
}
