package com.anahuac.mayab.modulo1;

public class Condicional 
{

	public static void main(String[] args) 
	{
		/*
		int edad =18;
		if (edad >= 18) {
			System.out.println("Eres mayor de edad");
		}	
		else
		{
			System.out.println("Eres menor de edad");
		}
		System.out.println("Fin del programa");
		
		// Calcular el mayor de 2 numeros
		
		int primerNumero = 1;
		int segundoNumero = 3;
		
		if(primerNumero > segundoNumero) 
		{
			System.out.println("El numero: " + primerNumero + " es mayor que " + segundoNumero);		
		}
		else 
		if (segundoNumero  > primerNumero) 
		{
			System.out.println("El numero: " + segundoNumero + " es mayor" + primerNumero);
		}	
		else 
		{
			System.out.println("El numero: " + segundoNumero + " es igual a " + primerNumero);
		}
		*/		
			double cuenta = 1000;
			double propina = 10;
			
			if (cuenta <= 100) 
			{
				System.out.println("La propina es de: " + propina );
			}
			else 
			{
				propina = cuenta * 0.1;
				System.out.println("El la propina es de : " + propina/*(cuenta*.1)*/ );	
			}
			
			
			
			
	}

}
