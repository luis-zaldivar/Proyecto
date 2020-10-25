package proyecto2;

import java.io.*; //Incluye Buffered
import java.util.*;

public class Acciones {

    boolean salir = false;

    int opcion;

    Scanner scan = new Scanner(System.in);
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<TiempoCompleto> listaTiempoCompleto = new ArrayList<>();
    ArrayList<DeAsignatura> listaAsignatura = new ArrayList<>();
    ArrayList<Alumno> Alumnos = new ArrayList<>();
    ArrayList<Sindicalizado> Sindicatos = new ArrayList<>();
    ArrayList<DeConfianza> confi = new ArrayList<>();
    ArrayList<Directivos> directivos = new ArrayList<>();

    public void AgrgarDocente() throws IOException {
        System.out.print("Docente de tiempo completo \n");
        System.out.print("Ingresar nombre completo: ");
        String nombre = entrada.readLine();
        System.out.print("Ingresa domicilio: ");
        String domicilio = entrada.readLine();
        System.out.print("Ingresa telefono: ");
        String tel = entrada.readLine();
        System.out.print("Ingresa los años de experiencia: ");
        int años = scan.nextInt();
        System.out.print("Ingresa la especialidad: ");
        String esp = entrada.readLine();
        //prof1.setEspecialidad(esp);
        System.out.print("Ingresa las horas de trabajo: ");
        int horas = scan.nextInt();
        System.out.print("Ingresa el grado de preparacion: ");
        String grado = entrada.readLine();
        TiempoCompleto datos = new TiempoCompleto(horas, grado, años, esp, nombre, domicilio, tel);
        listaTiempoCompleto.add(datos);
        System.out.print("El registro fue exitoso");
    }

    public void AgregarDocenteAsignatura() throws IOException {
        System.out.print("Docente de Asignatura \n");
        System.out.print("Ingresar nombre completo: ");
        String nombre = entrada.readLine();
        System.out.print("Ingresa domicilio: ");
        String domicilio = entrada.readLine();
        System.out.print("Ingresa telefono: ");
        String tel = entrada.readLine();
        System.out.print("Ingresa los años de experiencia: ");
        int añosExperiencia = scan.nextInt();
        System.out.print("Ingresa la especialidad: ");
        String Especialidad = entrada.readLine();
        System.out.print("Ingresa el numero de materias: ");
        int numMaterias = scan.nextInt();
        System.out.print("Ingresa el turno: ");
        String turno = entrada.readLine();
        DeAsignatura data = new DeAsignatura(turno, numMaterias, añosExperiencia, Especialidad, nombre, domicilio, tel);
        listaAsignatura.add(data);
        System.out.print("El registro fue exitoso");
    }

    public void AgregarAlumno() throws IOException {
        System.out.print("Alta alumnos\n");
        System.out.print("Inserte el nuero de cuenta: ");
        int numero = scan.nextInt();
        System.out.print("Inserte la licenciatura: ");
        String lic = entrada.readLine();
        System.out.print("ingrese el nombre: ");
        String nom = entrada.readLine();
        System.out.print("Ingrese el domicilio: ");
        String domi = entrada.readLine();
        System.out.print("Inserte un numero de telefono: ");
        String num = entrada.readLine();
        Alumno alu = new Alumno(numero, lic, nom, domi, num);
        Alumnos.add(alu);
        System.out.print("El registro fue exitoso");
    }

    public void AgregarSindicato() throws IOException {
        System.out.println("Personal del sindicato");
        System.out.print("Inserte el sindicato afiliado: ");
        String sin = entrada.readLine();
        System.out.print("Inserte el sueldo: ");
        float sueldo = scan.nextFloat();
        System.out.print("Inserte los años de antiguedad: ");
        int ant = scan.nextInt();
        System.out.print("Inerte el cargo: ");
        String cargo = entrada.readLine();
        System.out.print("Insrte e nombre: ");
        String nombre = entrada.readLine();
        System.out.print("Insrte el domicilio: ");
        String dom = entrada.readLine();
        System.out.print("Inserte el numero de telefono: ");
        String num = entrada.readLine();
        Sindicalizado sindicato = new Sindicalizado(sin, sueldo, ant, cargo, nombre, dom, num);
        Sindicatos.add(sindicato);
        System.out.print("El registro fue exitoso");
    }

