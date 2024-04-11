package ejercicio5;

public abstract class Poligono {
	 /**
	  * Atributo numeroLados de tipo entero
	  */
	protected int numeroLados;
	
	/**
	 * Constructor sin parámetros
	 */
	public Poligono() {
		
	}
	
	/**
	 * Constructor con parámetros
	 * @param numeroLados del polígono
	 */
	public Poligono (int numeroLados) {
		if (numeroLados > 2) {
			this.numeroLados = numeroLados;
		}
	}
	
	/**
	 * Get que obtiene el número de lados de un polígono
	 * @return número de lados
	 */
	public int getNumeroLados() {
		return numeroLados;
	}

	/**
	 * 
	 */
	@Override
	public String toString() {
		
		return "Numero de Lados:" + getNumeroLados();
	}
	
	
	public abstract double area();
	
	

	

	

}
