package ejercicios;

import recursos.figuras3d.Esfera_v1;
import recursos.figuras3d.PrismaRectangular_v1;

/**
 * 10.2. Diseña una clase abstracta llamada Figura3D_v1 con método abstracto
 * volumen (). Crea subclases: Esfera_v1 y PrismaRectangular_v1 que implementen
 * el método de la superclase. Incorpora los atributos que creas necesarios a
 * las tres clases. Haz un programa que cree una instancia de cada una de las 2
 * figuras y muestre cuál de ellas ocupa más.
 */

public class Ejercicio2 {
    public static void main(String[] args) {
        PrismaRectangular_v1 pRectangular_v1 = new PrismaRectangular_v1(5.4f, 7.8f, 9.3f);
        Esfera_v1 esfera_v1 = new Esfera_v1(9.8f);
        if (pRectangular_v1.volumen() > esfera_v1.volumen())
            System.out.println("La esfera es mayor");
        else
            System.out.println("El prisma es mayor");
    }
}
