/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pruebas;

import javax.swing.JOptionPane;

public class pruebaPromedios {

    public Double calculaPromedio(Double[] aleatorios) {
        Double promedio = 0.0;

        for (int i = 0; i < aleatorios.length; i++) {
            promedio += aleatorios[i];
        }
        return promedio / aleatorios.length;
    }

    public void prueba(Double[] aleatorios) {

        Double[] Resultados = new Double[aleatorios.length];
        double alpha = 0.975;
        double z = 1.959963985;
        double limiteInferior = 0.05 - (z * (1 / Math.sqrt(12 * aleatorios.length)));
        double limiteSuperior = 0.05 + (z * (1 / Math.sqrt(12 * aleatorios.length)));
        double promedio = calculaPromedio(aleatorios);
        if (promedio <= limiteSuperior && promedio >= limiteInferior) {
            JOptionPane.showMessageDialog(null, "El conjunto de datos es aceptado");
        } else {
            JOptionPane.showMessageDialog(null, "El conjunto de datos no aceptado");
        }

    }

}
