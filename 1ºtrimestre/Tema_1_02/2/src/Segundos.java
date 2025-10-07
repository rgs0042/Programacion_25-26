import java.util.Scanner;

public class Segundos{
    public static void main(String[] args) throws Exception {
        int dias = 0;
        int horas = 0;
        int mins = 0;
        int seg = 0;



        Scanner sc = new Scanner(System.in);
        System.out.println("Dime los días");
        dias = sc.nextInt();
        System.out.println("Dime las horas");
        horas = sc.nextInt();
        System.out.println("Dime los minutos");
        mins = sc.nextInt();
        System.out.println("Dime los segundos");
        seg = sc.nextInt();
        
        final int diaseg = dias * 86400;
        final int horaseg = horas * 3600;
        final int minseg = mins * 60;

        int totalseg = diaseg + horaseg + minseg + seg;

        System.out.println(totalseg);

    }
}
