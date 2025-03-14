package main.java.model;

public class Espiral {
	
	private int[][] matriz;
	private int dimension;
	private int[] centro;
	private int actualX;
	private int actualY;
	
	public Espiral(int[][] matriz) {
		super();
		this.matriz = matriz;
		this.dimension = matriz.length;
		this.centro = calcularCentro();
	}
	
	public int[] calcularCentro() {
		
	}
	
	public void sumarEstrellas(int x, int y) {
		
	}
	
	public void comenzarSumatorio() {
		actualX = centro[0];
        actualY = centro[1];
        sumarEstrellas(actualX,actualY);

        int numPaso = 0;
        while (actualX>=0 && actualX<dimension && actualY>=0) {
            numPaso++;
            //Cada 4 veces se ejecuta cada 1 de los metodos
            if(numPaso%4 == 1) {
                desplazarArriba(numPaso);
            }else if(numPaso%4 == 2) {
                desplazarDerecha(numPaso);
            }else if(numPaso%4 == 3) {
                desplazarAbajo(numPaso);
            }else if(numPaso%4 == 0) {
                desplazarIzquierda(numPaso);
            }
        }
	}
	
	public void desplazarArriba(int numPaso) {
		for (int i = 0; i < numPaso; i++) {
			actualY--;
			sumarEstrellas(actualX,actualY);
		}
	}
	
	public void desplazarIzquierda(int numPaso) {
		for (int i =0; i<numPaso;i++){
			actualX--;
			sumarEstrellas(actualX, actualY);
		}
	}
	
	public void desplazarAbajo(int numPaso) {
		for (int i = 0; i < numPaso; i++) {
			actualY++;
			sumarEstrellas(actualX,actualY);
		}
	}
	
	public void desplazarDerecha(int numPaso) {
		for (int i =0; i<numPaso;i++){
			actualX++;
			sumarEstrellas(actualX, actualY);
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

}









