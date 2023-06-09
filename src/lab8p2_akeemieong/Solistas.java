/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_akeemieong;

/**
 *
 * @author SURFACEB2I7
 */
public class Solistas extends Artistas{
    private int edad;

    public Solistas() {
    }

    public Solistas(int edad) {
        this.edad = edad;
    }

    public Solistas(int edad, Usuarios us, String nombre, String generomusical) {
        super(us, nombre, generomusical);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Solistas{" + "edad=" + edad + '}';
    }
    
}
