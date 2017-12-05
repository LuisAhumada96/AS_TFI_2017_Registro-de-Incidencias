/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Luis Ahumada
 */
public class DetalleIncidencia {
    private int tipo;
    private String lugar;
    private String fallo;
    private String solucion;

    public DetalleIncidencia(){}
    
    public DetalleIncidencia(int tipo, String lugar, String fallo, String solucion){
    this.tipo = tipo;
    this.lugar = lugar;
    this.fallo = fallo;
    this.solucion = solucion;
    
    }


    
    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getFallo() {
        return fallo;
    }

    public void setFallo(String fallo) {
        this.fallo = fallo;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setSolucion(String solucion) {
        this.solucion = solucion;
    }

    @Override
    public String toString() {
        return "DetalleIncidencia{" + "tipo=" + tipo + ", lugar=" + lugar + ", fallo=" + fallo + ", solucion=" + solucion + '}';
    }
    
    
}
