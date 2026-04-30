package ar.edu.unlam.pb1.tp2.parteB;
import java.util.Scanner;

public class Ejercicio15{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Ingrese el primer numero: ");
        int n1 = sc.nextInt();

        System.out.print("\nIngrese el segundo numero: ");
        int n2 = sc.nextInt();

        int mayor = Math.max(n1, n2);
        int menor = Math.min(n1, n2);
        System.out.print("\n\nEl mayor es: "+mayor+"\nEl menor es: "+menor);

    }
}