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
public class Avion extends Vehiculo_aereo{
    private String zonas, cabina, winglet, salidas_emergencia;

    public Avion(){}

    public Avion(String zonas, String cabina, String winglet, String salidas_emergencia, String asientos, String piloto_automatico, String ventanas, String tanques, String modelo, String marca, String linea, String motor, String color, String cilindros, String tipo, String precio_venta) {
        super(asientos, piloto_automatico, ventanas, tanques, modelo, marca, linea, motor, color, cilindros, tipo, precio_venta);
        this.zonas = zonas;
        this.cabina = cabina;
        this.winglet = winglet;
        this.salidas_emergencia = salidas_emergencia;
    }

    
    
    

    public String getZonas() {
        return zonas;
    }

    public void setZonas(String zonas) {
        this.zonas = zonas;
    }

    public String getCabina() {
        return cabina;
    }

    public void setCabina(String cabina) {
        this.cabina = cabina;
    }

    public String getWinglet() {
        return winglet;
    }

    public void setWinglet(String winglet) {
        this.winglet = winglet;
    }

    public String getSalidas_emergencia() {
        return salidas_emergencia;
    }

    public void setSalidas_emergencia(String salidas_emergencia) {
        this.salidas_emergencia = salidas_emergencia;
    }
    
    @Override
    public void encender()
    {
        System.out.println("Primero encienda los motores, mueva las helices para que el motor a reaccion tenga suficiente flujo de aire a través del motor antes de que se introduzca el combustible");
    }
    
    @Override
    public void apagar()
    {
        System.out.println("Lamentablemente no hay mucha informacion de como se apaga un avion\n");
    }
    
    @Override
    public void despegar()
    {
        System.out.println("primero encienda el avion y luego pida permiso para despegar, alce la nariz, y baje lentamente el sideStick mientras acelera\n");
    }
    
    @Override
    public void aterrizar()
    {
        System.out.println("Lamentablemente no hay mucha informacion de como aterrizar un avion\n");
    }
    
    @Override
    public void modo_emergencia()
    {
        System.out.println("Al ser golpeados por algo, el avion desplegara mascaras de oxigeno para todos los pasajeros del avion");
    }
    
    @Override
    public void planear()
    {
        System.out.println("Este es un tipo de vuelo automatico");
    }
}
