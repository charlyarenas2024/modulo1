package com.anahuac.mayab.modulo1.ProyectoFinal;

public class TestVeterinaria {

	public static void main(String[] args) {
		Perro perro = new Perro ("Jade", "Pelusa","Akane");
		Perro perro2= new Perro ("Corriente","Zet","Carlos Arenas");
		CartillaPerro cartilla = new CartillaPerro(perro,"999");
		CartillaPerro cartilla2 = new CartillaPerro(perro2,"1232");
		
		Veterinaria vet = new Veterinaria("Mi veterinaria");
		vet.agregarPaciente(cartilla);
		vet.agregarPaciente(cartilla2);
		
	try {	
		/*Servicio servicio = vet.crearServicio("baño",perro.getNombre(),"16-nov-2024");
		servicio.realizar(perro.getNombre());*/
		Servicio servicio2 = vet.crearServicio("Vacuna",perro.getNombre(),"16-nov-2024");
		servicio2.setCartilla(cartilla);
		servicio2.realizar(perro.getNombre());
		cartilla.imprimirCartilla();
		
		//PERRO2
		Servicio servicio3 = vet.crearServicio("Baño",perro2.getNombre(),"23-dic-2024");
		servicio3.realizar(perro2.getNombre());
		Servicio servicio4 = vet.crearServicio("vacuna",perro2.getNombre(),"23-ene-2024");
		servicio4.setCartilla(cartilla2);
		servicio4.realizar(perro2.getNombre());
		cartilla2.imprimirCartilla();
		
	
	} catch (Exception e) {
		System.out.println("Ese servicio no lo ofrecemos!");
		e.printStackTrace();
	}
	//IMPRIMIR EXPEDIENTES
	vet.imprimirExpedientes();

	}
}