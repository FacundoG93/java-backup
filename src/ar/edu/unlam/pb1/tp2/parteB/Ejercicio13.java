package ar.edu.unlam.pb1.tp2.parteB;
import java.util.Scanner;

public class Ejercicio13 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero decimal: ");
        float numerin = sc.nextFloat();

        int redondo = Math.round(numerin);
        int arriba = (int) Math.ceil(numerin);
        int abajo = (int) Math.floor(numerin);
        System.out.print("\n\nEl numerito redondeado normal es: "+redondo);

        System.out.print("\nEl numerito redondeado para arriba es: "+arriba);

        System.out.print("\nEl numerito redondeado para abajo es: "+abajo);

    }
}
