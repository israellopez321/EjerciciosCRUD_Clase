package ejercicios_parte_dos;

public class CuentaCorriente {
	
	private String dni = "Sin DNI";
	private String nombre = "Sin Nombre";
	private double saldo = 0;
	private String nacionalidad = "Nacionalidad no conocida";
	
	
	//Constructores
	public CuentaCorriente(String dni, double saldo) {
		super();
		this.dni = dni;
		this.saldo = saldo;
	}
	public CuentaCorriente(String dni) {
	    this.dni = dni;
	}
	
	public CuentaCorriente(String dni, String nombre, double saldo) {
		super();;
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	public CuentaCorriente(String dni, String nombre, double saldo, String nacionalidad) {
		super();;
		this.dni = dni;
		this.nombre = nombre;
		this.saldo = saldo;
		this.nacionalidad = nacionalidad;
	}
	
	//Metodos
	/**
	 * Comprobar si es posible sacar dinero y restar al saldo el dinero sacado
	 * @param dinero a sacar
	 * @return Si es posible sacar dinero en caso de que el saldo sea suficiente
	 */
	public boolean sacarDinero(double dineroSacado) {
		boolean esPosible = false;
		
		if (dineroSacado <= this.saldo) {
			esPosible = true;
			this.saldo -= dineroSacado;
		}	
		
		return esPosible;
	}
	
	/**
	 * Comprobar si es posible sacar dinero y sumarle el dinero ingresado
	 * @param dinero a ingresar
	 * @return SI es posible ingresar el dinero
	 */
	public boolean ingresarDinero(double dineroIngresado) {
		boolean esPosible = false;
		
		if (this.saldo >= 0) {
			esPosible = true;
			this.saldo += dineroIngresado;
		}
		
		return esPosible;
	}
	
	/**
	 * Mostrar datos de cuenta del usuario
	 */
	public String toString() {
		String datos = null;
		
		datos = "--||Nombre: " + this.nombre + " || DNI: " + this.dni + " || Saldo: " + this.saldo + " || Nacionalidad: " + this.nacionalidad; 
		
		return datos;
	}
	/**
	 * Comprobacion de si dos cuentas son iguales
	 * @param Cuenta del usuario
	 * @return Si las dos cuenta son iguales
	 */
	public boolean equals(CuentaCorriente usuario) {
		boolean sonIguales = false;
		
		if (this.dni.equals(usuario.dni) && this.nombre.equals(usuario.nombre)) {
			sonIguales = true;
		}
		
		return sonIguales;
	}

	//Getter and Setter
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		if (!dni.isBlank()) {
			this.dni = dni;
		}
		
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if (!nombre.isBlank()) {
			this.nombre = nombre;
		}
		
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		if (!nacionalidad.isBlank()) {
			this.nacionalidad = nacionalidad;
		}
	}
	
}
