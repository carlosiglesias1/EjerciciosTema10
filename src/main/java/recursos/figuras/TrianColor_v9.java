package recursos.figuras;

/**
 * • Crea una nueva clase TrianColor_v6, hija de la clase Triángulo_v6 que
 * incluye un nuevo atributo privado de tipo String llamado color. • Esta nueva
 * clase tiene un constructor de 4 parámetros (alto, ancho, estilo, color),
 * además del getter y setter de color.
 */

public class TrianColor_v9 extends Triangulo_v9 {
    private String color;

    public TrianColor_v9 (float base, float altura, String name, String style, String colour){
        super(altura, base, name, style);
        this.color = colour;
    }

    public TrianColor_v9 (){
        super();
        this.color = null;
    }

    public String getColor() {
        return color;
    }
}
