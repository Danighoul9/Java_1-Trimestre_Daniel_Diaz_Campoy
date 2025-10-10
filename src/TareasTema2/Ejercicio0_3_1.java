package TareasTema2;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Ejercicio0_3_1 {
    public static void main(String[] args) {
        //Me dan como datos de entrada día, mes y año
        //Tengo que determinar si es una fecha correcta
        //No vamos a tener en cuenta años bisiestos

        //Diseño
        //Año:1900-2100-->Fuera de ahi años = fuera de rango
        //Meses: 1-12 o Enero a Diciembre
        //Dias: 1-28 ( si es febrero)
        //Dias: 1-30 ( si es Abril, Junio, Septiembre, Noviembre)
        //Dias: 1-31 ( si es Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre)

        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado

        int day, month, year;
        boolean correcto = true;

        System.out.println(" Dime un dia (1-31): ");
        day= sc.nextInt(); //Leer de teclado un entero

        System.out.println(" Dime un mes (1-12):  ");
        month= sc.nextInt(); //Leer de teclado un entero

        System.out.println(" Dime un año (1900-2100):  ");
        year= sc.nextInt(); //Leer de teclado un entero


        if(year < 1900 || year >2100) {  //Comprobamos año
            System.out.println("Año fuera del rango");
        }else if (month < 1 || month > 12){
            System.out.println("Mes fuera del rango");
        }else{
            switch (month){
                case 2:
                    if (day < 1 || day > 28){
                        correcto=false;
                    }break;

                case 4,6,9,11:
                    if (day < 1 || day > 30){
                       correcto=false;
                    }break;

                case 1,3,5,7,8,10,12:
                    if (day < 1 || day > 31){
                        correcto=false;
                    }break;
            }
        }
    }
}
