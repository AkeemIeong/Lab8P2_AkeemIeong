/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_akeemieong;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author SURFACEB2I7
 */
public class ingresar extends Thread{

    @Override
    public void run() {
        
        for (int i = 0; i < 5; i++) {
            Date h=new Date();
            DateFormat f=new SimpleDateFormat("hh:mm:ss");
                System.out.println(f.format(h));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {

            }
        }
        JOptionPane.showMessageDialog(null, "Se registro correctamente");
    }
    
    
}
