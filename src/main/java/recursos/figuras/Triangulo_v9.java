package recursos.figuras;

public class Triangulo_v9 extends Figura2D_v9 {
    private String estilo;

    public Triangulo_v9 (float alto, float ancho, String nombre, String estilo){
        super(alto, ancho, nombre);
        switch (estilo){
            case "equilátero":
            case "rectángulo":
            case "isósceles":
            case "escaleno":
                this.estilo = estilo;
                break;
            default: this.estilo = null;
        }
    }

    public Triangulo_v9 (float baseAltura, String nombre){
        super(baseAltura, nombre);
        this.estilo = "igualBaseAltura";
    }

    public Triangulo_v9 (Triangulo_v9 tV7){
        super(tV7);
        this.estilo = tV7.verEstilo();
    }

    public Triangulo_v9(){
        super();
        this.estilo = null;
    }

    public float area (){
        return (getAlto()*getAncho())/2;
    }

    public String verEstilo (){
        return this.estilo;
    }
}
