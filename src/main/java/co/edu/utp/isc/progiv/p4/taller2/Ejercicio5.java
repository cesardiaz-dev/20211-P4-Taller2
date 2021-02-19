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
public class Ejercicio5 {

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
        if (numero <= 1) {
            mensaje = "El " + numero + " es un número inválido";
        } else {

            var resultado = esPrimo(numero);
            if (resultado) {
                mensaje = String.format("El %d es un número primo", numero);
            } else {
                mensaje = String.format("El %d no es un número primo", numero);
            }
        }

        return mensaje;
    }

    private static boolean esPrimo(long numero) throws ArithmeticException {
        var resultado = true;
        if (numero <= 1) {
            // Enviar el error
            throw new ArithmeticException("El " + numero + " es un número inválido");
        }

        if (numero == 2) {
            resultado = true;
        } else {
            for (int i = 2; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    resultado = false;
                    break;
                }
            }
        }
        return resultado;
    }

}
