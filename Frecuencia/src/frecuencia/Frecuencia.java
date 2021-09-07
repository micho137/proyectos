package frecuencia;

import javax.swing.JOptionPane;

public class Frecuencia {

    int in1, in2, in3, in4, invalido;

    public Frecuencia() {
        in1 = in2 = in3 = in4 = invalido = 0;
    }

    public float porcentaje(int dato) {
        float var;
        var = (dato / 15f) * 100f;
        return (float) var;
    }

    public static void main(String[] args) {
        Frecuencia fre = new Frecuencia();
        int numero;
        int n = 0;
        while (n < 15) {

            String str = JOptionPane.showInputDialog(null, "Ingresa un numero de indice " + (n + 1) + " en el rango de [0,20]");
            numero = Integer.parseInt(str);

            if (numero >= 0 && numero <= 20) {
                if (numero >= 0 && numero <= 5) {
                    fre.in1++;
                } else if (numero >= 6 && numero <= 11) {
                    fre.in2++;
                } else if (numero >= 12 && numero <= 15) {
                    fre.in3++;
                } else if (numero >= 16 && numero <= 20) {
                    fre.in4++;
                }
                n++;
            } else {
                JOptionPane.showMessageDialog(null, "Numero Invalido");
                fre.invalido++;
            }
        }
        String moda = fre.in1 + ", " + fre.in2 + ", " + fre.in3 + ", " + fre.in4 + "";
        System.out.println(moda);
        JOptionPane.showMessageDialog(null, "Cantidades invalidas: " + fre.invalido);
        String porcentajes = fre.porcentaje(fre.in1) + ", " + fre.porcentaje(fre.in2) + ", " + fre.porcentaje(fre.in3) + ", " + fre.porcentaje(fre.in4);
        JOptionPane.showMessageDialog(null, "Porcentajes: " + porcentajes);
    }
}
