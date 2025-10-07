import java.util.Scanner;

public class fechas {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime los días");
        int dia = sc.nextInt();
        System.out.println("Dime los meses");
        int mes = sc.nextInt();
        System.out.println("Dime los años");
        int anyo = sc.nextInt();

        if (dia > 31 && mes > 12 && anyo < 0 && dia < 0 && mes < 0) {
            System.out.println("error");
        } else {

            switch (mes) {
                case 1:
                    if (dia == 31) {
                        mes = mes + 1;
                        dia = 0;
                    } else if (dia == 30) {
                        mes = mes + 1;
                        dia = -1;
                    }
                    break;
                case 2:
                    if (anyo % 4 == 0) {
                        if (dia == 29) {
                            mes = mes + 1;
                            dia = 0;
                        } else if (dia == 28) {
                            mes = mes + 1;
                            dia = -1;
                        }
                    } else if (dia == 28) {
                        mes = mes + 1;
                        dia = 0;

                    } else if (dia == 27) {
                        mes = mes + 1;
                        dia = -1;
                    }
                    break;
                case 3:
                    if (dia == 31) {
                        mes = mes + 1;
                        dia = 0;
                    } else if (dia == 30) {
                        mes = mes + 1;
                        dia = -1;
                    }
                    break;
                case 4:
                    if (dia == 30) {
                        mes = mes + 1;
                        dia = 0;
                    } else if (dia == 29) {
                        mes = mes + 1;
                        dia = -1;
                    }
                    break;
                case 5:
                    if (dia == 31) {
                        mes = mes + 1;
                        dia = 0;
                    } else if (dia == 30) {
                        mes = mes + 1;
                        dia = -1;
                    }
                    break;
                case 6:
                    if (dia == 30) {
                        mes = mes + 1;
                        dia = 0;
                    } else if (dia == 29) {
                        mes = mes + 1;
                        dia = -1;
                    }
                    break;
                case 7:
                    if (dia == 31) {
                        mes = mes + 1;
                        dia = 0;
                    } else if (dia == 30) {
                        mes = mes + 1;
                        dia = -1;
                    }
                    break;
                case 8:
                    if (dia == 30) {
                        mes = mes + 1;
                        dia = 0;
                    } else if (dia == 29) {
                        mes = mes + 1;
                        dia = -1;
                    }
                    break;
                case 9:
                    if (dia == 31) {
                        mes = mes + 1;
                        dia = 0;
                    } else if (dia == 30) {
                        mes = mes + 1;
                        dia = -1;
                    } else if (dia == 29) {
                        mes = mes + 1;
                        dia = -1;
                    }
                    break;
                case 10:
                    if (dia == 30) {
                        mes = mes + 1;
                        dia = 0;
                    } else if (dia == 29) {
                        mes = mes + 1;
                        dia = -1;
                    }
                    break;
                case 11:
                    if (dia == 31) {
                        mes = mes + 1;
                        dia = 0;
                    } else if (dia == 30) {
                        mes = mes + 1;
                        dia = -1;
                    }
                    break;
                case 12:
                    if (dia == 30) {
                        mes = 1;
                        dia = 0;
                        anyo = anyo + 1;
                    } else if (dia == 29) {
                        mes = mes + 1;
                        dia = -1;
                    }
                    break;

                default:
                    break;
            }
            dia = dia + 2;
            System.out.println("La fecha es= " + String.format("%02d", dia) + " / " + String.format("%02d", mes) + " / "
                    + String.format("%02d", anyo));
        }

    }
}
