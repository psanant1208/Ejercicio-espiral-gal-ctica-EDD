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
		
	}
	
	public void desplazarArriba(int numPaso) {
		
	}
	
	public void desplazarIzquierda(int numPaso) {
		
	}
	
	public void desplazarAbajo(int numPaso) {
		
	}
	
	public void desplazarDerecha(int numPaso) {
		
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









