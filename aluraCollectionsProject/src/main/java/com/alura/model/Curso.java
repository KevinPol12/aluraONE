package com.alura.model;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;


public class Curso /*implements Comparable<Curso>*/{
    private String nombre;
    private int tiempo;
    private List<Aula> aulaList = new LinkedList<>();
    private Collection<Alumno> alumnos = new LinkedHashSet<>();
    private Map<String,Alumno> alumnoMap = new HashMap<>();

    public Curso(String nombre, int tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }//End construcor 1

    public Curso(String nombre, int tiempo, List<Aula> aulaList) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.aulaList = aulaList;
    }//End constructor 2nd
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }
    
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public List<Aula> getAulaList() {
        return Collections.unmodifiableList(aulaList);
    }   

    public void setAulaList(List<Aula> aulaList) {
        this.aulaList = aulaList;
    }
    
    public void addAula(Aula aula){
        this.aulaList.add(aula);
    }
    
    public void addAlumno(Alumno alumno){
        this.alumnos.add(alumno);
        this.alumnoMap.put(alumno.getCodigo(), alumno);
    }

    public Collection<Alumno> getAlumnos() {
        return alumnos;
    }
    
    
    
    public boolean verificaAlumno(Alumno alumno){
        return this.alumnos.contains(alumno);
    }

    public Map<String, Alumno> getAlumnoMap() {
        return alumnoMap;
    }
    
    
    
    
    @Override
    public String toString(){
        return this.nombre;
    }

//    @Override
//    public int compareTo(Curso o) {
//        return this.nombre.compareTo(o.getNombre());
//    }

    

}// End class
