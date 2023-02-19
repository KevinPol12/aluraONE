

public class TestGerente {

    public static void main(String[] args) {
        
        Gerente kevin = new Gerente("Kevin","9962233333",2000);
        Contador wilmer = new Contador("Wilmer","885858585",2500);
        ControlBonificacion suma = new ControlBonificacion();
        
        
        System.out.println("Bonificacion Wilmer: ");
        System.out.println(wilmer.getBonificacion());
        System.out.println("El total de bonus hasta ahora es: ");
        System.out.println(suma.totalBonos(wilmer));
        
      
        
        System.out.println("Bonificacion Kevin: ");
        System.out.println(kevin.getBonificacion());
        System.out.println("El total de las bonificaciones ahora es de: ");
        System.out.println(suma.totalBonos(kevin));
        
        
        
        
        
        
        
        
        
        
    }//End Main
  
    
}//End class TestGerente
