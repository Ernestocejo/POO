import java.io.*;

public class Multiplo {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a;
		int b;
		int band;
		int aux;
		int suma;
		try {
			do {
				System.out.println("Introduce primer valor multiplo de 5");
				a = Integer.parseInt(br.readLine());
				if(a % 5 == 0 && a > 0) {
					band = 1;
				}else {
					System.out.println("El Valor no es multiplo de 5");
					band = 0;
				}
				if(a < 0) {
					System.out.println("Nopuedes introducir numeros negativos");
					band = 0;
				}
			}while(band == 0);

			do{
				System.out.println("Introduce segundo valor multiplo de 5");
				b = Integer.parseInt(br.readLine());
				if(b % 5 == 0 && b > 0) {
					band = 1;
				}else {
					System.out.println("El Valor no es multiplo de 5");
					band = 0;
				}
				if(b < 0) {
					System.out.println("Nopuedes introducir numeros negativos");
					band = 0;
				}
			}while(band == 0);

			if(a > b){
				aux = a;
				a = b;
				b = aux;
			}

			suma = a + b;

			System.out.println("La suma es " + suma);
			
		}catch(IOException e) {}

	}
}