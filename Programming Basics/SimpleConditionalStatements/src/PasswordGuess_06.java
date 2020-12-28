import java.util.Scanner;

public class PasswordGuess_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.Да напишем парола = s3cr3t!P@ssw0rd

        //2.Ако съвпада -- се изписва "Welcome"
        // 2.1 Ako не съвпада -- "Wrong password!"

        String password = scanner.nextLine();
        if (password.equals("s3cr3t!P@ssw0rd")) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }


    }
}
