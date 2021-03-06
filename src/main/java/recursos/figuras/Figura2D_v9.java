package recursos.figuras;

public abstract class Figura2D_v9 {
    private float ancho;
    private float alto;
    private String nombre;

    protected Figura2D_v9(float alto, float ancho, String nombre) {
        this.alto = alto;
        this.ancho = ancho;
        this.nombre = nombre;
    }

    protected Figura2D_v9(float altoYAncho, String nombre) {
        this.alto = altoYAncho;
        this.ancho = altoYAncho;
        this.nombre = nombre;
    }

    protected Figura2D_v9 (){
        this.alto = this.ancho = 0;
        this.nombre = null;
    }

    protected Figura2D_v9 (Figura2D_v9 fV7){
        this.alto = fV7.getAlto();
        this.ancho = fV7.getAncho();
        this.nombre = fV7.getNombre();
    }

    public float getAlto() {
        return alto;
    }

    public float getAncho() {
        return ancho;
    }

    public String getNombre() {
        return nombre;
    }

    public String verDim() {
        return String.format("alto = %.2f %nancho = %.2f", alto, ancho);
    }

    abstract float area ();

    public float precio (float precioMetroCuadrado){
        return this.area()*precioMetroCuadrado;
    }
}
