class Meses {

	public static void main(String[] arg) {
       // declaro e inicializo datos de tipo refrenciados 
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
		// declaro e inicializo datos de tipo primitivo 
		int jan = 1, feb = 2, mar = 3, apr = 4, may = 5, jun = 6;
		int jul = 7, agu = 8, sep = 9, oct = 10, nov = 11, dec = 12;
        // realiso sentencia if y muestro por pantalla
		if(jan == 1) {
			System.out.println("The number " + jan + " it's the month of " + ene);
			if(feb == 2) {
				System.out.println("The number " + feb + " it's the month of " + febr);
				if(mar >= 3) {
					System.out.println("The number " + mar + " it's the month of " + marz);
					if(apr <= 4) {
						System.out.println("The number " + apr + " it's the month of " + abr);
						if(may == 5) {
							System.out.println("The number " + may + " it's the month of " + mayo);
							if(jun <= 6) {
								System.out.println("The number " + jun + " it's the month of " + juni);
								if(jul >= 7) {
									System.out.println("The number " + jul + " it's the month of " + juli);
									if(agu == 8) {
										System.out.println("The number " + agu + " it's the month of " + agos);
										if(sep <= 9) {
											System.out.println("The number " + sep + " it's the month of " + sept);
											if(oct >= 10) {
												System.out.println("The number " + oct + " it's the month of " + octu);
												if(nov == 11) {
													System.out.println("The number " + nov + " it's the month of " + novi);
													if(dec <= 12) {
														System.out.println("The number " + dec + " it's the month of " + dici);
													} else System.out.println("Invalid option");
												}else System.out.println("Invalid option");
											}else System.out.println("Invalid option");
										}else System.out.println("Invalid option");
									}else System.out.println("Invalid option");
								}else System.out.println("Invalid option");
							}else System.out.println("Invalid option");
						}else System.out.println("Invalid option");
					}else System.out.println("Invalid option");
				}else System.out.println("Invalid option");
			}else System.out.println("Invalid option");
		}  else System.out.println("Invalid option");
	}
}