package recursos.pacientes;

import java.time.LocalDate;
import java.util.ArrayList;

public class PacienteRecetas extends Paciente {
    private ArrayList <String> recetas;
    private float PRECIOCONSULTA = 100;

    public PacienteRecetas (String name, LocalDate birthDate, ArrayList <String> medicines){
        super(name, birthDate);
        this.recetas = medicines;
    }

    public ArrayList<String> getRecetas() {
        return recetas;
    }

    public float facturar (){
        return this.PRECIOCONSULTA;
    }
}
