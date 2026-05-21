package ar.edu.unlam.pb1.repaso.tarjeta;

import javax.lang.model.type.IntersectionType;
import java.util.Scanner;

public class InterfazPruebaTarjeta {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        //1. SE LE PIDEN DATOS AL USUARIO PARA CREAR OBJETO
            //Usuario ingresa numero Tarjeta
            System.out.print("Ingrese el numero de la tarjeta: ");
            long numeroTarjeta = Long.parseLong(scanner.nextLine());

            //Usuario ingresa Nombre
            System.out.print("Ingrese el nombre del propietario de la tarjeta: ");
            String nombrePropietario = scanner.nextLine();

            //Usuario ingresa el DNI
            System.out.print("Ingrese el DNI del propietario: ");
            double dniPropietario = Double.parseDouble(scanner.nextLine());

        //2. SE CREA EL OBJETO
        Tarjeta miTarjeta = new Tarjeta(numeroTarjeta, nombrePropietario, dniPropietario);

        //3.Bucle menu
        int operacion=0;
        do {
            System.out.print("/n/nElija una operacióna  realizar:\n1.Ver datos de la tarjeta\n2.Consultar Nivel\n3.Cargar saldo\n4.Comprar regalo\n5.Comprar regalo con promoción\n6.Slir\n\nOperación a realizar: ");
            operacion = Integer.parseInt(scanner.nextLine());
            switch (operacion){
                case 1:
                    //[Nombre del objeto creado por el usuario].verDatos
                    miTarjeta.verDatos();
                    break;
                case 2:
                    miTarjeta.consultarNivelDeTarjeta();
                    break;
                case 3:
                    System.out.print("Ingrese el monto a ingresar en la tarjeta: ");
                    double montoCarga = Double.parseDouble(scanner.nextLine());
                    miTarjeta.recargarTarjeta(montoCarga);
                    System.out.println("Se ha cargado con éxito!\n");
                    break;


                case 4:
                    System.out.print("Indique el monto de la compra: ");
                    double montoCompra = Double.parseDouble(scanner.nextLine());
                    miTarjeta.realizarCompra(montoCompra);
                    break;


                case 5:
                    System.out.print("Indique el monto de la compra a la que aplicará una promoción: ");
                    double montoPromo = Double.parseDouble(scanner.nextLine());
                    miTarjeta.aplicarDescuentoPromocion(montoPromo);
                    break;


                case 6:
                    System.out.println("Gracias por participar!");
                    break;


                default:
                    System.out.println("OPeración no valida.\n");
                    break;
            }
        } while (operacion != 6); // Tu cierre del menú existente

        // --- RESUMEN FINAL AL SALIR ---
        System.out.println("\n=========================================");
        System.out.println("       RESUMEN DE OPERACIONES DE HOY      ");
        System.out.println("=========================================");
        System.out.println("Cantidad de regalos realizados: " + miTarjeta.getTotalRegalos());
        System.out.println("Total de saldo gastado: $" + miTarjeta.getTotalSaldoGastado());
        System.out.println("Saldo actual disponible en tarjeta: $" + miTarjeta.getSaldo());
        System.out.println("=========================================");
    }
}