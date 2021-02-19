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
public class Ejercicio3 {

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

    public static String procesarEntrada(long numero) {
        String mensaje;

        if (numero < 0) {
            // Enviar el error
            mensaje = String.format("El número %d no es una entrada válida", numero);
        } else {
            var resultado = funcion(numero);
            mensaje = String.format("El resultado es: %d", resultado);
        }

        return mensaje;
    }

    private static long funcion(long numero) {
        long resultado;
        if (numero == 0 || numero == 1) {
            resultado = numero;
        } else {
            resultado = funcion(numero - 1) + funcion(numero - 2);
        }
        return resultado;
    }

}
