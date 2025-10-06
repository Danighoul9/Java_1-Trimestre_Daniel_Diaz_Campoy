package Tareas_Contrareloj;

import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) {

        //Añadimos la funcion de Scanner
        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado

        double gradosF;
        double resultadoCelsius;


        System.out.println("Ingrese los Grados Fahrenheit para convertir a Celsius: ");
        gradosF = sc.nextDouble(); //Leer de teclado un decimal

        resultadoCelsius= (gradosF-32)*5/9;

        System.out.println("Serian " + resultadoCelsius + " Grados Celsius");
    }
}
