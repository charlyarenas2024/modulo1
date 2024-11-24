package com.anahuac.mayab.modulo1.ProyectoFinal;

public class ServicioMedico extends Servicio{

	public ServicioMedico(String tipo, double costo, String fecha, String encargado) {
		super(tipo,costo,fecha,encargado);
	}
	public void consultar(String nombre) {
		System.out.println("Realizando consulta paciente.."  + nombre);
	}
	
	public void darReceta() {
	    System.out.println("Crear receta con recomendaciones...");
}
	public void realizar(String nombre) {
	 getCartilla().actualizar(getTipo(), getFecha());
	 consultar(nombre);
	 darReceta();
	
}
	
}