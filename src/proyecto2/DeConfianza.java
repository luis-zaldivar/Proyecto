package proyecto2;

public class DeConfianza extends PerAdminitrativo {
    private String contrato;
    protected  int edad;

    public DeConfianza(String contrato, int edad, int Antiguedad, String Cargo, String nombre, String domicilio, String telefono) {
        super(Antiguedad, Cargo, nombre, domicilio, telefono);
        this.contrato = contrato;
        this.edad = edad;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
