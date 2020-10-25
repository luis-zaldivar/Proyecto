package proyecto2;

import java.io.*; //Incluye Buffered
import java.util.*;

public class Acciones {

    boolean salir = false;
    String nombre, domicilio, esp, grado, Especialidad, lic, nom, domi, sin, dom, cargo, cont, turno, car, hora, lav;
    int tel, años, horas, añosExperiencia, numMaterias, numero, ant, edad, numtel, num, opcion;
    float sueldo;
    DeAsignatura data = new DeAsignatura(turno, numMaterias, añosExperiencia, Especialidad, nombre, domicilio, tel);
    TiempoCompleto datos = new TiempoCompleto(horas, grado, años, esp, nombre, domicilio, tel);
    Alumno alu = new Alumno(numero, lic, nom, domi, num);
    Sindicalizado sindicato = new Sindicalizado(sin, sueldo, ant, cargo, nombre, dom, num);
    DeConfianza confianza = new DeConfianza(cont, edad, ant, car, nom, dom, num);
    Directivos dire = new Directivos(hora, lav, ant, car, nom, domi, numtel);

    Scanner scan = new Scanner(System.in);
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<TiempoCompleto> listaTiempoCompleto = new ArrayList<>();
    ArrayList<DeAsignatura> listaAsignatura = new ArrayList<>();
    ArrayList<Alumno> Alumnos = new ArrayList<>();
    ArrayList<Sindicalizado> Sindicatos = new ArrayList<>();
    ArrayList<DeConfianza> confi = new ArrayList<>();
    ArrayList<Directivos> directivos = new ArrayList<>();

    public void AgrgarDocente() throws IOException {
        System.out.print("Docente de tiempo completo\n ");
        System.out.print("Ingresar nombre completo: ");
        nombre = entrada.readLine();
        datos.setNombre(nombre);
        System.out.print("Ingresa domicilio: ");
        domicilio = entrada.readLine();
        datos.setDomicilio(domicilio);
        System.out.print("Ingresa telefono: ");
        tel = scan.nextInt();
        datos.setTelefono(tel);
        System.out.print("Ingresa los años de experiencia: ");
        años = scan.nextInt();
        datos.setAñosExperiencia(años);
        System.out.print("Ingresa la especialidad: ");
        esp = entrada.readLine();
        datos.setEspecialidad(esp);
        System.out.print("Ingresa las horas de trabajo: ");
        horas = scan.nextInt();
        datos.setHoras(horas);
        System.out.print("Ingresa el grado de preparacion: ");
        grado = entrada.readLine();
        datos.setGrado(grado);
        listaTiempoCompleto.add(datos);
        System.out.print("El registro fue exitoso");
    }

    public void AgregarDocenteAsignatura() throws IOException {
        System.out.print("Docente de Asignatura \n");
        System.out.print("Ingresar nombre completo: ");
        nombre = entrada.readLine();
        data.setNombre(nombre);
        System.out.print("Ingresa domicilio: ");
        domicilio = entrada.readLine();
        data.setDomicilio(domicilio);
        System.out.print("Ingresa telefono: ");
        tel = scan.nextInt();
        data.setTelefono(tel);
        System.out.print("Ingresa los años de experiencia: ");
        añosExperiencia = scan.nextInt();
        data.setAñosExperiencia(añosExperiencia);
        System.out.print("Ingresa la especialidad: ");
        Especialidad = entrada.readLine();
        data.setEspecialidad(Especialidad);
        System.out.print("Ingresa el numero de materias: ");
        numMaterias = scan.nextInt();
        data.setNumMaterias(numMaterias);
        System.out.print("Ingresa el turno: ");
        turno = entrada.readLine();
        data.setTurno(turno);
        listaAsignatura.add(data);
        System.out.print("El registro fue exitoso");
    }

