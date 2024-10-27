package com.anahuac.mayab.modulo1;
//.
public class Circulo {

	public static void main(String[] args) {
		double radio;
		double pi = 3.141516;
		double diametro;
		
		double area;
		
		radio = 15;
		area = (pi*radio*radio);
		diametro = (2*radio*pi);
		
		System.out.println("El area de tu circulo es: " + area);
		System.out.println("El area de tu circulo es: " + diametro);
	}

}
