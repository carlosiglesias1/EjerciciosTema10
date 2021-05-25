package recursos.deportistas;

import java.util.Random;

/**
 * Haz una nueva versión de TriAtleta (sufijo _v2b) que implemente saltaPertiga
 * con este criterio: para saltos de más de 6 metros devuelve false, entre 5 y 6
 * metros devuelve true la mitad de las veces y por debajo de 5 metros devuelve
 * siempre true.
 */

public class Triatleta_v2 implements Saltador_v2, Nadador, Ciclista {
    private int edad;
    private int nSaltos;

    public Triatleta_v2(int edad) {
        this.edad = edad;
    }

    public int nadar(float metros) {
        if (this.edad > 20 && this.edad <= 30)
            return (int) (metros / 1.09f);
        else if (this.edad > 30 && this.edad <= 40)
            return (int) (metros / 0.83f);
        else
            return (int) (metros / 0.5f);
    }

    private int terrenoValido(String terreno) {
        for (int i = 0; i < TERRENO.length; i++) {
            if (TERRENO[i].equals(terreno))
                return i;
        }
        return -1;
    }

    public int recorrer(float metros, String terreno) throws Exception {
        int pista = terrenoValido(terreno);
        if (pista != -1) {
            switch (pista) {
                case 0:
                    return (int) (metros / 8.33f);
                case 1:
                    return (int) (metros / 11.11f);
                case 2:
                    return (int) (metros / 9.72f);
                default:
                    throw new Exception("No sé que puede haber salido mal");
            }
        } else
            throw new Exception("El terreno no es válido");
    }

    public int saltarAltura() {
        Random altura = new Random();
        if (this.edad > 20 && this.edad < 30)
            return altura.nextInt(39) + 15;
        else if (this.edad > 30 && this.edad < 40)
            return altura.nextInt(30) + 10;
        else
            return altura.nextInt(20) + 5;
    }

    @Override
    public boolean saltaPertiga(float metros) {
        if (metros > 6)
            return false;
        else if (metros <= 6 && metros > 5) {
            this.nSaltos++;
            if (this.nSaltos % 2 == 0)
                return true;
            else
                return false;
        }
        return true;
    }
}
