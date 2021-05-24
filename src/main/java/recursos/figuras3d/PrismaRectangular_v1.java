package recursos.figuras3d;

public class PrismaRectangular_v1 extends Figura3D_v1 {
    private float ladoBase1;
    private float ladoBase2;
    private float altura;

    public PrismaRectangular_v1(float ladoBase1, float ladoBase2, float altura) {
        this.ladoBase1 = ladoBase1;
        this.ladoBase2 = ladoBase2;
        this.altura = altura;
    }

    public float volumen() {
        return this.ladoBase1 * ladoBase2 * altura;
    }
}
