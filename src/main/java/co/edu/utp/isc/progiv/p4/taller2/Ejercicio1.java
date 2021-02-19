/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.taller2;

import java.util.Scanner;

/**
 *
 * @author cdiaz
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Por favor ingresa un numero");
        var numero = sc.nextLong();

        var mensaje = procesarEntrada(numero);
        System.out.println(mensaje);

    }

    /*
    Implemente un algoritmo que verifique si un número es par o impar 
    e imprima el mensaje en consola.
     */
    public static String procesarEntrada(long numero) {
        String mensaje;

        if (numero == 0) {
            mensaje = "El número 0 no es par ni impar.";
        } else {

            var esNumeroPar = esPar(numero);
            if (esNumeroPar) {
                mensaje = "El número " + numero + " es par.";
            } else {
                mensaje = "El número " + numero + " es impar.";
            }
        }

        return mensaje;
    }

    private static boolean esPar(long numero) {
        return numero % 2 == 0;
    }

}
