import java.util.*;
import java.io.*;
public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	private String f_expiracion;
	private InputStreamReader isr = new InputStreamReader(System.in);
	private BufferedReader br = new BufferedReader(isr);

	public Fecha() {
		try {
			System.out.println("Ingresa fecha de vigencia del medicamento dd/mm/aaaa");
			this.f_expiracion = br.readLine();
		}catch(IOException e){}
	}

	public void getFecha(String fecha){
		fecha = f_expiracion;

	}

	public void setFecha() {
		try {
			System.out.print("Ingresa fecha de vigencia del medicamento");
			System.out.print("Ingresa dia -> ");
			this.dia = Integer.parseInt(br.readLine());
			System.out.print("Ingresa mes -> ");
			this.mes = Integer.parseInt(br.readLine());
			System.out.print("Ingresa anio -> ");
			this.anio = Integer.parseInt(br.readLine());
		} catch (IOException e) {}
	}
	//para la fecha atual	
	public void asignarFecha() {
		Calendar fecha = new GregorianCalendar();
		this.dia = fecha.get(Calendar.DAY_OF_MONTH);
		this.mes = fecha.get(Calendar.MONTH) + 1;
		this.anio = fecha.get(Calendar.YEAR);
	}
	public int bisiesto() {
		//int bi_anio[] = new int [3];
		if(this.anio % 400 == 0) {
			System.out.println("El anio es Bisiesto");
		}else if(this.anio % 4 == 0 && this.anio % 100 != 0) {
			System.out.println("El anio es Bisiesto");
		}else {
			System.out.println("El anio NO es Bisiesto");
			if(this.dia == 29) {
				System.out.println("Por lo tanto Febrero no tiene 29 dias");
				return 1;
			}
		}
		return 0;
	}

	public int valFecha() {
		if (valDia() == 0 && valMes() == 0 && valAnio() == 0) {
			//System.out.println("Fecha correcta");
		} else return 1;
		return 0;
	}

	public int valDia() {
		if(this.dia >= 1 && this.dia <= 31) {
		} else {
			System.out.println("El dia es incorrecto");
			return 1;
		} 
		return 0;
	}
	public int valMes() {
		if(this.mes >= 1 && this.mes <= 12) {
			if(this.mes == 2 && this.dia < 30 ) {
				if (bisiesto() == 0) {
				}else return 1;
			} else if (this.mes == 2){
				System.out.println("Febrero no tine mas de 28 dias");
				return 1;
			}
			if (this.mes != 4 && this.mes != 6 && this.mes != 9 && this.mes != 11) {
			} else if(this.dia == 31) {
				System.out.println("Este mes no tiene 31 dias");
				return 1;
			}
		}else {
			System.out.println("El mes es incorrecto");
			return 1;
		}
		return 0;
	}

	public int valAnio() {
		if(this.anio >= 1582) {
		} else  {
			System.out.println("El anio es incorrecto");
			return 1;
		}
		return 0;
	}

	public void obtenerFecha(int [] retorno_fecha) {
		retorno_fecha[0] = dia;
		retorno_fecha[1] = mes;
		retorno_fecha[2] = anio;
	}
}