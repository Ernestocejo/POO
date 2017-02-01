public class Vlocales{
    public static void main(String[] arg) {
    //tipos primitivos enteros
    byte by1 = -128;  // va del -128 al 127
    byte by2 = 127;
    short $sho1 = -32768; // va del -32768 al 32767
    short _sho2 = 32767;
    int in1 = -2147483648; // va del -2147483648 al 2147483647
    int in2 =  2147483647;
    long lon1 = -9223372036854775808L; // va dle -9223372036854775808 al 9223372036854775807
    Long lon2 = 9223372036854775807L;
    char var5 = '2'; //uso de comillas simples para un solo caracter
    
    //tipos primitivos Reales
    float flo = -3.402823E38F; // de 6 a 7 cifras decimales equivalentes 
    double dou = 478633/22F; // unas 15 cifras equivalentes

    //tipos primitivos referenciados clases string
    String var6 = "Null"; // comillas dobles para los objetos de la clase STRING
    String var7 = "Hola JAVA";
     
     // Mandamos a iprimir por pantalla todas las vareables declaradas e inisializadas
    System.out.println("byte va del: " + by1 + " al " + by2);
    System.out.println("short va del: " + $sho1 + " al " + _sho2);
    System.out.println("int va del: " + in1 + " al " + in2);
    System.out.println("long va del: " + lon1 + " al: " + lon2);
    System.out.println("char es: " + var5);
    System.out.println("float es: " + flo);
    System.out.println("double es: " + dou);
	    System.out.println("String es: " + var6);
	    System.out.println("String es: " + var7);	

    }

}