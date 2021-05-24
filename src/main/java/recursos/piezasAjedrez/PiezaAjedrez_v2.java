package recursos.piezasAjedrez;

public abstract class PiezaAjedrez_v2 {
    private int fila;
    private int columna;

    public PiezaAjedrez_v2(int filaInicial, int columnaInicial) {
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

    static int[] parseMovement(char fila, int columna) {
        int column = columna - 1;
        int row = 8;
        char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h' };
        for (int i = 0; i < letters.length; i++) {
            if (fila == letters[i]) {
                row = i;
                break;
            }
        }
        int[] movimiento = { row, column };
        return movimiento;
    }

    public abstract boolean mover(char filaDestino, int columnaDestino);
}
