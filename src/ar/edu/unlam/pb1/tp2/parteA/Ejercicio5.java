package ar.edu.unlam.pb1.tp2.parteA;

public class Ejercicio5 {
    public static void main (String [] args){
        String mail = "pepito@yahoo.com";
        int arroba = mail.indexOf('@');
        String dominio = mail.substring(arroba);
        System.out.println("El domnio del mail que usa elmuchacho es: "+dominio);

    }
}
