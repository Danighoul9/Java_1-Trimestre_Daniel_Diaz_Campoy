package Tareas_Contrareloj;

import java.util.Scanner;

public class EJ1 {
    public static void main(String[] args) {
        //Añadimos la funcion de Scanner
        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado

        String nombre;

        System.out.println(" Ingrese su nombre: ");
        nombre = sc.nextLine(); //Leer de teclado un decimal

        System.out.println("Hola,¿que tal estas? " + nombre);
    }
}
