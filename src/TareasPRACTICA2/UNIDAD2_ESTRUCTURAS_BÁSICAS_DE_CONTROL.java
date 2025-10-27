package TareasPRACTICA2;

import java.util.Scanner;

public class UNIDAD2_ESTRUCTURAS_BÁSICAS_DE_CONTROL {
    static Scanner sc = new Scanner(System.in);

    public static void mayor(int a, int b, int c){

        //A es mayor
        if( a > b && a > c){
            System.out.println(a + " es el número mayor");
        }

        //B es mayor
        if( b > a && b > c){
            System.out.println(b + " es el número mayor");
        }

        //C es mayor
        if( c > a && c > b){
            System.out.println(c + " es el número mayor");
        }

        //Hay 2 iguales y no hay numero o mayor, o TODOS son iguales
        if (a == b && a != c || a == c && a != b || b == a && b != c || b ==c && b != a || c == a && c != b || c == b && c != a){
            System.out.println("HAY 2 NUMEROS IGUALES, por lo tanto no hay un número mayor");
        }else if( a == b && a == c || b == a && b == c || c == a && c ==b){
            System.out.println("Todos son iguales");
        }
    }
    public static void main(String[] args) {

        //1. Crea una función (método) que reciba como parámetros tres números enteros y devuelva el mayor de
        //los tres números. Utilizar esa función para el calcular el mayor de cuatro números enteros. Sería así:
        //public int mayor (int a, int b, int c) { … }

        int a;
        int b;
        int c;

        System.out.println("Dime un número");
        a= sc.nextInt();
        System.out.println("Dime un número");
        b= sc.nextInt();
        System.out.println("Dime un número");
        c= sc.nextInt();

        mayor(a,b,c);



//-------------------------------------------------------------------------------------------------------------


    }
}
