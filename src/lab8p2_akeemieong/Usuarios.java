/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_akeemieong;

/**
 *
 * @author SURFACEB2I7
 */
public class Usuarios {
    private String usuarios,contra;

    public Usuarios() {
    }

    public Usuarios(String usuarios, String contra) {
        this.usuarios = usuarios;
        this.contra = contra;
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

    @Override
    public String toString() {
        return "Usuarios{" + "usuarios=" + usuarios + ", contra=" + contra + '}';
    }
    
    
}
