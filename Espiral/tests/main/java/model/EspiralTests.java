package main.java.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.model.Espiral;

class EspiralTests {

	  private Espiral espiral;
	  private int[][] matriz;

	    @BeforeEach
	    void setUp() {
	        // Inicializamos una matriz 3x3 para las pruebas
	        matriz = new int[][] {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
	        espiral = new Espiral(matriz);
	    }

	    // Pruebas para el constructor
	    @Test
	    void testConstructor() {
	        assertNotNull(espiral);
	        assertEquals(3, espiral.getDimension());

	    }

	    // Pruebas para calcularCentro
	    @Test
	    void testCalcularCentro() {

	    }

	    // Pruebas para sumarEstrellas
	    @Test
	    void testSumarEstrellas() {
	        espiral.sumarEstrellas(0, 0); // Suma el valor 1
	        assertEquals(1, espiral.getAlmacenarSumaEstrellas());

	        espiral.sumarEstrellas(2, 2); // Suma el valor 9
	        assertEquals(10, espiral.getAlmacenarSumaEstrellas());

	        // Fuera de los límites de la matriz
	        espiral.sumarEstrellas(-1, -1); // No debe sumar nada
	        assertEquals(10, espiral.getAlmacenarSumaEstrellas());
	    }

	    // Pruebas para comenzarSumatorio
	    @Test
	    void testComenzarSumatorio() {

	    }

	    // Pruebas para desplazarArriba
	    @Test
	    void testDesplazarArriba() {

	    }

	    // Pruebas para desplazarDerecha
	    @Test
	    void testDesplazarDerecha() {

	    }

	    // Pruebas para desplazarAbajo
	    @Test
	    void testDesplazarAbajo() {

	    }

	    // Pruebas para desplazarIzquierda
	    @Test
	    void testDesplazarIzquierda() {

	    }

	    // Pruebas para getMatriz y setMatriz
	    @Test
	    void testGetSetMatriz() {
	        int[][] nuevaMatriz = new int[][] {
	            {9, 8, 7},
	            {6, 5, 4},
	            {3, 2, 1}
	        };
	        espiral.setMatriz(nuevaMatriz);
	        assertArrayEquals(nuevaMatriz, espiral.getMatriz());
	    }

	    // Pruebas para getDimension
	    @Test
	    void testGetDimension() {
	        assertEquals(3, espiral.getDimension());
	    }

	    // Pruebas para getCentro
	    @Test
	    void testGetCentro() {

	    }

	    // Pruebas para toString
	    @Test
	    void testToString() {

	    }

	    // Pruebas para getAlmacenarSumaEstrellas y setAlmacenarSumaEstrellas
	    @Test
	    void testGetSetAlmacenarSumaEstrellas() {
	        espiral.setAlmacenarSumaEstrellas(100);
	        assertEquals(100, espiral.getAlmacenarSumaEstrellas());
	    }
}
	


