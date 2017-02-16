class Operadores {

    public static void main(String[] arg) {
      // tipo de dato primitivo
       int result = 0;
      // tipo de dato referenciado con operador de asignación
     String res = "result ahora es: ";

     // sentencia while con operador de relacion
    	System.out.println(res + (result +=3)); // suma mas asignación
   
     // sentencia if con operador de relación y operadores logicos
     	// operadores de asignación
     	System.out.println(res + (result-=1)); // resta mas asignación
     	System.out.println(res + (result *=2)); // multiplicacion mas asignación
     	System.out.println(res + (result /=2));  // division mas asignación
     	System.out.println(res + (result = 10)); // asignación simple
     	System.out.println(res + (result -= 7 )); // resta mas asignación

  }
}