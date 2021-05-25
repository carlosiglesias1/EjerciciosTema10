package recursos.deportistas;

/**
 * Desarrolla una interfaz llamada Ciclista con un método llamado recorrer a la
 * que se le pasa un número de kilómetros, una cadena con tipo de terreno y
 * devuelve los segundos que tarda en recorrerlo.
 */

public interface Ciclista {
    public final String [] TERRENO = {"Pedregoso", "Asfalto", "Tierra"};
    abstract int recorrer (float km, String tipoTerreno) throws Exception;
}
