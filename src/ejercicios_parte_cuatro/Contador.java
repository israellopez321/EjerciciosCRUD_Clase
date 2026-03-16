package ejercicios_parte_cuatro;

/**
 * Clase que representa a un contador
 * 
 * Contador > cont
 * -incrementar
 * -decrementar
 * 
 * Limitación: El contador nunca puede tener valores negativos
 */
public class Contador {

	private int cont;

	//Constructor con valor inicial
	public Contador(int cont) {
		super();
		this.cont = cont;
	}
	
	//Constructor por defecto
	public Contador() {
		this.cont = 0;
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
		incrementar(1);
	}
	
	/**
	 * Aumento del contador en cierta cantidad
	 * @param suma cantidad a incrementar
	 */
	public void incrementar(int suma) {
		if(suma >= 0) {
			cont += suma;
		}
		
		if (cont < 0) {
			cont = 0;
		}
	}
	
	/**
	 * Disminuye el contador en 1
	 */
	public void decrementar () {
		cont--;
		
	if (cont < 0) {
		cont = 0;
	}
	}
	
	/**
	 * Disminuye el contador x unidades
	 * @param resta cantidad decrementar
	 */
	public void decrementar (int resta) {
		cont -= resta;
		
	if (cont < 0) {
		cont = 0;
	}
	}

	@Override
	public String toString() {
		return "Contador [cont=" + cont + "]";
	}
}
