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
public class RegIncidencia extends Incidencia {
    private int num;

    public RegIncidencia(){}
    
    public RegIncidencia(boolean estado_incidencia,Fecha fecha_incidencia,String usuario,int num){
      super(estado_incidencia,fecha_incidencia,usuario);
      this.num = num;
    }
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "RegIncidencia{" + "num=" + num + '}';
    }
    
}
