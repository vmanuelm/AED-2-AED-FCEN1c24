package aed;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class CoberturaTests {
    Cobertura cobertura = new Cobertura();

    @Test
    void testFizzBuzz() {
        assertEquals("FizzBuzz", cobertura.fizzBuzz(15));
        assertEquals("Fizz", cobertura.fizzBuzz(9));
        assertEquals("Buzz", cobertura.fizzBuzz(10));
        assertEquals("8", cobertura.fizzBuzz(8));  
    }

    
    @Test
    void testNumeroCombinatorio() {
        assertEquals(1, cobertura.numeroCombinatorio(10, 0));
        assertEquals(1, cobertura.numeroCombinatorio(10, 10));
        assertEquals(0, cobertura.numeroCombinatorio(10, 11));
        assertEquals(10, cobertura.numeroCombinatorio(5, 3));
       
    }

    @Test
    void testRepeticionesConsecutivas() {
        assertEquals(5, cobertura.repeticionesConsecutivas(new int[]{7, -2, 4, 4, 4, 4, 4, 1, 9}));
        assertEquals(1, cobertura.repeticionesConsecutivas(new int[]{7, -2, 4, 3, 4, 56, 4, 1, 9}));
        assertEquals(4, cobertura.repeticionesConsecutivas(new int[]{1, 1, 1, 1}));
    }
}
