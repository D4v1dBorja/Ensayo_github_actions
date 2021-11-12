package org.example;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {
    @Test
    public void  probarSuma(){

        //Creación del objeto para la prueba
        Calculadora calc = new Calculadora();
        //assert es la forma de comprobar mediante afirmación un test
        assertEquals(10.0,calc.sumar(5.0,5.0),0.001);
    }

    @Test
    public void probarResta(){
        Calculadora calc = new Calculadora();
        assertEquals(3.0,calc.restar(5.0,2.0),0.001);
    }
}
