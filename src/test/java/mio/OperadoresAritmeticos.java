package mio;

import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		var consola = new Scanner(System.in);
		int a= 5, b= 6, resultado = 0;
		boolean c = true, d = false, e;
/*	
		//suma
		resultado = a + b;
		System.out.println(resultado);
		
		//resta
		resultado = a - b;
		System.out.println(resultado);
		
		//multiplicacion
		resultado = a * b;
		System.out.println(resultado);
		
		//division
		resultado = a / b;
		System.out.println(resultado);
		
		//modulo
		resultado = a % b;
		System.out.println(resultado);
				
				
		//Operadores unarios
		
		resultado = +a;// asigna un valor positivo a la variable a (+1)*(a)
		System.out.println(resultado);
		resultado = -a;// asigna un valor positivo a la variable a (-1)*(a)
		System.out.println(resultado);
		
		//Operadir unario pre-incrento / pre-decremento
		resultado = ++a;//Primero se incrementa
		System.out.println(resultado);
		resultado = --a;//Primero se decrementa
		System.out.println(resultado);
	
		//Operadir unario pos-incrento / pos-decremento
		resultado = a++;//Se incrementa despues de su uso
		System.out.println(resultado);
		resultado = a--;//Se decrementa despues de su uso
		System.out.println(resultado);
						
		//Operadores de asignacion +=, -=, *=, %
		resultado += 6;
		System.out.println(resultado);
		
		resultado -= 3;
		System.out.println(resultado);
		
		resultado *= 3;
		System.out.println(resultado);
		
		resultado /= 3;
		System.out.println(resultado);
		
		resultado %= 3;
		System.out.println(resultado);
		
		// Asignacion de variables multiples
		System.out.printf("a = %d, b = %d, resultado = %d", a, b, resultado);

		//Operadores de comparqacion ==, !=, <, >, <=, >=, ===, !==
		c = a ==b ;
		System.out.println(c);
		
		c = a == a ;
		System.out.println(c);
		
		c = a != b ;
		System.out.println(c);
		
		c = a < b ;
		System.out.println(c);
		
		c = a > b ;
		System.out.println(c);
		
		c = a >= b ;
		System.out.println(c);
		
		c = a <= b ;
		System.out.println(c);
		
	
//			Operador amd (&)					Operador OR (||)			Operador not (!)
//		  
//		   A  |   B   |   &					   A  |   B   |  OR (||)		   A   |  NOT B (!B)
//		------------------------		----------------------------		------------------
//		false | false |	false				false | false | false			 false | true
//		true  |	false |	false				true  |	false | true			 true  | false
//		false |	true  | false				false |	true  | true			 false | true
//		true  |	true  | true				true  |	true  | true			 true  | false
		
		
		e = c & d;
		System.out.println(e);
		
		e = c || d;
		System.out.println(e);
		
		System.out.println(e);
		e = !c;
		System.out.println(e);
		
		
				
		// Valos dentro de rango
		
		System.out.println("Ingresa un numero");
		var numeroConsola = consola.nextInt();
		var limiteInferior = 2;
		var limiteSuperior = 5;
		
		e = (numeroConsola > limiteInferior) & (numeroConsola < limiteSuperior);
		System.out.println("Esta dentro de rango: " + e);
		
	
		//Sistemas descuentos VIP
		
		var numProductosDescuento = 10;
		
		System.out.println("Cuantos productos compraste");
		
		var productosComprados = consola.nextInt();
		
		System.out.println("Tienes membresia (true / false) ");
		
		var membresia = consola.nextBoolean();
		
		System.out.println(membresia);
		
		c = (10 <= productosComprados) & membresia;
		
		System.out.println("Es cliente VIP: " + c);	
				
		
		// Sistema prestamo de libros
		
		System.out.println("Tienes credencial de la bibloteca (true / false)");
		c = consola.nextBoolean();
		System.out.println("A que distancia vives de la bibloteca en Km");
		a = consola.nextInt();
		d = c || (a <= 3);
		System.out.println("Tiene acceso al prestamo de un libro: " + d);
		
		// Sistemas de sutenticacion
		
		System.out.println("********** Sistema de autenticacion ***************");
		var usuario = "Carlos24@gmail.com";
		var password = "123456ser@";
		String usuarioIngresado, passwordIngreado;
		System.out.println("Ingresa el usuario: ");
		usuarioIngresado = consola.next();
		System.out.println("Ingresa el password: ");
		passwordIngreado = consola.next();
		
		e = (usuario == usuarioIngresado) & (password == passwordIngreado);
		
		System.out.println("Los datos son correctos: " + e);
		
		// Calculo del area y perimetro de un rectangulo
		System.out.println("********* Calculo del area y perimetro de un rectangulo *****************************");
		System.out.println("¿Cual es la altura del rectangulo?");
		var altura = Integer.parseInt(consola.nextLine());
		System.out.println("¿Cual es la base del rectangulo?");
		var base = Integer.parseInt(consola.nextLine());
		var area = (base * altura);
		var perimetro = 2 * (base + altura);
		System.out.println("El area del rectamgulo es: " + area + " unidades cuadradas");
		System.out.println("El perimetro del rectangulo es: " + perimetro + " unidades");
*/		
		
        // Precedencia de Operadores en Java:
        // 1. Parentesis y Corchetes
        // 2. Operadores unarios -, ++, --
        // 3. Operadores aritmeticos *, / y %
        // 4. Operadores aritmeticos + y -
        // 5. Relacionales <, <=, >, >=
        // 6. Equivalencia == y !=
        // 7. Logicos && y ||
        // 8. Asignacion =, +=, -=, *=, etc

        // Expresion
        // Paso 1. Division 12 / 3 = 4
        // Paso 2. Multiplicacion 2 * 3 = 6
        // Paso 3. Suma 4 + 6 = 10
        // Paso 4. Resta 10 - 1 = 9
         a = 12 / 3 + 2 * 3 - 1;
         System.out.println("a = " + a);		
	}

}
