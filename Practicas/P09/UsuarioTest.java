public class UsuarioTest {

	public static void main(String[] args) {
		Lector reader = new Lector();
		Imprime imprime = new Imprime();
		
		System.out.println("Escribe Nombre, Telefono y Direccio del Usuario");
		Usuario persona_1 = new Usuario(reader.leeString(),reader.leeString(),reader.leeString());

		System.out.println("\nEscribe Nombre, Telefono, Direccio, Mail del Usuario");
		Usuario persona_2 = new Usuario(reader.leeString(),reader.leeString(),reader.leeString(),reader.leeString());


		System.out.println("\nEscribe Nombre, Telefono, Direccio, Mail, Nickname, Fecha naimnto del Usuario");
		Usuario persona_3 = new Usuario(reader.leeString(),reader.leeString(),reader.leeString(),reader.leeString(),reader.leeString(),reader.leeString());
		
		System.out.println("\nEscribe Nombre, Telefono, Direccio, Mail, Nickname, Fecha naimnto del Usuario");
		Usuario persona_4 = new Usuario();
		imprime.impNombre();
		persona_4.setNombre(reader.leeString());
		imprime.impTelefono();
		persona_4.setTelefono(reader.leeString());
		imprime.impDireccion();
		persona_4.setDireccion(reader.leeString());
		imprime.impMail();
		persona_4.setMail(reader.leeString());
		imprime.impNickname();
		persona_4.setNickname(reader.leeString());
		imprime.impFechanaci();
		persona_4.setFecha_nacimiento(reader.leeString());
		
		System.out.println("\nUsuario 1\n" + persona_1);
		System.out.println("\nUsuario 2\n" + persona_2);
		System.out.println("\nUsuario 3\n" + persona_3);
		System.out.println("\nUsuario 4\n" + persona_4);
	
		
	}
}