package ejercicio4;

public class Electrodomestico {

	enum colores {
		BLANCO, NEGRO, ROJO, AZUL, GRIS
	}

	enum consumoEnergetico {
		A, B, C, D, E, F
	}

	protected double precioBase = 100;

	protected colores color = colores.BLANCO;

	protected consumoEnergetico conEnergetico = consumoEnergetico.F;

	protected float peso = 5;

	public Electrodomestico() {

	}

	public Electrodomestico(double precio, float peso) {
		if (precioBase > 0) {
			this.precioBase = precio;
		}
		if (peso > 0) {
			this.peso = peso;
		}
	}

	public Electrodomestico(double precio, String color, char conEnergetico, float peso) {
		this(precio, peso);
		//comprobar color y consumo energético

	}

	private void combrobarConsumoEnergetico(char letra) {
		switch (letra) {
		case 'A', 'B', 'C', 'D', 'E', 'F':
			this.conEnergetico = consumoEnergetico.valueOf(String.valueOf(letra));
			break;

		default:
			this.conEnergetico = consumoEnergetico.F;
			break;
		}
	}

	private void comprobarColor(String color) {
		String colorMayus = color.toUpperCase();

		switch (colorMayus) {
		case "BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS":
			this.color = colores.valueOf(colorMayus);
			break;
		default:
			this.color = colores.BLANCO;
			break;
		}
	}

	public double getPrecioBase() {
		return this.precioBase;
	}

	public String getColor() {
		return String.valueOf(color);
	}

	public char getConsumo() {
		return String.valueOf(conEnergetico).charAt(0);
	}

	public float getPeso() {
		return this.peso;
	}

	public void precioFinal() {
		switch (conEnergetico) {
		case A:
			precioBase += 100;
			break;
		case B:
			precioBase += 80;
			break;
		case C:
			precioBase += 60;
			break;
		case D:
			precioBase += 50;
			break;
		case E:
			precioBase += 30;
			break;
		case F:
			precioBase += 10;
			break;
		}
		if (peso >= 0 && peso <= 19) {
			precioBase += 10;
		} else if (peso >= 20 && peso < 50) {
			precioBase += 50;
		} else if (peso >= 50 && peso < 80) {
			precioBase += 80;
		} else if (peso >= 80) {
			precioBase += 100;
		}

	}
}
