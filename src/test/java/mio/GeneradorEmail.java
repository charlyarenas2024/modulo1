//System.out.println();

package mio;

public class GeneradorEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var nombreUsuario = "Carlos Alberto Arenas Ibañez";
		var nombreUsuarioNormalizado = nombreUsuario.replace(' ', '.');
		var nombreUsuarioNormalizadoMinusculas = nombreUsuarioNormalizado.toLowerCase();
		var nombreEmpresa = "BROXEL";
		var nombreEmpresaNormalizado = nombreEmpresa.toLowerCase();
		var extensionDelDominio = ".com.mx";
		var dominioEmailNormalizado = '@' + nombreEmpresaNormalizado + extensionDelDominio;
		var emailFinalGenerado = nombreUsuarioNormalizadoMinusculas + dominioEmailNormalizado;
		
		System.out.println("***************Generador de Email*****************");
		System.out.println("Nombre usuario: " + nombreUsuario);
		System.out.println("Nombre usuario normalizado: " + nombreUsuarioNormalizado);
		System.out.println();
		System.out.println("Nombre empresa: " + nombreEmpresa);
		System.out.println("Extensión del dominio: " + extensionDelDominio);
		System.out.println("Dominio de email normalizado: " + dominioEmailNormalizado);
		System.out.println();
		System.out.println("Email final generado: " + emailFinalGenerado);
				
	}

}
