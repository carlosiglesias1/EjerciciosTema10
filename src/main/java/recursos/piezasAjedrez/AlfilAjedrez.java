package recursos.piezasAjedrez;

public class AlfilAjedrez extends PiezaAjedrez {
    public AlfilAjedrez(int filaInicial, int columnaInicial) {
        super(filaInicial, columnaInicial);
    }

    public boolean mover(int filaDestino, int columnaDestino) {
        if (Math.abs(this.getFila() - filaDestino) == Math.abs(this.getColumna() - columnaDestino) && filaDestino < 7
                && columnaDestino < 7) {
            this.setFila(filaDestino);
            this.setColumna(columnaDestino);
            return true;
        } else
            return false;
    }
}
