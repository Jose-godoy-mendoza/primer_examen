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
public class Moto extends Vehiculo_terrestre{
    private String traccion, cadena, tipo_clutch;

    public Moto(){}
    
    public Moto(String traccion, String cadena, String tipo_clutch, String asientos, String llantas, String placa, String chasis, String tipo_frenos, String modelo, String marca, String linea, String motor, String color, String cilindros, String tipo, String precio_venta) {
        super(asientos, llantas, placa, chasis, tipo_frenos, modelo, marca, linea, motor, color, cilindros, tipo, precio_venta);
        this.traccion = traccion;
        this.cadena = cadena;
        this.tipo_clutch = tipo_clutch;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String getTipo_clutch() {
        return tipo_clutch;
    }

    public void setTipo_clutch(String tipo_clutch) {
        this.tipo_clutch = tipo_clutch;
    }
    
    @Override
    public void acelerar()
    {
        System.out.println("Este Automovil acelera de 0 a 100 en 5 segundos\n");
    }
    ////////
    @Override
    public void frenar()
    {
        System.out.println("Esta moto puede frenar y diminuir la velocidad en 14km/s por cada 3 segundos\n");
    }
    /////////////
    public void comprimir(String tipo)
    {
        if((tipo.equals("Mecanico"))||(tipo.equals("mecanico")))
        {
        System.out.println("Para bajar más rapido la velocidad, suelte el clutch y frene para comprimir y frenar al mismo tiempo\n");    
        }
        else
        {
            System.out.println("Esta moto es automatica y no puede comprimir");
        }
    }
    
    //////////////
    @Override
    public void encender()
    {
        System.out.println("Inserte y gire la llave para encender el vehiculo\n");
    }
    //////////
    @Override
    public void apagar()
    {
        System.out.print("Gire la llave a la izquierda y quitela\n");
    }
    ///////////////
    @Override
    public void intermitentes()
    {
        System.out.println("presione la palanca hacia el lado al que va a pedir via \n");
    }
    //////////
    public void forma_acelerar(String tipo)
    {
        if((tipo.equals("Mecanico"))||(tipo.equals("mecanico")))
        {
            System.out.println("Para hacer los cambios meta clutch y mueva la palanca al cambio siguiente\n");
        }
        else
        {
            System.out.println("Este vehiculo es automatico y no tiene clutch");
        }
    }
    //////////////
    @Override
    public void bloquear_vehiculo()
    {
        System.out.println("Apage completamente el vehiculo, y presione la llave y girela a la izquierda para bloquear el vehiculo");
    }
}

/* String datos[]=new String[16];
        datos[0]=txt_traccion.getText();
        datos[1]=txt_cadena.getText();
        datos[2]=txt_clutch.getText();
        datos[3]=txt_asientosM.getText();
        datos[4]=txt_llantasM.getText();
        datos[5]=txt_placaM.getText();
        datos[6]=txt_chasisM.getText();
        datos[7]=txt_frenosM.getText();
        datos[8]=txt_modeloM.getText();
        datos[9]=txt_marcaM.getText();
        datos[10]=txt_lineaM.getText();
        datos[11]=txt_motorM.getText();
        datos[12]=txt_colorM.getText();
        datos[13]=txt_cilindrosM.getText();
        datos[14]=tipo;
        datos[15]=txt_ventaM.getText();
        t_moto.addRow(datos);*/