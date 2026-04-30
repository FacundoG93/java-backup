package ar.edu.unlam.pb1.tp1old;

public class Ejercicio2 {
    public static void main(String[] args) {
        int maximo = Byte.MAX_VALUE;
        System.out.println("El numero maximo d byte es: "+ maximo);
        maximo+=3;
        System.out.println("Ahora vale: "+maximo);
    }
}


/*
lo que pasa cuando sumamos al valor maximo, es que se repite el rango (-2147483648 hasta 2147483647), por eso si sumo 1 seria -2147483648

Una forma de solucionar esto es cambiando el tipo de variable a long o a bigint, pero esta segunda ya no es tan recomendable para numeros no taaaaaaan grandes
 */