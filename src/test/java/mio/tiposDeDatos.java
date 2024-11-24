package mio;

public class tiposDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte tipoByte = 127;
		System.out.println("tipoByte = " + tipoByte);
		short tipoShort = 32000;
		System.out.println("tipoShort = " + tipoShort);
		int tipoInt = 2147483647;
		System.out.println("tipoInt = " + tipoInt);
		long tipoLong = 987654321098765432L; //L o l ára indicar que es de tipo long
		System.out.println("tipoLong = " + tipoLong);
		
		// Punto Flotante
		float tipoFlotante = 3.14F; //F o f para indicar tipo float
		System.out.println("tipoFlotante = " + tipoFlotante);
		double tipoDouble = 3.1315D;  //D o d para indicar tipo double
		System.out.println("tipoDouble = " + tipoDouble);
		
		
	}

}
