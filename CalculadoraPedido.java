package com.refactoring.exercises;

//EJERCICIO 2: Extract Method (Extraer Método)
//Extrae el cálculo del descuento a un método separado

public class Ejercicio02 {

    public double procesarCompra(double precio, int cantidad, boolean esClienteVIP) {
        double total = precio * cantidad;
        total = descuentoVIP(esClienteVIP, total);
        return total;
    }

	private double descuentoVIP(boolean esClienteVIP, double total) {
		if (esClienteVIP) {
            total = total - (total * 0.15);
        }
		return total;
	}
}
