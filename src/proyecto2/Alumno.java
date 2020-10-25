package proyecto2;

public class Alumno extends Integrantes {
    private int numCuenta;
    public String licenciatura;

    public Alumno(int numCuenta, String licenciatura, String nombre, String domicilio, int telefono) {
        super(nombre, domicilio, telefono);
        this.numCuenta = numCuenta;
        this.licenciatura = licenciatura;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getLicenciatura() {
        return licenciatura;
    }

    public void setLicenciatura(String licenciatura) {
        this.licenciatura = licenciatura;
    }
    
    
    
}
