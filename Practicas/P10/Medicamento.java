import java.io.*;
import java.util.*;

public class Medicamento{

    private String id;
    private String nombre;
    //private String formula;
    private Precio precio;
   // private Dosis  dosis;

    public Medicamento() { 
        precio = new Precio();
        //dosis = new Dosis();
    }

    public void setId(String id_p) {
        this.id = id_p;
    }

    public String getId() {
        return this.id;
    }

    public void setNombre(String nombre_p) {
        this.nombre = nombre_p;
    }

    public String getNombre() {
        return this.nombre;
    }
    /*
    public void setFormula(String formula_p) {
        this.formula = formula_p;
    }
    public String getFormula() {
        return this.formula;
    }
    */
    public Precio getPrecio() {
        return this.precio;
    } 
    /*
    public Dosis getDosis() {
        return this.dosis;
    }
    */

    public String toString() {
        return ("El medicamento es: "+ this.nombre) + 
        //("\nFormula: " + this.formula) +
        ("\nEl ID_numerico del medicamento es: "+ this.id) +
        ("\nEl precio del medicamento "+ this.precio);
        //("\nDosis " + this.dosis);
    }
}