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
public class Incidencia {
    private boolean estado_incidencia;
    private Fecha fecha_incidencia;
    private String usuario;
    private DetalleIncidencia detalle;

    public Incidencia(){}
    
    public Incidencia(boolean estado_incidencia,Fecha fecha_incidencia,String usuario){
    this.estado_incidencia=estado_incidencia;
    this.fecha_incidencia = new Fecha();
    this.usuario = usuario;
    this.detalle = new DetalleIncidencia();
    }
    
    
    public boolean getEstado_incidencia() {
        return estado_incidencia;
    }

    public void setEstado_incidencia(boolean estado_incidencia) {
        this.estado_incidencia = estado_incidencia;
    }

    public Fecha getFecha_incidencia() {
        return fecha_incidencia;
    }

    public void setFecha_incidencia(Fecha fecha_incidencia) {
        this.fecha_incidencia = fecha_incidencia;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public DetalleIncidencia getDetalle() {
        return detalle;
    }

    public void setDetalle(DetalleIncidencia detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Incidencia{" + "fecha_incidencia=" + fecha_incidencia + ", usuario=" + usuario + ", detalle=" + detalle + '}';
    }


    
}
