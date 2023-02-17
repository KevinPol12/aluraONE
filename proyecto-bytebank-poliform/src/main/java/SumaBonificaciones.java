      public class SumaBonificaciones{
            
            private double sumaSalarios;
            
            public double totalBonos(Funcionario funcionario){
            
                    sumaSalarios += funcionario.getBonificacion();
                    
                    return sumaSalarios;
                
            }//End method totalBonos
            
        }//End class