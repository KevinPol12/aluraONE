package com.alura;

import java.util.ArrayList;

public class Clase1 {
    
    public static void main(String[] args) {
        
        String variable1 = ("Ejemplo 1");
        String variable2 = ("Ejemplo 2");
        String variable3 = ("Ejemplo 3");
        String variable4 = ("Ejemplo 4");
        String variable5 = ("Ejemplo 5");
        String variable6 = ("Ejemplo 6");
        
        ArrayList<String> lista = new ArrayList<>();
        ArrayList<String> lista2 = new ArrayList<>();
        
        lista.add(variable1);
        lista.add(variable2);
        lista.add(variable3);
        
        lista2.add(variable4);
        lista2.add(variable5);
        lista2.add(variable6);
        
        lista.addAll(lista2);
        
        
    }//End main
    
}// End class
