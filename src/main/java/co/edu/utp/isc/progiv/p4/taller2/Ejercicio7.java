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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
        System.out.println("Por favor ingresa el coeficiente 'a'");
        var a = sc.nextLong();

        System.out.println("Por favor ingresa el coeficiente 'b'");
        var b = sc.nextLong();

        System.out.println("Por favor ingresa el coeficiente 'c'");
        var c = sc.nextLong();

        var mensaje = procesarEntrada(a, b, c);
        System.out.println(mensaje);
    }

    public static String procesarEntrada(long a, long b, long c) {
        String mensaje;
        if (a == 0) {
            mensaje = "El coeficiente ‘a’ no tiene un número válido";
        } else {
            var discriminante = b * b - 4 * a * c;
            if (discriminante < 0) {
                mensaje = "El coeficiente dentro de la raíz no obtuvo un número válido";
            } else {
                var resultado = funcion(a, b, c);
                var ecuacion = "";
                if (a != 0) {
                    ecuacion += (a < 0 ? " -" : ""); 
                    ecuacion += (Math.abs(a) == 1 ? "" : Math.abs(a)) + "x^2";
                }
                if (b != 0) {
                    ecuacion += (b < 0 ? " - " : " + ");
                    ecuacion += (Math.abs(b) == 1 ? "" : Math.abs(b)) + "x";
                }
                if (c != 0) {
                    ecuacion += (c < 0 ? " - " : " + ") + Math.abs(c);
                }
                mensaje = String.format("Para la ecuación '%s' tiene como solución x1 = %.2f y x2 = %.2f",
                        ecuacion, resultado[0], resultado[1]);
            }
        }
        return mensaje;
    }

    private static double[] funcion(long a, long b, long c) {
        var resultado = new double[2];

        var discriminante = Math.sqrt(b * b - 4 * a * c);
        resultado[0] = (-b + discriminante) / (2 * a);
        resultado[1] = (-b - discriminante) / (2 * a);

        return resultado;
    }

}
