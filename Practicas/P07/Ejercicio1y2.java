import java.util.*;
public class Ejercicio1y2 {
	private int dia;
	private int mes;
	private int anio;

	//Ejercicio 2
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
	// Ejercicio 1
	public void asignarFecha(int dia_param, int mes_param, int anio_param) {
		this.dia = dia_param;
		this.mes = mes_param;
		this.anio = anio_param;
	}
	public void bisiesto() {
		if(this.anio % 400 == 0) {
			System.out.println("El anio es Bisiesto");
		}else if(this.anio % 4 == 0 && this.anio % 100 != 0) {
			System.out.println("El anio es Bisiesto");
		}else {
			System.out.println("El anio NO es Bisiesto");
			if(this.dia == 29) {
				System.out.println("Por lo tanto Febrero no tiene 29 dias");
			}
		}
	}
	public void valDia() {
		if(this.dia >= 1 && this.dia <= 31) {
		} else {
			System.out.println("El dia es incorrecto");
		} 
	}

	public void valMes() {
		if(this.mes >= 1 && this.mes <= 12) {
			if(this.mes == 2 && this.dia < 30 ) {
				this.bisiesto();
			} else if (this.mes == 2){
				System.out.println("Febrero no tine mas de 28 dias");
			}
			if (this.mes != 4 && this.mes != 6 && this.mes != 9 && this.mes != 11) {
			} else if(this.dia == 31) {
				System.out.println("Este mes no tiene 31 dias");
			}
		}else {
			System.out.println("El mes es incorrecto");
		}
	}
	public void valAnio() {
		if(this.anio >= 1582) {
		} else  {
			System.out.println("El anio es incorrecto");
		}
	}
	public void fechaCorrecta() {
		this.valDia();
		this.valMes();
		this.valAnio();
	}

	public void obtenerFecha(int [] retorno_fecha) {
		retorno_fecha[0] = this.dia;
		retorno_fecha[1] = this.mes;
		retorno_fecha[2] = this.anio;
	}

	public static void dmaFecha(int[] fecha) {
		System.out.println(fecha[0]+"/"+fecha[1]+"/"+fecha[2]);
	}
}