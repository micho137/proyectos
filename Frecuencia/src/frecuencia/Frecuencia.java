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
        double x1 = 2.5, x2 = 8.5, x3 = 13.5, x4 = 18;
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
        int Y = fre.in1+fre.in2+fre.in3+fre.in4;
        double X = (x1*fre.in1)+(x2*fre.in2)+(x3*fre.in3)+(x4*fre.in4);
        double Z = X/Y;
        String moda = "Cantidad de datos Ingresados por rangos\n" + "[0,5]: " + fre.in1 + "\n" + "[6,11]: " + fre.in2 + "\n" + "[12,15]: " + fre.in3 + "\n" + "[16,20]: " + fre.in4 + "\n";
        JOptionPane.showMessageDialog(null, moda);
        String porcentajes = "Porcentaje de datos Ingresados por rangos\n" + "[0,5]: " + fre.porcentaje(fre.in1) + "%" + "\n" + "[6,11]: " + fre.porcentaje(fre.in2) + "%" + "\n" + "[12,15]: " + fre.porcentaje(fre.in3) + "%" + "\n" + "[16,20]: " + fre.porcentaje(fre.in4) + "%" + "\n";
        JOptionPane.showMessageDialog(null, "Porcentajes: " + porcentajes);
        JOptionPane.showMessageDialog(null, "Media: "+Z);
        JOptionPane.showMessageDialog(null, "Cantidades invalidas: " + fre.invalido);

    }
}
