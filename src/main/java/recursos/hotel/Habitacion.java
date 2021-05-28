package recursos.hotel;

import java.time.LocalDate;

public abstract class Habitacion {
    private int precio;
    private LocalDate checkIn;
    private LocalDate checkOut;

    protected Habitacion(int precio, LocalDate checkIn, LocalDate checkOut) {
        this.precio = precio;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    protected Habitacion(int precio) {
        this.precio = precio;
        this.checkIn = null;
        this.checkOut = null;
    }

    public int getPrecio() {
        return precio;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    protected int getDias() {
        return this.getCheckOut().getDayOfYear() - this.getCheckIn().getDayOfYear();
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public float checkOut() {
        return (float) this.getDias() * this.getPrecio();
    }

    @Override
    public abstract String toString();
}
