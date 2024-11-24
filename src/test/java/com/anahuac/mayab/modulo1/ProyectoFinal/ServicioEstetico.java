package com.anahuac.mayab.modulo1.ProyectoFinal;

public class ServicioEstetico extends Servicio{
     
	
	public ServicioEstetico(String tipo, double costo, String fecha, String encargado) {
		super(tipo,costo,fecha,encargado);
	}
	
	public void baniar() {
		System.out.println("Bañando...");
	
}
	public void cepillar() {
		System.out.println("Cepillando...");
	
}
	public void cortarUnias() {
		System.out.println("Cortando Uñas...");
	}
	public void realizar(String nombre) {
		System.out.println("Atendiendo a :" + nombre);
		baniar();
		cepillar();
		cortarUnias();
	}
}
