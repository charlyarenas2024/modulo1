package mioPoo;

public class Persona 
{
	//En la definicion de los atributos de la clase no se recomienda el uso de var
	String nombre;
	String apellido;
	String email;
	String telefono;
	
	void mostrarPersona ()
	{
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Email: " + email);
		System.out.println("Telefono: " + telefono);
		System.out.println();
	}
	
	public static void main(String[] args) 
	{
		System.out.println("*** Creacion de clase y objeto Persona ***");
		var objeto1 = new Persona();
		var objeto2 = new Persona();
		objeto1.nombre = "Laura";
		objeto1.apellido = "Acosta";
		
		objeto1.mostrarPersona();
		
		objeto2.nombre = "Ian";
		objeto2.apellido = "Gomez";
		
		objeto2.mostrarPersona();
	}


}
