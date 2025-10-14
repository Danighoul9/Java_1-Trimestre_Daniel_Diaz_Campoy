package TareasTema2;

import java.util.Scanner;

public class Ejercicio0_3 {
    public static void main(String[] args) {

        //Me dan como datos de entrada día, mes y año
        //Tengo que determinar si es una fecha correcta
        //No vamos a tener en cuenta años bisiestos

        //DISEÑO
        //Año: 1900-2100 --> fuera de ahí año fuera de rango
        //Meses: 1-12 o Enero-Diciembre
        //Día: 1-28 si es febrero
        //     1-30 si es abril, junio, septiembre, noviembre
        //     1-31 si es enero, marzo, mayo, julio, agosto, octubre, diciembre

        int day, month, year;
        //boolean correcto = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime día (1-31)");
        day = sc.nextInt();
        System.out.println("Dime mes (1-12)");
        month = sc.nextInt();
        System.out.println("Dime año (1900-2100)");
        year = sc.nextInt();

        if (year >= 1900 && year <= 2100) {
            if (month >= 1 && month <= 12) {
                switch (month) {
                    case 2:
                        if (day >= 1 && day <= 28) {
                            System.out.println("Fecha correcta");
                        } else {
                            System.out.println("Fecha incorrecta");
                        }
                        break;
                    case 4,6,9,11:
                        if (day >= 1 && day <= 30) {
                            System.out.println("Fecha correcta");
                        } else {
                            System.out.println("Fecha incorrecta");
                        }
                        break;
                    case 1,3,5,7,8,10,12:
                        if (day >= 1 && day <= 31) {
                            System.out.println("Fecha correcta");
                        } else {
                            System.out.println("Fecha incorrecta");
                        }
                        break;
                }
            } else {
                System.out.println("Mes incorrecto");
            }
        } else {
            System.out.println("Año incorrecto");
        }


    }
}


