package ar.edu.unlam.pb1.tp2.parteA;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el link: ");
        String link = sc.nextLine();
        boolean https = link.startsWith("https");
        boolean google = link.contains("google");

        System.out.println("\n\nEl link comienza con 'https': "+https+"\nEl link contiene la palabra 'google': "+google);

    }

}
