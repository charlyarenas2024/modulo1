package com.anahuac.mayab.modulo1.ProyectoFinal;


import java.util.ArrayList;
import java.util.HashMap;

public class TestPerro {
	public static void main(String[] args) {
		
    	Perro perro1 = new Perro("Corriente","Mator", 10.5,"Petit","Carlos", 3);
		Perro perro2 = new Perro("Peludo", "pequeño", 10.5, "Solovino", "Juaquin", 5);
		Perro perro3 = new Perro("Caballo","", 10.5,"Agarrado","Andy", 7);
		Perro perro4 = new Perro("Mini", "Mediano", 10.5, "Manchado", "Geo", 8);
		Perro perro5 = new Perro("Hachi","Grande", 10.5,"Patroclo","Elena", 10);
	
		//ARRAY SIMPLE
		
		Perro[] misPerros = new Perro[5];
		misPerros[0]= perro1;
		misPerros[1]= perro2;
		misPerros[2]= perro3;
		misPerros[3]= perro4;
		misPerros[4]= perro5;
		

		//ARRAY LIST 
		ArrayList<Perro> listaPerros = new ArrayList<Perro>();
		listaPerros.add(perro1);
		listaPerros.add(perro2);
		listaPerros.add(perro3);
		listaPerros.add(perro4);
		listaPerros.add(perro5);
				
		// HASHMAP 
		HashMap<Integer, Perro> mapPerros = new HashMap<>();
		
		mapPerros.put(0, perro1);
		mapPerros.put(1, perro2);
		mapPerros.put(2, perro3);
		mapPerros.put(3, perro4);
		mapPerros.put(4, perro5);
		
		for (Integer p:mapPerros.keySet()) {
		    Perro perro = mapPerros.get(p);
		    perro.ladrar();
		}
		System.out.println("IMPESION HASMAP");
		for (Perro n: listaPerros) {
			 n.ladrar();		     
			}
		System.out.println("IMPESION ARRAY LIST");
		for (int i = 0; i<misPerros.length;i++) {
			Perro p = misPerros[i];
			p.ladrar();
		}
		System.out.println("IMPESION ARRAY SIMPLE");
   }
}

