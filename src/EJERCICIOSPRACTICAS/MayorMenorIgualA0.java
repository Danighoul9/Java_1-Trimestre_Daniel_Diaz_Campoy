package EJERCICIOSPRACTICAS;

import java.util.Scanner;

public class MayorMenorIgualA0 {
    public static void main(String[] args) {


        //Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a
        //introducir). El programa debe informar de cuantos números introducidos son mayores que
        //0, menores que 0 e iguales a 0.

        //Vamos a pedir 3 numeros y compararlos con 0
        Scanner sc = new Scanner(System.in);

        int n1,n2,n3;

        System.out.println("Vamos a comparar tus numerso introducidos con 0");

        do {
            System.out.println("Introduce el numero 1: ");
            n1 = sc.nextInt();

            System.out.println("Introduce el numero 2: ");
            n2 = sc.nextInt();

            System.out.println("Introduce el numero 3: ");
            n3 = sc.nextInt();


            //Comparamos n1 con 0

            if(n1 > 0){
                System.out.println("El numero 1 es mayor a 0");
            }else if(n1 < 0){
                System.out.println("EL numero 1 es menor a 0");
            }else{
                System.out.println("El numero 1 es igual a 0");
            }

            //Comparamos n2 con 0
            if(n2 > 0){
                System.out.println("El numero 2 es mayor a 0");
            }else if(n2 < 0){
                System.out.println("EL numero 2 es menor a 0");
            }else{
                System.out.println("El numero 2 es igual a 0");
            }

            //Comparamos n3 con 0
            if(n3 > 0){
                System.out.println("El numero 3 es mayor a 0");
            }else if(n3 < 0){
                System.out.println("EL numero 3 es menor a 0");
            }else{
                System.out.println("El numero 3 es igual a 0");
            }


        }while (true);
    }
}

