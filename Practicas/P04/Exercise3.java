class Exercise3{
	public static void main(String[] args) {

		String word = "Hello, my good  friend, Hello "; // declaramos e inisializamos con una frase

		System.out.println(word.lastIndexOf("Hello"));// Devuelve la posicion de la ultima ocurrencia de la cadena
		System.out.println(word.indexOf("Hello",1));// Devuelve la posicion de la primera ocurrencia de la cadena devueve -1 si no encuentra ocurrencias
		System.out.println(word.substring(0,9)); // extrae una sub cadena de una cadena segun los parametros asignados
	}

}