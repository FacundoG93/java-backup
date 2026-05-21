package ar.edu.unlam.pb1.tp2old;

public class EjemploDeVida {
    public static void main (String[] args){
        Persona Sofia = new Persona("Sofia", "Mujer", 38432153, 2.8F, 0.50F);
        Sofia.mostrarNombre();

        //C_
        System.out.println(Sofia);

        //D_
        System.out.println(Sofia.peso);
        System.out.println(Sofia.altura);

        // E_
        Sofia.alimentar(1.0F);

    }
}
