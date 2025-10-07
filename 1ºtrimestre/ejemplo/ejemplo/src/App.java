import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opt = 0;
        
        do {
            System.out.println("Introduce el ejercicio que quieres ejectuar");
            System.out.println("1- suma");
            System.out.println("2- resta");
            System.out.println("3- multiplicar");
            System.out.println("0- salir");
            opt = sc.nextInt();

            switch (opt) {
                case 1:
                System.out.println("suma");
                    break;
                case 2:
                System.out.println("resta");
                    break;
                case 3:
                System.out.println("multiplicar");
                    break;
                default:
                    break;
            }

        }while (opt != 0);
    }
}
