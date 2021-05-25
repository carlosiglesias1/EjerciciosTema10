package ejercicios;

import recursos.deportistas.Triatleta;
import recursos.deportistas.Triatleta_v2;

/**
 * 10.10. Duplica las interfaces y las clases del ejercicio anterior
 * (añadiéndoles el sufijo _v2) Modifica la interfaz Saltador_v2 añadiéndole el
 * método saltaPertiga que recibe como parámetro una altura en centímetros y
 * devuelve true si ha logrado el salto y false si no lo ha logrado ¿Qué ocurre
 * con la clase TriAtleta_v2? Desarrolla saltaPertiga como método default en la
 * interfaz de forma que por defecto devuelva false. • Haz una nueva versión de
 * TriAtleta (sufijo _v2b) que implemente saltaPertiga con este criterio: para
 * saltos de más de 6 metros devuelve false, entre 5 y 6 metros devuelve true la
 * mitad de las veces y por debajo de 5 metros devuelve siempre true. • Haz un
 * programa que cree una instancia de Triatleta_v2 y otra de Triatleta_v2b y que
 * muestre el resultado de ambos atletas saltando: 100cm, 550cm, 560cm, 580cm,
 * 700cm.
 */

public class Ejercicio10 {
    public static void main(String[] args) {
        Triatleta triatleta = new Triatleta(25);
        Triatleta_v2 triatleta_v2 = new Triatleta_v2(25);

        if (triatleta.saltaPertiga(2))
            System.out.println("El triatleta 1 ha conseguido el salto");
        else
            System.out.println("Salto no conseguido");

        if (triatleta_v2.saltaPertiga(2))
            System.out.println("El triatleta 2 ha conseguido el salto");
        else
            System.out.println("Salto no conseguido");
    }

}