    public void AgregarAlumno() throws IOException {
        System.out.print("Alta alumnos\n");
        System.out.print("Inserte el nuero de cuenta: ");
        numero = scan.nextInt();
        alu.setNumCuenta(numero);
        System.out.print("Inserte la licenciatura: ");
        lic = entrada.readLine();
        alu.setLicenciatura(lic);
        System.out.print("ingrese el nombre: ");
        nom = entrada.readLine();
        alu.setNombre(nom);
        System.out.print("Ingrese el domicilio: ");
        domi = entrada.readLine();
        alu.setDomicilio(domi);
        System.out.print("Inserte un numero de telefono: ");
        num = scan.nextInt();
        alu.setTelefono(num);
        Alumnos.add(alu);
        System.out.print("El registro fue exitoso");
    }

    public void AgregarSindicato() throws IOException {
        System.out.println("Personal del sindicato");
        System.out.print("Inserte el sindicato afiliado: ");
        sin = entrada.readLine();
        sindicato.setSindicato(sin);
        System.out.print("Inserte el sueldo: ");
        sueldo = scan.nextFloat();
        sindicato.setSueldo(sueldo);
        System.out.print("Inserte los años de antiguedad: ");
        ant = scan.nextInt();
        sindicato.setAntiguedad(edad);
        System.out.print("Inerte el cargo: ");
        cargo = entrada.readLine();
        sindicato.setCargo(cargo);
        System.out.print("Insrte e nombre: ");
        nombre = entrada.readLine();
        sindicato.setNombre(nombre);
        System.out.print("Insrte el domicilio: ");
        dom = entrada.readLine();
        sindicato.setDomicilio(dom);
        System.out.print("Inserte el numero de telefono: ");
        num = scan.nextInt();
        sindicato.setTelefono(num);
        Sindicatos.add(sindicato);
        System.out.print("El registro fue exitoso");
    }

    public void AgregarConfianza() throws IOException {
        System.out.println("Personal de confianza");
        System.out.print("tiempo de contrato");
        cont = entrada.readLine();
        confianza.setContrato(cont);
        System.out.print("Inserte la edad: ");
        edad = scan.nextInt();
        confianza.setEdad(edad);
        System.out.print("Inserte la antiguedad: ");
        ant = scan.nextInt();
        confianza.setAntiguedad(ant);
        System.out.print("Inserte el cargo: ");
        car = entrada.readLine();
        confianza.setCargo(car);
        System.out.print("Inserte el nombre: ");
        nom = entrada.readLine();
        confianza.setNombre(nom);
        System.out.print("Insrte el domicilio: ");
        dom = entrada.readLine();
        confianza.setDomicilio(dom);
        System.out.print("Inserte un numero telefonico: ");
        num = scan.nextInt();
        confianza.setTelefono(num);
        confi.add(confianza);
        System.out.print("El registro fue exitoso");
    }

    public void AgrearDirectivos() throws IOException {
        System.out.println("Directivos");
        System.out.print("Inserte el horario: ");
        hora = entrada.readLine();
        dire.setHorario(hora);
        System.out.print("Inserte su labor principal: ");
        lav = entrada.readLine();
        dire.setLaborprincipal(lav);
        System.out.print("Inserte los años de antiguedad: ");
        ant = scan.nextInt();
        dire.setAntiguedad(ant);
        System.out.print("Inserte el cargo: ");
        car = entrada.readLine();
        dire.setCargo(car);
        System.out.print("Insertar el nombre: ");
        nom = entrada.readLine();
        dire.setNombre(nom);
        System.out.print("Inserte el domicilio: ");
        domi = entrada.readLine();
        dire.setDomicilio(dom);
        System.out.print("Inserte el numero telefonico");
        numtel = scan.nextInt();
        dire.setTelefono(numtel);
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
                System.out.println("Datos:\nNombre: "+listaTiempoCompleto.get(indice).getNombre());
            } else {
                System.out.println("no existe nada en esa posicion");
            }
        }
    }

    public void motrarAS(int indice) {

    }

    public void mostrarAl(int indice) {

    }

    public void mostarSin(int indice) {

    }

    public void mostrarCon(int indice) {

    }

    public void MostrarDir(int indice) {

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
