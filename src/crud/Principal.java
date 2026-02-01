package crud;

import java.util.Scanner;

import articulo.Articulo;
import 	ejercicios_parte_dos.Alumno;
import ejercicios_parte_dos.Pizza;
import ejercicio_parte_tres.Disco;
import ejercicios_parte_dos.CuentaCorriente;

public class Principal {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
	        GestorAlumnos gestor = new GestorAlumnos(30);
	        int opcion;

	        do {
	            System.out.println("\nALUMNOS/AS");
	            System.out.println("===================");
	            System.out.println("1. Listado.");
	            System.out.println("2. Nuevo Alumno.");
	            System.out.println("3. Modificar.");
	            System.out.println("4. Borrar.");
	            System.out.println("5. Salir.");
	            System.out.print("Opción: ");

	            opcion = sc.nextInt();
	            sc.nextLine();

	            switch (opcion) {
	                case 1:
	                    gestor.listarAlumnos();
	                    break;

	                case 2:
	                    System.out.print("Nombre del alumno: ");
	                    String nombre = sc.nextLine();

	                    System.out.print("Nota del alumno: ");
	                    double nota = sc.nextDouble();

	                    if (gestor.añadirAlumno(new Alumno(nombre, nota))) {
	                        System.out.println("Alumno añadido correctamente.");
	                    } else {
	                        System.out.println("No hay espacio para más alumnos.");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Nombre del alumno a modificar: ");
	                    nombre = sc.nextLine();

	                    System.out.print("Nueva nota: ");
	                    nota = sc.nextDouble();

	                    if (gestor.modificarNota(nombre, nota)) {
	                        System.out.println("Nota modificada.");
	                    } else {
	                        System.out.println("Alumno no encontrado.");
	                    }
	                    break;

	                case 4:
	                    System.out.print("Nombre del alumno a borrar: ");
	                    nombre = sc.nextLine();

	                    if (gestor.borrarAlumno(nombre)) {
	                        System.out.println("Alumno eliminado.");
	                    } else {
	                        System.out.println("Alumno no encontrado.");
	                    }
	                    break;

	                case 5:
	                    System.out.println("Saliendo del programa...");
	                    break;

	                default:
	                    System.out.println("Opción incorrecta.");
	            }

	        } while (opcion != 5);

	        
	        
	        GestorArticulos gestor1 = new GestorArticulos(50);
	        int opcion1;

	        do {
	            System.out.println("\nGESTISIMAL");
	            System.out.println("===================");
	            System.out.println("1. Listado");
	            System.out.println("2. Alta");
	            System.out.println("3. Baja");
	            System.out.println("4. Modificación");
	            System.out.println("5. Entrada de mercancía");
	            System.out.println("6. Salida de mercancía");
	            System.out.println("7. Salir");
	            System.out.print("Opción: ");

	            opcion1 = sc.nextInt();
	            sc.nextLine();

	            switch (opcion1) {
	                case 1:
	                    gestor1.listar();
	                    break;

	                case 2:
	                    System.out.print("Código: ");
	                    String codigo = sc.nextLine();
	                    System.out.print("Descripción: ");
	                    String desc = sc.nextLine();
	                    System.out.print("Precio: ");
	                    double precio = sc.nextDouble();
	                    System.out.print("Stock inicial: ");
	                    int stock = sc.nextInt();

	                    if (gestor1.alta(new Articulo(codigo, desc, precio, stock))) {
	                        System.out.println("Artículo añadido.");
	                    } else {
	                        System.out.println("No se pudo añadir.");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Código del artículo a borrar: ");
	                    codigo = sc.nextLine();
	                    System.out.println(
	                        gestor1.baja(codigo) ? "Artículo eliminado." : "Artículo no encontrado."
	                    );
	                    break;

	                case 4:
	                    System.out.print("Código del artículo: ");
	                    codigo = sc.nextLine();
	                    System.out.print("Nueva descripción: ");
	                    desc = sc.nextLine();
	                    System.out.print("Nuevo precio: ");
	                    precio = sc.nextDouble();

	                    System.out.println(
	                        gestor1.modificar(codigo, precio) ? "Artículo modificado." : "Artículo no encontrado."
	                    );
	                    break;

	                case 5:
	                    System.out.print("Código del artículo: ");
	                    codigo = sc.nextLine();
	                    System.out.print("Cantidad a entrar: ");
	                    int cantidad = sc.nextInt();

	                    System.out.println(
	                        gestor1.entrada(codigo, cantidad) ? "Stock actualizado." : "Artículo no encontrado."
	                    );
	                    break;

	                case 6:
	                    System.out.print("Código del artículo: ");
	                    codigo = sc.nextLine();
	                    System.out.print("Cantidad a sacar: ");
	                    cantidad = sc.nextInt();

	                    if (gestor1.salida(codigo, cantidad)) {
	                        System.out.println("Stock actualizado.");
	                    } else {
	                        System.out.println("No hay suficiente stock o el artículo no existe.");
	                    }
	                    break;

	                case 7:
	                    System.out.println("Saliendo del programa...");
	                    break;

	                default:
	                    System.out.println("Opción incorrecta.");
	            }

	        } while (opcion1 != 7);
	        
	        GestorPizzas gestor2 = new GestorPizzas(50);
	        int opcion2;

	        do {
	            System.out.println("\nPIZZAS DEL DÍA");
	            System.out.println("===================");
	            System.out.println("1. Listado de pizzas");
	            System.out.println("2. Nuevo pedido");
	            System.out.println("3. Pizza servida");
	            System.out.println("4. Salir");
	            System.out.print("Opción: ");

	            opcion2 = sc.nextInt();
	            sc.nextLine();

	            switch (opcion2) {
	                case 1:
	                    gestor2.listar();
	                    break;

	                case 2:
	                    System.out.print("Tipo de pizza: ");
	                    String tipo = sc.nextLine();

	                    System.out.print("Tamaño (mediana/familiar): ");
	                    String tamaño = sc.nextLine();

	                    if (gestor2.nuevoPedido(new Pizza(tipo, tamaño))) {
	                        System.out.println("Pedido registrado.");
	                    } else {
	                        System.out.println("No se pueden registrar más pizzas.");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Número de pizza a servir: ");
	                    int num = sc.nextInt();

	                    if (gestor2.servirPizza(num)) {
	                        System.out.println("Pizza servida.");
	                    } else {
	                        System.out.println("Número incorrecto o pizza ya servida.");
	                    }
	                    break;

	                case 4:
	                    System.out.println("Fin del día.");
	                    break;

	                default:
	                    System.out.println("Opción incorrecta.");
	            }

	        } while (opcion2 != 4);
	        
	        Disco[] discos = new Disco[50];
	        int contador = 0;
	        int opcion3;

	        do {
	            System.out.println("\nCOLECCIÓN DE DISCOS");
	            System.out.println("===================");
	            System.out.println("1. Listado.");
	            System.out.println("2. Nuevo Disco.");
	            System.out.println("3. Borrar.");
	            System.out.println("4. Salir.");
	            System.out.print("Opción: ");

	            opcion3 = sc.nextInt();
	            sc.nextLine();

	            switch (opcion3) {
	                case 1:
	                    if (contador == 0) {
	                        System.out.println("No hay discos en la colección.");
	                    } else {
	                        for (int i = 0; i < contador; i++) {
	                            System.out.println(discos[i]);
	                        }
	                    }
	                    break;

	                case 2:
	                    if (contador >= discos.length) {
	                        System.out.println("No se pueden añadir más discos.");
	                        break;
	                    }

	                    System.out.print("Código: ");
	                    String codigo = sc.nextLine();

	                    // Comprobar si ya existe
	                    boolean existe = false;
	                    for (int i = 0; i < contador; i++) {
	                        if (discos[i].getCodigo().equalsIgnoreCase(codigo)) {
	                            existe = true;
	                            break;
	                        }
	                    }

	                    if (existe) {
	                        System.out.println("Ya existe un disco con ese código.");
	                        break;
	                    }

	                    System.out.print("Autor: ");
	                    String autor = sc.nextLine();

	                    System.out.print("Título: ");
	                    String titulo = sc.nextLine();

	                    System.out.print("Duración (minutos): ");
	                    int duracion = sc.nextInt();
	                    sc.nextLine();

	                    System.out.print("Género (ROCK, POP, JAZZ, BLUES): ");
	                    Disco.Genero genero = Disco.Genero.valueOf(sc.nextLine().toUpperCase());

	                    discos[contador] = new Disco(codigo, autor, titulo, duracion, genero);
	                    contador++;

	                    System.out.println("Disco añadido correctamente.");
	                    break;

	                case 3:
	                    System.out.print("Código del disco a borrar: ");
	                    codigo = sc.nextLine();

	                    int pos = -1;
	                    for (int i = 0; i < contador; i++) {
	                        if (discos[i].getCodigo().equalsIgnoreCase(codigo)) {
	                            pos = i;
	                            break;
	                        }
	                    }

	                    if (pos != -1) {
	                        for (int i = pos; i < contador - 1; i++) {
	                            discos[i] = discos[i + 1];
	                        }
	                        discos[contador - 1] = null;
	                        contador--;
	                        System.out.println("Disco eliminado.");
	                    } else {
	                        System.out.println("Disco no encontrado.");
	                    }
	                    break;

	                case 4:
	                    System.out.println("Saliendo del programa...");
	                    break;

	                default:
	                    System.out.println("Opción incorrecta.");
	            }

	        } while (opcion3 != 4);
	        
	        CuentaCorriente[] cuentas = new CuentaCorriente[50];
	        int contador4 = 0;
	        int opcion4;

	        do {
	            System.out.println("\nCUENTAS CORRIENTES");
	            System.out.println("===================");
	            System.out.println("1. Listado");
	            System.out.println("2. Nueva cuenta");
	            System.out.println("3. Borrar cuenta");
	            System.out.println("4. Ingresar dinero");
	            System.out.println("5. Retirar dinero");
	            System.out.println("6. Salir");
	            System.out.print("Opción: ");

	            opcion4 = sc.nextInt();
	            sc.nextLine();

	            switch (opcion4) {

	                case 1: // LISTADO
	                    if (contador4 == 0) {
	                        System.out.println("No hay cuentas registradas.");
	                    } else {
	                        for (int i = 0; i < contador4; i++) {
	                            System.out.println(cuentas[i]);
	                        }
	                    }
	                    break;

	                case 2: // NUEVA CUENTA
	                    if (contador4 >= cuentas.length) {
	                        System.out.println("No se pueden crear más cuentas.");
	                        break;
	                    }

	                    System.out.print("DNI: ");
	                    String dni = sc.nextLine();

	                    // Comprobar si ya existe
	                    boolean existe = false;
	                    for (int i = 0; i < contador4; i++) {
	                        if (cuentas[i].equals(new CuentaCorriente(dni, i))) {
	                            existe = true;
	                            break;
	                        }
	                    }

	                    if (existe) {
	                        System.out.println("Ya existe una cuenta con ese DNI.");
	                        break;
	                    }

	                    System.out.print("Nombre del titular: ");
	                    String nombre = sc.nextLine();

	                    System.out.print("Saldo inicial: ");
	                    double saldo = sc.nextDouble();

	                    cuentas[contador4] = new CuentaCorriente(dni, nombre, saldo);
	                    contador4++;

	                    System.out.println("Cuenta creada correctamente.");
	                    break;

	                case 3: // BORRAR
	                    System.out.print("DNI de la cuenta a borrar: ");
	                    dni = sc.nextLine();

	                    int pos = -1;
	                    for (int i = 0; i < contador4; i++) {
	                        if (cuentas[i].equals(new CuentaCorriente(dni))) {
	                            pos = i;
	                            break;
	                        }
	                    }

	                    if (pos != -1) {
	                        for (int i = pos; i < contador4 - 1; i++) {
	                            cuentas[i] = cuentas[i + 1];
	                        }
	                        cuentas[contador4 - 1] = null;
	                        contador4--;
	                        System.out.println("Cuenta eliminada.");
	                    } else {
	                        System.out.println("Cuenta no encontrada.");
	                    }
	                    break;

	                case 4: // INGRESAR
	                    System.out.print("DNI: ");
	                    dni = sc.nextLine();

	                    System.out.print("Cantidad a ingresar: ");
	                    double cantidad = sc.nextDouble();

	                    boolean ingresado = false;
	                    for (int i = 0; i < contador4; i++) {
	                        if (cuentas[i].equals(new CuentaCorriente(dni))) {
	                            cuentas[i].ingresarDinero(cantidad);
	                            ingresado = true;
	                            break;
	                        }
	                    }

	                    System.out.println(ingresado ? "Ingreso realizado." : "Cuenta no encontrada.");
	                    break;

	                case 5: // RETIRAR
	                    System.out.print("DNI: ");
	                    dni = sc.nextLine();

	                    System.out.print("Cantidad a retirar: ");
	                    cantidad = sc.nextDouble();

	                    boolean retirado = false;
	                    for (int i = 0; i < contador4; i++) {
	                        if (cuentas[i].equals(new CuentaCorriente(dni))) {
	                            retirado = cuentas[i].sacarDinero(cantidad);
	                            break;
	                        }
	                    }

	                    if (retirado) {
	                        System.out.println("Retirada realizada.");
	                    } else {
	                        System.out.println("No se pudo retirar dinero (saldo insuficiente o cuenta inexistente).");
	                    }
	                    break;

	                case 6:
	                    System.out.println("Saliendo del programa...");
	                    break;

	                default:
	                    System.out.println("Opción incorrecta.");
	            }

	        } while (opcion4 != 6);
	        
	        sc.close();
	    }
	}