import java.util.Scanner;

public class AreaofFigures_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1.Да напишем вид и размер на фигура

        String figure = scanner.nextLine();
        double lenghtA = Double.parseDouble(scanner.nextLine());


        //2.Фигурите са 4 вида:square, rectangle, circle, triangle;


        if (figure.equals("square")) {
            System.out.printf("%.3f", lenghtA * lenghtA);
        } else if (figure.equals("rectangle")) {
            double lenghtB = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", lenghtA * lenghtB);
        } else if (figure.equals("circle")) {
            double circleArea = Math.PI * (lenghtA * lenghtA);
            System.out.printf("%.3f", circleArea);
        } else if (figure.equals("triangle")) {
            double lenghtB = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", (lenghtA * lenghtB) / 2);
        }
    }
}
