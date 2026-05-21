package ar.edu.unlam.pb1.tp2old;

public class Persona{
    String Nombre;
    String Genero;
    long DNI;
    float peso;
    float altura;

    public Persona(String Nombre, String Genero, long DNI, float peso, float altura){
        this.Nombre = Nombre;
        this.Genero = Genero;
        this.DNI = DNI;
        this.peso = peso;
        this.altura= altura;

    }

    public void mostrarNombre(){
        System.out.println("Hola, mí nombre es "+Nombre);
    }

    public void saltar(){
        System.out.println("Salto. Ya salté.");
    }

    public void alimentar(float cantidadComida){
        peso+=cantidadComida;
        System.out.println(Nombre+" comíó "+cantidadComida+"kg de comida.");
    }

}