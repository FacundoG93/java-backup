package ar.edu.unlam.pb1.tp1old;

public class Ejercicio10 {
    public static void main (String[] args){
        int nota1, nota2;
        nota1= 10;
        nota2= 7;

        boolean promociona= (nota1 >=7) && (nota2 >=7);
        System.out.println("El alumno promociono.");

        boolean desaprueba = (nota1<7) && (nota2<7);
        System.out.println("El alumno desaprobo.");

        boolean aprueba = (nota1>=7) && (nota2<7) || (nota1<=7) && (nota2>7);
        System.out.println("El alumno aprobo.");

    }
}
