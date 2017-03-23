public class Ejercicio1y2Test {
	public static void main(String[] args) {
		
		//ejercicio 1
		Ejercicio1y2 fecha = new Ejercicio1y2();
		int gua_fecha[] = new int [3];
		fecha.asignarFecha(6,7,1990);
		fecha.obtenerFecha(gua_fecha);

		//ejercicio 2
		Ejercicio1y2 fecha2 = new Ejercicio1y2();
		int fecha_hoy[] = new int [3];
		fecha2.asignarFecha();
		fecha2.obtenerFecha(fecha_hoy);

		Ejercicio1y2 fecha3 = new Ejercicio1y2();
		int pi_dia[] = new int [3];
		fecha3.asignarFecha(4);
		fecha3.obtenerFecha(pi_dia);

		Ejercicio1y2 fecha4 = new Ejercicio1y2();
		int pi_dia_mes[] = new int [3];
		fecha4.asignarFecha(30,4);
		fecha4.obtenerFecha(pi_dia_mes); 

		System.out.println("\n--------------\n");
		fecha.fechaCorrecta();
		Ejercicio1y2.dmaFecha(gua_fecha);

		System.out.println("\n-----fecha actual---------\n");
		fecha2.fechaCorrecta();
		Ejercicio1y2.dmaFecha(fecha_hoy);

		System.out.println("\n-----mes y anio actual---------\n");
		fecha3.fechaCorrecta(); 
		Ejercicio1y2.dmaFecha(pi_dia);

		System.out.println("\n------anio actual--------\n");
		fecha4.fechaCorrecta();
		Ejercicio1y2.dmaFecha(pi_dia_mes);
		
	}
}