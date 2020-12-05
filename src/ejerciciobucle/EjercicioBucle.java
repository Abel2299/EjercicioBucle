/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciobucle;

import java.util.Scanner;

/**
 *
 * @author Abel
 */
public class EjercicioBucle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Este es un ejercicio que solicita por teclado un número entero comprendido entre 1 y 5 y muestre por pantalla el
        mensaje HOLA MUNDO las veces indicadas por dicho número.    */
        Scanner teclado = new Scanner(System.in);

        int num;

        do {
            System.out.println("Introduzca un numero entero entre el 1-5: ");
            num = teclado.nextInt();
        } while (num < 1 || num > 5);

        for (int cont = 1; cont <= num; cont++) {
            System.out.println("HOLA MUNDO");
        }

    }

}
