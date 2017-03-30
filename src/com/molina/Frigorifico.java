package com.molina;

/**
 * Created by Francisco Molina Lopez on 30/03/2017.
 */
public class Frigorifico extends Electrodomestico {

    //Atributos

    private double capacidadTotal;
    private double capacidadCongelador;
    private String caracteristicas;

    //Constructores

    //Constructor por defecto

    public Frigorifico() {
    }

    //Constructor designado

    public Frigorifico(String marca, String modelo, double precioBase, char consumoEnergetico, double altura, double anchura, double peso, double capacidadTotal, double capacidadCongelador, String caracteristicas) {
        super(marca, modelo, precioBase, consumoEnergetico, altura, anchura, peso);
        this.setCapacidadTotal(capacidadTotal);
        this.setCapacidadCongelador(capacidadCongelador);
        this.caracteristicas = caracteristicas;
    }

    //Metodos

    /**
     * Metodo que calcula el precio total de un conjunto variable de frigorificos.
     * @param numDeFrigorificos Frigorifico Cantidad de frigorificos para calcular.
     * @return double Valor del ingreso total de frigorificos
     */
    public static double ingresoTotalFrigorifico(Frigorifico...numDeFrigorificos){
        double ingresoTotal = 0;

        for (Frigorifico frigos: numDeFrigorificos){
            ingresoTotal += frigos.pvp();
        }

        return ingresoTotal;
    }

    /**
     * Metodo que imprime los atributos de Frigorifico.
     * @return String Cadena con los atributos.
     */
    @Override
    public String toString() {
        return  "Frigorifico:" + '\n' +
                super.toString() +
                "CapacidadTotal: " + capacidadTotal + " litros \n" +
                "CapacidadCongelador: " + capacidadCongelador + " litros \n" +
                "Caracteristicas: " + caracteristicas;
    }

    //Accesores

    public double getCapacidadTotal() {
        return capacidadTotal;
    }

    public void setCapacidadTotal(double capacidadTotal) {
        if (this.capacidadTotal < 0){
            this.capacidadTotal = 1;
        }else {
            this.capacidadTotal = capacidadTotal;
        }
    }

    public double getCapacidadCongelador() {
        return capacidadCongelador;
    }

    /**
     * Setter del atributo capacidadCongelador que comprueba que no sea menor que 0, en cuyo caso
     * lo pone a 1.
     * @param capacidadCongelador double Valor atributo capacidadCongelador.
     */
    public void setCapacidadCongelador(double capacidadCongelador) {
        if (this.capacidadCongelador < 0){
            this.capacidadCongelador = 1;
        }else {
            this.capacidadCongelador = capacidadCongelador;
        }
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }
}
