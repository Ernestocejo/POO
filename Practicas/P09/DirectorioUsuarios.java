public class DirectorioUsuarios {

	private Usuarios2 [] lista_de_usuarios;

	public DirectorioUsuarios() {
		lista_de_usuarios = new Usuarios2[3]; 
	}
	public void setListaUsu(Usuarios2 nickname) {
		Lector reader = new Lector();
		Imprime imprime = new Imprime();
		for(int i =0; i<lista_de_usuarios.length;i++){
			imprime.impNickname();
			nickname.setNickname(reader.leeString());
			lista_de_usuarios[i] = nickname;
		}
	}
	public Usuarios2 [] getListaUsu() {
		return lista_de_usuarios;
	}
	public void imprListaUsu() {
		for(int i =0; i<lista_de_usuarios.length;i++) {
			 System.out.println(lista_de_usuarios[i]);
		}
	}
	public boolean iniciarSesion(Usuarios2 nickname) {
		int i = 0;
		while (i < 3 && (nickname.equals(lista_de_usuarios[i]))) {
			i++;
		}
		if(i > 2) {
			return false;
			//System.out.println("La palabra '" + palabra + "' no se encuentra en el Diccionario");
		} else {
			return true;
			//System.out.println("\n" + palabra + " -> " + spanish[i]);
		}

	}
}