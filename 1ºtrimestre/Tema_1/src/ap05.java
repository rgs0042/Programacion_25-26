import java.util.Scanner;

public class ap05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Pedir al usuario que ponga algo

        System.out.println("Introduce piedra, papel o tijera J1");
        String x = sc.nextLine();
        System.out.println("Introduce piedra, papel o tijera J2");
        String y = sc.nextLine();

        if (x.equals("tijera") && y.equals("piedra")) {
            System.out.println("Ganar jugador 2");
        } else if (x.equals("tijera") && y.equals("papel")) {
            System.out.println("Ganar jugador 1");
        } else if (x.equals("papel") && y.equals("piedra")) {
            System.out.println("Ganar jugador 1");
        } else if (x.equals("papel") && y.equals("tijera")) {
            System.out.println("Ganar jugador 1");
        } else if (x.equals("piedra") && y.equals("tijera")) {
            System.out.println("Gana jugador 1");
        } else if (x.equals("piedra") && y.equals("papel")) {
            System.out.println("Gana jugador 2");
        } else if (x.equals("tijera") && y.equals("tijera")) {
            System.out.println("Empate");
        } else if (x.equals("piedra") && y.equals("piedra")) {
            System.out.println("Empate");
        } else if (x.equals("papel") && y.equals("papel")) {
            System.out.println("Empate");
        } else {
            System.out.println("ERROR");
        }

        // System.out.println("Gana jugador 1");

        // System.out.println("Empate");

    }
}