    public void AgregarConfianza() throws IOException {
        System.out.println("Personal de confianza");
        System.out.print("tiempo de contrato");
        String cont = entrada.readLine();
        System.out.print("Inserte la edad: ");
        int edad = scan.nextInt();
        System.out.print("Inserte la antiguedad: ");
        int ant = scan.nextInt();
        System.out.print("Inserte el cargo: ");
        String car = entrada.readLine();
        System.out.print("Inserte el nombre: ");
        String nom = entrada.readLine();
        System.out.print("Insrte el domicilio: ");
        String dom = entrada.readLine();
        System.out.print("Inserte un numero telefonico: ");
        String num = entrada.readLine();
        DeConfianza confianza = new DeConfianza(cont, edad, ant, car, nom, dom, num);
        confi.add(confianza);
        System.out.print("El registro fue exitoso");
    }

    public void AgrearDirectivos() throws IOException {
        System.out.println("Directivos");
        System.out.print("Inserte el horario: ");
        String hora = entrada.readLine();
        System.out.print("Inserte su labor principal: ");
        String lav = entrada.readLine();
        System.out.print("Inserte los años de antiguedad: ");
        int ant = scan.nextInt();
        System.out.print("Inserte el cargo: ");
        String car = entrada.readLine();
        System.out.print("Insertar el nombre: ");
        String nom = entrada.readLine();
        System.out.print("Inserte el domicilio: ");
        String domi = entrada.readLine();
        System.out.print("Inserte el numero telefonico");
        String numtel = entrada.readLine();
        Directivos dire = new Directivos(hora, lav, ant, car, nom, domi, numtel);
        directivos.add(dire);
        System.out.print("El registro fue exitoso");
    }

