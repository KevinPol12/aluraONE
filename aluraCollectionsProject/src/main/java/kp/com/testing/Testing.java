package kp.com.testing;

public class Testing {

    public static void main(String[] args) {
        //sort data into ascending order
        
        
        try{
        System.out.println(System.currentTimeMillis());
        
            for (int i = 0; i < 5; i++) {
                System.out.printf("Waiting '%d' second...%n",i+1);
                Thread.sleep(1000);
            }
            
                 
        
        System.out.println(System.currentTimeMillis());
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }//End main
        
        

}// End class
