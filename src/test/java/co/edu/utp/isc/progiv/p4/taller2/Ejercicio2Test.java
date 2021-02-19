/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.taller2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 *
 * @author cdiaz
 */
public class Ejercicio2Test {
    
    @Test
    public void procesarEntradaIngresa5Devuelve120() {
        var entrada = 5;
        var esperado = "El resultado es: 120";
        
        var resultado = Ejercicio2.procesarEntrada(entrada);
        
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void procesarEntradaIngresa0Devuelve1() {
        var entrada = 0;
        var esperado = "El resultado es: 1";
        
        var resultado = Ejercicio2.procesarEntrada(entrada);
        
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void procesarEntradaIngresaMenos2DevuelveError() {
        var entrada = -2;
        var esperado = "El número -2 no es una entrada válida";
        
        var resultado = Ejercicio2.procesarEntrada(entrada);
        
        assertEquals(esperado, resultado);
    }
    
}
