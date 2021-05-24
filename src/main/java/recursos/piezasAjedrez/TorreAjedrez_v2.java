package recursos.piezasAjedrez;

public class TorreAjedrez_v2 extends PiezaAjedrez_v2 {
    public TorreAjedrez_v2(int filaInicial, int columnaInicial) {
        super(filaInicial, columnaInicial);
    }

    public boolean mover(char fila, int columna) {
        int filaDestino = PiezaAjedrez_v2.parseMovement(fila, columna)[1];
        int columnaDestino = PiezaAjedrez_v2.parseMovement(fila, columna)[0];
        if (filaDestino == 0 && columnaDestino < 7 || columnaDestino == 0 && filaDestino < 7) {
            this.setColumna(columnaDestino);
            this.setFila(filaDestino);
            return true;
        } else
            return false;
    }
}
