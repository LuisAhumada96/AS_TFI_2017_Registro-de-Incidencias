/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Luis Ahumada
 */
public class Incidencias {
    private ArrayList<Ticket> tickets = new ArrayList<Ticket>();
    private ArrayList<RegIncidencia> regIncidencias = new ArrayList<RegIncidencia>();

    public Incidencias(){}
    
    public ArrayList<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(ArrayList<Ticket> tickets) {
        this.tickets = tickets;
    }

    public ArrayList<RegIncidencia> getRegIncidencias() {
        return regIncidencias;
    }

    public void setRegIncidencias(ArrayList<RegIncidencia> regIncidencias) {
        this.regIncidencias = regIncidencias;
    }
    public void agregarIncidenciaInt(Ticket ticket){
        tickets.add(ticket);
    }

    public void agregarIncidenciaExt(RegIncidencia reg){
        regIncidencias.add(reg);
    }

    @Override
    public String toString() {
        return "Incidencias{" + "tickets=" + tickets + ", regIncidencias=" + regIncidencias + '}';
    }

}
