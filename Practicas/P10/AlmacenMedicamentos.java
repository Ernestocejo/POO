public class AlmacenMedicamentos {

	private PrecentacionMedic [] listamedicamento;

	public AlmacenMedicamentos (int tam) {
		//int opcion;
		Precio.iva = 1.16F;
		listamedicamento = new PrecentacionMedic[tam];
		Lector reader = new Lector();
		Imprime imprime = new Imprime();
		for (int i = 0; i < listamedicamento.length ; i ++ ) {
	      //Medicamento medicamento1 = new Medicamento(); 
			PrecentacionMedic medicamento1 = new PrecentacionMedic();
	      imprime.impNombreMedic();
	      medicamento1.setNombre(reader.leeString());

	      imprime.impFormula();
	      medicamento1.setFormula(reader.leeString());

	      imprime.impDosis();
	      medicamento1.setDosis(reader.leeFloat());

	      imprime.impTipoPresentacion();
	      medicamento1.setPresentacion(reader.leeString());
	      
	      imprime.impIDMedic();
	      medicamento1.setId(reader.leeString()); 
	    

	      imprime.impPrecioVenta();
	      medicamento1.getPrecio().setPriceVenta(reader.leeFloat());
	      imprime.impPrecioCompra();
	      medicamento1.getPrecio().setPriceCompra(reader.leeFloat());
	      listamedicamento[i] = medicamento1;
	    }
	}
    public void imprListaUsu() {
    	for (int i = 0; i < listamedicamento.length ; i ++ ) {
    		System.out.println("--------");	
      		System.out.println(listamedicamento[i]);  
      		System.out.println("Precio Compra IVA:" + listamedicamento[i].getPrecio().getPriceCompraIVA());
      		System.out.println("Precio Venta IVA:" + listamedicamento[i].getPrecio().getPriceVentaIVA());
    		System.out.println("--------");
    	}
    }
    /*
    public void switchDosis(int opcion) {
    	Lector reader = new Lector();
    	Medicamento medica = new Medicamento();
    	switch (opcion) {
    		case 1:
    		medica.getDosis().setGramos(reader.leeFloat());
    			break;
    		case 2:
    		medica.getDosis().setMiligramos(reader.leeFloat());
    			break;
    		case 3:
    		medica.getDosis().setMililitros(reader.leeFloat());
    			break;
    		default:
    		System.out.println("Opcion invalida");
    			break;
    	}
    }
    */
}