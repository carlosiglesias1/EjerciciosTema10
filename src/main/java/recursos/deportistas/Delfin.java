package recursos.deportistas;

import java.util.Random;

/**
 * Desarrolla una clase Delfin que implemente la interfaz Nadador. El tiempo en
 * recorrer una distancia es aleatorio entre 40km/h y 70km/hora
 */

public class Delfin implements Nadador {
    public Delfin (){
        //new deflin, no parameters to initialize
    }

    public int nadar (float metros){
        Random velocidad = new Random();
        //40 km/h = 11.11 m/s
        //70 km/h = 19.44 m/s
        return (int) (metros/(velocidad.nextFloat()*(8.33f)));
    }
}
