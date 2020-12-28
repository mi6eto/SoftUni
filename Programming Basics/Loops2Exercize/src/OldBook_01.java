import java.util.Scanner;

public class OldBook_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String anasBook=scanner.nextLine();
        int capacityLibrary=Integer.parseInt(scanner.nextLine());

        int checkedbooks=0;
        String searchedbook;
        boolean isFound=false;

        while (capacityLibrary>checkedbooks){

            searchedbook=scanner.nextLine();

            if (searchedbook.equals(anasBook)){
                isFound=true;
                break;
            } checkedbooks++;

        }
        if (isFound){
            System.out.printf("You checked %d books and found it.", checkedbooks);
        }else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %s books.", checkedbooks);
        }
    }
}
