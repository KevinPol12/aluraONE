package com.alura;

import com.alura.model.Alumno;
import java.util.Collection;
import java.util.HashSet;

public class Clase13 {
    
    public static void main(String[] args) {
        
        Alumno alumno1 = new Alumno("Luis Miguel","001");
        Alumno alumno2 = new Alumno("Pepito los palotes","002");
        Alumno alumno3 = new Alumno("Juan Carlos","003");
        Alumno alumno4 = new Alumno("Pedro Pedrito","004");
        Alumno alumno5 = new Alumno("Gustavo Sanchez","005");
        Alumno alumno6 = new Alumno("Marcia Macia","006");
        Alumno alumno7 = new Alumno("Claudia Patricia","007");
        Alumno alumnoNuevo = new Alumno("Luis Miguel","001");
     
        Collection<Alumno> listaAlumnos = new HashSet<>();
        
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add(alumno6);
        listaAlumnos.add(alumno7);
        listaAlumnos.add(alumnoNuevo);
        
      
        System.out.println(listaAlumnos.contains(alumnoNuevo));
        
      
        
        
        
    }//End main
    
}// End class
