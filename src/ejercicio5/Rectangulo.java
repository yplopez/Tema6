package ejercicio5;

public class Rectangulo extends Poligono {
	/**
	 * Atributo lado1 de tipo double
	 */
	private double lado1;
	/**
	 * Atributo lado2 de tipo entero
	 */
	private double lado2;
	/**
	 * Contructor sin parámetros
	 */
	public Rectangulo() {
		super(4);
	}
	/**
	 * Constructor con parámetros
	 * @param lado1 medida de lado 1
	 * @param lado2 medida de lado 2
	 */
	public Rectangulo(double lado1, double lado2) {
		super(3);
		if(lado1>0) {
		this.lado1 = lado1;
		}
		if(lado2>0) {
		this.lado2 = lado2;
		}
	}
	
	
	
	public double getLado1() {
		return lado1;
	}
	public void setLado1(double lado1) {
		if(lado1>0) {
			this.lado1 = lado1;
			}
	}
	public double getLado2() {
		return lado2;
	}
	public void setLado2(double lado2) {
		if(lado2>0) {
			this.lado2 = lado2;
			}
	}
	
	
	@Override
	public String toString() {
		String cadena = super.toString();
		cadena += "Rectangulo: " + "Lado 1: " + this.lado1;
		cadena += "Lado 2: " + this.lado2;
		return cadena;
	}
	
	
	@Override
	public double area() {
		double areaTri = this.lado1 * this.lado2;
		return areaTri;
	}
	
	

}
