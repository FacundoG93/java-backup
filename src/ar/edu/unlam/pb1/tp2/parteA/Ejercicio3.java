package ar.edu.unlam.pb1.tp2.parteA;

public class Ejercicio3 {
    public static void main (String [] args){
        String archivo = "CV.pdf";
        String tipo = archivo.endsWith(".pdf") ? ("PDF") : archivo.endsWith(".png") ? ("PNG"): archivo.endsWith(".jpg") ? ("JPG") : ("Estension no valida");
        System.out.println("El tipo de archivo es: "+tipo);



        //postgress, correr linux, gcp trgratis, conectarlo,hacer correr openclaude en local, hacer correr imagenes docker
    }
}
