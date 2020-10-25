
package proyecto2;

public class Sindicalizado extends PerAdminitrativo {
    protected String sindicato;
    private float sueldo;

    public Sindicalizado(String sindicato, float sueldo, int Antiguedad, String Cargo, String nombre, String domicilio, int telefono) {
        super(Antiguedad, Cargo, nombre, domicilio, telefono);
        this.sindicato = sindicato;
        this.sueldo = sueldo;
    }

    

    public String getSindicato() {
        return sindicato;
    }

    public void setSindicato(String sindicato) {
        this.sindicato = sindicato;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
