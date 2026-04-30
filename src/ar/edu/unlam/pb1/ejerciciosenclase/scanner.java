package ar.edu.unlam.pb1.ejerciciosenclase;
import java.util.Scanner;

public class scanner {
    public static void main (String [] args){
        int numerito = 4;
        String palabra ="texto";

        Scanner scanner= new Scanner(System.in);

        System.out.print("Ingrese un numerini: ");
        //numerito = scanner.nextLine();
        System.out.print("");
        System.out.print("ingrese una palabra: ");
        palabra = scanner.nextLine();
        System.out.println("La palabra ingresada es: " + palabra);


    }
}
