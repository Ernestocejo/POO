public class Almacen {
	private String [][] estante;

	public Almacen () {
		int i;
		int j;
		this.estante = new String [5][3];
		for(i=0;i<5; i++) {
			for(j=0;j<3;j++) {
				this.estante[i][j] = " ";
			}
		}
	}

	public void getAlmacen(String lista) {
		int i,j;
		for(i=0;i<5; i++) {
			for(j=0;j<3;j++) {
				if(this.estante[i][j] == " ") {
					this.estante[i][j] = lista;
					i=20;
					j=20;
				}	
			}
			System.out.println("");
		}
	}

	public void impAlmacen () {
		int i,j;
		for(i=0;i<5; i++) {
			for(j=0;j<3;j++) {
				if(this.estante[i][j] != " ") {
					System.out.print("[ " + this.estante[i][j] + " ]" + ",");
				}
			}
			System.out.println("");
		}
	}

}