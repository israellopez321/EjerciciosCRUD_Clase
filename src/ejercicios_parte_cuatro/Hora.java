package ejercicios_parte_cuatro;

public class Hora {
	
	
	private int horas;
	private int minutos;
	private int segundos;
	
	public Hora(int horas, int minutos, int segundos) {
		super();
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		if(horas <= 23 && horas >= 0) {	
		this.horas = horas;
		}
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		if (minutos < 60 && minutos >= 0) {
			this.minutos = minutos;
		} 
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		if (segundos < 60 && segundos >= 0) {
			this.segundos = segundos;
		}
	}
	
	
}
