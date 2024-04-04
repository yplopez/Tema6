package ejercicio4;

public class Electrodomestico {

	enum colores {
		blanco, negro, rojo, azul, gris
	}

	enum consumoEnergetico {
		A, B, C, D, E, F
	}

	protected double precioBase = 100;

	protected colores col = colores.blanco;

	protected consumoEnergetico conEnergetico;

	protected int peso = 5;

	public Electrodomestico() {

	}

	public Electrodomestico(double precio, int peso) {
		if (precioBase > 0) {
			this.precioBase = precio;
		}
		if(peso > 0) {
			this.peso = peso;
		}
	}
	
	public Electrodomestico (double precioBase, String colores, consumoEnergetico conEnergetico )
	
	

}
