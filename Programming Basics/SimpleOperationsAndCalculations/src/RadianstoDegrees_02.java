import java.util.Scanner;

public class RadianstoDegrees_02 {
    public static void main(String[] args) {
        //1.рочитаме радианите
        //2.degree = radians * 180 / 3.14
        //3.закръгляме до най-близкото число
        Scanner scanner = new Scanner(System.in);
        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians * 180 / Math.PI;
        System.out.printf("%.0f", degrees);
    }
}
