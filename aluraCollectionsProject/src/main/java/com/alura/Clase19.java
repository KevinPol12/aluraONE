package com.alura;

import com.alura.model.Alumno;
import com.alura.model.Curso;
import java.util.Optional;

public class Clase19 {
    
    public static void main(String[] args) {
        
        Curso curso1 = new Curso("Historia",30);
        
        Alumno alumno1 = new Alumno("Luis Miguel","001");
        Alumno alumno2 = new Alumno("Pepito los palotes","002");
        Alumno alumno3 = new Alumno("Juan Carlos","003");
        Alumno alumno4 = new Alumno("Pedro Pedrito","004");
        Alumno alumno5 = new Alumno("Gustavo Sanchez","005");
        Alumno alumno6 = new Alumno("Marcia Macia","006");
        Alumno alumno7 = new Alumno("Claudia Patricia","007");
     
        
        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);
        
//        curso1.getAlumnos().forEach(alumno ->{
//            System.out.println(alumno);
//        });

//        Optional<Alumno> var = curso1.getAlumnos().stream().filter(a->"003".equalsIgnoreCase(a.getCodigo())).findFirst();
//        
//        System.out.println(var.get());
        
        Alumno alumnoMap = curso1.getAlumnoMap().get("003");
        
        System.out.println(alumnoMap);

      
        
        
        
    }//End main
    
}// End class
