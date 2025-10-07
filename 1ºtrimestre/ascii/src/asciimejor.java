
import java.util.Scanner;

public class asciimejor {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime hasta que número quieres saber");
        int s = sc.nextInt();
        for (int i = 0; i < s; i++) {
            System.out.println((char)i);
        }

    }
}
