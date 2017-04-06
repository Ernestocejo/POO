public class DirectorioUsuariosTest {
	public static void main(String[] args) {
		Lector reader = new Lector();
		//Imprime imprime = new Imprime();

		DirectorioUsuarios lista = new DirectorioUsuarios();
		Usuarios2 nickname = new Usuarios2();
		lista.setListaUsu(nickname);
		System.out.println(lista.iniciarSesion(nickname));
		lista.imprListaUsu();
		//System.out.println("\nUsuario 4\n" + persona_5);
	}
}	