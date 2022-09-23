import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class fileOutput {
    public static void main(String[] args) throws FileNotFoundException {
        File outputFile = new File("mycourses.txt");
        PrintWriter output = new PrintWriter(outputFile);
        String course;
        String credits;
        String score;
        // write a header for the file with spaces between each
        output.printf(" %s %s %s \n", "course", "credits", "score");
        // ask the user for info for 2 courses
        for (int i = 1; i<=2; i++){
          course=  JOptionPane.showInputDialog(String.format("Enter the name of your course %d", i));
          credits =JOptionPane.showInputDialog("Enter the course crdits");
          score= JOptionPane.showInputDialog("Enter the course score");

          // print infor on one line with spaces between;
            output.printf("%s %s %s\n" ,course, credits,score);



        }
        output.close();


    }
}
