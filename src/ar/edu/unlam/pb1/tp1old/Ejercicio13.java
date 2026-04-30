package ar.edu.unlam.pb1.tp1old;

public class Ejercicio13 {
    public static void main (String[] args){
        float ladoA= 12.45F;
        float ladoB= 12;
        float ladoC= 12;

        boolean equilatero=(ladoA==ladoB && ladoA==ladoC);
        boolean isoceles=(ladoA==ladoB && ladoA!=ladoC) || (ladoB==ladoC && ladoB!=ladoA) || (ladoA==ladoC && ladoA!=ladoB);
        boolean escaleno=(ladoA!=ladoB && ladoB!=ladoC && ladoA!=ladoC);

        System.out.println("El triángulo es Equilátero: "+equilatero);
        System.out.println("El triángulo es Isoceles: "+isoceles);
        System.out.println("El triángulo es Escaleno: "+escaleno);
    }
}
