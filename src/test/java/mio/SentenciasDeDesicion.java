package mio;

import java.util.Scanner;

public class SentenciasDeDesicion {

	public static void main(String[] args) {
		
		// Sentencia If
		
		var edad = 18;
		var consola = new Scanner(System.in);
/*		
		System.out.println("¿Cual es tu edad?");
		var edadIngresada = Integer.parseInt(consola.nextLine());
		
		if (edadIngresada > edad)
		{
			System.out.println("Eres mayor de edad");
		}
		
		// Sentencia if else
		
		System.out.println("¿Cual es tu edad?");
		var edadIngresada = Integer.parseInt(consola.nextLine());
		
		if (edadIngresada > edad)
		{
			System.out.println("Eres mayor de edad");
		}
		else 
		{
			System.out.println("Eres menor de edad");
		}
		
		// Sentencia if else if
		
		System.out.println("¿Cual es tu edad?");
		var edadIngresada = Integer.parseInt(consola.nextLine());
		
		if (edadIngresada >= edad)
		{
			System.out.println("Eres mayor de edad");
		}
		else if (edadIngresada >= 13 & edadIngresada < edad) 
		{
			System.out.println("Eres un adolecente");
		}
		else 
		{
			System.out.println("Eres un niño");
		}
		
	// Si un numero es positivo	
		
		System.out.println("proporciona un numero");
		var valor = Integer.parseInt(consola.nextLine());
		
		if (valor > 0) 
		{
			System.out.println("El numero es positivo");
		}
		else if (valor < 0)
		{
			System.out.println("El numero es negativo");
		}
		else
		{
			System.out.println("El numero es cero");
		}	
	
		// Tienda en linea
		
		var compraMinima = 1000;
		System.out.println("************** Tien da en linea con descuentos **********************");
		System.out.println("¿Cual es el monto de su compra?");
		var compra = Integer.parseInt(consola.nextLine());
		System.out.println("¿Cuenta con la menmbresia de la tienda (true  / false)?");
		var membresia = Boolean.parseBoolean(consola.nextLine());
		
		if (compra >= compraMinima & membresia) 
		{
			var cuentaActual = compra * 0.9; 
			System.out.printf("Tienes un 10% de descuento en tu compra, tu cuenta actual es: " + cuentaActual);
		}
		else if (membresia) 
		{
			var cuentaActual = compra * 0.95;
			System.out.println("Tienes un 5% de descuento en tu compra, tu cuenta actual es: " + cuentaActual);
		}
		else 
		{
			System.out.println("Tienes un 0% de descuento en tu compra, tu cuenta actual es: " + compra);
		}
		
		// Sistema Bancario
		
		System.out.println("**************** Te encuentrea en el sistema bancario************************");
		System.out.println("¿Deseas salir del sistema (true / false)?");
		var continuar = Boolean.parseBoolean(consola.next());
		
		if (!continuar) 
		{
			System.out.println("Continuamos dentro del sistema");
		}
		else 
		{
			System.out.println("Saliendo del sistema.......");
		}

		// Operador ternario condicion ? expresion1 (condicion verdadera) : expresion2 (condicion falsa);
		
		var operadorTernario = 5<3 ? "Es verdadero" : "Es falso";
		System.out.println(operadorTernario);
		
		// Anidando operador ternario
		
		var operadorTernario = 5<3 ? "Es verdadero" : 5 > 3 ? "Es verdadero" : "Es falso";
		System.out.println(operadorTernario);
		
		// Aplicacion de salud y fitness
		
		var metaPasos = 10000;
		var caloriasPorPaso = 0.04;
		
		System.out.println("*** Aplicacion de salud y fitness ***");
		System.out.println("¿Cual es tu nombre?");
		var nombre = consola.nextLine();
		System.out.println("¿Cuantos pasos diste hoy?");
		var pasos = Integer.parseInt(consola.nextLine());
		
		var caloriasQuemadas = pasos * caloriasPorPaso;
		var meta =  pasos >= metaPasos ? true : false;
		
		System.out.println("Hola " + nombre);
		System.out.println("Hoy diste " + pasos + " ¿tu meta fue alcanzada? " + meta + " quemaste " + caloriasQuemadas + " calorias ");
*/		
		// Sentencia Switch
/*
		switch (valor_a_evaluar)
		{
			case 1:
					sentencias a evaluar
					break;
			
			case 2:
					sentencias a evaluar
					break;
			default:
					sentencias a evaluar			
*/		
		
		
		
		// Dia de la semana
/*		
		System.out.println("Ingresa un dia de la semana nimerado de 1 a 7");
		var diaSemana = Integer.parseInt(consola.nextLine());
		
		switch (diaSemana) {
			
				case 1: {
							System.out.println("Hoy es lunes");
							break;
						}
				
				case 2: {
							System.out.println("Hoy es martes");
							break;
						}
				
				case 3: {
							System.out.println("Hoy es miercoles");
							break;
						}
				
				case 4: {
							System.out.println("Hoy es jueves");
							break;
						}
				
				case 5: {
							System.out.println("Hoy es viernes");
							break;
						}
				
				case 6: {
							System.out.println("Hoy es sabado");
							break;
						}
				
				case 7: {
							System.out.println("Hoy es domingo");
							
						}
		
		};
		
		
		System.out.println("Ingresa un dia de la semana nimerado de 1 a 7");
		var diaSemana = Integer.parseInt(consola.nextLine());
		
		switch (diaSemana) {
			
				case 1 ->
						{
							System.out.println("Hoy es lunes");
							break;
						}
				
				case 2 -> 
						{
							System.out.println("Hoy es martes");
							break;
						}
				
				case 3 -> 
						{
							System.out.println("Hoy es miercoles");
							break;
						}
				
				case 4 -> 
						{
							System.out.println("Hoy es jueves");
							break;
						}
				
				case 5 ->
						{
							System.out.println("Hoy es viernes");
							break;
						}
				
				case 6 -> 
						{
							System.out.println("Hoy es sabado");
							break;
						}
				
				case 7 -> 
						{
							System.out.println("Hoy es domingo");
							break;
						}
				default -> 
						{
							System.out.println("Dia invalido");
						}
		
		}
		
		
		
		System.out.println("Ingresa un mes del año numerado de 1 a 12");
		var mes = Integer.parseInt(consola.nextLine());
		//La sintaxis mejorada de switch no funciona en esta version de Java instalada en este compilador
		var estacion = switch (mes) {
			
				case 1,2,12 ->
						{
							System.out.println("Invierno");
							break;
						}
				
				case 3,4,5 -> 
						{
							System.out.println("Primavera");
							break;
						}
				
				case 6,7,8 -> 
						{
							System.out.println("Verano");
							break;
						}
				
				case 9,10,11 -> 
						{
							System.out.println("Otoño");
							break;
						}
				default -> 
						{
							System.out.println("Mes invalido");
						}	
		}		
*/		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
