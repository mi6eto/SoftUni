import java.util.Scanner;

public class Number100to200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.цяло число от конзолата
        //1.1 да е <100,
        //1.2 между 100
        //1.3 или >100

        //2. Less than 100; Between 100 and 200; Greater than 200

        int number = Integer.parseInt(scanner.nextLine());
        if (number <= 99) {
            System.out.println("Less than" + " " + 100);
        } else if (number <= 200) {
            System.out.println("Between" + " " + 100 + " " + "and" + " " + 200);
        } else {
            System.out.println("Greater than" + " " + 200);
        }


    }
}
