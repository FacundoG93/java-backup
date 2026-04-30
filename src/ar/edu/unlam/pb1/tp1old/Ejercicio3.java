package ar.edu.unlam.pb1.tp1old;

public class Ejercicio3 {
    public static void main (String[] args){
        byte MaximoB = Byte.MAX_VALUE;
        System.out.println(MaximoB);
        MaximoB++;
        System.out.println(MaximoB);
        //Lo que pasa cuando sumamos al valor maximo, es que se repite el rango (-128 hasta 127), por eso si sumo 1 seria -128

        short MaximoS = Short.MAX_VALUE;
        System.out.println("\n\n"+MaximoS);
        MaximoS++;
        System.out.println(MaximoS);
        //Lo que pasa cuando sumamos al valor maximo, es que se repite el rango (-32768 hasta 32767), por eso si sumo 1 seria -32768

        long MaximoL = Long.MAX_VALUE;
        System.out.println("\n\n"+MaximoL);
        MaximoL++;
        System.out.println(MaximoL);
        //Lo que pasa cuando sumamos al valor maximo, es que se repite el rango (-9223372036854775808 hasta 9223372036854775807), por eso si sumo 1 seria -9223372036854775808

        float MaximoF = Float.MAX_VALUE;
        System.out.println("\n\n"+MaximoF);
        MaximoF++;
        System.out.println(MaximoF);
        //No pasa nada cuando sumamos al valor maximo

        double MaximoD = Double.MAX_VALUE;
        System.out.println("\n\n"+MaximoD);
        MaximoD++;
        System.out.println(MaximoD);
        //No pasa nada cuando sumamos al valor maximo

        char MaximoC = Character.MAX_VALUE;
        System.out.println("\n\n"+MaximoC);
        MaximoC++;
        System.out.println(MaximoC);
        //No muestra el valor en bits ni en caracteres

        //No se puede hacer con variables booleanas

    }
}
