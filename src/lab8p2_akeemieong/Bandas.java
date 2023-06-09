/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_akeemieong;

/**
 *
 * @author SURFACEB2I7
 */
public class Bandas extends Artistas{
    private int integrantes;

    public Bandas() {
    }

    public Bandas(int integrantes) {
        this.integrantes = integrantes;
    }

    public Bandas(int integrantes, Usuarios us, String nombre, String generomusical) {
        super(us, nombre, generomusical);
        this.integrantes = integrantes;
    }

    public int getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(int integrantes) {
        this.integrantes = integrantes;
    }

    @Override
    public String toString() {
        return "Bandas{" + "integrantes=" + integrantes + '}';
    }
    
    
    
}
