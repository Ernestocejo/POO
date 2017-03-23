public class Fecha {
	private int dia;
	private int mes;
	private int anio;

	public void asignarFecha(int dia_param, int mes_param, int anio_param) {
		this.dia = dia_param;
		this.mes = mes_param;
		this.anio = anio_param;
	}

	public void obtenerFecha(int [] retorno_fecha) {
		retorno_fecha[0] = dia;
		retorno_fecha[1] = mes;
		retorno_fecha[2] = anio;
	}
	public static void dmaFecha(int[] fecha) {
		System.out.println("Vencimento -> " + fecha[0]+"/"+fecha[1]+"/"+fecha[2]);
	}
}