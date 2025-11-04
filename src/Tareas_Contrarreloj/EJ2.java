package Tareas_Contrareloj;

import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {

        double base,altura;
        double perimetro,area;

        //Añadimos la funcion de Scanner
        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado

        System.out.println("Ingrese la base de su rectangulo: ");
        base = sc.nextDouble(); //Leer de teclado un decimal

        System.out.println("Ingrese la altura de su rectangulo: ");
        altura = sc.nextDouble(); //Leer de teclado un decimal

        perimetro= 2 * base + 2 * altura;
        area= base * altura;

        System.out.println("El perímetro de su rectangulo es de: " + perimetro);
        System.out.println("El area de su rectangulo es de: " + area);
    }
}
