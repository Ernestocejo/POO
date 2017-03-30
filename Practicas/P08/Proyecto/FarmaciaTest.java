public class FarmaciaTest {
	public static void main(String[] args) {
		Medicamento s_Medico = new Medicamento ();
		Almacen almacena = new Almacen();
		OtroMedica otro_M = 	new OtroMedica();
		String obtencad = new String ("");

		s_Medico.setMedicamento();
		almacena.getAlmacen(s_Medico.getMedicamento(obtencad));

		while(otro_M.otro_Medicamento()) {
			s_Medico.setMedicamento();
			almacena.getAlmacen(s_Medico.getMedicamento(obtencad));
		}	
		almacena.impAlmacen();
	}
}