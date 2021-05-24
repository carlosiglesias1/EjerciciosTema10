package recursos.piezasAjedrez;

public abstract class PiezaAjedrez {
    private int fila;
    private int columna;

    public PiezaAjedrez (int filaInicial, int columnaInicial){
        this.fila = filaInicial;
        this.columna = columnaInicial;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public int getFila() {
        return fila;
    }

    public abstract boolean mover(int filaDestino, int columnaDestino);
}
