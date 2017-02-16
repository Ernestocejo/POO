class Uber {
	public static void main(String[] arg) {
    float driveDistances[] = {8,7,9,7,8};
    float currentGasLevel = 4; // gas
    float avgMileage = 50; // kilometraje
    int horas = 12; //horas
    int i;
    float distancia = 0; // es la suma de las distintas total recorrida
    float gasPromedio = 4; 
    boolean gasPrediction; 
  
    //un galon equivale 0.2641720512415584
    //convierto a millas y asigno
    for(i = 0; i<5; i++) {
       driveDistances[i] *= 0.62137; //una milla equivale a 0.62137
       distancia += driveDistances[i];
    }
      // promedio del consumo de gas por hora
       gasPromedio *= horas;
       gasPromedio /= 100;

       //El kilometraje se mide en millas por galón muestra cuántas millas un vehículo puede Viajar en un galón de gas.
       avgMileage *= 0.62137;
       avgMileage *= 0.26417;

       //boolean
       gasPrediction = (gasPromedio > currentGasLevel);
     
       System.out.println("¿Nesecita gas? " + gasPrediction);
       System.out.println("La distancia recorrida es igual a: "+ distancia + " millas");
       System.out.println("En promedio el conductor gasta " + gasPromedio + "g de gas por hora");
       System.out.println("Un veiculo pude viajar " + avgMileage + " millas con un galon de gas");
       System.out.println(driveDistances[driveDistances.length -5]); //para entrar en el arreglo

	}
}