import java.util.Scanner;

public class Apuntes {
    public static void main(String[] args) throws Exception {
        System.out.println("HOLA MUNDO");// Escribir en la consola
        int x = 0;
        Scanner sc = new Scanner(System.in); // Pedir al usuario que ponga algo
        x = sc.nextInt();

        char letra = 'N';
        String cadena = "cago en diez";

        boolean booleano = true;

        final int w = 1;// variable constante

        // Operadores
        // IF() "Si" ELSE() "Sino"
        // IF ELSE {}
        // AND && Todo tiene que estar activado
        // OR || Si al menos hay uno activado
        // NOT ! Devuelve el valor contrario
        //
//----------------------------------------------------------------------------------------
        if (x == w ) {
            System.out.println("tas apañao");
        } else if (x >= w) {
            System.out.println("tu eres un espabilado");

        } else {
            System.out.println("vete anda");
        }
// ----------------------------------------------------------------------------------------
        



    }
}
