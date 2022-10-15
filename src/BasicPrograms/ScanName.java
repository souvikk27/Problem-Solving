
import java.util.Scanner;

public class ScanName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name: ");
        String str = sc.nextLine();
        System.out.println("User namme is: " + str);
        sc.close();
    }
}
