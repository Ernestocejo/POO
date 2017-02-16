import java.util.Scanner;
import java.io.*;
class Exercise2 {
	//metodo para imprimir
	public static void printCapitalized(String nombre){
		System.out.println(nombre.toUpperCase());
	}

	public static void main(String[] arg) {
		String palabra;

		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe una palabra");
		palabra = entrada.nextLine ();
		//llamado del metodo		
		printCapitalized(palabra);
	}
}

