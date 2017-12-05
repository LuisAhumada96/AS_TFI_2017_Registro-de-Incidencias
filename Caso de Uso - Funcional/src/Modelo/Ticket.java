/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;

/**
 *
 * @author Luis Ahumada
 */
public class Ticket extends Incidencia {
    private int cod;
    private DetalleIncidencia detalle;

    public Ticket(){}
    public Ticket(boolean estado_incidencia,Fecha fecha_incidencia,String usuario,int cod){
        super(estado_incidencia,fecha_incidencia,usuario);
        this.cod = cod;
        this.detalle = new DetalleIncidencia();
    
    }
    
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
    public DetalleIncidencia getDetalle() {
        return detalle;
    }

    public void setDetalle(DetalleIncidencia detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Ticket{" + "cod=" + cod + ", detalle=" + detalle + '}';
    }

    
}
