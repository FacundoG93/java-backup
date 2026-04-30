package ar.edu.unlam.pb1.tp1old;

public class Ejercicio9 {
    public static void main (String[] args){
        /*
        int capacidad_hdd = 1; //expresado en teras
        double capacidad_DVD = 8.5; //expresado en Gigas
        double capacidad_blueray = 25.0; //expresado en Gigas
        int cantidadDVDParaBackupearHDD;
        int cantidadBlueRayParaBackupearHDD;
        int conversionDeUnidad = 1024;

        cantidadDVDParaBackupearHDD = ((capacidad_hdd*conversionDeUnidad)/capacidad_DVD);
        cantidadBlueRayParaBackupearHDD = ((capacidad_hdd*conversionDeUnidad)/capacidad_blueray);

        System.out.println("Cantidad de DVD que se requieren para backuppear el hdd: "+ cantidadDVDParaBackupearHDD);
        System.out.println("Cantidad de BlueRay que se requieren para backuppear el hdd: "+ cantidadBlueRayParaBackupearHDD);
         */

        //a_ Lo que pasa es que no pueden interactuar dos datos diferentes de tipos (en este caso int y double)
        //b_ Yo haria que todos los tipos sean floats, asi no hay problemas con los decimales.
        int capacidad_hdd = 1; //expresado en teras
        float capacidad_DVD = 8.5F; //expresado en Gigas
        float capacidad_blueray = 25; //expresado en Gigas
        float cantidadDVDParaBackupearHDD;
        float cantidadBlueRayParaBackupearHDD;
        float conversionDeUnidad = 1024;

        cantidadDVDParaBackupearHDD = ((capacidad_hdd*conversionDeUnidad)/capacidad_DVD);
        cantidadBlueRayParaBackupearHDD = ((capacidad_hdd*conversionDeUnidad)/capacidad_blueray);

        System.out.println("Cantidad de DVD que se requieren para backuppear el hdd: "+ cantidadDVDParaBackupearHDD);
        System.out.println("Cantidad de BlueRay que se requieren para backuppear el hdd: "+ cantidadBlueRayParaBackupearHDD);

        //c_ Podria ser mejor? Si, pero esta bastante bien.
    }
}
