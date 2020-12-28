import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int pieces = width * length;

        //СТОП: ако команда == "STOP" -> продължаваме: command != "STOP"
        //СТОП: ако свърши тортата -> pieces <= 0

        String command = scanner.nextLine();// "STOP" или "брой парчета"

        while (!command.equals("STOP")){
            //брой парчета -> "3" на int
            int takenPieces = Integer.parseInt(command);
            pieces -= takenPieces;
            if(pieces <= 0){
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieces));
                break;
            }

            command = scanner.nextLine();
        }

        if(command.equals("STOP")){
            System.out.printf("%d pieces are left.", pieces);
        }


    }
}