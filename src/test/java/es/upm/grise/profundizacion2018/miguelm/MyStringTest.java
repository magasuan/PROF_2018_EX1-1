package es.upm.grise.profundizacion2018.miguelm;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;

public class MyStringTest {
		@Test
		public void vacioYRelleno() {
			MyString vacio = new MyString("");
			MyString relleno = new MyString("Probando");
			assertEquals(vacio.compareTo(relleno), -8);
		}

	
}
