package ejercicio3;

public class Producto {

	protected String nombre;
	protected double precio;
	
	
	
	public Producto() {
		
	}

	public Producto (String nombre, double precio) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
		if (precio >0) {
			this.precio = precio;
		}
	}

	/**
	 * @return nombre del producto
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre modificado
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.equals("")) {
			this.nombre = nombre;
		}
	}

	/**
	 * @return precio del producto
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * @param precio modificado
	 */
	public void setPrecio(double precio) {
		if (precio >0) {
			this.precio = precio;
		}
	}
	
	public double calcular (int cantidad) {
		return precio * cantidad;
	}

	@Override
	public String toString() {
		String productos = "";
		
		productos += "Nombre: " + this.nombre + "\n";
		productos += "Precio: " + this.precio + "\n";
		
		return productos;
	}
	
	
	
	
}


