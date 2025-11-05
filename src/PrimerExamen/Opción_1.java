package PrimerExamen;

import java.util.Scanner;

public class Opción_1 {

    //Ponemos el scanner
    static Scanner sc = new Scanner(System.in);

    //Metodo para el ejercicio 1 para llamar al menu
    public static void llamarMenu(){
        System.out.println("1. Muestra la suma de cada uno de sus dígitos");
        System.out.println("2. Que diga si es primo o no");
        System.out.println("3. La longitud de una circunferencia cuyo radio fuera ese número");
        System.out.println("4. Salir");
    }

    //Metodo para el ejercicio 1 sumar 2 digitos
    public static void llamarDigitos(int numDigitos) {

        int i;
        //He usado un valor que guarde numDigitos porque el for que cuenta los digitos que tiene lo descompone hasta que
        // queda solo uno
        int numParaSuma = numDigitos;
        int suma = 0;

        // Contar los dígitos
        for (i = 1; numDigitos / 10 != 0; i++) {
            numDigitos = numDigitos / 10;
        }

        //Calculo de los digitos (Basicamente hace modulos usando el ultimo numero y acumulandose en suma y la división
        //quita ese número ya usado (el ultimo),por lo tanto lo va descomponiendo  y sumando en el acumulador)

        while (numParaSuma != 0) {
            suma = suma + numParaSuma % 10;  // Suma el último dígito (EJ: 12 modulo 10, seria 2, dejando el ultimo digito)
            numParaSuma = numParaSuma / 10; // Quita el último dígito (Al ser un entero no tiene decimales)
        }

        System.out.println("El número consta de " + i + " dígitos.");
        System.out.println("La suma de sus dígitos es: " + suma);
    }

    //Metodo para el ejercicio 1 esPremo? (copiado de un ejercicio anterior para no complicarme)
    public static void esPremo(int num){

        int i;
        int resultado;
        boolean esPremo = true;

        for(i=2; i <= (num-1);i++){

            resultado= num % i;

            if(resultado == 0){
                esPremo = false;
                break;
            }

        }
        if (esPremo){
            System.out.println("El número es primo");
        }else{
            System.out.println("El número no es primo");
        }

    }

    //Metodo para el ejercicio 1 calcularCircunferencia
    public static void calcularCircunferencia(double radio) {
        double circunferencia;

        circunferencia = 2 * Math.PI * radio;
        System.out.println("La circunferencia con radio " + radio + " es: " + circunferencia);
    }

    static void main(String[] args) {
        //OPCIÓN 1

        //Menú
        //Realiza un programa que pida un número por teclado. Luego muestra un menú con las
        //siguientes opciones:

        //1. Muestra la suma de cada uno de sus dígitos
        //2. Que diga si es primo o no
        //3. La longitud de una circunferencia cuyo radio fuera ese número
        //4. Salir

        //Para cada una de las opciones deberás llamar a una función que calcule lo que se pide y
        //devuelva el resultado.

        int opcion = 1;
        do {
            try{
                //Variable para todo el ejercicio (int num)
                int num;

                llamarMenu();
                System.out.println("Ingrese una opcion 1-4");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese un número");
                        num = sc.nextInt();
                        llamarDigitos(num);
                        break;

                    case 2:
                        System.out.println("Ingrese un numero");
                        num = sc.nextInt();
                        esPremo(num);
                        break;

                    case 3:
                        System.out.println("Ingrese un numero");
                        num = sc.nextInt();
                        calcularCircunferencia(num);
                        break;

                    case 4:
                        System.out.println("Gracias por usar nuestro programa");
                        break;
                }
                
            }catch(Exception e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        } while (opcion != 4);



        //Cubitus y Humerus 1
        //Marcus Cubitus y Julius Humerus son dos legionarios que se entretienen en sus ratos
        //libres jugando a juegos de dados, el pasatiempo favorito de los antiguos romanos. Un
        //juego que pudieron haber jugado estos amigos consiste en tirar cada jugador cinco dados
        //de 6 caras. La puntuación es la suma total de puntos, pero hay un bonus de 10 puntos por
        //sacar una escalera (1,2,3,4,5 o 2,3,4,5,6) y un bonus de 20 puntos por sacar los cinco
        //dados iguales. Hay una penalización de 5 puntos si la suma de los dados es menor de 8. El
        //jugador que saca más puntos gana la partida. Escriba un programa que simule varias
        //partidas seguidas de este juego de dados.
    }


}
