package com.mycompany.primerjpa;

import java.io.Serializable;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Carrera implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Basic
    private String nombreCarrera;
    private int cantidadSemestres;
    //Para hacer una relacion de 1 a n es necesario vicular la clase con la clase de 
    //la cual se contara con muchos objetos 
    //Esto se hace mediante una linkedlist o array list
    //Se necesita establecer la relacion entre ambas clases 
    @OneToMany(mappedBy = "Carr")
    private LinkedList<Materia> listaMaterias;
    
    public Carrera() {
    }

    public Carrera(int id, String nombreCarrera, int cantidadSemestres, LinkedList<Materia> listaMaterias) {
        this.id = id;
        this.nombreCarrera = nombreCarrera;
        this.cantidadSemestres = cantidadSemestres;
        this.listaMaterias = listaMaterias;
    }

    

    public LinkedList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(LinkedList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public int getCantidadSemestres() {
        return cantidadSemestres;
    }

    public void setCantidadSemestres(int cantidadSemestres) {
        this.cantidadSemestres = cantidadSemestres;
    }

    @Override
    public String toString() {
        return "Carrera{" + "id=" + id + ", nombreCarrera=" + nombreCarrera + ", cantidadSemestres=" + cantidadSemestres + '}';
    }

    
           
}
