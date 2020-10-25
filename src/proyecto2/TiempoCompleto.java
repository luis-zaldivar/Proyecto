package proyecto2;

public class TiempoCompleto extends Docente{
    public int horas;
    protected String grado;
    //Variables para acceder a las privadas
    
    

 
    public TiempoCompleto(int horas, String grado, int añosExperiencia, String Especialidad, String nombre, String domicilio, int telefono) {
        super(añosExperiencia, Especialidad, nombre, domicilio, telefono);
        this.horas = horas;
        this.grado = grado;
    }
     
    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    
 
    
}
