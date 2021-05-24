package recursos.figuras3d;

public class Esfera_v2 extends Figura3D_v2 {
    private float radio;

    public Esfera_v2(float radio) {
        this.radio = radio;
    }

    public float volumen() {
        return this.radio * (float) Math.PI;
    }

    public float superficie() {
        return 4 * (float) Math.PI * radio * radio;
    }
}
