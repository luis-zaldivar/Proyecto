package proyecto2;

import java.io.IOException;


public class Docente extends Integrantes {
    private int añosExperiencia;
    private String Especialidad;
    

    
    public Docente(int añosExperiencia, String Especialidad, String nombre, String domicilio, String telefono) {
        super(nombre, domicilio, telefono);
        this.añosExperiencia = añosExperiencia;
        this.Especialidad = Especialidad;
    }

    public int getAñosExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String Especialidad) {
        this.Especialidad = Especialidad;
    }
    
    

}
