package com.mycompany.primerjpa;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import persistencia.controladorPersistencia;

public class ejecutableJPA {

    public static void main(String[] args) {

        /*controladorPersistencia newPer = new controladorPersistencia();*/
        controladorMetodosCRUD controlador = new controladorMetodosCRUD();
        //Alumno nuevoAlumno = new Alumno(8, "Pablo", "Sanchez", 316699692, new Date());
        /*//controlador.crearAlumno(nuvoAlumno);
        
        //controlador.eliminarAlumno(5);
        //Este metodo de edicion solo funciona en la instancia actual
        nuevoAlumno.setApellido("Torres");
        controlador.editarAlumno(nuevoAlumno);
         */
 /*Alumno alu = controlador.traerAlumno(8);
        //Busqueda individual
        System.out.println("El alumn es: " + alu.toString());
        System.out.println("--------------------------");
        //Busqueda completa
        ArrayList<Alumno> listaAlumnos = controlador.listaAlumnos();
        for(Alumno al:listaAlumnos){
            System.out.println("Los alumnos son : " +al.toString());
        }*/

        //Creacion de una carrera 
        //Carrera carrera = new Carrera(10,"Ingenieria en Electrnica", 9);
        //Guardar la carrera en la base de datos 
        //controlador.crearCarrera(carrera);
        //Crear un alumno con carrera
        //Alumno nuevoAlumno = new Alumno(5, "Juan", "Gordinez", 316239692, new Date(),carrera);
        //Guardar el nuevo alumno en la base de datos
        //controlador.crearAlumno(nuevoAlumno);
        //Resultados
        /*System.out.println("Datos del Alumno");
        //Se busca un id en particular para acceder a sus metodos 
        Alumno alumno  = controlador.traerAlumno(10);
        System.out.println("Alumno: "+alumno.getNombre()+" "+alumno.getApellido());
        //Se pude acceder a los metodos de una clase asociada 
        System.out.println("Cursa la carrera: "+alumno.getCarr().getNombreCarrera());*/
        //Creacion de las materias 
        /* Materia materiaUno = new Materia(10, "Calculo", "Obligatoria");
        Materia materiaDos = new Materia(12, "Metodos Numericos", "Obligatoria");
        Materia materiaTres = new Materia(14, "Intrumentacion y Control", "Optativa");
        //Guardar las materias en la base de datos 
        controlador.crearMateria(materiaUno);
        controlador.crearMateria(materiaDos);
        controlador.crearMateria(materiaTres);
        //Crear la lista de materias 
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        //Agregar las materias a la lista 
        listaMaterias.add(materiaUno);
        listaMaterias.add(materiaDos);
        listaMaterias.add(materiaTres);

        //Creacion de la carrera con la lista de materias
        Carrera carrera = new Carrera(18, "Ingenieria Mecatronica", 9,listaMaterias);
        //Guardar la carrera en la base de datos 
        controlador.crearCarrera(carrera);
        //Crear el alumno 
        Alumno alum = new Alumno(18, "Pepe", "Perez", 316165479, new Date(), carrera);
        //Guardar el aluno en la base de datos 
        controlador.crearAlumno(alum);*/
        //Crear primero la lista de materias que estara vacio
        LinkedList<Materia> listaMaterias = new LinkedList<Materia>();
        //Creacion de la carrera con la lista de materias
        Carrera carrera = new Carrera(18, "Ingenieria Mecatronica", 9, listaMaterias);
        //Guardar la carrera en la base de datos 
        controlador.crearCarrera(carrera);
        //Creacion de las materias 
        Materia materiaUno = new Materia(10, "Calculo", "Obligatoria", carrera);
        Materia materiaDos = new Materia(12, "Metodos Numericos", "Obligatoria", carrera);
        Materia materiaTres = new Materia(14, "Intrumentacion y Control", "Optativa", carrera);
        //Guardar las materias en la base de datos 
        controlador.crearMateria(materiaUno);
        controlador.crearMateria(materiaDos);
        controlador.crearMateria(materiaTres);
        //Agregar las materias a la lista 
        listaMaterias.add(materiaUno);
        listaMaterias.add(materiaDos);
        listaMaterias.add(materiaTres);
        //Agregar a carrera la lista de materias a nivel logico o codigo 
        carrera.setListaMaterias(listaMaterias);
        //Agregar a carrera la lista de materias a nivel base de datos 
        controlador.editarCarrera(carrera);
         //Crear el alumno 
        Alumno alum = new Alumno(18, "Pepe", "Perez", 316165479, new Date(), carrera);
        //Guardar el aluno en la base de datos 
        controlador.crearAlumno(alum);

    }
}
