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
public class Ejercicio6 {

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
            mensaje = String.format("El número %d es un número inválido", numero);
        } else {
            var resultado = calcularHoras(numero);

            mensaje = numero + " horas equivalen a ";
            var coma = false;
            if (resultado[2] != 0) {
                mensaje += resultado[2] + " semanas";
                coma = true;
            }
            if (resultado[1] != 0) {
                mensaje += (coma ? ", " : "") + resultado[1] + " días";
                coma = true;
            }
            if (resultado[0] != 0) {
                mensaje += (coma ? " y " : "") + resultado[0] + " horas";
            }
        }
        return mensaje;
    }

    private static long[] calcularHoras(long horas) {
        // 0 -> Horas, 1 -> Dias, 2 -> Semanas
        var resultado = new long[3];

        // Horas
        resultado[0] = horas % 24;

        // Dias
        horas /= 24;
        resultado[1] = horas % 7;

        // Semanas
        horas /= 7;
        resultado[2] = horas;

        return resultado;
    }
    
 
}
