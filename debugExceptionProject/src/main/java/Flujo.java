
public class Flujo {

	public static void main(String[] args) {
        System.out.println("Inicio main");
        metodo1();
        System.out.println("Fin de main");
    }

    private static void metodo1() {
        System.out.println("Inicio de metodo 1");
        try{
        metodo2();
        }catch(MiException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Fin de metodo 1");
    }

    private static void metodo2() throws MiException {
        System.out.println("Inicio de metodo 2");
        
        throw new MiException("Mi excepcion fue lanzada");
        
        
//        System.out.println("Fin de metodo2");
    }

	
}
