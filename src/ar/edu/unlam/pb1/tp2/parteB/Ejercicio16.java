package ar.edu.unlam.pb1.tp2.parteB;
import java.util.Scanner;

public class Ejercicio16 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int num = scanner.nextInt();

        double logN = Math.log(num);
        double log10 = Math.log10(num);
        System.out.println("\nEl log natural del numero es: "+logN+"\nEl log base 10 del numero es: "+log10);
    }
}
