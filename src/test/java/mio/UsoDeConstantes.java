/*
 * Constantes: es una variable cuyo valor no puede modificarse una vez asignado un valor, se utiliza para valores que sabemos que no 
 * cambiaran a lo largo de la ejecución del programa se puede usar indicando el tipo de dato primitivo o con VAR

System.out.println("");

**/

package mio;

public class UsoDeConstantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("*****************Constantes en Java**********************");
		
		//Definicion de las variables constantes
		final var diasDeLaSemana = 7;
		final var PI = 3.14159;
		
		System.out.println(diasDeLaSemana);
		//diasDeLaSemana = 15; // no permite asignar un valor nuevo a la variable
		System.out.println(PI);		
		System.out.println(Math.PI);
		
		
	}

}
