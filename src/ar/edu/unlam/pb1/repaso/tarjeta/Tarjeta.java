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
    public void aplicarDescuentoPromocion(double montoPromo) {
        // 1. Consultamos cuánto descuento le corresponde a este monto
        double descuentoAutilizar = obtenerDescuento(montoPromo);

        // 2. Calculamos el precio real final que se le va a cobrar al usuario
        double montoFinalConDescuento = montoPromo - descuentoAutilizar;

        // 3. Verificamos si hay saldo suficiente para afrontar el costo final
        if (this.saldo >= montoFinalConDescuento) {
            this.saldo -= montoFinalConDescuento; // Restamos el dinero

            // Sumamos las estadísticas globales de la tarjeta
            this.totalRegalos += 1;
            this.totalSaldoGastado += montoFinalConDescuento;

            System.out.println("¡Compra con promoción completada con éxito!");
            System.out.println("Monto original: $" + montoPromo + " | Descuento aplicado: $" + descuentoAutilizar);
            System.out.println("Saldo cobrado final: $" + montoFinalConDescuento);
        } else {
            System.out.println("No se puede realizar la compra, el saldo es insuficiente.");
        }
    }


    //MEOTODS PARA REALIZAR LOS DE LA INTERFAZ
    public double obtenerDescuento(double montoDescuento) {
        double descuento = 0.0;

        // Evaluamos: si es mayor o igual a 10000 (sin ponerle techo de 50000)
        if (montoDescuento >= 10000) {
            descuento = montoDescuento * 0.15; // Aplica 15%
        } else if (montoDescuento >= 1000 && montoDescuento < 10000) {
            descuento = montoDescuento * 0.05; // Aplica 5%
        }

        // Si el 15% calculado supera los 20.000 (por ejemplo en una compra de $150.000), se clava en el tope
        if (descuento > 20000) {
            descuento = 20000;
        }

        return descuento;
    }

    //PARTE FINAL, ya sería el return del resumen esto
    public int getTotalRegalos() {
        return totalRegalos;
    }

    public double getTotalSaldoGastado() {
        return totalSaldoGastado;
    }
}
