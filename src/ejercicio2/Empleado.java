package ejercicio2;

public class Empleado {
	protected String nombre;

	public Empleado() {
		
	}

	public Empleado(String nombre) {
		if ( nombre != null && !nombre.equals("")) {
		this.nombre = nombre;
		}
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		if ( nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
			}
	}
	
	public String toString() {
		return "Empleado " + this.nombre;
	}
	
	
}
