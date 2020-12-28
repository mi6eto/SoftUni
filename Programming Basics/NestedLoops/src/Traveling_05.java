import java.util.Scanner;

public class Traveling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine(); //End или дестинация

        while (!command.equals("End")){
            //дестинация -> пътуваме
            double budget = Double.parseDouble(scanner.nextLine());
            //имаме заявено пътуване -> докато не достигнем бюджета -> спестява (въвеждаме суми)
            //стоп: бюджет <= спестена сума
            //продължава да пести -> бюджета > спестена сума
            int sum = 0; //спестени пари
            while (sum < budget) {
                double saved = Double.parseDouble(scanner.nextLine());
                sum += saved;

            }
            //ako sum >= budget
            if(sum >= budget){
                System.out.printf("Going to %s!%n", command);
            }

            command = scanner.nextLine();

        }


    }
}