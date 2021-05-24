package ejercicios;

import java.util.ArrayList;

import recursos.figuras3d.Cilindro_v4;
import recursos.figuras3d.Figura3D_v3;

/**
 * 10.8. Haz una nueva versión de la interfaz y clases del ejercicio anterior
 * (añádele el sufijo _v4). Añádele a la interfaz el método superficie (). Crea
 * una nueva clase Cilindro_v4 y haz que implemente los métodos de la interfaz.
 * Haz un programa que permita crear una instancia de cada una de las 3 figuras
 * y nos muestre cuál tiene más superficie. • Cuestión 1: ¿Al añadir el nuevo
 * método a la interfaz, si no modificamos las clases que la implementan ¿se
 * produce algún error? ¿Por qué? ¿Cómo evitamos esta situación? • Cuestión 2:
 * Supón que añades a la interfaz un nuevo método llamado ocupaMasque va a ser
 * igual para todas las clases que implementen la interfaz ya que es una
 * comparación del volumen, tenga la forma que tenga ¿qué opciones tenemos para
 * no tener que implementarlo en todas las clases?
 */

public class Ejercicio8 {
    public static void main(String[] args) {
        ArrayList <Figura3D_v3> fV3s = new ArrayList<>();
        fV3s.add(new Cilindro_v4(5.6f, 4.8f));
        System.out.println(fV3s.get(0).volumen());
    }
}
