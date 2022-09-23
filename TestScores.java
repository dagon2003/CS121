import javax.swing.JOptionPane;
import java.util.Scanner;


public class TestScores{
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        int firstTestScore;
        int secondTestScore;
        int thirdTestScore;
        double average;
        char letterGrade;

        firstTestScore = Integer.parseInt(JOptionPane.showInputDialog("What is the first test score?"));
        secondTestScore=Integer.parseInt(JOptionPane.showInputDialog("What is the second test score?"));
        thirdTestScore=Integer.parseInt(JOptionPane.showInputDialog("What is the third test score?"));

        average=(firstTestScore+secondTestScore+thirdTestScore)/3.0;

        if (average >= 90){
            letterGrade = 'A';
        } else if(average >= 80){
            letterGrade = 'B';
        }else if(average >= 70){
            letterGrade = 'C';
        }else if(average >= 60){
            letterGrade = 'D';
        }else{
            letterGrade = 'F';
        }

        JOptionPane.showMessageDialog(null,String.format("You've earned a %c average",letterGrade));
    }

}
