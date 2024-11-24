package com.anahuac.mayab.modulo1.proyecto;

public class ServicioEstetico extends Servicio{
	public ServicioEstetico(String tipo, double costo, string fecha, String encargado) {
		super(tipo, costo, fecha, encargado);
	}
	public void baniar() {
		System.out.println("Bañando....");
	}
	public void cepillar() {
		System.out.println("Cepillando....");
	}
	public void cortarUnas() {
		System.out.println("Cortando las uñas....");
	}

}
