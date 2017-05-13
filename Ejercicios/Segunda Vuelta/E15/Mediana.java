import java.io.*;

public class Mediana {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] mediana;
		int tam;
		int i, j;
		int aux;
		
		try {
			do {
				System.out.println("Cuantos Numeros a Ingresar");
				tam = Integer.parseInt(br.readLine());
				if(tam % 2 == 0) {
					System.out.println("La lista deve deser un numero inpar");
					System.out.println("Intenta de de Nuevo");
					System.out.println("");
				}
			}while(tam % 2 == 0);

			mediana = new int [tam];

			for(i=0; i< mediana.length;i++) {
				System.out.print("Ingresa Numero -> ");
				mediana[i] = Integer.parseInt(br.readLine());
			}

			for(i=0; i < mediana.length;i++) {
				for (j = i + 1; j < mediana.length; j++) {
					if(mediana[i] > mediana[j]) {
						aux = mediana[i];
						mediana[i] = mediana[j];
						mediana[j] = aux;
					}
				}
			}

			System.out.println("");
			for(i=0; i < mediana.length;i++) {
				System.out.print(mediana[i] + ", ");
			}

			System.out.println("\n\nLa mediana es " + mediana[tam/2]);
		}catch(IOException e) {}
	}
}