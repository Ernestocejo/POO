import java.util.*;
public class Ejercicio2 {
	private int dia;
	private int mes;
	private int anio;

	public void asignarFecha() {
		Calendar fecha = new GregorianCalendar();
		this.dia = fecha.get(Calendar.DAY_OF_MONTH);
		this.mes = fecha.get(Calendar.MONTH) + 1;
		this.anio = fecha.get(Calendar.YEAR);
	}
	public void asignarFecha(int p_dia) {
		this.asignarFecha();
		this.dia = p_dia;
	}
	public void asignarFecha(int p_dia, int p_mes) {
		this.asignarFecha();
		this.dia = p_dia;
		this.mes = p_mes;	
	}
	//public void asignarFecha(int dia_param, int mes_param, int anio_param) {
	//	this.dia = dia_param;
	//	this.mes = mes_param;
	//	this.anio = anio_param;
	//}
}