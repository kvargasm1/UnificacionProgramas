package Pruebas;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class pruebaKolmogorov {

    int n;
    double tabla[] = {0.975, 0.842, 0.708, 0.624, 0.563, 0.521, 0.486, 0.457, 0.432, 0.409, 0.391, 0.375, 0.361, 0.349, 0.338, 0.328, 0.318, 0.309, 0.301, 0.294, 0.264, 0.242, 0.230, 0.210, 0.188, 0.172, 0.160, 0.150, 0.141, 0.134};
    int index[], a = 0;

    public pruebaKolmogorov() {
        index = new int[30];

    }

    public void iniciar() {
        for (int i = 0; i < 30; i++) {
            if (i < 20) {
                a = i + 1;
            } else if (i >= 20 && i < 24) {
                a += 5;
            } else if (i >= 24) {
                a += 10;
            }

            index[i] = a;

        }
    }

    public void prueba(Double aleatorios[], double alfa, int periodo) {

        iniciar();
        double diff = 0, max = 0, vec[], mx;

        n = periodo;
        vec = new double[periodo];
        for (int i = 0; i < periodo; i++) {
            vec[i] = aleatorios[i];
        }
        Arrays.sort(vec);
        max = 0;
        double fn = 0;
        for (int i = 0; i < n; i++) {
            fn = (double) (i + 1) / n;
            diff = Math.abs(fn - vec[i]);
            if (diff > max) {
                max = diff;
            }
        }
        try {
            mx = tabla[indice(n)];
        } catch (Exception ex) {
            mx = 1.36 / Math.sqrt(n);
        }
        if (max <= mx) {

            JOptionPane.showMessageDialog(null, "se acepta el criterio");
        } else {

            JOptionPane.showMessageDialog(null, "no se acepta el criterio");
        }

    }

    public int indice(int indx) {
        for (int i = 0; i < 30; i++) {
            if (index[i] == indx) {
                return i;
            }
        }
        return -1;
    }

}
