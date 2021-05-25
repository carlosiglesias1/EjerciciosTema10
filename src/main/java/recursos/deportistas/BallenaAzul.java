package recursos.deportistas;

/**
 * Desarrolla una clase BallenaAzul que implemente la interfaz Nadador. El
 * tiempo en recorrer una distancia es de 10km/h para las mayores de 5 años y
 * 13km/h para las menores.
 */

public class BallenaAzul implements Nadador {
    private int anhos;

    public BallenaAzul(int age) {
        this.anhos = age;
    }

    public int getAnhos() {
        return anhos;
    }

    public int nadar(float metros) {
        if(this.anhos >= 5)
        //10km/h = 2,77m/s
            return (int)(metros / 2.77f);
        else
        //13km/h = 3.61m/s
            return (int)(metros / 3.61f);
    }
}
