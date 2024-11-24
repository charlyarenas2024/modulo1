package mioPoo;

public class SobrecargaConstructores 
{
	int operador1, operador2;
	
	public SobrecargaConstructores() 
	{
		System.out.println("Hola");
	}
	
	public SobrecargaConstructores(int a, int b) // Se genera la sobrecarga de constructores
	{
		operador1 = a; 
		operador2 = b;
	}
	void suma()
	{	
		System.out.println(operador1 + operador2);
	}
	void resta()
	{
		System.out.println(operador1 - operador2);
	}
	
	public static void main(String[] args) 
	{
			var aritmetica1 = new SobrecargaConstructores(5, 7);
			var aritmetica2 = new SobrecargaConstructores();
			aritmetica1.suma();
			aritmetica1.resta();
			aritmetica2.operador1 = 10;
			aritmetica2.operador2 = 10;
			aritmetica2.suma();
			aritmetica2.resta();	
	}
}
