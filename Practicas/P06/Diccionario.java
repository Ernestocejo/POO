import java.io.*;
public class Diccionario {
	private String spanish [] = new String [30];
	private String inglish [] = new String [30];

	public void CrearDiccionario() {
		spanish[0] = "Libro"; spanish[1] = "Verde"; spanish[2] = "Raton"; spanish[3] = "Casa"; spanish[4] = "Mesa";
		inglish[0] = "Book"; inglish[1] = "Green"; inglish[2] = "Mouse"; inglish[3] = "House"; inglish[4] = "Table";
		spanish[5] = "Familia"; spanish[6] = "Padre"; spanish[7] = "Madre"; spanish[8] = "Abuelo"; spanish[9] = "Abuela";
		inglish[5] = "Family"; inglish[6] = "Father"; inglish[7] = "Mother"; inglish[8] = "Grandfather"; inglish[9] = "Grandmother";
		spanish[10] = "Nieto"; spanish[11] = "Nieta"; spanish[12] = "Hermano"; spanish[13] = "Hermana"; spanish[14] = "Hijo";
		inglish[10] = "Grandson"; inglish[11] = "Granddaughter"; inglish[12] = "Brother"; inglish[13] = "Sister"; inglish[14] = "Son";
		spanish[15] = "Hija"; spanish[16] = "Tio"; spanish[17] = "Tia"; spanish[18] = "Sobrino"; spanish[19] = "Sobrina";
		inglish[15] = "Daugther"; inglish[16] = "Uncle"; inglish[17] = "Aunt"; inglish[18] = "Newphew"; inglish[19] = "Niece";
		spanish[20] = "Manzana"; spanish[21] = "Pelota"; spanish[22] = "Gato"; spanish[23] = "Perro"; spanish[24] = "Elefante";
		inglish[20] = "Apple"; inglish[21] = "Ball"; inglish[22] = "Cat"; inglish[23] = "Dog"; inglish[24] = "Elephant";
		spanish[25] = "Pescado"; spanish[26] = "Sombrero"; spanish[27] = "Jugo"; spanish[28] = "Anillo"; spanish[29] = "Reloj";
		inglish[25] = "Fish"; inglish[26] = "Hat"; inglish[27] = "Juice"; inglish[28] = "Ring"; inglish[29] = "Watch";
	}
	public void Traducir(String palabra) {
		int i = 0;
		while (i < 30 && (palabra.compareToIgnoreCase(inglish[i])) != 0) {
			i++;
		}
		if(i > 29) {
			System.out.println("La palabra '" + palabra + "' no se encuentra en el Diccionario");
		} else {
			System.out.println("\n" + palabra + " -> " + spanish[i]);
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