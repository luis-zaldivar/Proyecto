package proyecto2;

public class DeAsignatura extends Docente {
    public String turno;
    private int numMaterias;

    public DeAsignatura(String turno, int numMaterias, int añosExperiencia, String Especialidad, String nombre, String domicilio, int telefono) {
        super(añosExperiencia, Especialidad, nombre, domicilio, telefono);
        this.turno = turno;
        this.numMaterias = numMaterias;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getNumMaterias() {
        return numMaterias;
    }

    public void setNumMaterias(int numMaterias) {
        this.numMaterias = numMaterias;
    }
    
    
}
