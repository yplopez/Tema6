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
		
	}
	/**
	 * Constructor con parámetros
	 * @param lado1 medida de lado 1
	 * @param lado2 medida de lado 2
	 */
	public Rectangulo(double lado1, double lado2) {
		super();
		if(lado1>0) {
		this.lado1 = lado1;
		}
		if(lado2>0) {
		this.lado2 = lado2;
		}
	}
	
	
	
	@Override
	public String toString() {
		String cadena = super.toString();
		cadena += "Lado 1: " + this.lado1;
		cadena += "Lado 2: " + this.lado2;
		return cadena;
	}
	
	
	@Override
	double area() {
		double areaRec = lado1 * lado2;
		return areaRec;
	}
	
	

}
