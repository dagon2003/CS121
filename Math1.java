import java.util.Scanner;

public class Math1 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number.");
        int number1 = in.nextInt();

        System.out.print("Input second number.");
        int number2 = in.nextInt();

        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));

        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));

        System.out.println(number1 + " x " + number2 + " = " + (number1 * number2));

        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));

        System.out.println(Math.sqrt(number1));

        System.out.println(Math.sqrt(number2));

        System.out.println(Math.pow(number1,number2));

        System.out.println(Math.pow(number2,number1));

        System.out.println(Math.log(number1));

        System.out.println(Math.log(number2)) ;





        }

}
