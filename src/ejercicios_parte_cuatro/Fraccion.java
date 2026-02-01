package ejercicios_parte_cuatro;

public class Fraccion {
	
	private int numerador;
	private int denominador;
	
	//Constructores
	public Fraccion(int numerador, int denominador) {
		super();
		this.numerador = numerador;
		this.denominador = denominador;
	}
	
	public Fraccion suma(Fraccion frac) {
		int num;
		int denom;
		
		num = this.numerador * frac.denominador + frac.numerador * this.denominador;
		denom = this.denominador * frac.denominador;
		
		Fraccion resultado = new Fraccion(num, denom);
		
		return resultado;
	}
	
	public Fraccion resta(Fraccion frac) {
		
		 int num = this.numerador * frac.denominador - frac.numerador * this.denominador;
		 int den = this.denominador * frac.denominador;
		 Fraccion resultado = new Fraccion(num, den);
		 
		 return resultado;
	}
	
	public Fraccion multiplica(Fraccion frac) {
		
		int num = this.numerador * frac.numerador;
		int den = this.denominador * frac.denominador;
        Fraccion resultado = new Fraccion(num, den);
		
        return resultado;
	}
	
	
	public Fraccion divide(Fraccion frac) {
		
		if (frac.numerador == 0) {
			throw new IllegalArgumentException("El denominador no puede ser 0");
		}
		
		int num = this.numerador * frac.denominador;
        int den = this.denominador * frac.numerador;
        Fraccion resultado = new Fraccion(num, den);
        
        return resultado;
		
	}
	
	
	
	//Getter y setter
	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		if (denominador == 0) {
			throw new IllegalArgumentException("El denominador no puede ser 0");
		}
		this.denominador = denominador;
	}
	
	
	
	
	
}
