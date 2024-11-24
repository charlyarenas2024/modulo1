package mio;

public class DetalleLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tituloLibro = "El señor de los anillos"; //los datos tipo string son inmutables no se pueden modificar ni sobreescribit
		int anoPublicado = 1995;
		double prcio = 24.95;
		boolean libroDisponible = true;
		
		System.out.println(tituloLibro);
		System.out.println(anoPublicado);
		System.out.println(prcio);
		System.out.println(libroDisponible);
		
		//Modificar titulo de libro
		tituloLibro = "El amor es ciego";
		System.out.println(tituloLibro);
	}

}
