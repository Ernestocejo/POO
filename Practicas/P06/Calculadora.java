import java.io.*;
public class Calculadora {
	private double suma;
	private double resta;
	private double multiplicar;
	private double dividir;

	public double Sumar(double a, double b) {
		return suma = a + b;
	}
	public double Restar(double a, double b) {
		return resta = a - b;
	}
	public double Multiplicar(double a, double b) {
		return multiplicar = a * b;
	}
	public double Dividir(double a, double b) {
		 dividir = a / b;
		 return dividir;
	}
	public void Salir() {
		System.out.println("Fin del Programa");
	}

	public void Menu() {
			System.out.println("1.- Sumar");
			System.out.println("2.- Restar");
			System.out.println("3.- Multiplicar");
			System.out.println("4.- Dividir");
			System.out.println("5.- Salir");
	}
	public static void main(String[] args) {
		int opcion;
		double dato1, dato2;
		Calculadora Operacion = new Calculadora();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader flujoE = new BufferedReader(isr);
		try {
			do {
				Operacion.Menu();
				System.out.print("Seleccione la opcion deseada: ");
				opcion = Integer.parseInt(flujoE.readLine());
				if (opcion == 5 ) {
					System.out.println("------------");
				 	Operacion.Salir();
				}else {
					System.out.print("Dato 1: ");
					dato1 = Double.parseDouble(flujoE.readLine());
					System.out.print("Dato 2: ");
					dato2 = Double.parseDouble(flujoE.readLine());
					if(opcion == 1) {
						System.out.println("Resultado: " + Operacion.Sumar(dato1,dato2));
					}		
					if(opcion == 2) {	
						System.out.println("Resultado: " + Operacion.Restar(dato1,dato2));
					}		
					if(opcion == 3) {
						System.out.println("Resultado: " + Operacion.Multiplicar(dato1,dato2));
					}		
					if(opcion == 4 && dato2 != 0) {
						System.out.println("Resultado: " + Operacion.Dividir(dato1,dato2));
					}else if (dato2 == 0) System.out.println("No se puede dividir entre 0");

					System.out.println("-------");		
				}
			}while (opcion > 0 && opcion < 5);
		} catch (IOException e) {}
	}
}