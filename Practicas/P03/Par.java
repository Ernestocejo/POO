import java.util.Scanner;
class Par {

    public static void main(String[] arg) {
      //declaro variables de tipo primitivo
      int num = 1000, i;
      int resu = 0;
      // declaro arrays
      int par[]; 
      int imp[];

      par = new int[num];
      imp = new int[num];
     

     //recorro el array para comprovar si un numero es par o no
      for(i=0; i < num; i++) {
        resu = i % 2;
        if(resu == 0){
          par[i] = i;
        }else imp[i] = i;
      }
       System.out.println("\n");
    // muestro por pantalla los numeros pares
      System.out.println("Los numeros pares son\n");
      for(i=0; i < num; i++) {
        if(par[i] == 0) {

        }else {  
          System.out.printf("\'" + par[i] + ", \t" + " ");//utilizo printf para que no me de nueva linea (\n)
        } 
      }

      System.out.println("\n");
      // muestro poo pantalla lon numeros que no son par
      System.out.println("Los numeros impares son\n");
      for(i=0; i < num; i++) {
        if(imp[i] == 0) {

        }else {  
          System.out.printf("\'" + imp[i] + ", \t" + " "); //utilizo printf para que no me de nueva linea (\n)
        } 
      }
         
      /*
        ESTA ES OTRA FORMA DE SAVER SI UN NUMERO ES PAR O NO

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
          */
    }

}