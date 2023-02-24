package com.alura;

import com.alura.model.Curso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Clase9 {
    
    public static void main(String[] args) {
        
        Curso curso1 = new Curso("Historia",30);
        Curso curso2 = new Curso("Algebra",10);
        Curso curso3 = new Curso("Aritmetica",20);
        Curso curso4 = new Curso("Geometria",50);
     
        
        ArrayList<Curso> cursos = new ArrayList<>();
        
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        
        System.out.println(cursos);
        
        Collections.sort(cursos,Comparator.comparing(Curso:: getNombre).reversed());
        
        System.out.println(cursos);
        

    }//End main
    
}// End class
