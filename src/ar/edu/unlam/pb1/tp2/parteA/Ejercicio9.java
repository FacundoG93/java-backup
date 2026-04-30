package ar.edu.unlam.pb1.tp2.parteA;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        String palabra1, palabra2;


        System.out.print("\n\nIngrese la primer palabra que quiera usar: ");
        palabra1 = sc.nextLine();

        System.out.print("Ingrese la segunda palabra que quiera usar: ");
        palabra2 = sc.nextLine();

        String primero = (palabra1.compareTo(palabra2)<0) ? palabra1 : palabra2;
        String segundo = (palabra1.compareTo(palabra2)<0) ? palabra2 : palabra1;

        System.out.print("\n\nEl orden alfabetico es:\n1-"+primero+"\n2-"+segundo);
    }
}
