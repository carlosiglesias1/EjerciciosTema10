package recursos.mobiles;

public interface Prepagable {
    abstract void efectuarLlamada (int segundos);
    abstract void navegar(int mb);
    abstract boolean recargar (int importe); 
}
