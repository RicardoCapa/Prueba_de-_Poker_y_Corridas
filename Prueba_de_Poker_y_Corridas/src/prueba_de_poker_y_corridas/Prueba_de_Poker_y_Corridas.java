/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_de_poker_y_corridas;

/**
 *
 * @author ricardo
 */
public class Prueba_de_Poker_y_Corridas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       
        double datos[] = {
            0.6129,
            0.7097,
            0.9355,
            0.7742,
            0.7419,
            0.3226,
            0.0323,
            0.3871,
            0.8710,
            0.9677,
            0.1613,
            0.5806,
            0.2903
        };
          String[] ArrayString = {""};
          
        
        for (int i = 0; i < datos.length; i++) {
            double aux = datos[i];
          String cadena = String.valueOf(aux);
            System.out.println(cadena);
        }
    
    }

}
