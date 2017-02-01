public class Vglobales{
   /*declaracion de variables globales
    * se declaran variables globales usando metodo static
    */
	//tipos primitivos enteros
   static byte by1 = -128;  // va del -128 al 127
    static byte by2 = 127; 
    static short $sho1 = -32768; // va del -32768 al 32767
    static short _sho2 = 32767;
    static int in1 = -2147483648; // va del -2147483648 al 2147483647
    static int in2 =  2147483647;
    static long lon1 = -9223372036854775808L; // va dle -9223372036854775808 al 9223372036854775807
    static Long lon2 = 9223372036854775807L;
    static char _h = 'H'; //uso de comillas simples para un solo caracter
    static char _o = 'o';
    static char _l = 'l';
    static char _a = 'a';
    static boolean bf = false;
    static boolean bt = true;

    //tipos primitivos Reales
    static float flo = -3.402823E38F; // de 6 a 7 cifras decimales equivalentes 
    static double dou = 478633/22F; // unas 15 cifras equivalentes

    //tipos primitivos referenciados clases string
    static String _st = "Null"; // comillas dobles para los objetos de la clase STRING
    static String _st1 = "Hola JAVA";

	public static void main(String[] arg){
		
  // Mandamos a iprimir por pantalla todas las vareables declaradas e inisializadas como glabales
    System.out.println("byte va del: " + by1 + " al " + by2);
    System.out.println("short va del: " + $sho1 + " al " + _sho2);
    System.out.println("int va del: " + in1 + " al " + in2);
    System.out.println("long va del: " + lon1 + " al: " + lon2);
    System.out.println("char es: " + _h + _o + _l + _a);
    System.out.println("boolean: " + bf + " ó " + bt);
    System.out.println("float es: " + flo);
    System.out.println("double es: " + dou);
	    System.out.println("String es: " + _st);
	    System.out.println("String es: " + _st1);

	}
}