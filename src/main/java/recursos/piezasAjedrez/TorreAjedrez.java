package recursos.piezasAjedrez;

public class TorreAjedrez extends PiezaAjedrez {
    public TorreAjedrez(int filaInicial, int columnaInicial) {
        super(filaInicial, columnaInicial);
    }

    public boolean mover(int filaDestino, int columnaDestino) {
        if (filaDestino == 0 && columnaDestino < 7 || columnaDestino == 0 && filaDestino < 7) {
            this.setColumna(columnaDestino);
            this.setFila(filaDestino);
            return true;
        } else
            return false;
    }
}
