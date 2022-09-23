// Dagon Katz
// 09/08/22
// CS 121 Activity 2
import javax.swing.*;

public class BookClubPoints {
    public static void main(String[]args) {
        int purchases;   // var 1
        int points;      // var 2
        purchases=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of book purchases"));
            if (purchases ==0) points =0;
            if (purchases == 1) points=5;
            if (purchases == 2) points = 15;
            if (purchases == 3) points =30;
            if (purchases >=4) points =60;


        System.out.println("You entered" + purchases);



    }
}

