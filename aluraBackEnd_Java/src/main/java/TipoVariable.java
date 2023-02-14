
import java.util.Scanner;

public class TipoVariable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = 1;

        do {

            System.out.println("Please enter a number:");

            double number = input.nextInt();

            System.out.printf("%s%.0f%n%n", "Your number is ", number);
            num++;
        } while (num <= 2);

    }//End Main

}//End class
