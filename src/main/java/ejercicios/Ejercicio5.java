package ejercicios;

import java.util.Scanner;

import recursos.piezasAjedrez.AlfilAjedrez;
import recursos.piezasAjedrez.PiezaAjedrez;
import recursos.piezasAjedrez.TorreAjedrez;

/**
 * 10.5. Pensando que en el futuro implementemos el juego de ajedrez para dos
 * jugadores, se desea crear una clase abstracta llama PiezaAjedrez, con dos
 * atributos enteros llamados fila y columna que representan sus coordenadas en
 * el tablero (valores entre 0 y 7) y un método abstracto llamado mover () al
 * que se le pasan como parámetro la fila y columna destino de un movimiento. El
 * método devolver true si el movimiento se puede realizar o false si es un
 * movimiento erróneo. Implementa esa clase y sus subclases AlfilAjedrez y
 * TorreAjedrez. Para simplificarlo, vamos a pensar en movimientos en un tablero
 * vacío, es decir solo con una pieza, la que se está movimiento. • Haz un
 * programa que permita al usuario mover una pieza (Alfil o Torre) por el
 * tablero, partiendo de la posición 0,0, indicando las coordenadas destino del
 * movimiento que quiere hacer cada vez, terminando el programa cuando
 * introduzca fila -1. • El programa tendrá una función que presente por
 * pantalla la situación del tablero. • Por comodidad, puedes hacer las clases
 * dentro del mismo fichero que el programa.
 */

public class Ejercicio5 {
    public static void main(String[] args) {
        PiezaAjedrez[] pieza = new PiezaAjedrez[2];
        int[] movimiento = new int[2];
        Scanner teclado = new Scanner(System.in);
        int opcion;
        pieza[0] = new AlfilAjedrez(0, 0);
        pieza[1] = new TorreAjedrez(0, 0);
        System.out.println("Qué pieza quieres mover?\n0: Alfil\n1: Torre");
        opcion = teclado.nextInt();
        if (opcion == 0) {
            System.out.println("A dónde quieres mover la pieza?");
            movimiento[0] = teclado.nextInt();
            movimiento[1] = teclado.nextInt();
            if (pieza[0].mover(movimiento[0], movimiento[1]))
                System.out.println("Se ha ejecutado tu movimiento");
            else
                System.out.println("No se ha podido ejecutar tu movimiento");
        } else {
            System.out.println("A dónde quieres mover la pieza?");
            movimiento[0] = teclado.nextInt();
            movimiento[1] = teclado.nextInt();
            if (pieza[1].mover(movimiento[0], movimiento[1]))
                System.out.println("Se ha ejecutado tu movimiento");
            else
                System.out.println("No se ha podido ejecutar tu movimiento");
        }
        teclado.close();
    }
}
