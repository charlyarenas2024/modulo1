/*
 * Los constructores solo tienen un tipo de modificador que es public
 * por default se agrega un constructor vacio
 * El constructor debe llamarse igual que el nombre de nuestra clase
 * Los constructores no regresan nungun tipo de dato
 * La sobrecarga de constructores permite distintos con valores y parametros diferentes
 * Cuando se 
*/
package mioPoo;

public class Aritmetica 
{
	public Aritmetica()
	{
		System.out.println("Primero se ejecuta lo que contiene el constructor y despue el flujo del progrma con los objetos de este tipo por cada objeto que es creado");
	}
	
	int operador1, operador2;
 
	void suma(int operador1, int operador2)
	
	{
		System.out.println(operador1 + operador2);
	}
	void resta(int operador1, int operador2)
	{
		System.out.println(operador1 - operador2);
	}
	
	
	public static void main(String[] args)
	{
		var aritmetica1 = new Aritmetica();
		var aritmetica2 = new Aritmetica();
		var aritmetica3 = new Aritmetica();
		aritmetica1.suma(10, 15);
		aritmetica1.resta(100, 25);		
		
		aritmetica2.suma(12, 16);
		aritmetica2.resta(15, 25);		
		aritmetica3.operador1 = 10;
		aritmetica3.operador2 = 1;
		aritmetica3.suma(aritmetica3.operador1, aritmetica3.operador2);
		aritmetica3.resta(aritmetica3.operador1, aritmetica3.operador2);	
		
	}
}
