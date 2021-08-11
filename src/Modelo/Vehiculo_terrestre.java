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
public class Vehiculo_terrestre extends Vehiculo{
    private String asientos, llantas, placa, chasis, tipo_frenos;

    public Vehiculo_terrestre() {}

    public Vehiculo_terrestre(String asientos, String llantas, String placa, String chasis, String tipo_frenos, String modelo, String marca, String linea, String motor, String color, String cilindros, String tipo, String precio_venta) {
        super(modelo, marca, linea, motor, color, cilindros, tipo, precio_venta);
        this.asientos = asientos;
        this.llantas = llantas;
        this.placa = placa;
        this.chasis = chasis;
        this.tipo_frenos = tipo_frenos;
    }

    public String getAsientos() {
        return asientos;
    }

    public void setAsientos(String asientos) {
        this.asientos = asientos;
    }

    public String getLlantas() {
        return llantas;
    }

    public void setLlantas(String llantas) {
        this.llantas = llantas;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getTipo_frenos() {
        return tipo_frenos;
    }

    public void setTipo_frenos(String tipo_frenos) {
        this.tipo_frenos = tipo_frenos;
    }
    
    
    
    public void acelerar(){}
    public void frenar(){}
    public void comprimir(){}
    public void encender(){}
    public void apagar(){}
    public void intermitentes(){}
    public void forma_acelerar(){}
    public void bloquear_vehiculo(){}
}
