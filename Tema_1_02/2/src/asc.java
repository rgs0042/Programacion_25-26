import java.util.Scanner;

public class asc{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        
        int uno = 0;
        int dos = 0;
        int tres = 0;

        System.out.println("Dime el primer número");
        uno= sc.nextInt();
        System.out.println("Dime el segundo número");
        dos= sc.nextInt();
        System.out.println("Dime el tercer número");
        tres= sc.nextInt();
        
        if (uno < dos && dos < tres){
            System.out.println("los nuemeros son de sentido ascendente");
        } else {
            System.out.println("Escribe los número de manera ascendente");
        }

        

    }
}
