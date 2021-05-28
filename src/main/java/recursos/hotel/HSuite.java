package recursos.hotel;

import java.time.LocalDate;

/**
 * 5 habitaciones Suite. 200 euros/día con 20% de descuento para estancias de 10
 * o más días.
 */

public class HSuite extends Habitacion {
    public HSuite(LocalDate checkIn, LocalDate checkOut) {
        super(200, checkIn, checkOut);
        if (this.getDias() > 10)
            this.setPrecio(160);
    }

    public HSuite (){
        super(200);
    }
}
