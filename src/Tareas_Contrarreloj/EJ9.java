package Tareas_Contrareloj;

public class EJ9 {
    public static void main(String[] args) {

        //Punto1 (x1,x2)
        //Punto2 (y1,y2)
        double x1,x2,y1,y2;
        double distancia;

        x1=89.99;
        x2=76.11;

        y1=23.99;
        y2=98.32;


        distancia= Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.println(distancia);
    }
}
