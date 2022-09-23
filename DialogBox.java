import javax.swing.JOptionPane;
import java.util.Scanner;
public class DialogBox {

// *********************************************************************
//                      Assignment#1
//                      Name: Dagon Katz
//                      Data Strucutres: Date of submission
// **********************************************************************
// Documentation Information

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String firstName;
        String lastName;
        String uppperName;
        String lowerName;
        String reversedString = "";
        String reversedString2 = "";
        char ch, ch2;

        firstName = JOptionPane.showInputDialog("What is your first name?");
        lastName = JOptionPane.showInputDialog("What is your last name?");
        for (int i = 0; i < firstName.length(); i++) {
            ch = firstName.charAt(i);
            reversedString = ch + reversedString;
        }
        for (int i = 0; i < lastName.length(); i++) {
            ch2 = lastName.charAt(i);
            reversedString2 = ch2 + reversedString2;
        }


        //System.out.print(firstName.toUpperCase());
        //System.out.print(lastName.toUpperCase());
        //System.out.print(firstName.toLowerCase());
        // System.out.print(lastName.toLowerCase());
        System.out.println(firstName.toUpperCase() + "\n " + lastName.toUpperCase() + " \n" + firstName.toLowerCase() + " \n" + lastName.toLowerCase() + "\n " + "In Reverse: \n" + reversedString + " \n " + reversedString2);


    }


}


















