import java.util.Scanner;

public class hipo {
public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    double cat1 = 0, cat2 = 0;

    System.out.println("El primer cateto");
    cat1 = sc.nextInt();
    System.out.println("El segundo cateto");
    cat2 = sc.nextInt();

    double hipo = (cat1*cat1) + (cat2*cat2); //aquí se realiza el cuadrado de los catetos
    
    double solu = Math.sqrt(hipo); // aquí se realiza la raíz cuadrada

    System.out.println(solu);

    }
}
