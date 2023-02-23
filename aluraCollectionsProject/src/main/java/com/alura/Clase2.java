package com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class Clase2 {
    
    public static void main(String[] args) {
        
        String variable1 = ("z");
        String variable2 = ("a");
        String variable3 = ("h");
     
        
        ArrayList<String> listaString = new ArrayList<>();
        
        listaString.add(variable1);
        listaString.add(variable2);
        listaString.add(variable3);
        
        for (String string : listaString) {
            System.out.println(string);
            
        }
        System.out.println();
        
//        System.out.println(listaString);
        
//        for(int i=0; i<listaString.size();i++){
//            
//        }

        String[] lista2 = new String[2];
        lista2[0]="z";
        lista2[1]="a";
        
        Collections.sort(listaString);
        
//        for (String string : lista2) {
//            System.out.println(string);
//        }
        
//        
//        for (String string : listaString) {
//            System.out.println(string);
//        }
        
        listaString.forEach(var ->{
            System.out.println(var);
        });
        
        
        
    }//End main
    
}// End class
