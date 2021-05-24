package recursos.figuras3d;

public class Esfera_v1 extends Figura3D_v1 {
    private float radio;

    public Esfera_v1 (float radio){
        this.radio= radio;
    }

    public float volumen (){
        return this.radio * (float) Math.PI;
    }
}
