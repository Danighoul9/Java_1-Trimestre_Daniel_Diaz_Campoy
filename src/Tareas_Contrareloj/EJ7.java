package Tareas_Contrareloj;

import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {

        double descuento = 15;
        double valorCompra;
        double resultado;

        //2.Usamos el scanner para que el usuario introduzca los minutos deseados
        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado

        System.out.println(" Ingrese el valor de su compra ");
        valorCompra = sc.nextDouble(); //Leer de teclado un decimal

        resultado= valorCompra - ((valorCompra * descuento) /100);

        System.out.println("Tu compra se queda en unos " + resultado + "€ con el 15% de descuento");


    }
}
