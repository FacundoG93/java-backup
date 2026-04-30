package ar.edu.unlam.pb1.tp2.parteA;

public class Ejercicio4 {
    public static void main(String[] args) {
       String ejemplo = "    Se me escaparon unos espacios   ";

       //Llamo al gil
        String guionazo = antiespacios(ejemplo);
        System.out.println("Con guiones: " + guionazo);
    }

    //El gil en ceustion
    public static String antiespacios(String ejemplo) {
        String limpio = ejemplo.trim(); // quita espacios extremos
        String guionazo = limpio.replace(" ", "-");  // reemplaza espacios internos
        return guionazo; // lo devuelve al main
    }
}
