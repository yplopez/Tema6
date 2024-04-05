package ejercicio4;

public class Television extends Electrodomestico{
	private int resolucion;
	private boolean sintonizadorTDT = false;
	
	
	public Television() {
		super();
	}

	public television(double precio, float peso) {
		super(precio, peso);		
	}

	public Television(double precio, String color, char conEnergetico, float peso, int resolucion, boolean sintonizadorTDT) {
		super(precio,color, conEnergetico, peso);
		this.resolucion = resolucion;
		this.sintonizadorTDT = sintonizadorTDT;
	}
	
	
	
	

}
