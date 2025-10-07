import java.util.Scanner;

public class bucle {
        public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // for = contar las iteraciones 
        // while = cuando la ejecución depende de una condición
        // Do while = cuando se debe ejecutar al menos una vez
// --------------------------------------------------------------------------------------------------------
        // for( int i = 1; i<= 10; i++){
        //     System.out.println("i = "+ i);
        // }
// --------------------------------------------------------------------------------------------------------
        // System.out.println("Ponga un número");
        // int x = sc.nextInt();
        // while(x != 0){
        //     System.out.println("ponga 0 para salir del bucle");
        //     x = sc.nextInt();
        // }
        // System.out.println("Has salido del bucle :)");

//--------------------------------------------------------------------------------------------------------
        // System.out.println("Ponga un número");
        // int a = sc.nextInt();
        // do {
        //     System.out.println("ponga 0 para salir del bucle");
        //     a = sc.nextInt();
        // } while (a != 0);
        // System.out.println("Has salido del bucle :)");
// ------------------------------------------------------------------------------------------------------------
        System.out.println("Ponga un número");
        int num = sc.nextInt();
        int e = 0;
        int salida = 0;
        System.out.println("Tabla del "+ num);
        for (e = 0; e <= 10; e++){
                salida = num * e;
                System.out.println( num +  "X" + e  + "=" + salida);
        }

}
}
