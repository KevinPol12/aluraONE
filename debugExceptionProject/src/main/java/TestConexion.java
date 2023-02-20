
public class TestConexion {

    public static void main(String[] args) throws Exception {
        System.out.println("In Main");


        try (Conexion con = new Conexion()) {
            System.out.println("In Try");
            con.leerDatos();
            System.out.println("Pass Try");

        } catch (IllegalStateException me) {
            System.out.println("In Catch");
            me.printStackTrace();
            System.out.println("Pass Catch");
        } 
//        finally {
//            System.out.println("In Finally");
//            con.cerrar();
//            System.out.println("Pass Finally");
//        }
//        
        System.out.println("En Main");
    }//End main

}// End class
