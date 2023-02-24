package com.alura.model;


public class Aula /*implements Comparable<Curso>*/{
    private String nombre;

    public Aula(String nombre) {
        this.nombre = nombre;
    }//End constructor

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    public String toString(){
        return this.nombre;
    }

    

}// End class
