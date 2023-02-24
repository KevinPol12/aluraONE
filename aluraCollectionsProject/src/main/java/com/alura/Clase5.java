package com.alura;

import com.alura.model.Curso;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase5 {
    
    public static void main(String[] args) {
        
        Curso curso1 = new Curso("Java",30);
        Curso curso2 = new Curso("JavaScript",10);
        Curso curso3 = new Curso("PHP",20);
        Curso curso4 = new Curso("Ruby",50);
     
        
        ArrayList<Curso> cursos = new ArrayList<>();
        
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        
        
//        cursos.sort(Comparator.naturalOrder());
//        
//        System.out.println(cursos);
//        
//        cursos.sort(Comparator.reverseOrder());
        
//        System.out.println(cursos);
//        
//        System.out.println(cursos.stream().sorted().collect(Collectors.toList()));
        
         System.out.println(cursos.stream().sorted(Comparator.comparing(Curso::getNombre)).collect(Collectors.toList()));

    }//End main
    
}// End class
