import java.util.Scanner;

public class Building_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countFloors = Integer.parseInt(scanner.nextLine());
        int countRooms = Integer.parseInt(scanner.nextLine());

        for (int floors = countFloors; floors >= 1; floors--) {
            for (int rooms = 0; rooms < countRooms; rooms++) {
                if (floors == countFloors) {
                    System.out.printf("L%d%d ", floors, rooms);
                } else if (floors % 2 == 0) {
                    System.out.printf("O%d%d ", floors, rooms);
                } else if (floors % 2 != 0) {
                    System.out.printf("A%d%d ", floors, rooms);
                }
            }
            System.out.println();
        }
    }
}
