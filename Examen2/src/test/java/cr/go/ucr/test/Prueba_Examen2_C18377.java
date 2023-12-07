package cr.go.ucr.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import cr.go.ucr.OperacionAritmetica;
import cr.go.ucr.operaciones.Division;
import cr.go.ucr.operaciones.Resta;
import cr.go.ucr.operaciones.Sumar;

class Prueba_Examen2_C18377 {
	OperacionAritmetica context;
	
	//Pruebas de Suma:
	
	//Casos donde los valores deberían ser iguales:
	
	//Ambos valores negativos con un código de -1. Ejemplo: -2, -3, código = -1.
	@org.junit.jupiter.api.Test
	void testGetSuma1() {
		context = new OperacionAritmetica( new Sumar() );
		assertEquals(context.procesar(-2, -3), -1);
	}
	
	//Primer valor negativo y el segundo positivo con un código de -1. Ejemplo: -2, 4, código = -1.
	@org.junit.jupiter.api.Test
	void testGetSuma2() {
		context = new OperacionAritmetica( new Sumar() );
		assertEquals(context.procesar(-2, 4), -1);
	}
	
	//Segundo valor negativo y el primero positivo con un código de -1. Ejemplo: 4, -2, código = -1.
	@org.junit.jupiter.api.Test
	void testGetSuma3() {
		context = new OperacionAritmetica( new Sumar() );
		assertEquals(context.procesar(4, -2), -1);
	}
	
	//Ambos valores positivos con un código de la suma que debería dar. Ejemplo: 4, 4, código = 8.
	@org.junit.jupiter.api.Test
	void testGetSuma4() {
		context = new OperacionAritmetica( new Sumar() );
		assertEquals(context.procesar(4, 4), 8);
	}
	
	//Casos donde los valores no deberían ser iguales:
	
	//Primer valor negativo y el segundo positivo con un código de 0. Ejemplo: -2, 4, código = 0.
	@org.junit.jupiter.api.Test
	void testGetSuma5() {
		context = new OperacionAritmetica( new Sumar() );
		assertNotEquals(context.procesar(-2, 4), 0);
	}
	
	//Segundo valor negativo y el primero positivo con un código de -2. Ejemplo: 4, -2, código = -2.
	@org.junit.jupiter.api.Test
	void testGetSuma6() {
		context = new OperacionAritmetica( new Sumar() );
		assertNotEquals(context.procesar(4, -2), -2);
	}
	
	//Ambos valores positivos con un código de la suma que no debería dar. Ejemplo: 4, 4, código = 2.
	@org.junit.jupiter.api.Test
	void testGetSuma7() {
		context = new OperacionAritmetica( new Sumar() );
		assertNotEquals(context.procesar(4, 4), 2);
	}
	
	//Pruebas de Resta:
	
	//Casos donde los valores deberían ser iguales: 
	
	//Segundo número mayor al primero con un código de -2. Ejemplo: 1, 2, código = -2.
	@org.junit.jupiter.api.Test
	void testGetResta1() {
		context = new OperacionAritmetica( new Resta() );
		assertEquals(context.procesar(1, 2), -2);
	}

	//Primer número mayor al segundo con el código de la resta que debería de dar. Ejemplo: 2, 1, código = 1.
	@org.junit.jupiter.api.Test
	void testGetResta2() {
		context = new OperacionAritmetica( new Resta() );
		assertEquals(context.procesar(2, 1), 1);
	}
	
	//Ambos valores sean positivos e iguales con un código de 0. Ejemplo: 4, 4, código = 0.
	@org.junit.jupiter.api.Test
	void testGetResta3() {
		context = new OperacionAritmetica( new Resta() );
		assertEquals(context.procesar(4, 4), 0);
	}
	
	//Ambos valores sean negativos e iguales con un código de 0. Ejemplo: -4, -4, código = 0.
	/*
	@org.junit.jupiter.api.Test
	void testGetResta4() {
		context = new OperacionAritmetica( new Resta() );
		assertEquals(context.procesar(-4, -4), 0);
	}
	*/
	
	//Casos donde los valores no deberían ser iguales: 
	
	//Segundo número mayor al primero con un código de -1. Ejemplo: 1, 2, código = -1.
	@org.junit.jupiter.api.Test
	void testGetResta5() {
		context = new OperacionAritmetica( new Resta() );
		assertNotEquals(context.procesar(1, 2), -1);
	}
	
	//Segundo número mayor al primero con un código de -3. Ejemplo: 1, 2, código = -3.
	@org.junit.jupiter.api.Test
	void testGetResta6() {
		context = new OperacionAritmetica( new Resta() );
		assertNotEquals(context.procesar(1, 2), -3);
	}
	
	//Pruebas de División:
	
	//Casos donde los valores deberían ser iguales: 
	
	//Segundo valor 0, el primero un valor positivo diferente de 0 con un código de -3. Ejemplo: 2, 0, código = -3.
	@org.junit.jupiter.api.Test
	void testGetDivision1() {
		context = new OperacionAritmetica( new Division() );
		assertEquals(context.procesar(2, 0), -3);
	}
	
	//Segundo valor 0, el primero un valor negativo diferente de 0 con un código de -3. Ejemplo: -2, 0, código = -3.
	/*
	@org.junit.jupiter.api.Test
	void testGetDivision2() {
		context = new OperacionAritmetica( new Division() );
		assertEquals(context.procesar(-2, 0 ), -3);
	}
	*/
	
	//Ambos valores 0 con un código de -3. Ejemplo: 0, 0, código = -3.
	@org.junit.jupiter.api.Test
	void testGetDivision3() {
		context = new OperacionAritmetica( new Division() );
		assertEquals(context.procesar(0, 0), -3);
	}
	
	//Ambos valores distintos de 0 con un código de la división que debería dar. Ejemplo: 2, 2, código = 1.
	@org.junit.jupiter.api.Test
	void testGetDivision4() {
		context = new OperacionAritmetica( new Division() );
		assertEquals(context.procesar(2, 2), 1);
	}
	
	//Casos donde los valores no deberían ser iguales: 
	
	//Primer valor 0, el segundo un valor positivo diferente de 0 con un código de -3. Ejemplo: 0, 2, código = -3.
	@org.junit.jupiter.api.Test
	void testGetDivision5() {
		context = new OperacionAritmetica( new Division() );
		assertNotEquals(context.procesar(0, 2), -3);
	}
	
	//Primer valor 0, el segundo un valor negativo diferente de 0 con un código de -3. Ejemplo: 0, -2, código = -3.
	@org.junit.jupiter.api.Test
	void testGetDivision6() {
		context = new OperacionAritmetica( new Division() );
		assertNotEquals(context.procesar(0, -2), -3);
	}
	
	//Segundo valor 0, el primero un valor positivo diferente de 0 con un código de -2. Ejemplo: 2, 0, código = -2.
	@org.junit.jupiter.api.Test
	void testGetDivision7() {
		context = new OperacionAritmetica( new Division() );
		assertNotEquals(context.procesar(2, 0), -2);
	}
	
	//Segundo valor 0, el primero un valor positivo diferente de 0 con un código de -4. Ejemplo: 2, 0, código = -4.
	@org.junit.jupiter.api.Test
	void testGetDivision8() {
		context = new OperacionAritmetica( new Division() );
		assertNotEquals(context.procesar(2, 0), -4);
	}
}