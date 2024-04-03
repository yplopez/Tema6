package ejercicio1;

public class HoraExacta extends Hora{

	private int segundo;
	

	public HoraExacta(int hora, int minuto, int segundo) {
		super(hora, minuto);
		if (segundo>0 && segundo<60) {			
			this.segundo = segundo;
		}
	}
	
	boolean setSegundo(int valorSeg) {
		boolean isValid = false;
		if (valorSeg >= 0 && valorSeg < 60) {
			isValid = true;
			this.segundo = valorSeg;
		}
		
		return isValid;
	}
	
	@Override
	void inc() {
		this.segundo++;
		if(this.segundo == 60) {
			this.segundo = 0;
			super.inc();
		}
	}
	
	@Override
	public String toString() {
		String cadena = super.toString();

		cadena += ":";
		if (this.segundo < 10) {
			cadena += "0";
		}
		cadena += segundo;
		

		return cadena;
	}
	
	
	
}
