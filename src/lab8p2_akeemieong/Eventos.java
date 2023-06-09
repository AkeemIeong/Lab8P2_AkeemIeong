/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_akeemieong;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author SURFACEB2I7
 */
public class Eventos {
    private Date fecha;
    private String ciudad,lugar;
    private int cantper;
    private ArrayList<Canciones> lista =new ArrayList<>();

    public Eventos() {
    }

    public Eventos(Date fecha, String ciudad, String lugar, int cantper) {
        this.fecha = fecha;
        this.ciudad = ciudad;
        this.lugar = lugar;
        this.cantper = cantper;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCantper() {
        return cantper;
    }

    public void setCantper(int cantper) {
        this.cantper = cantper;
    }

    public ArrayList<Canciones> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Canciones> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Eventos{" + "fecha=" + fecha + ", ciudad=" + ciudad + ", lugar=" + lugar + ", cantper=" + cantper + ", lista=" + lista + '}';
    }
    
    
}
