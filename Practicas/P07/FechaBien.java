public class FechaBien {
	public static void main(String[] args) {
		System.out.println("Fecha de Actual");
		Fecha fecha = new Fecha();
		int ret_fecha[] = new int[3];
		fecha.asignarFecha();
		fecha.obtenerFecha(ret_fecha);
		if(fecha.valFecha() == 0) {
			Fecha.dmaFecha(ret_fecha);
		}
		System.out.println("\nMes y Anio Actual");
		Fecha fecha2 = new Fecha();
		int ret_dia[] = new int[3];
		fecha2.asignarFecha(0);
		fecha2.obtenerFecha(ret_dia);
		if(fecha2.valFecha() == 0) {
			Fecha.dmaFecha(ret_dia);
		}
		System.out.println("\nAnio Actual");
		Fecha fecha3 = new Fecha();
		int ret_dia_mes[] = new int[3];
		fecha3.asignarFecha(0,0);
		fecha3.obtenerFecha(ret_dia_mes);
		if(fecha3.valFecha() == 0) {
			Fecha.dmaFecha(ret_dia_mes);
		}
		System.out.println("\nIngresa una Fecha");
		Fecha fecha4 = new Fecha();
		int in_fecha[] = new int [3];
		fecha4.ingresaFecha();
		fecha4.obtenerFecha(in_fecha);
		if(fecha4.valFecha() == 0) {
			Fecha.dmaFecha(in_fecha);
		}
	}
}