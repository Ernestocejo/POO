import java.util.Scanner;
class Switch {
	public static void main(String[] arg){
		Scanner entrada = new Scanner(System.in);
		// declaracion e inicializacion de tipo referenciados
		String ene = "January";
		String febr = "February";
		String marz = "March";
		String abr = "April";
		String mayo = "May";
		String juni = "June";
		String juli = "July";
		String agos= "August";
		String sept = "September";
		String octu = "October";
		String novi = "November";
		String dici = "December";
		// declaro e inicializo un tipo primitivo con operador de asignacion simple
		int salir = 0;
		/* imprimo por pantalla un menu a seleccionar opcion.
		* el do..while lo ocupo para salir del menu
		*/
	do{
		System.out.println("\n-----------------------------\n");
		System.out.println("Select the month you want to know the days\n");
		System.out.println(ene);
		System.out.println(febr);
		System.out.println(marz);
		System.out.println(abr);
		System.out.println(mayo);
		System.out.println(juni);
		System.out.println(juli);
		System.out.println(agos);
		System.out.println(sept);
		System.out.println(octu);
		System.out.println(novi);
		System.out.println(dici);
		System.out.println("exit");
		System.out.println("\n-----------------------------\n");
		String mes = entrada.nextLine();	
		//comienso de la estructura switch
	
		switch (mes) {
			case "january":
				System.out.println("The month " + ene + " has 31 day ");
				break;
			case "February":
				System.out.println("The month " + febr + " has 28 days");
				System.out.println("if you want to know if leap year enters the year, otherwise prees 1");//Si quieres saber si es bisiesto ingresa el año de lo contrario oprime 1 
                int ano = entrada.nextInt();
                int res1 = ano % 400;
				int res2 = ano % 4;
				int res3 = ano % 100;
				/* sentensia if que nos dira si es bisiesto o no.
				* ya que Un año es bisiesto si es múltiplo de 4, 
				* exceptuando los múltiplos de 100, que sólo son bisiestos
				* cuando son múltiplos además de 400.
				*/
				if(ano == 1) { // ocupo operadores de relacion
				}else if(res1 == 0) {
					System.out.println("The year is leap year " + ano + " and has 29 days " + febr);
				}else if (res2 == 0 && res3 != 0) { // un operador de relacion y con un operador logico 
					System.out.println("The year is leap year " + ano + " and has 29 days " + febr);
				}else System.out.println("The year is not leap year " + ano + " and has 28 days " + febr);

				break;
			case "March":
				System.out.println("The month " + marz + " has 31 days ");
				break;
			case "April":
				System.out.println("The month " + abr + " has 30 days ");
				break;
			case "May":
				System.out.println("The month " + mayo + " has 31 days ");
				break;
			case "June":
				System.out.println("The month " + juni + " has 30 days");
				break;
			case "July":
				System.out.println("The month " + juli + " has 31 days ");
				break;
			case "August":
				System.out.println("The month " + agos + " has 31 days ");
				break;
			case "September":
				System.out.println("The month " + sept + " has 30 days");
				break;
			case "October":
				System.out.println("The month " + octu + " has 31 days ");
				break;
			case "November":
				System.out.println("The month " + novi + " has 30 days");
				break;
			case "December":
				System.out.println("The month " + dici + " has 31 day ");
				break;
			case "exit":
                 salir += 1; // operador de asignacion, suma mas asigna
				break;
			default:
				System.out.println("Invalid option");
				break;

         }
     }while(salir == 0); // operador de relacion
	} 
}