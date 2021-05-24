package recursos.piezasAjedrez;

public class AlfilAjedrez_v2 extends PiezaAjedrez_v2 {
    public AlfilAjedrez_v2 (int filaInicial, int columnaInicial) {
        super(filaInicial, columnaInicial);
    }

    public boolean mover(char fila, int columna) {
        int filaDestino = PiezaAjedrez_v2.parseMovement(fila, columna)[1];
        int columnaDestino = PiezaAjedrez_v2.parseMovement(fila, columna) [0]; 
        if (Math.abs(this.getFila() - filaDestino) == Math.abs(this.getColumna() - columnaDestino) && filaDestino <= 7
                && columnaDestino <= 7) {
            this.setFila(filaDestino);
            this.setColumna(columnaDestino);
            return true;
        } else
            return false;
    }
}
