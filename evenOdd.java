import javax.swing.JOptionPane;
import java.util.Scanner;

public class evenOdd {
    public static void main(String[]args){
        Scanner keyboard = new Scanner(System.in);
        int number;
        String parity;

        System.out.println("Enter A Number");
        number= Integer.parseInt(keyboard.nextLine());
        if(number % 2 == 0){
            parity = "Even";
        }else{
            parity = "Odd";

        System.out.printf("The number is %s", parity);
        keyboard.close();

        }
    }
}