    public void tamaños() {
        while (!salir) {
            System.out.println("Indique de quien quiere saber el tamaño\n"
                    + "1.-Docentes de tiempo completo\n2.- Docentes de asignatura\n"
                    + "3.-Alumnos\n4.-Administrativos por sindicato\n"
                    + "5.-Administrativos de confianza\n6.-Directivos\n7.-regresar al menu ");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Los PTC son: " + listaTiempoCompleto.size());
                    return;
                case 2:
                    System.out.println("Los docentes por asignatuira son: " + listaAsignatura.size());
                    return;
                case 3:
                    System.out.println("Alumnos dados de alta: " + Alumnos.size());
                    return;
                case 4:
                    System.out.println("el administrativo con sindicao es un total de: " + Sindicatos.size());
                    return;
                case 5:
                    System.out.println("Los administrativos de confianza son: " + confi.size());
                    return;
                case 6:
                    System.out.println("los directivos que existen son: " + directivos.size());
                    return;
                case 7:
                    return;
            }
        }
    }

    public void mostraPTC(int indice) {
        if (indice >= 0) {
            if (indice <= listaTiempoCompleto.size() - 1) {
                System.out.println("Datos:\nNombre: " + listaTiempoCompleto.get(indice).getNombre() + " domicilio: " + listaTiempoCompleto.get(indice).getDomicilio()
                        + "  telefono: " + listaTiempoCompleto.get(indice).getTelefono() + " Años Experiencia: " + listaTiempoCompleto.get(indice).getAñosExperiencia()
                        + " Epecialidad: " + listaTiempoCompleto.get(indice).getEspecialidad() + " Horas Trabajo: " + listaTiempoCompleto.get(indice).getHoras()
                        + " Grado: " + listaTiempoCompleto.get(indice).getGrado());
            } else {
                System.out.println("no existe nada en esa posicion");
            }
        }
    }

    public void motrarAS(int indice) {
        if (indice >= 0) {
            if (indice <= listaAsignatura.size() - 1) {
                System.out.println("Datos:\nNombre: " + listaAsignatura.get(indice).getNombre() + " domicilio: " + listaAsignatura.get(indice).getDomicilio()
                        + " Telefono: " + listaAsignatura.get(indice).getTelefono() + " Años Experiencia: " + listaAsignatura.get(indice).getAñosExperiencia()
                        + " Especialidad: " + listaAsignatura.get(indice).getEspecialidad() + " Matrias: " + listaAsignatura.get(indice).getNumMaterias() + " turno:"
                        + listaAsignatura.get(indice).getTurno());
            } else {
                System.out.println("no existe nada en esa posicion");
            }
        }
    }

    public void mostrarAl(int indice) {
        if (indice >= 0) {
            if (indice <= Alumnos.size() - 1) {
                System.out.println("Datos:\nNo.Cuenta: " + Alumnos.get(indice).getNumCuenta() + " licenciatura: " + Alumnos.get(indice).getLicenciatura()
                        + " nombre: " + Alumnos.get(indice).getNombre() + " Domicilio: " + Alumnos.get(indice).getDomicilio() + " Telefono: " + Alumnos.get(indice).getTelefono());
            } else {
                System.out.println("no existe nada en esa posicion");
            }
        }
    }

    public void mostarSin(int indice) {
        if (indice >= 0) {
            if (indice <= Sindicatos.size() - 1) {
                System.out.println("Datos:\nSindicato: " + Sindicatos.get(indice).getSindicato() + " sueldo: " + Sindicatos.get(indice).getSueldo() + "  Años Antiguedad: "
                        + Sindicatos.get(indice).getAntiguedad() + " cargo: " + Sindicatos.get(indice).getCargo() + " nombre: " + Sindicatos.get(indice).getNombre()
                        + " Domicilio: " + Sindicatos.get(indice).getDomicilio() + " tel: " + Sindicatos.get(indice).getTelefono());
            } else {
                System.out.println("no existe nada en esa posicion");
            }
        }
    }

    public void mostrarCon(int indice) {
        if (indice >= 0) {
            if (indice <= confi.size() - 1) {
                System.out.println("Datos:\nTiempo Contrato: " + confi.get(indice).getContrato() + " edad: " + confi.get(indice).getEdad() + " Antiguedad: " + confi.get(indice).getAntiguedad()
                        + " cargo: " + confi.get(indice).getCargo() + " nombre: " + confi.get(indice).getNombre() + " domicilio: " + confi.get(indice).getDomicilio() + " tel: " + confi.get(indice).getTelefono());
            } else {
                System.out.println("no existe nada en esa posicion");
            }
        }
    }

    public void MostrarDir(int indice) {
        if (indice >= 0) {
            if (indice <= directivos.size() - 1) {
                System.out.println("Datos:\nHorario: " + directivos.get(indice).getHorario() + " labor: " + directivos.get(indice).getLaborprincipal()
                        + " años de antiguedad: " + directivos.get(indice).getAntiguedad()+" cargo: "+directivos.get(indice).getCargo()+" nombre: "
                +directivos.get(indice).getNombre()+" domicilio: "+directivos.get(indice).getDomicilio()+" Tel: "+directivos.get(indice).getTelefono());
            } else {
                System.out.println("no existe nada en esa posicion");
            }
        }
    }

    public void EliPTC(int xd) {
        if (xd >= 0) {
            if (xd <= listaTiempoCompleto.size() - 1) {
                listaTiempoCompleto.remove(xd);
                System.out.println("se elimino ");
            } else {
                System.out.println("no existe nada en esa posicion");
            }
        }
    }

    public void EliAs(int xd) {
        if (xd >= 0) {
            if (xd <= listaAsignatura.size() - 1) {
                listaAsignatura.remove(xd);
                System.out.println("se elimino ");
            } else {
                System.out.println("no existe nada en esa posicion");
            }
        }
    }

    public void EliAl(int xd) {
        if (xd >= 0) {
            if (xd <= Alumnos.size() - 1) {
                Alumnos.remove(xd);
                System.out.println("se elimino ");
            } else {
                System.out.println("no existe nada en esa posicion");
            }
        }
    }

    public void Elisin(int xd) {
        if (xd >= 0) {
            if (xd <= Sindicatos.size() - 1) {
                Sindicatos.remove(xd);
                System.out.println("se elimino ");
            } else {
                System.out.println("no existe nada en esa posicion");
            }
        }
    }

    public void eliCon(int xd) {
        if (xd >= 0) {
            if (xd <= confi.size() - 1) {
                confi.remove(xd);
                System.out.println("se elimino ");
            } else {
                System.out.println("no existe nada en esa posicion");
            }
        }
    }

    public void eliDi(int xd) {
        if (xd >= 0) {
            if (xd <= directivos.size() - 1) {
                directivos.remove(xd);
                System.out.println("se elimino ");
            } else {
                System.out.println("no existe nada en esa posicion");
            }
        }
    }

    public void ElimanaTPTC() {
        listaTiempoCompleto.clear();
        System.out.println("se eliminaron todos los elementos de la lista Docentes tiempo completo");
    }

    public void ElimindarTAS() {
        listaAsignatura.clear();
        System.out.println("Se eliminaron todos los elementos de la lista Docentes por asignatura");
    }

    public void EliminarALu() {
        Alumnos.clear();
        System.out.println("se eliminaro la lista alimnos ");
    }

    public void EliminarSin() {
        Sindicatos.clear();
        System.out.println("Se elimono la lista Personal con sindicato");
    }

    public void EliminarCon() {
        confi.clear();
        System.out.println("Se elimino la lista personal de confianza");
    }

    public void EliminarDire() {
        directivos.clear();
        System.out.println("Se elimono el contenido de la lista Directivos");
    }
}
