package com.anahuac.mayab.modulo1.ProyectoFinal;

import java.io.IOException;
import java.util.ArrayList;

public class Veterinaria {
	private String nombre;
	private ArrayList<CartillaPerro> listaPacientes = new ArrayList<>();


	public String getNombre() {
		return nombre;
	}
	public Veterinaria(String nombre) {
		this.nombre = nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Servicio crearServicio(String tipo, String nombre, String fecha) throws Exception {
		Servicio servicio = null;
		
		if(tipo== "baño"|| tipo== "corte") {
			//(String tipo, double costo, String fecha, String encargado)
			servicio= new ServicioEstetico(tipo,250,fecha,"encargadoEstetica");
		}
		else if (tipo.startsWith("vacuna") || tipo == "consulta") {
			servicio= new ServicioMedico(tipo,250,fecha,"veterinario");
		}
		
		else {
			throw new Exception("No existe ese servicio");
		}
		return servicio;
	}

	public void agregarPaciente(CartillaPerro cartilla) {
		listaPacientes.add(cartilla);
	}
	public void imprimirExpedientes() {
		for(CartillaPerro c: listaPacientes) {
			try {
				c.imprimirExpediente();
			} catch (IOException e) {
				System.out.println("Ese servicio no lo ofrecemos!");
				e.printStackTrace();
			}
		}
	}
}
