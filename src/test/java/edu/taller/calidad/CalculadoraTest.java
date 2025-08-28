package edu.taller.calidad;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {

    private Calculadora calc;

    @BeforeEach
    void setUp() {
        calc = new Calculadora();
    }

    @Test
    void testSumar() {
        assertEquals(5, calc.sumar(2, 3));
    }

    @Test
    void testRestar() {
        assertEquals(1, calc.restar(3, 2));
    }

    @Test
    void testMultiplicar() {
        assertEquals(6, calc.multiplicar(2, 3));
    }

    @Test
    void testDividir() {
        assertEquals(2, calc.dividir(6, 3));
    }

    @Test
    void testDividirPorCero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(5, 0));
    }
}
