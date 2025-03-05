package com.mycompany.primerjpa;

import java.util.ArrayList;
import java.util.LinkedList;
import persistencia.controladorPersistencia;

public class controladorMetodosCRUD {
    //intancia del controlador de persistencia donde se accede a sus metodos
    controladorPersistencia controlPersis = new controladorPersistencia();
    //metodo c para cread
    public void crearAlumno(Alumno alu){
        
        controlPersis.crearAumno(alu);
    }
    
    //metodo para delate
    public void eliminarAlumno(int id){
        controlPersis.eliminarAlumno(id);
    }
    
    //metodo para edit
    public void editarAlumno(Alumno alu){
        controlPersis.editarAlumno(alu);
    }
    
    //metodo para mostrar un alumno
    public Alumno traerAlumno(int id){
        return controlPersis.traerAlumno(id);
    }
    //metodo para traer todos los alumnos
    public ArrayList<Alumno>listaAlumnos(){
        return controlPersis.listaAlumnos();
    }
    
    //CRUD para Carrera
    public void crearCarrera(Carrera carr){
        
        controlPersis.crearCarrera(carr);
    }
    
    //metodo para delate
    public void eliminarCarrera(int id){
        controlPersis.eliminarCarrera(id);
    }
    
    //metodo para edit
    public void editarCarrera(Carrera carr){
        controlPersis.editarCarrera(carr);
    }
    
    //metodo para mostrar un alumno
    public Carrera traerCarrera(int id){
        return controlPersis.traerCarrera(id);
    }
    //metodo para traer todos los alumnos
    public ArrayList<Carrera>listaCarreras(){
        return controlPersis.listaCarreras();
    }
    
    /*Metodos crud para la clase materia*/
    public void crearMateria(Materia mat){
        controlPersis.crearMateria(mat);
    }
    
    //metodo para delate
    public void eliminarMateria(int id){
        controlPersis.eliminarMaeria(id);
    }
    
    //metodo para edit
    public void editarMaeria(Materia mat){
        controlPersis.editarMateria(mat);
    }
    
    //metodo para mostrar un alumno
    public Materia traerMateria(int id){
        return controlPersis.traerMateria(id);
    }
    //metodo para traer todos los alumnos
    public LinkedList<Materia>listaMaterias(){
        return controlPersis.listaMaerias();
    }
}
