/*
 *Se debe definir su valor
 *se debe inicializar la variable con el tipo de dato
 *No acepta valores null
 *solo se puede usar dentro de funciones locales, no como variables de clases
 *No esta permitida la defnicion compuesta de variables, var solo define una sola variable 
*/
package mio;

public class UsoDeVar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***************Uso de Var en Java**********************");
		String nombre1 = "Juan Manuel";
		System.out.println(nombre1);
		var nombre2 = "Carlos Arenas"; 
		System.out.println(nombre2);
		var edad = 15;
		System.out.println(edad);
		var sueldo = 55000.20F;// se infiere el tipo floar a partir de su valor
		System.out.println(sueldo);
		var esCasado = true;
		System.out.println(esCasado);
		
		
		
		System.out.println();
	}

}
