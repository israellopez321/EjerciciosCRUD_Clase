package crud;

import ejercicios_parte_dos.Pizza;

public class GestorPizzas {

    private Pizza[] pizzas;
    private int contador;

    public GestorPizzas(int tamaño) {
        pizzas = new Pizza[tamaño];
        contador = 0;
    }

    // LISTADO
    public void listar() {
        if (contador == 0) {
            System.out.println("No hay pizzas registradas.");
        } else {
            for (int i = 0; i < contador; i++) {
                System.out.println((i + 1) + ". " + pizzas[i]);
            }
        }
    }

    // NUEVO PEDIDO
    public boolean nuevoPedido(Pizza pizza) {
        if (contador < pizzas.length) {
            pizzas[contador] = pizza;
            contador++;
            return true;
        }
        return false;
    }

    // PIZZA SERVIDA
    public boolean servirPizza(int numero) {
        if (numero >= 1 && numero <= contador) {
            if (!pizzas[numero - 1].isServida()) {
                pizzas[numero - 1].servir();
                return true;
            }
        }
        return false;
    }
}