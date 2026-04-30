public class Dado {
    public static void main (String[] args) {
        int numAleatorio;
        System.out.println("Aleatorio: "+Math.random());
        numAleatorio= (int)(Math.random()*6)+1;
        System.out.println("El numero del dado es: "+ numAleatorio);

    }
}
