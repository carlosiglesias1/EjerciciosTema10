package recursos.deportistas;

import java.util.Random;

public class Triatleta implements Saltador, Nadador, Ciclista {
    private int edad;

    public Triatleta(int edad) {
        this.edad = edad;
    }

    public int nadar(float metros) {
        if (this.edad > 20 && this.edad < 30)
            return (int) (metros / 1.09f);
        else if (this.edad > 30 && this.edad < 40)
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
            switch (pista){
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
        Random altura = new Random ();
        if (this.edad > 20 && this.edad < 30)
            return altura.nextInt(39)+15;
        else if (this.edad > 30 && this.edad < 40)
            return altura.nextInt(30)+10;
        else
            return altura.nextInt(20)+5;
    }
}
