import java.util.Scanner;

public class fechasmejor {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime los años");
        int anyo = sc.nextInt();
        boolean bis = false;
        boolean error = false;
        if (anyo % 4 == 0) {
            bis = true;
        }
        System.out.println("Dime los días");
        int dia = sc.nextInt();
        if (dia == 29 && bis == true) {
            error = true;
        }
        System.out.println("Dime los meses");
        int mes = sc.nextInt();

        System.out.println("Dime los días que quieres sumar");
        int sum = sc.nextInt();

        if (dia > 31 || dia < 0 || mes > 12 || anyo < 0  || mes < 0 || error == true) {
            System.out.println("Error");
        } else {

            switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    if ((dia + sum) > 31 && mes == 12) {
                        dia = dia - 31;
                        mes = 1;
                        anyo = anyo + 1;

                    } else {
                        mes = mes + 1;
                        dia = dia - 31;

                    }

                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    if ((dia + sum) > 30) {
                        mes = mes + 1;
                        dia = dia - 30;
                    }
                    break;
                case 2:
                    // bi
                    if ((dia + sum) > 29 && bis == true) {
                        mes = mes + 1;
                        dia = dia - 29;
                    }
                    // nobi
                    if ((dia + sum) > 28) {
                        mes = mes + 1;
                        dia = dia - 28;
                    }
                    break;
                default:
                    break;

            }
            dia = dia + sum;
            System.out.println("La fecha es= " + String.format("%02d", dia) + " / " + String.format("%02d", mes) + " / "
                    + String.format("%02d", anyo));
        }

    }
}
