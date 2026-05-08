package ar.edu.unlam.pb1.tp2.parteA;
import java.util.Arrays;

public class Ejercicio1 {
    public static void main(String[] args) {
        //Investigar charAt(), length(), toLowerCase(), trim(), substring(), split().
        String ejemplo = "        Testeando los chiches que se pueden hacer en java      ";


        //     charAt(): Returns the char value at the specified index.
        char mostrarCaracterElecto = ejemplo.charAt(40); //quiero mostrar una R
        System.out.println("El Caracter Seleccionado es: "+mostrarCaracterElecto);


        //     length(): Returns the length of this string.
        int cantidadCaracteres= ejemplo.length();
        System.out.println("\nLa cantidad de caracteres en el string es de: "+cantidadCaracteres);

        //     toLowerCase(): Converts all of the characters in this String to lower case using the rules of the default locale.
        String MINUSCULAS = ejemplo.toLowerCase();
        System.out.println("\nEl string todo en minuscula es: "+ MINUSCULAS);

        //     trim(): Returns a string whose value is this string, with all leading and trailing space removed, where space is defined as any character whose codepoint is less than or equal to 'U+0020' (the space character).
        String espacio = ejemplo.trim();
        System.out.println("\nEl string sin espacios al inicio y final es: "+ espacio);

        //     substring(int beginIndex, int endIndex): Returns a string that is a substring of this string.
        String corte = ejemplo.substring(14, 21);
        System.out.println("\nEl highlight del string es: '"+ corte+"'");

        //     split(): Splits this string around matches of the given regular expression.
        String [] palabrasSeparadas = ejemplo.split("e"); // corta por la letra 'e'
        System.out.println("\nEl string original separado por 'e's: " + palabrasSeparadas);
        //Lo muestra feo, para mostrar el contenido del array, tengo que:
        //Hay que hacer import java.util.Arrays;
        //Arrays.toString(variable donde fue guardado, no "ejemplo")

        System.out.println("\n\n\nEl string original separado por 'e's: " + Arrays.toString(palabrasSeparadas));

    }
}
