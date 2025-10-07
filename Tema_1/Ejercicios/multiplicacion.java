import java.util.Scanner;

public class multiplicacion {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner (System.in); // Pedir al usuario que ponga algo
        

        int x = 0;
        int y = 0;

        System.out.println("Introduce el primer número: ");
        
        x = sc.nextInt();

        System.out.println("Introduce el segundo número: ");

        y = sc.nextInt();

        System.out.println("La multiplicación es: "); //aqui se hace la multiplicación
        
        System.out.println(x * y);
        
    }
}

