package mio;

import java.util.Scanner;

public class Funciones 
{
	static void funcionSaludar(String contenidoMensaje)
	{
		System.out.println("Mensaje: " + contenidoMensaje);
	}
	
	static double funcionSumar(double sumaA, double sumaB )
	{
		System.out.println("La suma de A mas B es: " + (sumaA + sumaB));
		double resultado = (sumaA + sumaB);
		return  resultado;
	}
	static boolean esPar(int valor)
	{
		if(valor%2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}	
	
	//funcion recursiva se debe mandar a llamar a si misma
	//Debe avanzar hacia un caso base, de lo contrario caemos en ciclos infinitos
	
	static void funcionRecursiva(int valorR)
	{
		if(valorR == 1)
		{
			System.out.print(valorR + " ");
		}
		else
		{
			System.out.print(valorR + " ");
			funcionRecursiva(valorR-1);
			System.out.print(valorR + " "); // Hasta que se termina la recursividad se va a ajecutar esta ultima linea con 
		}									// todos los datos que tiene almacenados
	}
	
	public static void main(String[] args) 
	{
		var consola = new Scanner(System.in);
		//funcionSaludar("Hola desde Java");
		//funcionSaludar("Adios");
		//funcionSumar(1,3);
		//System.out.println(funcionSumar(1,3));
		//System.out.println("Ingrtesa un numero ");
		//var numeroIngresado = Integer.parseInt(consola.nextLine());
		//System.out.println("¿El numero es par? " + esPar(numeroIngresado));
		
		System.out.println("Ingresa un numero");
		var valorDeEntrada = Integer.parseInt(consola.nextLine());
		funcionRecursiva(valorDeEntrada); 
	}
}












