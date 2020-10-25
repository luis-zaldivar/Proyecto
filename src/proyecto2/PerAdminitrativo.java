package proyecto2;

public class PerAdminitrativo extends Integrantes {
    protected int Antiguedad;
    private String Cargo;

    public PerAdminitrativo(int Antiguedad, String Cargo, String nombre, String domicilio, String telefono) {
        super(nombre, domicilio, telefono);
        this.Antiguedad = Antiguedad;
        this.Cargo = Cargo;
    }

    public int getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(int Antiguedad) {
        this.Antiguedad = Antiguedad;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }
    
    
}
