package mio;

import java.util.Scanner;

public class CiclosEnJava 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		var contador = 0;
		var consola = new Scanner(System.in);
/*		
		// Ciclo While
		
		while (contador < 10) 
		{
			System.out.println(contador ++);
		}
		
		System.out.println(contador);
		
		
		//Numeros pares
		
		while (contador <= 20) 
		{	
			if ((contador%2) == 0) 
			{
				System.out.println(contador++);
			}
			else 
			{
				contador++;
			}
			
		}
		
		// do While
		
		
		do 
		{
			System.out.println(contador++);
		}
		while (contador <= 5);
		
		// Numeros inversos
		contador = 10;
		while (contador >= 0) 
		{
			System.out.println(contador--);
		}
		
		//Numeros impares 0 a 20
		do
		{
			if (contador%2 != 0) 
			{
				System.out.print(contador++ + " ");	
			}
			else
			{
				contador++;
			}
			
		} while ((contador <= 20));
		
		//Ciclo for for(inicializacion; evalua una condicion; incremento de variables)
		
		for (var contador1 = 0; contador1 <= 10; contador1++)
		{
			System.out.print(contador1 + " ");
		}
		
		//Numeros pares con ciclo for
		
		for(var contador1 = 0; contador1 <= 20; contador1++)
		{
			if (contador1%2 == 0)
			{
				System.out.print(contador1 + " ");
			}
		}
		
		// Acumulador suma
		var acumulador = 5;
		while(contador <= 5)
		{	
			System.out.print(acumulador + " ");
			acumulador += acumulador;
			contador++; 
		}
		
		//Sistema administracion de cuentas
		int opcion;
		do
		{
			System.out.print("""
					*************** Sistema administracion de cuentas ******************
					Menu:
					1. Crea una cuenta.
					2. Eliminar una cuenta.
					3. Eliminar una cuenta.
					""");
			opcion = Integer.parseInt(consola.next());
			
			if (opcion == 1)
			{
				System.out.print("Creando cuenta.........");
			}
			else if (opcion == 2)
			{
				System.out.print("Eliminando cuenta.........");
			}
			else if(opcion == 3)
			{
				System.out.print("Eliminando cuenta.........");
			}
			else
			{
				System.out.print("Opcion equivocada");
			}
		} while (opcion != 3);
	
		//Cajero automatico
		
		var saldo = 1000.00;
		var operacion = 0;
		while(operacion != 4)
		{
			System.out.print("""
					*** Cajero automatico ***\n
					Operaciones que puedes realizar\n
					1. Consulta de saldo.
					2. Retirar.
					3. Depositar
					4. Salir
					
					Escoge una opcion
					""");
			operacion = consola.nextInt();
			if(operacion == 1)
			{
				System.out.println("Tu saldo actual es: " + saldo + "\n");
			}
			else if (operacion == 2)
			{
				System.out.println("¿Cuanto deseas retirar?");
				var retiro = consola.nextInt();
				if(retiro > saldo)
				{
					System.out.println("No cuentas con saldo suficiente, tu saldo es de: " +  saldo + "\n");
				}
				else
				{
					saldo = saldo - retiro;
					System.out.println("Operacion exitosa tu saldo actual es " +  saldo + "\n");
				}
				
				
			}
			else if(operacion == 3)
			{
				System.out.println("¿Que cantidad deseas depositar?");
				var deposito = consola.nextInt();
				saldo = saldo + deposito;
				System.out.println("Operacion exitosa tu saldo actual es " +  saldo + "\n");
			}
			else if(operacion == 4)
			{
				System.out.println("Saliendo del sistema...\n");
			}
			else
			{
				System.out.println("Opcion incorrecta \n");
			}
			
		}
*/		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
