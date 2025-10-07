import java.util.Scanner;

public class resta {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in); // Pedir al usuario que ponga un número
        

        int x = 0;
        int y = 0;

        System.out.println("Introduce el primer número: ");
        
        x = sc.nextInt();

        System.out.println("Introduce el segundo número: ");

        y = sc.nextInt();

        System.out.println("La resta es: ");
        
        System.out.println(x - y); //aqui se hace la resta
        
    }
}

