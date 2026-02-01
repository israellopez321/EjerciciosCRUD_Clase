package ejercicios_parte_dos;

public class Libro {

	String titulo;
	String autor;
	int nEjemplares;
	int ejemPrestados;
	genero generoLibro;
	
	public enum genero {
		Narrativo,
		Lirico,
		Dramatico,
		Didactico,
		Poetico
	}
	
	//Constructores 
	
	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public Libro(String titulo, String autor, int nEjemplares, int ejemPrestados) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.nEjemplares = nEjemplares;
		this.ejemPrestados = ejemPrestados;
	}
	
	public Libro(String titulo, String autor, int nEjemplares, int ejemPrestados, genero generoLibro) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.nEjemplares = nEjemplares;
		this.ejemPrestados = ejemPrestados;
		this.generoLibro = generoLibro;
	}

	/**
	 * 
	 * @param librosPrestados
	 * @return es posible prestar ejemplares
	 */
	public boolean prestamo(int librosPrestados) {
		boolean esPosible = false;
		
		if (librosPrestados <= this.nEjemplares) {
			esPosible = true;
			nEjemplares -= librosPrestados;
			ejemPrestados += librosPrestados;
		}
		
		return esPosible;
	}
	
	/**
	 * 
	 * @param librosDevueltos
	 * @return
	 */
	public boolean devolucion(int librosDevueltos) {
		boolean esPosible = false;
		
		if (ejemPrestados <= librosDevueltos) {
			esPosible = true;
			ejemPrestados -= librosDevueltos;
			nEjemplares += librosDevueltos;
		}
		
		return esPosible;
	}
	
	public String toString() {
		String datos;
		
		datos = "--|| Título: " + this.titulo + " || Autor: " + this.autor + " || Nº de ejemplares: " + this.nEjemplares + " || Ejemplares prestados: " + this.ejemPrestados + " || Género: " + this.generoLibro + "||--";		
				
		return datos;		
	}
	
	public boolean equals(Libro libro) {
		boolean sonIguales = false;
		
		if (this.titulo.equals(libro.titulo) && this.autor.equals(libro.autor)) {
			sonIguales = true;
		}
		
		return sonIguales;
	}
	
	
	//Getter y setter
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getnEjemplares() {
		return nEjemplares;
	}

	public void setnEjemplares(int nEjemplares) {
		this.nEjemplares = nEjemplares;
	}

	public int getEjemPrestados() {
		return ejemPrestados;
	}

	public void setEjemPrestados(int ejemPrestados) {
		this.ejemPrestados = ejemPrestados;
	}

	public genero getGeneroLibro() {
		return generoLibro;
	}

	public void setGeneroLibro(genero generoLibro) {
		this.generoLibro = generoLibro;
	}
	
	
	
	
}
