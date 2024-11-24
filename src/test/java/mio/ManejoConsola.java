//System.out.println("");

package mio;
import java.util.Scanner;
import java.util.Random;
public class ManejoConsola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var consola = new Scanner(System.in);//in - input -entrada de datos
/*
		System.out.println("Escribe tu nombre: ");
		var nombre = consola.nextLine();
		System.out.println("Mi nombre es: " + nombre);
		
		
		
		//Leer distintos tipos de datos
		System.out.println("Ingresa tu edad: ");
		var edad = consola.nextInt();//lee un dato tipo int
		System.out.println("Edad: " + edad);
		System.out.println("Ingresa tu altura: ");
		var altura = consola.nextDouble();//ingresa un dato tipo double el cual no consume un salto de linea, por lo que debemos agregarlo
		consola.nextLine();
		System.out.println("Altura: " + altura);
		System.out.println("Escribe tu nombre: ");
		nombre = consola.nextLine();
		System.out.println("Mi nombre es: " + nombre);
		
		
		
		//Conversion de datos
		System.out.println("Ingresa un valor de tipo entero");
//		var enteroString = consola.nextLine();
//		var entero = Integer.parseInt(enteroString);
		var entero = Integer.parseInt(consola.nextLine());
		System.out.println("Entero: = " + entero);
		System.out.println("Ingresa un valor de tipo flotante");
		var flotante = Float.parseFloat(consola.nextLine());
		System.out.println("Flotante: = " + flotante);
		
	
		
	
		//Sistema empleado
		System.out.println("Ingresa el nombre del empleado");
		var nombre = consola.nextLine();
		System.out.println("Ingresa la edad del empleado");
		var edad = Integer.parseInt(consola.nextLine());
		System.out.println("Ingresa el salario");
		var salario = Double.parseDouble(consola.nextLine());
		System.out.println("Es jefe de departamento");
		var esJefe = Boolean.parseBoolean(consola.nextLine());
		
		System.out.println("\nNombre del Empleado: " + nombre);
		System.out.println("\tLa edad es: " + edad + "años");
//		System.out.println("\tEl salario es: $%.2f%n".formatted(salario) );
		System.out.printf("\tEl salario es: $%.6f%n",salario);
		System.out.println("\tEs jefe de deepartamento: " + esJefe);
		

		//Receta de Cocina
		System.out.println("Cual es el nombre de la receta");
		var nombreReceta = consola.nextLine();
		System.out.println("Cuales son los ingredientes");
		var ingredientesPrincipales = consola.nextLine();
		System.out.println("Cual es el tiempo de preparacion");
		var tiempoPreparacion = Integer.parseInt(consola.nextLine());
		System.out.println("Cual es la dificultad de la receta: ");
		var dificultad = consola.nextLine();
		
		System.out.println("\n\tLa receta es: " + nombreReceta);
		System.out.println("\tLos ingredientes son: " + ingredientesPrincipales);
		System.out.println("\tEl tiempo de preparacion es: " + tiempoPreparacion + " minutos");
		System.out.println("\tLa disicultad de la receta es: " + dificultad);
		

		//Numeros aleatorios
		System.out.println("******************* Numero Aleatorio **********************");
		var numAleatorio = new Random();
		
		var aleatorio = numAleatorio.nextInt(10);// fenera un numero aleatorio entero entre 0 y 9
		System.out.println("El valor aleatorio entre 0 y 9 es: " + aleatorio);
		
		aleatorio = numAleatorio.nextInt(10) + 1;//numero aleatorio entero entre 1 y 11
		System.out.println("El valor aleatorio entre 1 y 10 es: " + aleatorio);
		
		var aletorioFtotante = numAleatorio.nextFloat();
		System.out.println("El valor aleatorio entre 0.0 y 0.10 es: " + aletorioFtotante);
		
		var dado = numAleatorio.nextInt(6) + 1;
		System.out.println("El valor del dado es: " + dado);
		

		var nombre = "Matias";
		var edad = 35;
		var numEmpleado = 12;
		var salario = 2100;
		
	
		//String.format- no es compatible para este IDE
//		var mensaje = String.format("Nombre: %s, Edad: %d, Salario: %.2f", nombre, edad, salario);
//		System.out.println(mensaje);
//		System.out.printf("Nombre: %s, Edad: %d, Salario: %.2f", nombre, edad, salario);//no es compatible con este IDE
		
		
		var mensajeNuevo = """
				
				
				%nDetalle Persona: \s
				-----------------------
				\tNombre: %s
				\tEdad: %d años
				\tNumero de empleado: %d
				""".formatted(nombre, edad, numEmpleado, salario);
		System.out.println(mensajeNuevo);
		
*/
		
		//Sistema generador de id unico	
		System.out.println("Cual es tu nombre: ");
		var nombre = consola.nextLine();
		var nombreId = nombre.trim().toUpperCase().substring(0, 2);
		System.out.println("Cual es tu apellido: ");
		var apellido = consola.nextLine();
		var apellidoId = apellido.trim().toUpperCase().substring(0, 2);
		System.out.println("Cual es tu año de nacimiento: ");
		var anoNacimiento = consola.nextLine();
		var anoIni = anoNacimiento.length()-2;
		var anoFin = anoNacimiento.length();
		var anoId = anoNacimiento.substring(anoIni,anoFin);
		var numAleatorio = new Random();
		var numId = String.format("%04d", numAleatorio.nextInt(9999)+1);
		var idunico = nombreId+apellidoId+anoId+numId;
		
		
		System.out.println("**************** Sistema generador de id unico*********************");
		System.out.println(idunico);
		
	
		
		

	}

}
