package com.anahuac.mayab.modulo1.sesion5;

public class TestPato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pato patol new PatoMallard ("mallard", "negro");

		//PatoMallard patol = new PatoMallard ("mallard", "neg.ro");

		Pato pato2 = new PatoHule ("hule", "amarillo");

		Pato pato3 new PatoSenuelo ("señuelo", "gris");

		Pato pato4 new PatoSenuelo ("señuelo2", "cafe");

		Pato pato5 new Pato Papel ("papel","blanco");

		/*
		System.out.println("Nombre:" + patol.getNombre());
		patol.quack();
		System.out.println("Nombre:" + pato2.getNombre());
		pato2.quack();
		System.out.println("Nombre:" + pato3.getNombre());
		pato3.quack();*/

		ArrayList<Pato> lista Patos = new ArrayList<Pato>();
		listaPatos.add(pato1);
		listaPatos.add(pato2);
		listaPatos.add(pato3);
		listaPatos.add(pato4);
		listaPatos.add(pato5);

		SimuladorPatos simulador = new SimuladorPatos();
		simulador.simulaAcciones (listaPatos);

	}

}
