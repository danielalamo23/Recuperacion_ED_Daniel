

//EJERCICIO 2: Extract Method (Extraer Método)
//Extrae el cálculo del descuento a un método separado

/**
 * Clase encargada de gestionar el procesamiento de pedidos y cálculos de ventas.
 * Se han aplicado patrones de refactorización para mejorar la legibilidad y 
 * facilitar el mantenimiento del sistema de descuentos.
 * @author Daniel Álamo
 * @version 1.0
 */
public class CalculadoraPedido {

    private static final double PORCENTAJE_DESCUENTO_VIP = 0.15;
    /**
     * Gestiona el flujo completo de una compra...
     * @param precio Precio base del producto.
     * @param cantidad Cantidad de productos.
     * @param esClienteVIP Indica si el cliente tiene estatus VIP. 
     */
	public double procesarCompra(double precio, int cantidad, boolean esClienteVIP) {
        double total = calcularSubtotal(precio, cantidad);
        total = descuentoVIP(esClienteVIP, total);
        return total;
    }
	/**
	 * Calcula el subtotal del pedido multiplicando el precio por la cantidad.
	 * @param precio El coste de una sola unidad.
	 * @param cantidad El número de unidades solicitadas.
	 * @return El importe total antes de aplicar descuentos.
	 */
	private double calcularSubtotal(double precio, int cantidad) {
		return precio * cantidad;
	}
	/**
	 * Aplica el descuento correspondiente si el cliente tiene estatus VIP.
	 * @param esClienteVIP Booleano que indica si aplica el descuento.
	 * @param total Importe total sobre el que aplicar la rebaja.
	 * @return Importe final tras procesar el descuento.
	 */
	private double descuentoVIP(boolean esClienteVIP, double total) {
		if (esClienteVIP) {
            total = total - (total * PORCENTAJE_DESCUENTO_VIP);
        }
		return total;
	}
}
