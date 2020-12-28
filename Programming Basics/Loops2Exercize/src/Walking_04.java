import javafx.scene.shape.SVGPath;

import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = 0;
        String command;

        while (steps < 10000) {
            command = scanner.nextLine();
            if (command.equals("Going home")) {
                int laststeps = Integer.parseInt(scanner.nextLine());
                steps = steps + laststeps;
                break;
            }

            int newsteps = Integer.parseInt(command);
            steps = steps + newsteps;
        }

        if (steps >= 10000) System.out.println("Goal reached! Good job!");
        else System.out.printf("%d more steps to reach goal.", 10000 - steps);
    }
}