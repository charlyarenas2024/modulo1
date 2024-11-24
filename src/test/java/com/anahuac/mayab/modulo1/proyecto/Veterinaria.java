package com.anahuac.mayab.modulo1.proyecto;

public class Veterinaria {
	private String nombre;

	public Veterinaria(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Servicio realizaServicio(String tipo, String nombre, String fecha) {
		Servicio servicio = null;
		if (tipo == "baño" || tipo == "corte") {
			servicio = new ServicioEstetico(tipo, 250, fecha, "encargadoEstetica");
		}
		else if(tipo == "vacuna" || tipo == "consulta") {
			servicio = new ServicioEstetico(tipo, 250, fecha, "encargadoEstetica");
		}
	}

}
