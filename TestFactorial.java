package prFactorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestFactorial {
	
	@Test
	public void factorialEntrada0Salida1(){
		assertTrue(1 == Factorial.calcular(0));
	}

}
