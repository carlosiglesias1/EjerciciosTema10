package ejercicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

import recursos.pacientes.Paciente;
import recursos.pacientes.PacienteConsulta;
import recursos.pacientes.PacienteRecetas;
import recursos.pacientes.PacienteRevision;

/**
 * 10.4. Copia el ejercicio 2.9 (lista de espera del médico) y redefine la
 * superclase Paciente como abstracta haciendo el método facturar() abstracto,
 * ya que se implementa en las tres clases hijas.
 */

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
        char opcion;
        Scanner teclado = new Scanner(System.in);
        int paciente = 1;
        float totalFacturado = 0;
        do {
            System.out.println(
                    "Opciones:\n\ta: Añadir paciente\n\tp: Dar paso a un paciente\n\tc: Consultar facturado\n\te: Salir");
            opcion = teclado.nextLine().charAt(0);
            switch (opcion) {
                case 'a':
                    System.out.println("Motivo de la consulta?\n\tr:Revisión\n\tc:Consulta\n\tp:Recetas");
                    opcion = teclado.nextLine().charAt(0);
                    switch (opcion) {
                        case 'r':
                            System.out.println("Nombre / Fecha de nacimiento (aaaa-mm-dd) / Fecha última revisión");
                            pacientes.add(new PacienteRevision(teclado.nextLine(), LocalDate.parse(teclado.nextLine()),
                                    LocalDate.parse(teclado.nextLine())));
                            break;
                        case 'c':
                            System.out.println("Nombre / Fecha de nacimiento (aaaa-mm-dd)/ Motivo de la Consulta");
                            pacientes.add(new PacienteConsulta(teclado.nextLine(), LocalDate.parse(teclado.nextLine()),
                                    teclado.nextLine()));
                            break;
                        case 'p':
                            System.out.println("Nombre / Fecha de nacimiento (aaaa-mm-dd)/ Lista de Recetas");
                            pacientes.add(new PacienteRecetas(teclado.nextLine(), LocalDate.parse(teclado.nextLine()),
                                    new ArrayList<String>()));
                            break;
                        default:
                            System.out.println("Oh vaya, semejante cagada!");
                            break;
                    }
                    break;
                case 'p':
                    if (pacientes.isEmpty())
                        System.out.println("No hay pacientes para pasar, burro");
                    else {
                        System.out.println("Que pase el paciente " + paciente + "!");
                        paciente++;
                        Paciente paciente2 = pacientes.get(0);
                        totalFacturado += paciente2.returnFactura();
                        pacientes.remove(0);
                    }
                    break;
                case 'c':
                    System.out.println("Total facturado hasta ahora: " + totalFacturado);
                    break;
                case 'e':
                    break;
                default:
                    System.out.println(
                            "Baya cagadita eh, no te fijes en las faltas de ortografía y escoje una opción korrecta");
                    break;
            }
        } while (opcion != 'e');
        teclado.close();
    }
}
