package crud;

import articulo.Articulo;

public class GestorArticulos {

	    private Articulo[] articulos;
	    private int contador;

	    public GestorArticulos(int tamaño) {
	        articulos = new Articulo[tamaño];
	        contador = 0;
	    }

	    // LISTADO
	    public void listar() {
	        if (contador == 0) {
	            System.out.println("No hay artículos en el almacén.");
	        } else {
	            for (int i = 0; i < contador; i++) {
	                System.out.println(articulos[i]);
	            }
	        }
	    }

	    // ALTA
	    public boolean alta(Articulo articulo) {
	        if (contador < articulos.length && buscarPosicion(articulo.getNombre()) == -1) {
	            articulos[contador] = articulo;
	            contador++;
	            return true;
	        }
	        return false;
	    }

	    // BAJA
	    public boolean baja(String codigo) {
	        int pos = buscarPosicion(codigo);
	        if (pos != -1) {
	            for (int i = pos; i < contador - 1; i++) {
	                articulos[i] = articulos[i + 1];
	            }
	            articulos[contador - 1] = null;
	            contador--;
	            return true;
	        }
	        return false;
	    }

	    // MODIFICACIÓN
	    public boolean modificar(String nombre, double precio) {
	        int pos = buscarPosicion(nombre);
	        if (pos != -1) {
	            articulos[pos].setPrecio(precio);
	            return true;
	        }
	        return false;
	    }

	    // ENTRADA DE MERCANCÍA
	    public boolean entrada(String codigo, int cantidad) {
	        int pos = buscarPosicion(codigo);
	        if (pos != -1) {
	            articulos[pos].almacenar(cantidad);
	            return true;
	        }
	        return false;
	    }

	    // SALIDA DE MERCANCÍA
	    public boolean salida(String nombre, int cantidad) {
	        int pos = buscarPosicion(nombre);
	        if (pos != -1) {
	            return articulos[pos].vender(cantidad);
	        }
	        return false;
	    }

	    // Buscar por código
	    private int buscarPosicion(String nombre) {
	        for (int i = 0; i < contador; i++) {
	            if (articulos[i].getNombre().equalsIgnoreCase(nombre)) {
	                return i;
	            }
	        }
	        return -1;
	    }
	}
	

