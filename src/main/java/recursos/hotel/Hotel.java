package recursos.hotel;

import java.util.ArrayList;

public class Hotel {
    private ArrayList<Habitacion> habitacions;

    public Hotel (){
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

    public String [] checkIn (){
        String [] checks = new String [habitacions.size()];
        for (int i = 0; i < checks.length; i++) {
            if(habitacions.get(i).getCheckIn() == null)
                checks[i] = "libre"+ha
        }
    }
}
