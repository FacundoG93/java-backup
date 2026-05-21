package ar.edu.unlam.pb1.repaso.tarjeta;

public class Tarjeta {
    private long numeroTarjeta;
    private String nombrePropietario;
    private double dniPropietario;
    private double saldo;
    private String nivelTarjeta;

    //Las defino acá?
    private int totalRegalos;
    private double totalSaldoGastado;

    public Tarjeta(long numeroTarjeta, String nombrePropietario, double dniPropietario) {
        this.numeroTarjeta = numeroTarjeta;
        this.nombrePropietario = nombrePropietario;
        this.dniPropietario = dniPropietario;
        this.saldo = 0;
        this.nivelTarjeta = "Sin nivel";
    }


    //GETTERS+SETTERS
        //NIVEL TARJETA
        public String getNivelTarjeta() {
            return nivelTarjeta;
        }
        public void setNivelTarjeta(String nivelTarjeta) {
            this.nivelTarjeta = nivelTarjeta;
        }


        //SALDO
        public double getSaldo() {
            return saldo;
        }
        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        //DNI PROPIETARIO
        public double getDniPropietario() {
            return dniPropietario;
        }
        public void setDniPropietario(double dniPropietario) {
            this.dniPropietario = dniPropietario;
        }

        //NOMBRE DEL PROPIETARIO
        public String getNombrePropietario() {
            return nombrePropietario;
        }
        public void setNombrePropietario(String nombrePropietario) {
            this.nombrePropietario = nombrePropietario;
        }

        //NUMERO DE TARJETA
        public long getNumeroTarjeta() {
            return numeroTarjeta;
        }
        public void setNumeroTarjeta(long numeroTarjeta) {
            this.numeroTarjeta = numeroTarjeta;
        }


    //Metodos de la interfaz:
    //1. verDatos
    public void verDatos(){
        System.out.println("Numero de la tarjeta: "+numeroTarjeta);
        System.out.println("Propietario: "+nombrePropietario);
        System.out.println("DNI: "+dniPropietario);
        System.out.println("Saldo: "+saldo);
        System.out.println("Nivel: "+nivelTarjeta);
    }

    //2. consultarNivel
    public void consultarNivelDeTarjeta(){
        // Evaluamos sin puntos de miles y asignamos el valor al atributo de la clase
        if (saldo >= 50000) {
            this.nivelTarjeta = "PLATINUM";
        } else if (saldo >= 10000) {
            this.nivelTarjeta = "GOLD";
        } else {
            this.nivelTarjeta = "BASIC";
        }

        // Ahora mostramos la variable actualizada
        System.out.println("Nivel: " + this.nivelTarjeta);
    }


    //3.Cargar tarjeta
    public void recargarTarjeta(double montoCarga){
        saldo+=montoCarga;
    }



    //4. Comprar regalo
    public void realizarCompra(double montoCompra) {
        //Indicar si se hizo la compra teniendo en cuenta:
        if (saldo >= montoCompra) { //1- Si hay saldo disponible se realiza,
            saldo -= montoCompra; //1.2- se actualiza el monto
            System.out.println("Compra realizada con éxito!"); //1.3- se confirma la operación
            totalRegalos += 1; //1.3- Se contabiliza la cantidad de regalos comprados
            totalSaldoGastado +=montoCompra; //1.4- Se contabiliza el total del saldo gastado en compras

        } else System.out.println("No se puede realizar la operacaión, el saldo no es suficiente."); //2- Si no hay saldo no se realiza
        //2.1 Se informa que no hay saldo

    }



    //5. Aplicar descuento por la promoción
    public void aplicarDescuentoPromocion(double montoPromo){

        //Indica si se pudo aplicar el descuento
        //1- Se debe verificar si el monto ingresado puede acceder a un descuento, consultar el método obtenerDescuento(monto)
            //1.2- Si accede al descuento:
                //1.2.1- Actualiza saldo disponible restando el monto final
                //1.2.2- Aplica el descuento correspondiente
                //1.2.3- Confirma operación de compra

                //1.2.4- Contabiliza regalos comprados
                //1.2.5- Contabiliza el total del saldo gastado en TODAS las compras

            //1.3- Si no accede al descuento se informa
    }


    //MEOTODS PARA REALIZAR LOS DE LA INTERFAZ
    public double obtenerDescuento(double montoDescuento){
        double descuento = 0.0; //inicializamos primero en 0
        //1 Si hay suficiente saldo

        if (montoDescuento>=1.000 && montoDescuento<10.000){ //1.1- If compra >= 1.000   &&   compra<10.000  then  Descuento=5%
            descuento= montoDescuento*0.05;
        } else if (montoDescuento<50.000) {
            descuento= montoDescuento*0.15;
        }

        if (descuento >20000){ //1.3- El descuento máximo debe ser de 20.000, si se supera, asignar este valor
            descuento = 20.0000;
        }

        return descuento;
    }
}
