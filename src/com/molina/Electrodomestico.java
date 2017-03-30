package com.molina;

/**
 * Created by Francisco Molina Lopez on 30/03/2017.
 */
public class Electrodomestico {

    //Atributos

    private String marca;
    private String modelo;
    private double precioBase;
    private char consumoEnergetico;
    private double altura;
    private double anchura;
    private double peso;

    //Constructores

    //Constructor por defecto

    public Electrodomestico() {

    }

    //Constructor designado

    public Electrodomestico(
            String marca,
            String modelo,
            double precioBase,
            char consumoEnergetico,
            double altura,
            double anchura,
            double peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.setPrecioBase(precioBase);
        this.setConsumoEnergetico(consumoEnergetico);
        this.setAltura(altura);
        this.setAnchura(anchura);
        this.setPeso(peso);
    }

    //Metodos

    /**
     * Metodo que calcula el precio bruto del electrodomestico en funcion del precio base y el consumo energetico.
     * @return double Valor del precio bruto.
     */
    public double precioBruto(){
        double precioBruto;
        double precioExtra = 0;

        switch (this.consumoEnergetico){
            case 'A':
                precioExtra = 100;
                break;
            case 'B':
                precioExtra = 80;
                break;
            case 'C':
                precioExtra = 60;
                break;
            case 'D':
                precioExtra = 50;
                break;
            case 'E':
                precioExtra = 30;
                break;
            case 'F':
                precioExtra = 10;
                break;
        }

        precioBruto = this.precioBase + precioExtra;

        return precioBruto;
    }

    /**
     * Metodo que calcula el precio de transporte de un electrodomestico en funcion de su peso.
     * @return double Valor del precio de transporte.
     */
    public double precioTransporte(){
        double precioTransporte;

        if (this.peso < 20){
            precioTransporte = 10;
        }else if (this.peso >= 20 && this.peso < 50){
            precioTransporte = 50;
        }else if (this.peso >= 50 && this.peso < 80){
            precioTransporte = 80;
        }else {
            precioTransporte = 100;
        }

        return precioTransporte;
    }

    /**
     * Metodo que calcula el precio total sumando el precio de transporte y el precio bruto.
     * @return double Valor total del electrodomestico.
     */
    public double pvp() {
        double precioTotal;

        precioTotal = this.precioTransporte() + this.precioBruto();

        return precioTotal;
    }

    /**
     * Metodo que imprime los atributos del electrodomestico.
     * @return String Cadena con todos los atributos.
     */
    @Override
    public String toString() {
        return  "Marca: " + marca + '\n' +
                "Modelo: " + modelo + '\n' +
                "PrecioBase: " + precioBase + " euros \n" +
                "ConsumoEnergetico: " + consumoEnergetico + '\n' +
                "Altura: " + altura + " metros \n" +
                "Anchura: " + anchura + " metros \n" +
                "Peso: " + peso + "Kg \n";
    }

    //Accesores

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    /**
     * Setter del atributo precioBase en el que se comprueba que no sea menor que 0, si es asi
     * se pone como 1.
     * @param precioBase double Valor del atributo precioBase
     */
    public void setPrecioBase(double precioBase) {
        if (this.precioBase < 0){
            this.precioBase = 1;
        }else {
            this.precioBase = precioBase;
        }
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    /**
     * Setter del atributo consumoEnergetico en el que si recibe un char en minuscula, lo pasa a mayuscula.
     * @param consumoEnergetico char Valor del atributo consumoEnergetico
     */
    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = Character.toUpperCase(consumoEnergetico);
    }

    public double getAltura() {
        return altura;
    }

    /**
     * Setter del atributo Altura en el que se comprueba que no sea menor que 0, en cuyo caso
     * se pone a 1.
     * @param altura double Valor del atributo altura.
     */
    public void setAltura(double altura) {
        if (this.altura < 0){
            this.altura = 1;
        }else {
            this.altura = altura;
        }
    }

    public double getAnchura() {
        return anchura;
    }

    /**
     * Setter del atributo anchura en el que se comprueba que no sea menor que 0, en cuyo caso
     * se pone a 1.
     * @param anchura double Valor del atributo anchura.
     */
    public void setAnchura(double anchura) {
        if (this.anchura < 0){
            this.anchura = 1;
        }else {
            this.anchura = anchura;
        }
    }

    public double getPeso() {
        return peso;
    }

    /**
     * Setter del atributo peso en el que se comprueba que no sea menor que 0, en cuyo caso
     * pone a 1.
     * @param peso double Valor del atributo peso.
     */
    public void setPeso(double peso) {
        if (this.peso < 0){
            this.peso = 1;
        }else {
            this.peso = peso;
        }
    }
}
