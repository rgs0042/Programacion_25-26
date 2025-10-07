import java.util.Scanner;

public class par{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int num = 0;
        
        System.out.println("Dime un número");
        num= sc.nextInt();

        int resto = num%2;

        if (resto==1){
            System.out.println("el número es impar");
        }else {
            System.out.println("el número es par");
        }

    }
}
