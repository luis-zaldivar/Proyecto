package proyecto2;

public class Directivos extends PerAdminitrativo{
        protected String Horario;
        public String laborprincipal;

    public Directivos(String Horario, String laborprincipal, int Antiguedad, String Cargo, String nombre, String domicilio, int telefono) {
        super(Antiguedad, Cargo, nombre, domicilio, telefono);
        this.Horario = Horario;
        this.laborprincipal = laborprincipal;
    }

    

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getLaborprincipal() {
        return laborprincipal;
    }

    public void setLaborprincipal(String laborprincipal) {
        this.laborprincipal = laborprincipal;
    }
        
        
                   
}
