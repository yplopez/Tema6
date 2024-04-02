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
		}
		
		return isValid;
	}
	
	@Override
	void inc() {
		this.segundo++;
		if(this.segundo == 60) {
			this.segundo = 0;
		}
		super.inc();
	}
	
	@Override
	public String toString() {
		String horaExacta;

		if (this.segundo < 10) {
			horaExacta = this.hora + " : " + "0" + this.minuto + " : " + "0" + this.segundo;
		} else {
			horaExacta = this.hora + " : " + this.minuto;
		}

		return horaExacta;
	}
	
	
	
}
