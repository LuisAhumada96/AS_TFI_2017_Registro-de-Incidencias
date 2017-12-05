/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import vista.IncidenciaExt;
import java.awt.event.ActionListener;
import Modelo.*;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import vista.*;
/**
 *
 * @author Luis Ahumada
 */
public class Controlador implements ActionListener {
  private Incidencias incidencias;
  private GMant gmant;
  private IncidenciaExt incidenciaExt;
  private IncidenciaInt incidenciaInt;
  
  
      public Controlador(){
        incidencias = new Incidencias();
        gmant = new GMant();
        incidenciaInt = new IncidenciaInt();
        incidenciaExt = new IncidenciaExt();
    }
    public void ejecutar(){
        gmant.setControlador(this);
        incidenciaExt.setControlador(this);
        incidenciaInt.setControlador(this);
        mostrarIncidenciasInt();
        mostrarIncidenciasExt();
        gmant.ejecutar();
    }
  
  
  
   
    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getActionCommand().equals(gmant.AGREGAR_INT)){
        incidenciaInt.ejecutar();
        }
        if(e.getActionCommand().equals(gmant.AGREGAR_EXT)){
            incidenciaExt.ejecutar();
            incidenciaExt.setNum(incidencias.getRegIncidencias().size()+1);

        }
      
        if(e.getActionCommand().equals(incidenciaInt.ACEPTAR_Int))
        {
            if(controlarTicket(incidenciaInt.getCod())== false){
                if(incidenciaInt.siNo() == true){
                 agregarIncidenciaInt();
                 mostrarIncidenciasInt();
                incidenciaInt.setVisible(false);
          }
            }
            else{
            incidenciaInt.ticketRepetido();
            }
          
        }
        if(e.getActionCommand().equals(incidenciaExt.ACEPTAR_Ext)){
            if(incidenciaExt.siNo() == true){
            agregarIncidenciaExt();
            mostrarIncidenciasExt();
            incidenciaExt.setVisible(false);
            }
        
        }
    }
    public void agregarIncidenciaInt(){
        
        Ticket tmp = new Ticket(incidenciaInt.getEstado(),new Fecha(incidenciaInt.getDia(),
                                incidenciaInt.getMes(),incidenciaInt.getAnio()), 
                                incidenciaInt.getUsuario(),incidenciaInt.getCod());
        
        tmp.setDetalle(new DetalleIncidencia(incidenciaInt.getTipo(),incidenciaInt.getLugar(),
                        incidenciaInt.getDes(),incidenciaInt.getSol()));
        incidencias.agregarIncidenciaInt(tmp);
        }
    public void mostrarIncidenciasInt(){
           ArrayList datos = new ArrayList();
                           String aux;
            for(Ticket t : incidencias.getTickets()){
                Object fila[] = new Object[7];
                fila[0] = t.getCod();
                fila[1] = t.getDetalle().getLugar();
                if (t.getDetalle().getTipo()==1) aux = "Nivel 1";else aux = "Nivel 2";
                fila[2] = aux;
                fila[3] = t.getDetalle().getFallo();
                fila[4] = t.getDetalle().getSolucion();
                fila[5] = new String(t.getFecha_incidencia().getDia() + "/" + t.getFecha_incidencia().getMes() + "/" + t.getFecha_incidencia().getAnio());

                if(t.getEstado_incidencia()==true)aux = "RESUELTA";else aux = "PENDIENTE";
                fila[6] = aux;
                datos.add(fila);
            }
            gmant.cargarTablaInt(datos);
    
    }
    public boolean controlarTicket(int cod){        
        for(Ticket t : incidencias.getTickets()){
            if(t.getCod() == cod)
                return true;
        }
    return false;
    
    
    
    
    }
    
    
    
    
    public void agregarIncidenciaExt(){
        
        RegIncidencia tmp = new RegIncidencia(incidenciaExt.getEstado(),new Fecha(incidenciaExt.getDia(),
                                incidenciaExt.getMes(),incidenciaExt.getAnio()), 
                                incidenciaExt.getUsuario(),incidencias.getRegIncidencias().size()+1);
        
        tmp.setDetalle(new DetalleIncidencia(incidenciaExt.getTipo(),incidenciaExt.getLugar(),
                        incidenciaExt.getDes(),incidenciaExt.getSol()));
        incidencias.agregarIncidenciaExt(tmp);
        }

        public void mostrarIncidenciasExt(){
           ArrayList datos = new ArrayList();
                           String aux;
            for(RegIncidencia r : incidencias.getRegIncidencias()){
                Object fila[] = new Object[7];
                fila[0] = r.getNum();
                fila[1] = r.getDetalle().getLugar();
                if (r.getDetalle().getTipo()==1) aux = "Nivel 1";else aux = "Nivel 2";
                fila[2] = aux;
                fila[3] = r.getDetalle().getFallo();
                fila[4] = r.getDetalle().getSolucion();
                fila[5] = new String(r.getFecha_incidencia().getDia() + "/" + r.getFecha_incidencia().getMes() + "/" + r.getFecha_incidencia().getAnio());

                if(r.getEstado_incidencia()==true)aux = "RESUELTA";else aux = "PENDIENTE";
                fila[6] = aux;
                datos.add(fila);
            }
            gmant.cargarTablaExt(datos);
    
    }
    
    
    
    
    
}
