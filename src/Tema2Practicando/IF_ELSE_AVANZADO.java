package Tema2Practicando;

import java.util.Scanner;

public class IF_ELSE_AVANZADO {
    public static void main(String[] args) {


        int edad;

        Scanner sc = new Scanner(System.in); //Crea el objeto para leer de teclado
        System.out.println(" Ingrese su edad: ");
        edad= sc.nextInt(); //Leer de teclado un entero


        if (edad < 4){
            System.out.println("Eres un bebé");
        } else if (edad == 5) {
            System.out.println("Vas a primero de primaria");
        } else if (edad == 6) {
            System.out.println("Vas a segundo de primaria");
        } else if (edad == 7) {
        System.out.println("Vas a tercero de primaria");
        } else if (edad == 8) {
            System.out.println("Vas a cuarto de primaria");
        }else if (edad == 9) {
            System.out.println("Vas a quinta de primaria");
        } else if (edad == 10) {
            System.out.println("Vas a sexto de primaria");
        } else {
            System.out.println("No eres un estudiante de primaria");
        }


        //Determinar si estas en infantil, primario u otra cosa


        if (edad < 5){
            System.out.println("Vas a la guardería");
        } else if (edad < 11) { // Edad menor de 11
            System.out.println("Estas en primaria");
        } else {//Edad mayor de 11 o mas
            System.out.println("Estas en otra cosa");
        }
    }
}
