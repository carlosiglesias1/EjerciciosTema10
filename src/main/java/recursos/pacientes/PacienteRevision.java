package recursos.pacientes;

import java.time.LocalDate;

public class PacienteRevision extends Paciente {
    private LocalDate ultimaRevision;
    private final float PRECIOMAYORES65 = 30;
    private final float PRECIONORMAL = 50;

    public PacienteRevision(String name, LocalDate birthDate, LocalDate lastMeeting) {
        super(name, birthDate);
        this.ultimaRevision = lastMeeting;
    }

    public LocalDate getUltimaRevision() {
        return ultimaRevision;
    }

    private boolean precioReducido() {
        LocalDate now = LocalDate.now();
        if (this.getFechaNacimiento().getYear() > (now.getYear() - 65)
                || this.getFechaNacimiento().getYear() == now.getYear() - 65
                        && this.getFechaNacimiento().getMonthValue() > now.getMonthValue()
                || this.getFechaNacimiento().getMonth() == now.getMonth()
                        && this.getFechaNacimiento().getDayOfMonth() > now.getDayOfMonth())
            return false;
        else
            return true;
    }

    public float facturar (){
        if(this.precioReducido())
            return this.PRECIOMAYORES65;
        else
            return this.PRECIONORMAL;
    }
}
