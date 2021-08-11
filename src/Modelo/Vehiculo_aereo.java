/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author joseg
 */
public class Vehiculo_aereo extends Vehiculo{
    private String asientos, piloto_automatico, ventanas, tanques;

    public Vehiculo_aereo(){}
    
    public Vehiculo_aereo(String asientos, String piloto_automatico, String ventanas, String tanques, String modelo, String marca, String linea, String motor, String color, String cilindros, String tipo, String precio_venta) {
        super(modelo, marca, linea, motor, color, cilindros, tipo, precio_venta);
        this.asientos = asientos;
        this.piloto_automatico = piloto_automatico;
        this.ventanas = ventanas;
        this.tanques = tanques;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    public String getPiloto_automatico() {
        return piloto_automatico;
    }

    public void setPiloto_automatico(String piloto_automatico) {
        this.piloto_automatico = piloto_automatico;
    }

    public String getVentanas() {
        return ventanas;
    }

    public void setVentanas(String ventanas) {
        this.ventanas = ventanas;
    }

    public String getTanques() {
        return tanques;
    }

    public void setTanques(String tanques) {
        this.tanques = tanques;
    }
    @Override
    public void encender(){}
    @Override
    public void apagar(){}
    public void despegar(){}
    public void aterrizar(){}
    public void modo_emergencia(){}
    public void planear(){}
}
