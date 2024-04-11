package ejercicio5;

public class Triangulo extends Poligono {

	/**
	 * Atributo lado1 de tipo double
	 */
	private double lado1;
	/**
	 * Atributo lado2 de tipo entero
	 */
	private double lado2;
	/**
	 * Atributo lado3 de tipo entero
	 */
	private double lado3;

	/**
	 * Contructor sin parámetros
	 */
	public Triangulo() {
		super(3);
	}

	/**
	 * Constructor con parámetros
	 * 
	 * @param lado1 medida de lado 1
	 * @param lado2 medida de lado 2
	 */
	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}
	
	
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		if (lado1 > 0) {
			this.lado1 = lado1;
		}
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		if (lado2 > 0) {
			this.lado2 = lado2;
		}
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		if (lado3 > 0) {
			this.lado3 = lado3;
		}
	}

	@Override
	public String toString() {
		String cadena = super.toString();
		cadena += "Triangulo: " + "Lado 1: " + this.lado1;
		cadena += "Lado 2: " + this.lado2;
		cadena += "Lado 3: " + this.lado3;
		return cadena;
	}

	@Override
	public double area() {
		double semiPerimetro = (lado1 + lado2 + lado3)/2;
		double area = Math.sqrt(semiPerimetro* (semiPerimetro - this.lado1) * (semiPerimetro - this.lado2)
                * (semiPerimetro - this.lado3));
		return area;
	}

}
