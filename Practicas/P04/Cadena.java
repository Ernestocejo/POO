class Cadena {
	public static void main(String[] args) {
		String str1 = "caballo bonito"; //dreclro string e inicializo
		String str2 = "bonilj caballo";
        char [] cadena = new char[str1.length ()]; //declaro una cadena de caracteres
        char char1,char2; //decalro variables tipo primitivo char
        int i, j,len;

        // preguntamos si son de la misma longitud   
        if(str1.length () == str2.length ()) {
        //inicio una sentencia for para recorrer la cadena y acomodarla
			for(i =0; i < str1.length(); i++) {
				char1 = str1.charAt(i); //el charAt nos devuelve el caracter
				for(j=0; j < str1.length(); j++) {
					char2 = str2.charAt(j);
					if(char1 == char2) {
						cadena[i] = str2.charAt(j);	
					}
				}
				//System.out.println(i + " -> " + cadena[i]);
			}

		

			String str3 = new String (cadena); //convierto el char a string
			System.out.println(cadena);
			System.out.println(str3);
			if(str1.compareTo(str3)==0) { //comparo la lexicografia de ambas cadenas
				System.out.println("La palabra " + str2 + " es un Anagrama de " +  str1);
			}else System.out.println("La " + str2 + " No es un Anagrama de " + str1);
		}else System.out.println("La " + str2 + " No es un Anagrama de " + str1);	
	}
}