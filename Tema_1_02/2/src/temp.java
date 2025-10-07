import java.util.Scanner;

public class temp{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        
        int centi = 0;
        
        System.out.println("Dime los centígrados");
        centi = sc.nextInt();
        
        double f = 32 + ((9*centi)/5);
        
        System.out.println(f + "F");
    }
}
