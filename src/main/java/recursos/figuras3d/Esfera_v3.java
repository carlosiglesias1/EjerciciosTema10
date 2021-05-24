package recursos.figuras3d;

public class Esfera_v3 implements Figura3D_v3 {
    private float radio;

    public Esfera_v3(float radio) {
        this.radio = radio;
    }

    public float volumen() {
        return this.radio * (float) Math.PI;
    }

    public float superficie() {
        return 4 * (float) Math.PI * radio * radio;
    }
}
