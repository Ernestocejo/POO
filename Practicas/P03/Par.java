import java.util.Scanner;
class Par {

    public static void main(String[] arg) {
       Scanner entrada = new Scanner(System.in);
       String even = "Even";
       String odd = "Odd";
       String elnum = "El numero ";

         System.out.println("Dame dato a validar positivo");
       int numero = entrada.nextInt();
       int modu = numero % 2;

      		if (modu != 0) { // sentencia if 
        		System.out.println(elnum + numero + " " + odd);
      		} else System.out.println(elnum + numero + " " + even);
    }

}