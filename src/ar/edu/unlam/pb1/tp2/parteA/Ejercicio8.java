package ar.edu.unlam.pb1.tp2.parteA;

public class Ejercicio8 {
    public static void main (String[] args){
        long tarjeta = 8172369127346521L;
        String STRtarjeta = String.valueOf(tarjeta);

        int cantidad = STRtarjeta.length();
        System.out.println("La cantidad de numeros ingresados es de: "+cantidad); //verifico que sea una tarjeta (osea, maximo 16 numeros)

        String primer = STRtarjeta.substring(0, cantidad-4);//agarro todos los digitos de la tarjeta EXCEPTO los ultimos 4
        String ultimos = STRtarjeta.substring(cantidad-4);
        String censura = "X".repeat(primer.length());
        System.out.println("Su tarjeta es: "+censura+ultimos);
    }
}
