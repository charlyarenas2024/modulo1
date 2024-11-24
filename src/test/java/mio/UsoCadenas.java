/*
 * Las cadenas son inmutables, no se pueden modificar
 * Al intentar modificar una cadena se genera una cadena nueva
 * Se puede generar una cadena de multiples lineas conocida como text block iniciando con """ y terminando con """
 * Una cadena es un objeto
 * los indices en las cadenas estan indexados iniciando en 0 hasta el valor n-1 almacenandose de manera secuencial
 * La funcion chartAt (numero de elemento en la cadena) obtiene el caracter en la posicion solicitada en tipo de dato primitivo char
 * Al comparar 2 cadenas y estas fueron asignados sus valores de la misma manera y el texto es el mismo aran referencia a la misma direccion y seran iguales ==
 * Las cadenas se pueden comparar solamente su contenido con el metodo eqyuals
 * Subcadenas: obtienen una parte de una cadena original
 * Metodos para concatenar cadenas
 * 
 */
//System.out.println();

package mio;

public class UsoCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Manejo de cadenas
		var cadena0 =  "cadena uno";
		String cadena1 = "cadena uno";
		System.out.println(cadena1);
		var cadena2 = new String("cadena uno");
		System.out.println(cadena2);
		var cadena3 = cadena1 + " + " + cadena2 + "  ";
		System.out.println(cadena3);
		System.out.println();
		var cadena4 =
				"""
				-Cadena
				-multikinea
				-en text
				-block
				-desde
				-java
				""";
		System.out.println(cadena4);
		
		
		//indices en Cadenas
		var longitudCadena = cadena1.length();
		System.out.println(longitudCadena);
		
		var caracterObtenido = cadena1.charAt(0);
		System.out.println(caracterObtenido);
		
		caracterObtenido = cadena1.charAt(longitudCadena-1);
		System.out.println(caracterObtenido);
		
		
		// Comparacion de cadenas (pool de cadenas) ==
		System.out.println(cadena0 == cadena1);
		System.out.println(cadena1 == cadena2);
		
		System.out.println(cadena0.equals(cadena1));
		System.out.println(cadena1.equals(cadena2));
		
		
		//Metodos de cadenas
		System.out.println(cadena1.length()); // obtiene la longitud de la cadena
		var metodosCadenas1 = cadena2.replace('o','a'); // remplaza el valor del segundo parametro con el valor del primer parametro
		System.out.println(metodosCadenas1);
		System.out.println(metodosCadenas1.toLowerCase()); // convierte a minusculas la cadena
		System.out.println(metodosCadenas1.toUpperCase()); // convierte a mayusculas la cadena
		System.out.println(cadena3.trim()); // elimina espacios al inicio y final de la cadena
		System.out.println(cadena3);
		
		// Subcadenas: obtienen una parte de una cadena original
		System.out.println(cadena4.length());
		System.out.println(cadena4.substring(8,20)); // genera una subcadena de los caracteres 8 a 20
		
		// Buscar subcadenas indexof regresa el indice de la primera aparicion de la subcadena que estamos buscando
		
		var indice = cadena3.indexOf("cadena"); //muestra la primera aparicio de la subcadena
		System.out.println(indice);
		indice = cadena3.lastIndexOf("cadena"); //muestra la ultima aparicio de la subcadena
		System.out.println(indice);
		indice = cadena3.lastIndexOf("mama"); //muestra -1 cuando no se encuentra una subcadena
		System.out.println(indice);
		indice = cadena3.indexOf("mama"); //muestra -1 cuando no se encuentra una subcadena
		System.out.println(indice);		
		
		// Reemplazar subcadenas
		// reemplazar la cadena 'cadena' por 'esta' 
		var cadenaNueva = cadena3.replace("cadena", "esta");
		System.out.println(cadenaNueva);
		
		
		// metodo concat
		cadenaNueva = cadena1.concat(" +").concat(" ").concat(cadena2);
		System.out.println(cadenaNueva);
		
		//StringBuilder
		var constructorCadenas = new StringBuilder();
		constructorCadenas.append(cadena1);
		constructorCadenas.append(" ");
		constructorCadenas.append(cadena2);
		var resultado = constructorCadenas.toString();
		System.out.println(resultado);
		//es igual que: 
		//var resultado = constructorCadenas.append(cadena1).append(" ").append(cadena2).toString();
		
		
		// StringBuffer: nos sirve cuando varios procesos se ejecutan a la vez
		var stringBuffer = new StringBuffer();
		resultado = stringBuffer.append(cadena1).append(" ").append(cadena2).toString();
		System.out.println(resultado);
		
		// join
		resultado = String.join( " + ",cadena1, cadena2, cadena3, "hola" );
		System.out.println(resultado);
	}

}
