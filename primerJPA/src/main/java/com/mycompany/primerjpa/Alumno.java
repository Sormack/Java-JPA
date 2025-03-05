package com.mycompany.primerjpa;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Alumno implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    @Basic
    private String nombre;
    private String apellido;
    private int numeroCuenta;
    @Temporal(TemporalType.DATE)
    private Date fecha;
    //Para hacer la relacionte entre clases y entre tablas de la base de datos 
    //Es necesario instanciar un objeto de la clase a relacionar 
    //Esta etiqueta hace relacion 1 a 1 entre tablas 
    @OneToOne 
    private Carrera carr;
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, int numeroCuenta, Date fecha, Carrera carr) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCuenta = numeroCuenta;
        this.fecha = fecha;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Carrera getCarr() {
        return carr;
    }

    public void setCarr(Carrera carr) {
        this.carr = carr;
    }

    @Override
    public String toString() {
        return "Alumno{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", numeroCuenta=" + numeroCuenta + ", fecha=" + fecha + ", carr=" + carr + '}';
    }

    
    
    
    
}
