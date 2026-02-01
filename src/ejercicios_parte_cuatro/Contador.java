package ejercicios_parte_cuatro;

public class Contador {

	private int cont;

	//Constructores
	public Contador(int cont) {
		super();
		this.cont = cont;
	}
	
	//Getter y setter
	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		if (cont >= 0) {
			this.cont = cont;
		}
	}
	
	/**
	 * Aumento del contador en 1
	 */
	public void incrementar() {
		cont++;
		if (cont < 0) {
			cont = 0;
		}
	}
	
	/**
	 * Disminuye el contador en 1
	 */
	public void decrementar () {
		cont--;
	}
}
