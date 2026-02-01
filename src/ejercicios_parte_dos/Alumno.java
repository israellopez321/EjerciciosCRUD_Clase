package ejercicios_parte_dos;

public class Alumno {

	private String nombre;
	private double nota;
	
	//Constructores
	public Alumno(String nombre, double nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
	}
	
	/**
	 * Devolver datos del alumno (nombre y nota )
	 */
	public String toString() {
		String datos;
		
		datos = this.nombre + " " + this.nota;
		
		return datos;
	}
	
	/**
	 * Para comprobar si son el mismo alumno
	 * @param alumno
	 * @return Los dos alumnos son el mismo?
	 */
	public boolean equals(Alumno alumno) {
		boolean sonIguales = false;
		
		if (this.nombre.equals(alumno.nombre)) {
			sonIguales = true;
		}
		
		return sonIguales;
	}
	
	
	//Getter y setter
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (!nombre.isBlank())
		this.nombre = nombre;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		if (nota >= 0 && nota <= 10) {
			this.nota = nota;
		}
	}
}
