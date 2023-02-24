package com.alura.model;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class Curso /*implements Comparable<Curso>*/{
    private String nombre;
    private int tiempo;
    private List<Aula> aulaList = new LinkedList<>();

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
    
    
    
    
    @Override
    public String toString(){
        return this.nombre;
    }

//    @Override
//    public int compareTo(Curso o) {
//        return this.nombre.compareTo(o.getNombre());
//    }

    

}// End class
