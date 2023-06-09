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
public class Usuarios {
    private String usuarios,contra;
    private int edad;
    private ArrayList<Eventos>event=new ArrayList<>();
    private ArrayList<Artistas>artista=new ArrayList<>();

    public Usuarios() {
    }

    public Usuarios(String usuarios, String contra, int edad) {
        this.usuarios = usuarios;
        this.contra = contra;
        this.edad = edad;
    }

    public String getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(String usuarios) {
        this.usuarios = usuarios;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList<Eventos> getEvent() {
        return event;
    }

    public void setEvent(ArrayList<Eventos> event) {
        this.event = event;
    }

    public ArrayList<Artistas> getArtista() {
        return artista;
    }

    public void setArtista(ArrayList<Artistas> artista) {
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "usuarios=" + usuarios + ", contra=" + contra + ", edad=" + edad + ", event=" + event + ", artista=" + artista + '}';
    }
    
    
}
