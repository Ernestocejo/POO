import java.io.*;

public class Lector {
	private String dato = "";
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public String leeString() {
		try{
			this.dato = br.readLine();
		}catch (IOException e) {}

		return this.dato;
	}

	public float leeFloat() {
		try{
			return Float.valueOf(br.readLine());
		} catch (IOException e) {}

		return 0.0F;
	}

	public int leeInt() {
		int valor;
		try{
			valor = Integer.valueOf(br.readLine());
			if(valor < 10 ) {
				valor = 10
			}

			return valor;
			//return Integer.valueOf(br.readLine());
		} catch (IOException e) {}

		return 0;
	}
}