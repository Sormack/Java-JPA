package com.mycompany.primerjpa;
//Mapeo de la clase 

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Materia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Basic
    private String nombre;
    private String tipoMateria;
    //Para hacer la relacion bidireccional entre carrera y materia 
    @ManyToOne
    private Carrera carr;
   
    public Materia() {
    }

    public Materia(int id, String nombre, String tipoMateria, Carrera carr) {
        this.id = id;
        this.nombre = nombre;
        this.tipoMateria = tipoMateria;
        this.carr = carr;
    }

    public Carrera getCarr() {
        return carr;
    }

    public void setCarr(Carrera carr) {
        this.carr = carr;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoMateria() {
        return tipoMateria;
    }

    public void setTipoMateria(String tipoMateria) {
        this.tipoMateria = tipoMateria;
    }
    
    
}
