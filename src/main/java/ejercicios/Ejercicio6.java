package ejercicios;

import java.util.Scanner;

import recursos.piezasAjedrez.AlfilAjedrez_v2;
import recursos.piezasAjedrez.PiezaAjedrez_v2;
import recursos.piezasAjedrez.TorreAjedrez_v2;

/**
 * 10.6. Modifica la clase PiezaAjedrez (versión _v2) para incluir métodos
 * ¿estáticos? para que el usuario introduzca la columna como letra (a-h) y la
 * fila (entre 1 y 8) y los convierta a los valores usados previamente (entre 0
 * y 7). Esto obligará a generar una nueva versión del programa anterior, para
 * que el usuario introduzca a-h y 1-8 como valores destino del movimiento.
 */

public class Ejercicio6 {
    public static void main(String[] args) {
        PiezaAjedrez_v2[] pieza = new PiezaAjedrez_v2[2];
        char row;
        int column;
        Scanner teclado = new Scanner(System.in);
        int opcion;
        pieza[0] = new AlfilAjedrez_v2(0, 0);
        pieza[1] = new TorreAjedrez_v2(0, 0);
        System.out.println("Qué pieza quieres mover?\n0: Alfil\n1: Torre");
        opcion = Integer.parseInt(teclado.nextLine());
        if (opcion == 0) {
            System.out.println("A dónde quieres mover la pieza?");
            row = teclado.nextLine().charAt(0);
            column = Integer.parseInt(teclado.nextLine());
            if (pieza[0].mover(row, column))
                System.out.println("Se ha ejecutado tu movimiento");
            else
                System.out.println("No se ha podido ejecutar tu movimiento");
        } else {
            System.out.println("A dónde quieres mover la pieza?");
            row = teclado.nextLine().charAt(0);
            column = Integer.parseInt(teclado.nextLine());
            if (pieza[0].mover(row, column))
                System.out.println("Se ha ejecutado tu movimiento");
            else
                System.out.println("No se ha podido ejecutar tu movimiento");
        }
        teclado.close();
    }
}
