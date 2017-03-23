public class Medicamento {
	private String nombre;
	private int precio;

	public void asignarMedicamento (String p_nom, int p_pre) {
		this.nombre = p_nom;
		this.precio = p_pre;
	}
	public void prmedica() {
		System.out.print(this.nombre + ", ");
		System.out.println("$" + this.precio);
	}
}