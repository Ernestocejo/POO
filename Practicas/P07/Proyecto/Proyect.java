public class Proyect {
	public static void main(String[] args) {
		Medicamento pildo = new Medicamento();
		Fecha fech = new Fecha();
		int fet [] = new int [3];

		pildo.asignarMedicamento("Paracetamol",120);
		fech.asignarFecha(3,6,2007);
		fech.obtenerFecha(fet);
		pildo.prmedica();
		Fecha.dmaFecha(fet);

	}
}