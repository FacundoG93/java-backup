package ar.edu.unlam.pb1.tp1old;

public class Ejercicio8 {
    public static void main (String[] args) {
        int preincremento = 5, postincremento =5;
        System.out.println("Pre Incremento: "+ ++preincremento);
        System.out.println("Post Incremento: "+ postincremento++);
        // Lo que pasa es que al estar el operasdor "++" antes del llamado a la variable de "preincremento" se incrementa la variable y luego se muestra. Mientras quer en "postincremento" es el caso contrario, pero si yo volviera a omprimir la variable, se mostrara con el valor de 6.
    }
}
