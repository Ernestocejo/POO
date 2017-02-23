import java.io.*;
class Alumno {
	public static void main(String[] args) {
		float calific [];
		String nombre [];
		String rep = "Reprobado";
		String bie = "Bien";
		String not = "Notable";
		String sobre = "Sobresaliente";
		int tamaInt, i, aux;

		//Declaracion de los flujos Estandar de E/S
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader flujoE = new BufferedReader(isr);
		PrintStream flujoS = System.out;

		try {

			flujoS.println("Cuantos Alumnos deseas ingresar");
			// conviete el texto  en numeros enteros
			tamaInt = Integer.parseInt(flujoE.readLine());

			//inicializo lor arrays
			nombre = new String [tamaInt];
			calific = new float [tamaInt]; 

			//La Sentencia do...while sirve para poner un limite en el rango de calificaciones
			do { 
				//para salir de la sentencia do...while
				aux = 1;
				//lleno los arreglos solicitando nombre y calificacion del alumno
				for(i=0;i<tamaInt;i++){
					flujoS.println("Nombre del Alumno");
					nombre[i] = flujoE.readLine();
					flujoS.println("Su calificacion");
					calific[i] = Float.parseFloat(flujoE.readLine());// conviete el texto  en numero Decimal
					if(calific[i] < 0 || calific[i] > 10){
						flujoS.println("Recuerde que la clificacion no pude ser ");
						flujoS.println("menor que '0' (cero) ni mayor que '10' (diez)");
						flujoS.println("Intente de nuevo");
						flujoS.println("\nSu calificacion es");
						calific[i] = Float.parseFloat(flujoE.readLine());
						aux = 0;
					}
				}
			}while(aux != 0);

			//recorro los arreglos para su salida Estandar(pantalla)
			//utilizo Sentencias if para saber que nota les corresponde	
			for(i=0; i<tamaInt; i++) {
				if(calific[i] >= 0 && calific[i] <= 4.99){
					flujoS.println(nombre[i] + ", Calific. " + calific[i] + ", " + rep);
				}
				if(calific[i] >= 5 && calific[i] <= 6.99) {
					flujoS.println(nombre[i] + ", Calific. " + calific[i] + ", " + bie);
				}
				if(calific[i] >= 7 && calific[i] <= 8.99) {
					flujoS.println(nombre[i] + ", Calific. " + calific[i] + ", " + not);	
				}
				if(calific[i] >= 9 && calific[i] <= 10) {
					flujoS.println(nombre[i] + ", Calific. " + calific[i] + ", " + sobre);
				}
			}//fin del for
		}catch(IOException e) {}
	}
}