package ar.edu.unlam.pb1.tp2.parteA;

public class Ejercicio2 {
    public static void main (String[] args) {
        String minuscula = "java es case sensitive";
        int caracteres= minuscula.length();
        System.out.println("\nLa cantidad total de caracteres es de: "+caracteres);

        String MAYUS = minuscula.toUpperCase();
        System.out.println("\n"+MAYUS+".");
    }
}
