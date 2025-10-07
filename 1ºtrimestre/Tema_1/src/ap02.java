import java.util.Scanner;

public class ap02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Pedir al usuario que ponga algo

        System.out.println("Intriduce un día de la semana");
        int x = sc.nextInt();

        switch (x) {
            case 1:
                System.out.println("Día entre semana");
                break;
            case 2:
                System.out.println("Día entre semana");
                break;
            case 3:
                System.out.println("Día entre semana");
                break;
            case 4:
                System.out.println("Día entre semana");
                break;
            case 5:
                System.out.println("Día entre semana");
                break;
            case 6:
                System.out.println("Día entre semana");
                break;
            case 7:
                System.out.println("Día entre semana");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }
}
