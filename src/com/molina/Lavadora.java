package com.molina;

/**
 * Created by Francisco Molina Lopez on 30/03/2017.
 */
public class Lavadora extends Electrodomestico {

    //Atributos

    private String tipoCarga;
    private double velocidadCentrifugado;
    private boolean secadora;

    //Constructores

    //Constructor por defecto

    public Lavadora() {
    }

    //Constructor designado

    public Lavadora(String marca, String modelo, double precioBase, char consumoEnergetico, double altura, double anchura, double peso, String tipoCarga, double velocidadCentrifugado, boolean secadora) {
        super(marca, modelo, precioBase, consumoEnergetico, altura, anchura, peso);
        this.tipoCarga = tipoCarga;
        this.setVelocidadCentrifugado(velocidadCentrifugado);
        this.secadora = secadora;
    }

    //Metodos

    /**
     * Metodo que calcula el precio total de un conjunto variable de lavadoras.
     * @param numDeLavadoras Lavadora Cantidad de lavadoras para calcular.
     * @return double Valor del ingreso total de lavadoras.
     */
    public static double ingresoTotalLavadoras(Lavadora...numDeLavadoras){
        double ingresoTotal = 0;

        for (Lavadora lavadoras: numDeLavadoras){
            ingresoTotal += lavadoras.pvp();
        }

        return ingresoTotal;
    }

    /**
     * Metodo que imprime los atributos de Lavadora.
     * @return String Cadena con los atributos.
     */
    @Override
    public String toString() {
        return  "Lavadora:" + '\n' +
                super.toString() +
                "TipoCarga: " + tipoCarga + '\n' +
                "VelocidadCentrifugado: " + velocidadCentrifugado + "rpm \n" +
                "Secadora: " + esSecadora();
    }

    /**
     * Metodo que comprueba si una lavadora es secadora o no.
     * @return String Cadena con valor "Es secadora" o "No es secadora".
     */
    public String esSecadora(){
        return this.secadora?"Es secadora":"No es secadora";
    }

    //Accesores

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public double getVelocidadCentrifugado() {
        return velocidadCentrifugado;
    }

    /**
     * Setter del atributo velocidadCentrifugado que comprueba que no sea menor que 0, en cuyo caso
     * lo pone a 1.
     * @param velocidadCentrifugado double Valor atributo velocidadCentrifugado.
     */
    public void setVelocidadCentrifugado(double velocidadCentrifugado) {
        if (this.velocidadCentrifugado < 0 ){
            this.velocidadCentrifugado = 1;
        }else {
            this.velocidadCentrifugado = velocidadCentrifugado;
        }
    }

    public boolean isSecadora() {
        return secadora;
    }

    public void setSecadora(boolean secadora) {
        this.secadora = secadora;
    }
}
