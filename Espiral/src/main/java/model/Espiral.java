package main.java.model;

public class Espiral {

	private int[][] matriz;
	private int dimension;
	private int[] centro;
	private int actualRow;
	private int actualColumn;
	private int almacenarSumaEstrellas; // Variable que almacena la suma de las estrellas

	public Espiral(int[][] matriz) {
		super();
		this.matriz = matriz;
		this.dimension = matriz.length;
		this.centro = calcularCentro();
	}

	public int[] calcularCentro() {
		int filas = this.matriz.length;
		int columnas = this.matriz[0].length;
		int[] centro;

		centro = new int[] { (int) filas / 2, (int) columnas / 2 };
		return centro;
	}

	public void sumarEstrellas(int row, int column) {
		int sumar = 0;
		if (row >= 0 && row < dimension && column >= 0 && column < dimension) {
			sumar += matriz[column][row];
		}
		almacenarSumaEstrellas += sumar;
	}

	public void comenzarSumatorio() {
		actualRow = centro[0];
		actualColumn = centro[1];
		sumarEstrellas(actualRow, actualColumn);

		int numPaso = 0;
		while (actualRow >= 0 && actualRow < dimension && actualColumn >= 0) {
			numPaso++;
			// Cada 4 veces se ejecuta cada 1 de los metodos
			if (numPaso % 4 == 1) {
				desplazarArriba(numPaso);
			} else if (numPaso % 4 == 2) {
				desplazarDerecha(numPaso);
			} else if (numPaso % 4 == 3) {
				desplazarAbajo(numPaso);
			} else if (numPaso % 4 == 0) {
				desplazarIzquierda(numPaso);
			}
		}
	}

	public void desplazarArriba(int numPaso) {
		for (int i = 0; i < numPaso; i++) {
			actualColumn--;
			sumarEstrellas(actualRow, actualColumn);
		}
	}

	public void desplazarIzquierda(int numPaso) {
		for (int i = 0; i < numPaso; i++) {
			actualRow--;
			sumarEstrellas(actualRow, actualColumn);
		}
	}

	public void desplazarAbajo(int numPaso) {
		for (int i = 0; i < numPaso; i++) {
			actualColumn++;
			sumarEstrellas(actualRow, actualColumn);
		}
	}

	public void desplazarDerecha(int numPaso) {
		for (int i = 0; i < numPaso; i++) {
			actualRow++;
			sumarEstrellas(actualRow, actualColumn);
		}
	}

	public int[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(int[][] matriz) {
		this.matriz = matriz;
	}

	public int getDimension() {
		return dimension;
	}

	public int[] getCentro() {
		return centro;
	}

	@Override
	public String toString() {
		String resultado = "Dimension: " + dimension + "x" + dimension + "\n";
		resultado += "Centro: (" + centro[0] + ", " + centro[1] + ")\n";
		resultado += "Suma de estrellas: " + almacenarSumaEstrellas + "\n";
		resultado += "Matriz:\n";

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				resultado += matriz[i][j] + " ";
			}
			resultado += "\n";
		}
		return resultado;
	}

	public int getAlmacenarSumaEstrellas() {
		return almacenarSumaEstrellas;
	}

	public void setAlmacenarSumaEstrellas(int almacenarSumaEstrellas) {
		this.almacenarSumaEstrellas = almacenarSumaEstrellas;
	}

	public void setCentro(int[] centro) {
		this.centro = centro;
	}

	public void setAxtualX(int valor) {
		this.actualRow = valor;
	}

	public void setActualY(int valor) {
		this.actualColumn = valor;
	}

}
