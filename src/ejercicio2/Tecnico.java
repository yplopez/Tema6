package ejercicio2;

public class Tecnico extends Operario{

	public Tecnico(String nombre) {
		super(nombre);
		
	}

	@Override
	public String toString() {
		String tecnico = super.toString();
		tecnico += " -> Técnico";
		return tecnico;
	}
	
	
	

}
