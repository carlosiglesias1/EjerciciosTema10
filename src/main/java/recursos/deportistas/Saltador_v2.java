package recursos.deportistas;

/**
 * Modifica la interfaz Saltador_v2 añadiéndole el método saltaPertiga que
 * recibe como parámetro una altura en centímetros y devuelve true si ha logrado
 * el salto y false si no lo ha logrado ¿Qué ocurre con la clase TriAtleta_v2?
 * Desarrolla saltaPertiga como método default en la interfaz de forma que por
 * defecto devuelva false.
 */

public interface Saltador_v2 {
    abstract int saltarAltura();

    default boolean saltaPertiga(float altura) {
        return false;
    };
}
