/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_akeemieong;

import java.util.ArrayList;

/**
 *
 * @author SURFACEB2I7
 */
public class Artistas {
    private Usuarios us;
    private String nombre,generomusical;
    private ArrayList<Canciones> lista=new ArrayList<>();

    public Artistas() {
    }

    public Artistas(Usuarios us, String nombre, String generomusical) {
        this.us = us;
        this.nombre = nombre;
        this.generomusical = generomusical;
    }

    public Usuarios getUs() {
        return us;
    }

    public void setUs(Usuarios us) {
        this.us = us;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGeneromusical() {
        return generomusical;
    }

    public void setGeneromusical(String generomusical) {
        this.generomusical = generomusical;
    }

    public ArrayList<Canciones> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Canciones> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Artistas{" + "us=" + us + ", nombre=" + nombre + ", generomusical=" + generomusical + ", lista=" + lista + '}';
    }
    
}
