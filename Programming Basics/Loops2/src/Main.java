import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        int boxes = 0;
        String comand = scanner.nextLine();
        int roomSpace = 0;
        int freeSpace = 0;
        while (!comand.equals("Done")){
            if (roomSpace < boxes){
                System.out.printf("No more free space! You need %d Cubic meters more.",freeSpace);
                roomSpace = width * length * high;
                int newBoxes = Integer.parseInt(comand);
                newBoxes = Integer.parseInt(comand);
                newBoxes += boxes;
                freeSpace = roomSpace - newBoxes;

                newBoxes++;
                break;
            }
        }
        System.out.printf("%d Cubic meters left.",freeSpace);
    }
}
