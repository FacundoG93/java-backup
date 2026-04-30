package ar.edu.unlam.pb1.tp2.parteB;
import java.util.Scanner;
public class Ejercicio14 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el angulo de 45: ");
        int angulo = sc.nextInt();

        float radianeitor = (float) Math.toRadians(angulo);

        float sen = (float) Math.sin(radianeitor);
        float cos = (float) Math.cos(radianeitor);

        System.out.print("\n\nEl angulo original es: "+angulo+"\nEl angulo pasado a radianes es: "+radianeitor+"\nEl seno del angulo es: "+sen+"\nEl coseno del angulo es: "+cos);

    }
}
