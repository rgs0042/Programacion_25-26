import java.util.Scanner;

public class segundos {
public static void main(String[] args) throws Exception {
    int horas = 0;
    int minutos = 0;
    int segundos = 0;

    Scanner sc = new Scanner (System.in);
    horas = sc.nextInt();
    minutos = sc.nextInt();
    segundos = sc.nextInt();

    int horascon = horas * 3600; //multiplicar las horas por 3600
    int minscon = minutos * 60; //multiplica los minutos por 60

    int totalseg = horascon + minscon + segundos; //sumamos todo
    
    System.out.println(totalseg); //Calculo de los segundos

    }
}
