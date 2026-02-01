package ejercicios_parte_cuatro;

public class Fecha {
	
	private int dia;
	private int mes;
	private int ano;
	
	//Constructores
	public Fecha(int dia, int mes, int ano) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	/**
	 * Funcion para saber si un año es bisiesto
	 * @return true si es bisiesto
	 */
	public boolean esBisiesto() {
		
		boolean esBisiesto = false;
		
		if (this.ano % 4 == 0 ) {
			
			esBisiesto = true;
			
		}
		
		return esBisiesto;
	}
	/**
	 * Funcion para saber si la fecha es correcta
	 * @return la fecha es correcta?
	 */
	public boolean fechaCorrecta() {
		
		boolean esCorrecto = false;
		
		if (this.mes == 2 && this.dia <= 28 || this.mes == 2 && esBisiesto() && this.dia <= 29) {
			
			esCorrecto = true;
		} else if (this.mes%2 == 1 && this.dia <= 30) {
			
			esCorrecto = true;
		} else if (this.mes%2 == 0 && this.dia <= 31) {
			
			esCorrecto = true;
		}
		
		return esCorrecto;
	}
	
	public void diaSiguiente() {
	    dia++;

	    if (mes == 2) {
	        // Febrero
	        if ((esBisiesto() && dia > 29) || (!esBisiesto() && dia > 28)) {
	            dia = 1;
	            mes++;
	        }
	    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
	        // Meses de 30 días
	        if (dia > 30) {
	            dia = 1;
	            mes++;
	        }
	    } else {
	        // Meses de 31 días
	        if (dia > 31) {
	            dia = 1;
	            if (mes == 12) {
	                mes = 1;
	                ano++;
	            } else {
	                mes++;
	            }
	        }
	    }
	}
	
	/**
	 * Mostrar Fecha
	 */
	public String toString() {
		
		String fecha;
		String mes;
		String day;
		
		if (this.mes > 9) {
			mes = String.valueOf(this.mes);
		} else {
			mes = "0" + this.mes;
		}
		
		if (this.dia > 9) {
			day = String.valueOf(this.dia);
		} else {
			day = "0" + this.dia;
		}
		
		fecha = day + "-" + mes + "-" + this.ano;
		
		return fecha;
	}
	
	
	//Getter y setter
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		if (dia >= 0 && dia <= 31) {
			this.dia = dia;
		}
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes >= 0 && mes <= 12) {
			this.mes = mes;
		}
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
}
