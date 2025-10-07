import java.util.Scanner;

public class ascii {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        char letramin = 'a';
        int nummin = (int) letramin;
        int numma = nummin - 32;
        char letrama = (char) numma;
        System.out.println(letrama);

        char letra = 'e';
        int numero = ((int) letra) - 32;
        System.out.println((char) numero);

        String letre = "ola k ase";
// charAt para indicar la posición de la letra en una serie de carácteres
// .length() dice cuantos datos hay en una frase
        for (int i = 0; i < letre.length(); i++) {
            char letro = letre.charAt(i);
            int numletra = (int) letro - 32;
            System.out.println((char) numletra);

        }
    }
}
