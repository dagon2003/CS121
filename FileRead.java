// Dagon Katz
// 09/19/2022
// CS121 Activity 10

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileRead {
    public static void main(String[] args) {
        // file on Desktop
        File inputFile1 = new File("C:/Users/dagon_3ic7918/OneDrive/Documents/Courses.txt");
        // file in a project folder
        File inputFile2 = new File ("Courses.txt");
        try{
            Scanner input = new Scanner(inputFile1);
            // read the header and print it to the console
            String header = input.nextLine();
            System.out.println(header);
            // read the values
            while (input.hasNextLine()){
                String course = input.next();
                int credits = Integer.parseInt(input.next());
                int score = Integer.parseInt(input.next());
                System.out.printf("%-7s %3d %7d\n", course, credits, score);
            }
            input.close();
        }catch (FileNotFoundException e){
            System.err.println("File Not Found");

        }
    }
}
