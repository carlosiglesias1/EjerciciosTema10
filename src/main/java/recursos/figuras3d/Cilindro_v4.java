package recursos.figuras3d;

public class Cilindro_v4 implements Figura3D_v3{
    private float radio;
    private float altura;

    public Cilindro_v4(float radius, float altura) {
        this.radio = radius;
        this.altura = altura;
    }

    public float volumen() {
        return (float) Math.PI * this.altura * this.radio * this.radio;
    }

    public float superficie (){
        return (2*(float) Math.PI * this.altura * this.radio) + 2 * (float) Math.PI * this.radio;
    }
}
