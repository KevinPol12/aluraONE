package com.alura;

import com.alura.model.Aula;
import com.alura.model.Curso;
import java.util.ArrayList;
import java.util.List;

public class Clase7 {
    
    public static void main(String[] args) throws InterruptedException {
        
                
        Curso curso1 = new Curso("Java",30);
        curso1.addAula(new Aula("ArrayList"));
        curso1.addAula(new Aula("List"));
        curso1.addAula(new Aula("LinkedList"));
        
        List<Aula> aulaList = curso1.getAulaList();
        
        System.out.println(aulaList);
        aulaList.add(new Aula("hello"));
        
        System.out.println(aulaList);
//        ArrayList<Curso> cursos = new ArrayList<>();
//        cursos.add(curso1);
//        
//        System.out.println(cursos.get(0).getAulaList());
        
        
        
        

    }//End main
    
}// End class
