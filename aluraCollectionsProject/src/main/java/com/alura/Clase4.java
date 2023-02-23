package com.alura;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Clase4 {
    
    public static void main(String[] args) {
        
        Curso curso1 = new Curso("Historia",30);
        Curso curso2 = new Curso("Quimica",10);
        Curso curso3 = new Curso("Fisica",20);
        Curso curso4 = new Curso("Geometria",50);
     
        
        ArrayList<Curso> cursos = new ArrayList<>();
        
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        
        System.out.println(cursos.stream().sorted().collect(Collectors.toList()));
        
      
        

    }//End main
    
}// End class
