package recursos.hotel;

import java.time.LocalDate;
import java.util.ArrayList;

public class Hotel {
    private ArrayList<Habitacion> habitacions;

    public Hotel() {
        habitacions = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            habitacions.add(new HLowCost());
        }

        for (int i = 0; i < 5; i++) {
            habitacions.add(new HSuite());
        }

        for (int i = 0; i < 10; i++) {
            habitacions.add(new HDoble());
        }
    }

    /**
     * @param none
     * 
     * @return Array con las habitaciones libres y ocupadas
     */
    public String[] checkRooms() {
        String[] checks = new String[habitacions.size()];
        for (int i = 0; i < checks.length; i++) {
            if (habitacions.get(i).getCheckIn() == null) {
                if (habitacions.get(i) instanceof HLowCost)
                    checks[i] = (i + 1) + " - Habitación Low Cost, no ocupado" + ", "
                            + this.habitacions.get(i).getPrecio();
                else if (habitacions.get(i) instanceof HDoble)
                    checks[i] = (i + 1) + " - Habitación Doble, no ocupado" + ", "
                            + this.habitacions.get(i).getPrecio();
                else
                    checks[i] = (i + 1) + " - Suite, no ocupado" + ", " + this.habitacions.get(i).getPrecio();
            } else
                checks[i] = (i + 1) + ", Ocupada,  " + this.habitacions.get(i).toString();
        }
        return checks;
    }

    public boolean checkIn(int room, LocalDate checkIn, LocalDate checkOut) throws Exception {
        try {
            if (this.habitacions.get(room - 1).getCheckIn() != null
                    && this.habitacions.get(room - 1).getCheckOut().compareTo(checkIn) < 0) {
                return false;
            } else {
                this.habitacions.get(room - 1).setCheckIn(checkIn);
                this.habitacions.get(room - 1).setCheckOut(checkOut);
                return true;
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
