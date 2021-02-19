/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progiv.p4.taller2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author cdiaz
 */
public class Ejercicio1Test {
    
    public Ejercicio1Test() {
    }

    @Test
    public void procesarEntradaIngresa5DevuelveImpar() {
        var entrada = 5;
        var esperado = "El número 5 es impar.";
        
        var resultado = Ejercicio1.procesarEntrada(entrada);
        
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void procesarEntradaIngresa325410DevuelvePar() {
        var entrada = 325410;
        var esperado = "El número 325410 es par.";
        
        var resultado = Ejercicio1.procesarEntrada(entrada);
        
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void procesarEntradaIngresaMenos2DevuelvePar() {
        var entrada = -2;
        var esperado = "El número -2 es par.";
        
        var resultado = Ejercicio1.procesarEntrada(entrada);
        
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void procesarEntradaIngresa0DevuelveNinguno() {
        var entrada = 0;
        var esperado = "El número 0 no es par ni impar.";
        
        var resultado = Ejercicio1.procesarEntrada(entrada);
        
        assertEquals(esperado, resultado);
    }
    
}
