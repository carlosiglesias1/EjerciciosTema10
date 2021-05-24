package ejercicios;

import recursos.figuras3d.Cilindro_v2;
import recursos.figuras3d.Esfera_v2;
import recursos.figuras3d.PrismaRectangular_v2;

/**
 * 10.3. Haz una nueva versión de las clases del ejercicio anterior (añádele el
 * sufijo _v2). Añádele a la clase base el método abstracto superficie (). Crea
 * una nueva clase Cilindro y haz que implemente los métodos de la superclase.
 * Haz un programa que permita crear una instancia de cada una de las 3 figuras
 * y nos muestre cuál tiene más superficie.
 */

public class Ejercicio3 {
    public static void main(String[] args) {
        Cilindro_v2 cilindro_v2 = new Cilindro_v2(5.4f, 4.9f);
        Esfera_v2 esfera_v2 = new Esfera_v2(9.6f);
        PrismaRectangular_v2 pRectangular_v2 = new PrismaRectangular_v2(4.2f, 1.6f, 4.9f);
        float maximo = 0;
        if (cilindro_v2.superficie() > maximo)
            maximo = cilindro_v2.superficie();
        if (esfera_v2.superficie() > maximo)
            maximo = esfera_v2.superficie();
        if (pRectangular_v2.superficie() > maximo)
            maximo = esfera_v2.superficie();
        System.out.println(maximo);
    }
}
