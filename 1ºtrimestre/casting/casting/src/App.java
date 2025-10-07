public class App {
    public static void main(String[] args) throws Exception {
        // Casting implícito
        // Número entero
        int entero = 100;
        // Número entero largo
        long enterolargo = entero;
        // Número decimal
        float decimal = enterolargo ;
        // Número decimal largo
        double decimallargo = decimal;

        System.out.println(entero);
        System.out.println(enterolargo);
        System.out.println(decimal);
        System.out.println(decimallargo);

        // Casting explícito
        // Número entero
        double decimallarge = 100;
        // Número entero largo
        float decimale = (float)decimallarge;
        // Número decimal
        long enterolarge = (long)decimale ;
        // Número decimal largo
        int entere = (int)enterolarge;

        System.out.println(entere);
        System.out.println(enterolargo);
        System.out.println(decimal);
        System.out.println(decimallargo);

        // Casting explícito caracteres
        int num1 = 0;
        char letra = (char)num1;
    }
}
