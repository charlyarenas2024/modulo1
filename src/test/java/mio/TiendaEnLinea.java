package mio;

public class TiendaEnLinea {
	public static void main(String[] args) {
	String nombreProducto = "Pasta de dientes";
	double precioProducto = 19.99;
	int cantidadDisponible = 100;
	boolean disponibleTienda = true;
	
	System.out.println("*******************Tienda en Linea (Detalle del producto)***************************");
	System.out.println(nombreProducto);
	System.out.println(precioProducto);
	System.out.println(cantidadDisponible);
	System.out.println(disponibleTienda);

	// Modificar nombre del producto
	
	nombreProducto = "Celular samsung";
	precioProducto = 1000;
	cantidadDisponible = 325;
	disponibleTienda = false;
	
	System.out.println("");
	System.out.println("*******************Tienda en Linea (Detalle del producto)***************************");
	System.out.println(nombreProducto);
	System.out.println(precioProducto);
	System.out.println(cantidadDisponible);
	System.out.println(disponibleTienda);	
	}
	

	
}
