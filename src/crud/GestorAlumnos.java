package crud;

import ejercicios_parte_dos.Alumno;

public class GestorAlumnos {

    private Alumno[] alumnos;
    private int contador;

    public GestorAlumnos(int tamaño) {
        alumnos = new Alumno[tamaño];
        contador = 0;
    }

    // Opción 1: Listado
    public void listarAlumnos() {
        if (contador == 0) {
            System.out.println("No hay alumnos registrados.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println(alumnos[i]);
            }
        }
    }

    // Opción 2: Nuevo alumno
    public boolean añadirAlumno(Alumno alumno) {
        if (contador < alumnos.length) {
            alumnos[contador] = alumno;
            contador++;
            return true;
        }
        return false;
    }

    // Buscar alumno por nombre
    private int buscarPosicionPorNombre(String nombre) {
        for (int i = 0; i < contador; i++) {
            if (alumnos[i].getNombre().equalsIgnoreCase(nombre)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Modificar notas
     * @param nombre
     * @param nuevaNota
     * @return
     */
    public boolean modificarNota(String nombre, double nuevaNota) {
        int pos = buscarPosicionPorNombre(nombre);
        if (pos != -1) {
            alumnos[pos].setNota(nuevaNota);
            return true;
        }
        return false;
    }

    // Opción 4: Borrar alumno
    public boolean borrarAlumno(String nombre) {
        int pos = buscarPosicionPorNombre(nombre);
        if (pos != -1) {
            for (int i = pos; i < contador - 1; i++) {
                alumnos[i] = alumnos[i + 1];
            }
            alumnos[contador - 1] = null;
            contador--;
            return true;
        }
        return false;
    }
}
