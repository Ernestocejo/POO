import java.io.*;
public class Medicamento {
 	private String nom_comercil;
 	private String nom_generico;
 	private int cantidad;

 	private InputStreamReader isr = new InputStreamReader(System.in);
	private BufferedReader br = new BufferedReader(isr);

 	public Medicamento () {
 		//setMedicamento();
 	}

 	public void setMedicamento() {
 		try {
 			System.out.println("Nombre comercial");
 			this.nom_comercil = br.readLine();
 			System.out.println("Nombre Generico");
 			this.nom_generico = br.readLine();
 			System.out.println("Cantidad del producto");
 			this.cantidad = Integer.parseInt(br.readLine());
 		}catch (IOException e) {}
 	}

 	public String getMedicamento(String lista) {
 			lista = this.nom_comercil + "," + this.nom_generico + "," + cantidad;
 		return lista;
 	}
 	
 	/*
 	public String[] getMedicamento(String lista[]) {
 		int i;
 		for(i = 0; i < 2; i++) {
 			lista[i] = this.nom_comercil + ", " + this.nom_generico + ", " + cantidad;
 		}
 		return lista;
 	}
 	*/
 	/*
 	public void imprime(int tam, String [] med) {
 		int i;
 		for(i=0;i < 2;i++) {
 			System.out.println(med[i]);
 		}
 	}
 	*/
 }