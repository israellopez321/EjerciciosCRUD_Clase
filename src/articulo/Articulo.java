package articulo;


public class Articulo {
	
	public Articulo(String desc) {
		super();
		this.desc = desc;
	}

	private String nombre = "Sin nombre";
	private double precioBruto;
	private double iva;
	private int stock;
	private String desc;
	
	public Articulo (String nombre, String desc, double iva, int stock){
		
		
		
		if (!nombre.isBlank()) {
		this.nombre = nombre;
		}
		
		if (iva >= 0 && iva < 100) {
			this.iva = iva;	
		}
		
		if (stock >= 0) {
			this.stock = stock;	
		}
		
		this.desc = desc;
		
		
	}
	/**
	 * 
	 * @return Precio total con iva incluido
	 */
	public double getPVP() {
		double precioPVP;
		
		precioPVP = this.precioBruto + this.precioBruto * (this.iva / 100);
		
		return precioPVP;
	}
	/**
	 * 
	 * @return Precio total con descuento incluido 
	 */
	public double getPVPDescuento(int descuento) {
		
		double precioPVP;
		
		precioPVP = this.precioBruto + this.precioBruto * (descuento / 100);
		
		return precioPVP;
	}
	/**
	 * 
	 * @return es posible vender?
	 */
	public boolean vender(int vendido) {
		
		boolean esPosible = false;
		
		if (this.stock > vendido) {	
		this.stock -= vendido;
		esPosible = true;
		}
		
		return esPosible;
	}
	/**
	 * 
	 * @return Actualizar stock segun lo que haya que almacenar
	 */
	public void almacenar(int cuantoAlmacenar) {
		
		this.stock += cuantoAlmacenar;
		
	}
	/**
	 * 
	 * @return mostrar los datos del articulo
	 */
	public String toString() {
		String mostrar;
		
		mostrar = this.nombre + " | Precio : " + this.precioBruto + "€ | IVA: " + this.iva + "% | Stock: " + this.stock;
		
		return mostrar;
	}
	
	
	public void setNombre(String nombre) {
		if (!nombre.isBlank() ) {
			this.nombre = nombre.trim();
		}
	}
	
	public void setPrecio (double precioBruto) {
		if (precioBruto > 0) {
			this.precioBruto = precioBruto;
		}
	}
	
	public void setIva (int iva) {
		if (iva >= 0 && iva < 100) {
			this.iva = iva;
		}
	}
	
	public void setStock (int stock) {
		if (stock > 0) {
			this.stock = stock;
		}
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precioBruto;
	}
	
	public double getIva() {
		return iva;
	}
	
	public int getStock() {
		return stock;
	}
}
