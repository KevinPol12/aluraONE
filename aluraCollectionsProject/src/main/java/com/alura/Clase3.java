package com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Clase3 {
    
    public static void main(String[] args) {
        
        String curso1 = ("Geometria");
        String curso2 = ("Fisica");
        String curso3 = ("Quimica");
        String curso4 = ("Historia");
     
        
        ArrayList<String> cursos = new ArrayList<>();
        
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        
//        System.out.println(cursos);
//        
//        System.out.println();
//        
//        Collections.sort(cursos,Collections.reverseOrder());//sort
//        
//        System.out.println(cursos);
//        
//        Collections.sort(cursos); //sort
//        
//        System.out.println(cursos);
        
//        cursos.sort(Comparator.naturalOrder());
//        System.out.println(cursos);
//        
//        cursos.sort(Comparator.reverseOrder());
//        System.out.println(cursos);

        List<String> newCursos = cursos.stream().sorted().collect(Collectors.toList());
          
        System.out.println(newCursos);
        

    }//End main
    
}// End class
