package recursos.hotel;

import java.time.LocalDate;

public class HLowCost extends Habitacion {

    public HLowCost(LocalDate checkIn, LocalDate checkOut) {
        super(50, checkIn, checkOut);
    }

    public HLowCost() {
        super(50);
    }

    @Override
    public String toString() {
        return "Habitación Low Cost, " + this.getCheckIn() + " - " + this.getCheckOut() + ", " + this.checkOut();
    }
}
