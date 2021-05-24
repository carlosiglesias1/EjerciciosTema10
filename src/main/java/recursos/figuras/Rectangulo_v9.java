package recursos.figuras;

/**
 * • Crear una nueva clase hija de Figura2D_v8 llamada Rectangulo_v8 con
 * constructor con tres parámetros (alto, ancho, nombre), constructor con dos
 * parámetros (alto igual a ancho y nombre) y un método que devuelve boolean
 * llamado esCuadrado().
 */

public class Rectangulo_v9 extends Figura2D_v9 {
    
    public Rectangulo_v9 (float alto, float ancho, String nombre){
        super(alto, ancho, nombre);
    }

    public Rectangulo_v9 (float altoYAncho, String nombre){
        super(altoYAncho, nombre);
    }

    public boolean esCuadrado (){
        if(this.getAlto() == this.getAncho())
            return true;
        return false;
    }

    public float area (){
        return this.getAncho()*this.getAlto();
    }
}
