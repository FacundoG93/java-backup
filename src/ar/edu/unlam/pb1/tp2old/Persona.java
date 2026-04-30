package ar.edu.unlam.pb1.tp2old;

public class Persona {
    int edad;
    double peso, altura;
    long dni;
    public String nombre, genero; //variable de instancia vs constante
    final static String apellido = "Gutierrez"; //Esta es una constante
    boolean viva;

    //Constructor metodo que se ejecuta cuando haces new
    public Persona(String nombre) {
        this.nombre=nombre;
         //apellido= "Fernandez";
    }


    public void saltar() {
        System.out.println(nombre + " esta saltando!");
    }
}
