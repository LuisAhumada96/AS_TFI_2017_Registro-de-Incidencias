/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.util.Calendar;
/**
 *
 * @author sistemas
 */
public class Fecha {
    private int dia;
    private int mes;
    private int anio;

   public Fecha() {
       Calendar c = Calendar.getInstance(); //MÉTODO ABSTRACTO
       dia = c.get(Calendar.DAY_OF_MONTH);
       mes = c.get(Calendar.MONTH) + 1;
       anio = c.get(Calendar.YEAR);
       
    }
    
    public Fecha(int dia,int mes, int anio) {
    this.dia = dia;
    this.mes = mes;
    this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
   
    public void actual(){
    System.out.printf("%d/%d/%d", dia, mes, anio);
    
    
    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }
    
    
}
