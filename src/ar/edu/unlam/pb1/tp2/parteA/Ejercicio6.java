package ar.edu.unlam.pb1.tp2.parteA;

public class Ejercicio6 {
    public static void main(String[] args) {
        String palabra = "sebas";

        // Reverse the string using StringBuilder
        String invertida = new StringBuilder(palabra).reverse().toString();

        // Compare directly with equals()
        boolean esPalindromo = palabra.equals(invertida);

        System.out.println("¿Es palíndromo?\n" + esPalindromo);
    }
}
