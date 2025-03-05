package persistencia;

import com.mycompany.primerjpa.Alumno;
import com.mycompany.primerjpa.Carrera;
import com.mycompany.primerjpa.Materia;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.exceptions.NonexistentEntityException;

public class controladorPersistencia {
    AlumnoJpaController aluJPA = new AlumnoJpaController();
    CarreraJpaController carrJPA = new CarreraJpaController();
    MateriaJpaController matJPA = new MateriaJpaController();

    public void crearAumno(Alumno alu) {
        //se accede al metodo create de la instanica aluJPA
        aluJPA.create(alu);
    }

    public void eliminarAlumno(int id) {
        try {
            aluJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            System.out.println("Id no valida");
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            aluJPA.edit(alu);
        } catch (Exception ex) {
            System.out.println("Error al editar el alumno");
        }
    }
    
    public Alumno traerAlumno(int id ){
        return aluJPA.findAlumno(id);
    }

    public ArrayList<Alumno> listaAlumnos() {
        List<Alumno> lista = aluJPA.findAlumnoEntities();
        ArrayList<Alumno> listAlu = new ArrayList<Alumno>(lista);
        return listAlu;
    }

    public void crearCarrera(Carrera carr) {
        carrJPA.create(carr);
    }

    public void eliminarCarrera(int id) {
        try {
            carrJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera carr) {
        try {
            carrJPA.edit(carr);
        } catch (Exception ex) {
            Logger.getLogger(controladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return carrJPA.findCarrera(id);
  
    }

    public ArrayList<Carrera> listaCarreras() {
        List<Carrera> listac = carrJPA.findCarreraEntities();
        ArrayList<Carrera> listcarrera = new ArrayList(listac);
        return listcarrera;
    }
    
     public void crearMateria(Materia mat) {
        matJPA.create(mat);
    }

    public void eliminarMaeria(int id) {
        try {
            matJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(controladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMateria(Materia mat) {
        try {
            matJPA.edit(mat);
        } catch (Exception ex) {
            Logger.getLogger(controladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia traerMateria(int id) {
        return matJPA.findMateria(id);
    }

    public LinkedList<Materia> listaMaerias() {
        List<Materia> listam = matJPA.findMateriaEntities();
        LinkedList<Materia> listaMateria = new LinkedList(listam);
        return listaMateria;
    }
}
