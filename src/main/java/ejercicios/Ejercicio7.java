package ejercicios;

import recursos.figuras3d.Esfera_v3;
import recursos.figuras3d.PrismaRectangular_v3;

/**
 * 10.7. Convierte la clase abstracta Figura3D_v1 en una interfaz Figura3D_v3
 * con las mismas características. Rehaz las clases Esfera y PrismaRectangular
 * (tendrán sufijo v3) para adaptarlas a la nueva interfaz. Haz un programa que
 * cree una instancia de cada una de las 2 figuras y muestre cuál de ellas ocupa
 * más.
 */

public class Ejercicio7 {
    public static void main(String[] args) {
        Esfera_v3 esfera_v2 = new Esfera_v3(9.6f);
        PrismaRectangular_v3 pRectangular_v2 = new PrismaRectangular_v3(4.2f, 1.6f, 4.9f);
        if (esfera_v2.superficie() > pRectangular_v2.superficie())
            System.out.println("La esfera es ocupa más espacio");
        else
            System.out.println("El prisma ocupa más espacio");
    }
}
