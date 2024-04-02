package ejercicio1;

public class Hora {

	protected int hora;
	protected int minuto;

	public Hora(int hora, int minuto) {
		if (hora >= 0 && hora < 24) {
			this.hora = hora;
		}

		if (minuto >= 0 && minuto < 60) {
			this.minuto = minuto;
		}
	}

	void inc() {
		this.minuto++;
		if (this.minuto == 60) {
			this.minuto = 0;
			hora++;
		}
		if (this.hora == 24) {
			this.hora = 0;
		}
	}

	boolean setMinutos(int valorMin) {
		boolean isValid = false;
		if (valorMin >= 0 && valorMin < 60) {
			isValid = true;
		}

		return isValid;
	}

	boolean setHora(int valorHour) {
		boolean isValid = false;
		if (valorHour >= 0 && valorHour < 24) {
			isValid = true;
		}

		return isValid;
	}

	@Override
	public String toString() {
		String horaExacta;

		if (this.minuto < 10) {
			horaExacta = this.hora + " : " + "0" + this.minuto;
		} else {
			horaExacta = this.hora + " : " + this.minuto;
		}

		return horaExacta;
	}

}
