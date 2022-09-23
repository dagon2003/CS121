//*********************
//Dagon Katz
// CS121
//09/15/2022
//***********************


import java.util.Scanner;

public class testAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = 0;
        double tests = 0;

        do{
            System.out.print("How many students are in your class? ");
            students = sc.nextInt();
            if(students<1)
                System.out.println("Invalid # of students, try again.");
            else{
                do{
                    System.out.print("How many tests in this class? ");
                    tests = sc.nextDouble();
                    if(tests<1)
                        System.out.println("Invalid # of tests, try again.");
                    else{
                        for (int i = 1; i <= students; i++) {
                            System.out.println("****Student #" + i + "****");
                            double sum=0;
                            for (int j = 1; j <= tests; j++) {
                                int score=0;
                                do{
                                    System.out.print("Enter score for test #" + j + ":- ");
                                    score = sc.nextInt();
                                    if(score<1)
                                        System.out.println("Invalid score, try again.");
                                    else{

                                        sum = sum + score;
                                    }
                                }while(score<1);
                            }
                            double avg= sum/tests;
                            System.out.println("Average score for student #" + i + " is " + Math.ceil(avg*100)/100);
                        }

                    }
                }while(tests<1);
            }
        }while(students<1);

    }
}