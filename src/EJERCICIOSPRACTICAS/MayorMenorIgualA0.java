package EJERCICIOSPRACTICAS;

import java.util.Scanner;

public class MayorMenorIgualA0 {
    public static void main(String[] args) {


        //Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a
        //introducir). El programa debe informar de cuantos números introducidos son mayores que
        //0, menores que 0 e iguales a 0.

        //Vamos a pedir 3 numeros y compararlos con 0
        Scanner sc = new Scanner(System.in);

        int n;
        int num;
        int i;
        int contadorMayorA0 = 0;
        int contadorMenorA0 = 0;
        int contadorIgualA0 = 0;


        System.out.println("Vamos a comparar tus numeros introducidos con 0");
        System.out.println("¿Cuantos numeros vas a poner?");
        n = sc.nextInt();


        for(i=1; i<=n;i++){
            System.out.println("Dime un numero");
            num = sc.nextInt();

            if(num < 0){
                contadorMayorA0++;
            } else if (num > 0){
                contadorMenorA0++;
            }else{
                contadorIgualA0++;
            }

        }

        System.out.println("Hay " + contadorMayorA0 + " numeros mayores a 0");
        System.out.println("Hay " + contadorMenorA0 + " numeros menores a 0");
        System.out.println("Hay " + contadorIgualA0 + " numeros iguales a 0");





    }
}

