import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        //1.Вход
        //1.1 hallLenght & hallWidth на залата
        //1.2 а -- wardrobeSide

        //Да Сметнем пространството
        //Лице на залата -- hallLenght * hallWidth
        //Лице на гардероба -- wardrobeSide * wardrobeSide
        //Лице на пейката -- Лицето на залата / 10

        //Свободно място = лице на залата - лице гардероб - лице на пейка
        //Пространство за 1 танцьор = 40 + 7000 = 7040
        //Брой танцьори = свободно място / място за 1 танцьор


        Scanner scanner = new Scanner(System.in);
        Double hallLenght = Double.parseDouble(scanner.nextLine());
        Double hallWidth = Double.parseDouble(scanner.nextLine());
        Double wardrobeSide = Double.parseDouble(scanner.nextLine());

        double areaOfhall = (hallLenght * 100) * (hallWidth * 100);
        double areaOfwardrobe = (wardrobeSide * 100) * (wardrobeSide * 100);
        double areaOfBench = areaOfhall * 0.1;

        double freeSpace = areaOfhall - areaOfwardrobe - areaOfBench;
        double spaceForDancer = 7040;
        double countOfDancer = Math.floor(freeSpace / spaceForDancer);
        System.out.printf("%.0f", freeSpace / spaceForDancer);

    }
}
