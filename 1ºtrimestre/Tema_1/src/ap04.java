import java.util.Scanner;

public class ap04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Pedir al usuario que ponga algo

        System.out.println("Tira tres dados");
        System.out.println("Primer dado");
        int x = sc.nextInt();
        System.out.println("Segundo dado");
        int y = sc.nextInt();
        System.out.println("Tercero dado");
        int z = sc.nextInt();
        int puntos = 0;

        if (x == 6) {
            puntos++;
        }
        if (y == 6) {
            puntos++;
        }
        if (z == 6) {
            puntos++;
        }

        

        if (x >= 7 || y >= 7 || z >= 7 || x <= 0 || y <= 0 || z <= 0) {
            System.out.println("error"); //Margen de error
        } else if (puntos == 1) {
            System.out.println("regular");// Si solo saca un punto

        } else if (puntos == 2) {
            System.out.println("Muy bien"); // Si saca dos 

        } else if (puntos == 3) {
            System.out.println("Excelente");

        } else {
            System.out.println("Pésimo");
        }

    }

}
