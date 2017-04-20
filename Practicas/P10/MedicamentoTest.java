public class MedicamentoTest{


  public static void main(String []args){
    int tamMedi;
    Lector reader = new Lector();
    //Precio.iva = 1.16F;
    System.out.println("Cuantos medicamentos a introducir ");
    tamMedi = reader.leeInt();
    AlmacenMedicamentos medicamento1 = new AlmacenMedicamentos(tamMedi);
    medicamento1.imprListaUsu();
    medicamento1.toString();
  }
}