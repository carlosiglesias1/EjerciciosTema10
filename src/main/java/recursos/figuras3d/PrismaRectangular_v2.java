package recursos.figuras3d;

public class PrismaRectangular_v2 extends Figura3D_v2 {
    private float ladoBase1;
    private float ladoBase2;
    private float altura;

    public PrismaRectangular_v2(float ladoBase1, float ladoBase2, float altura) {
        this.ladoBase1 = ladoBase1;
        this.ladoBase2 = ladoBase2;
        this.altura = altura;
    }

    public float volumen() {
        return this.ladoBase1 * ladoBase2 * altura;
    }

    public float superficie() {
        return (ladoBase1 * altura * 2) + (ladoBase1 * ladoBase2 * 2) + (ladoBase2 * altura * 2);
    }
}
