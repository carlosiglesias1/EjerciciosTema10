package ejercicios;

import java.util.ArrayList;
import recursos.figuras.*;

/**
 * 10.1. Copia la última versión de las clases de los primeros ejercicios:
 * Figura2D, Triangulo, TrianColor y Rectangulo (añade sufijo _v9) y realiza los
 * siguientes cambios: • Crea un método abstracto llamado area () en Figura2D
 * que ha de implementarse en las clases hijas. • Crea un método precio (float
 * precioMetroCuadrado) en la clase Figura2D, que use el método abstracto
 * anterior. • Verificar que las clases hijas implementan el método area ().
 * ¿Qué ocurriría si no lo tuviesen implementado? • Haz un programa que almacene
 * figuras de los tres tipos en un ArrayList y finalmente se recorra el
 * ArrayList con un for-each mostrando el precio de cada figura, suponiendo un
 * precio de 10 euros el metro cuadrado.
 */

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList <Figura2D_v9> fList = new ArrayList<>();
        fList.add(new Rectangulo_v9(4.3f, 7.8f, "Campo de fútbol"));
        fList.add(new Triangulo_v9(5.2f, 8.9f, "Carlos", "Culos"));
        fList.add(new TrianColor_v9(7.2f, 8.9f, "Carlos", "Pedo", "Azul"));
        for (Figura2D_v9 figura2d_v9 : fList) {
            System.out.println(figura2d_v9.precio(5.1f));
        }
    }
}
