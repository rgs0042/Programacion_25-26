import java.util.Scanner;

public class ap03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Pedir al usuario que ponga algo

        System.out.println("Intriduce un día de la semana");
        int x = sc.nextInt();

        if (x >= 8 || x <= 0) {
            System.out.println("ERROR");
        } else if (x == 7 || x == 6) {
            System.out.println("FIN DE SEMANA");
        } else {
            System.out.println("Día entre semana");
        }
    }
}


