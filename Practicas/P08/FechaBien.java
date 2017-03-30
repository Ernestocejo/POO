public class FechaBien {
	public static void main(String[] args) {

		System.out.println("Fecha Actual con el constructor");
		Fecha fecha_5 = new Fecha();
		int ret_fecha_5[] = new int[3];
		fecha_5.obtenerFecha(ret_fecha_5);
		if(fecha_5.valFecha() == 0) {
			Fecha.dmaFecha(ret_fecha_5);
		}

		System.out.println("\nSe ingresa Dia, con el constructor");
		Fecha fecha_6 = new Fecha(0);
		int ret_fecha_6[] = new int[3];
		fecha_6.obtenerFecha(ret_fecha_6);
		if(fecha_6.valFecha() == 0) {
			Fecha.dmaFecha(ret_fecha_6);
		}
		System.out.println("\nSe ingresa Dia y Mes, con el constructor");
		Fecha fecha_7 = new Fecha(0,0);
		int ret_dia_mes_7[] = new int[3];
		fecha_7.obtenerFecha(ret_dia_mes_7);
		if(fecha_7.valFecha() == 0) {
			Fecha.dmaFecha(ret_dia_mes_7);
		}

		fecha_5 = null;
		fecha_6 = null;
		fecha_7 = null;
		System.gc();
		System.out.println("Despues de System.gc()");

		/*
		System.out.println("Fecha de Actual");
		Fecha fecha_1 = new Fecha();
		int ret_fecha[] = new int[3];
		fecha_1.asignarFecha();
		fecha_1.obtenerFecha(ret_fecha);
		if(fecha_1.valFecha() == 0) {
			Fecha.dmaFecha(ret_fecha);
		}
		
		System.out.println("\nMes y Anio Actual");
		Fecha fecha_2 = new Fecha();
		int ret_dia[] = new int[3];
		fecha_2.asignarFecha(0);
		fecha_2.obtenerFecha(ret_dia);
		if(fecha_2.valFecha() == 0) {
			Fecha.dmaFecha(ret_dia);
		}
		System.out.println("\nAnio Actual");
		Fecha fecha_3 = new Fecha();
		int ret_dia_mes[] = new int[3];
		fecha_3.asignarFecha(0,0);
		fecha_3.obtenerFecha(ret_dia_mes);
		if(fecha3.valFecha() == 0) {
			Fecha.dmaFecha(ret_dia_mes);
		}
		System.out.println("\nIngresa una Fecha");
		Fecha fecha_4 = new Fecha();
		int in_fecha[] = new int [3];
		fecha_4.ingresaFecha();
		fecha_4.obtenerFecha(in_fecha);
		if(fecha_4.valFecha() == 0) {
			Fecha.dmaFecha(in_fecha);
		}
		*/
	}
}