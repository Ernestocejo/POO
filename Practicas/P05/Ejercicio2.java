import java.io.*;
import java.util.Random;
class Ejercicio2 {
	public static void main(String[] args) {
		int numeros [];
		String cadena [];
		int tamaInt, i, aux;
		String termi;

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader flujoE = new BufferedReader(isr);
		PrintStream flujoS = System.out;

		try {
		
			flujoS.println("Cuantos numeros deceas el arreglo");	
			tamaInt = Integer.parseInt(flujoE.readLine());//conviete las cadenas de caracteres en numeros enteros
			
			//inicializo los aarreglos
			numeros = new int [tamaInt];
			cadena = new String [tamaInt];
			Random rnd = new Random(); //declro un random para llenar el arreglo con nueros aleatorios

			flujoS.println("");
			//lleno el arreglo con numeros aleatorios
			for(i=0; i<tamaInt; i++) {
				numeros[i] = (int)(rnd.nextDouble()*300 + 1);
				flujoS.println(numeros[i]); 
			}
			flujoS.println("");

			flujoS.println("Que terminacion quieres que se indique");
			termi = flujoE.readLine();
			
			//Se concatena la cadena
			for(i=0;i<tamaInt; i++){
				cadena[i] = "";
				cadena[i] = cadena[i] +  numeros[i]; 
			}

			flujoS.println("");
			flujoS.println("Se muestran");

			//se compara con la ultima ocurrncia en este caso el dato ingresado por el usuario
			for(i=0; i<tamaInt; i++ ) {
				//flujoS.println(cadena[i].lastIndexOf(termi));
				if(cadena[i].lastIndexOf(termi)>0 && cadena[i].lastIndexOf(termi) != 0) {
					flujoS.println(cadena[i]);
				}
			}			
		}catch(IOException e){}
	}
}