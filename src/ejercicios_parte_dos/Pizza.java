package ejercicios_parte_dos;

public class Pizza {
	
	

	private int codigo;
	private tamano tamano;
	private tipo tipo;
	private pedido estado;
	private boolean servida;
	
	//Enumeradores
	public enum tamano {
		Mediana,
		Familiar
	}
	
	public enum tipo {
		Margarita,
		CuatroQuesos,
		Funghi
	}
	
	public enum pedido {
		Pedida,
		Servida
	}
	
	//Constructores
	public Pizza(int codigo, tamano tamano, tipo tipo) {
		super();
		this.codigo = codigo;
		this.tamano = tamano;
		this.tipo = tipo;
	}

	public Pizza(String tipo2, String tamaño) {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Devolver datos del alumno (nombre y nota )
	 */
	public String toString() {
		String datos;
		
		datos = this.codigo + ": " + this.tamano + " - " + this.tipo + " - " + this.estado;
		
		return datos;
	}
	
	/**
	 * Para comprobar si son el mismo alumno
	 * @param alumno
	 * @return Los dos alumnos son el mismo?
	 */
	public boolean equals(Pizza pizza) {
		boolean sonIguales = false;
		
		if (this.codigo == pizza.codigo) {
			sonIguales = true;
		}
		
		return sonIguales;
	}
	
	//Setter y getter
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public tamano getTamano() {
		return tamano;
	}

	public void setTamano(tamano tamano) {
		this.tamano = tamano;
	}

	public tipo getTipo() {
		return tipo;
	}

	public void setTipo(tipo tipo) {
		this.tipo = tipo;
	}

	public pedido getPedido() {
		return estado;
	}

	public void setPedido(pedido estado) {
		this.estado = estado;
	}
	
	public boolean isServida() {
        return servida;
    }
	
	 public void servir() {
	        servida = true;
	    }
	
	
}
