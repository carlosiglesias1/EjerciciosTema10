package recursos.hotel;

import java.time.LocalDate;
import java.time.Month;

/**
 * 10 habitaciones dobles. Tienen una tarifa normal de 100 euros/dia y un
 * incremento del 20% si el día de salida es abril, julio o agosto.
 */

public class HDoble extends Habitacion {
    public HDoble(LocalDate checkIn, LocalDate checkOut) {
        super(100, checkIn, checkOut);
        if (checkOut.getMonth() == Month.JULY || checkOut.getMonth() == Month.AUGUST
                || checkOut.getMonth() == Month.APRIL)
            super.setPrecio(120);
    }

    public HDoble (){
        super(100);
    }
}
