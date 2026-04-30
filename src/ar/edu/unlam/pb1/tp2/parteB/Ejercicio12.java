package ar.edu.unlam.pb1.tp2.parteB;

public class Ejercicio12 {
    public static void main (String[] args){
        double radio = 5;
        double area = Math.PI * (radio * radio);
        System.out.println("El área de un círculo con radio 5 es de: " + area);

        //Otra forma es:
        double areaPOW = Math.PI * Math.pow(radio, 2);
        System.out.println("El área de un círculo con radio 5 es de: " + areaPOW);
    }
}
