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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Por favor ingresa el valor para 'n'");
        var n = sc.nextLong();

        System.out.println("Por favor ingresa el valor para 'm'");
        var m = sc.nextLong();

        var mensaje = procesarEntrada(n, m);
        System.out.println(mensaje);
    }

    public static String procesarEntrada(long n, long m) {
        String mensaje;
        if (m < 0) {
            mensaje = String.format("El valor de m = %d no es un válido", m);
        } else {
            var resultado = funcion(n, m);
            mensaje = String.format("El resultado es: %d", resultado);
        }
        return mensaje;
    }

    private static long funcion(long n, long m) {
        var resultado = 0L;

        for (int i = 0; i < m; i++) {
            resultado *= n;
        }

        return resultado;
    }

}
