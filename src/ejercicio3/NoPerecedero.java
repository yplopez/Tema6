package ejercicio3;

public class NoPerecedero extends Producto {

	private String tipo = "";

	public NoPerecedero() {

	}

	public NoPerecedero(String nombre, double precio, String tipo) {
		super(nombre, precio);
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		if (tipo != null && !tipo.equals("")) {
			this.tipo = tipo;
		}
	}
	
	public String toString() {
		String productos = super.toString();
		productos += "Tipo: " + this.tipo;
		return productos;
	}

}
