/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba_de_poker_y_corridas;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author ricardo
 */
public class Prueba_de_Corridas {

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
        // TODO code application logic here
        double alfa;
        int R = 1;
        int n1 = 0;
        int n2 = 0;
        double promedio = 0;
        double desviacion = 0;
        double Z = 0;
        ArrayList<Integer> binarios = new ArrayList<>();

        for (int i = 0; i < datos.length; i++) {
            if (datos[i] < 0.5) {
                binarios.add(0);
                n2++;
            } else {
                binarios.add(1);
                n1++;
            }
            System.out.print(binarios.get(i) + "");

        }

        System.out.print(" \n");
        System.out.println("positivas: " + n1);
        System.out.println("negativas: " + n2);

        int contador = binarios.get(0);
        for (int i = 0; i < binarios.size(); i++) {
            if (binarios.get(i) != contador) {
                R++;
                contador = binarios.get(i);
            }
        }

        DecimalFormat decimal = new DecimalFormat("0.000");
        promedio = ((double) (2 * n1 * n2) / (n1 + n2) + 1);
        desviacion = (Math.sqrt((2 * n1 * n2 * (2 * n1 * n2 - n1 - n2)) / ((Math.pow(n1 + n2, 2)) * (n1 + n2 - n1))));
        Z = (R - promedio) / desviacion;
        System.out.print("corridas " + R + "\n" + "promedio: " + promedio + " \n"
                + "desviacion: " + decimal.format(desviacion) + "\n" + "Valor de Z: " + decimal.format(Z));

    }
}
