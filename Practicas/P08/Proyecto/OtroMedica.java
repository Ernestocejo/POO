import java.io.*;
public class OtroMedica {
	private  String verdad;

	private InputStreamReader isr = new InputStreamReader(System.in);
	private BufferedReader br = new BufferedReader(isr);

	public boolean otro_Medicamento() {
 		try {
    		System.out.println("Presiona 's' si deseas ingresar otro Medicamento");
            this.verdad = br.readLine();
            return verdad.equalsIgnoreCase("s");
    		//this.verdad = (char)br.read();
            //return verdad.equals('s');
    		//return this.verdad == 's' || this.verdad == 'S';  //.equalsIgnoreCase("s");
    	}catch (IOException e){}
    	return false;
	}
}