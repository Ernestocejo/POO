import java.io.*;
public class Diccionario {
	private int tam;
	private String spanish [] = new String [100];
	private String inglish [] = new String [100];

	private InputStreamReader isr = new InputStreamReader(System.in);
	private BufferedReader flujo = new BufferedReader(isr);
	private PrintStream imp = System.out;

	public void CrearDiccionario() {
		try {
			int i;
			imp.println("Cuantas palabras deceas introducir");
			this.tam = Integer.parseInt(flujo.readLine());
			for(i=0; i < this.tam; i++) {
				imp.println("Ingresa palabra en espanol");
				spanish[i] = flujo.readLine();
				imp.println(spanish[i] + " en ingles");
				inglish[i] = flujo.readLine();
			}
		}catch(IOException e) {}
	}
	public void Traducir(String palabra) {
		int i = 0;
		while (i < this.tam && (palabra.compareToIgnoreCase(inglish[i])) != 0) {
			i++;
		}
		if(i > this.tam - 1) {
			imp.println("La palabra '" + palabra + "' no se encuentra en el Diccionario");
		} else {
			imp.println("\n" + palabra + " -> " + spanish[i]);
		}
	}
	public static void main(String[] args) {
		String palabra;
		Diccionario Dic = new Diccionario();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader flujo = new BufferedReader(isr);
		PrintStream imp = System.out;
		Dic.CrearDiccionario();
		try {
			imp.print("\nQue palabra decea traducir al Espanol -> ");
			palabra = flujo.readLine();
			Dic.Traducir(palabra);
		}catch (IOException e) {}	
	}
}