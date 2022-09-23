import javax.swing.*;
import javax.swing.JOptionPane;
import java.util.Scanner;


public class Login {
    public static void main(String[] args){
        /*Login*/
        String userName= "LD";
        String password = "secret";
        String name;
        String pw;
        String message;

        name= JOptionPane.showInputDialog("Enter user name");
        pw=JOptionPane.showInputDialog("Enter Password");
        if(userName.equals(name) && password.equals(pw)){
            message = "Welcome To CS 121";
        } else if (userName.equals(name)&& !password.equals(pw)){
            message = "Password is incorrect";

        } else if (!userName.equals(name)&& password.equals(pw)){
            message = "username is incorrect";
        }else{
            message = "Username and password are incorrect";
        }
        JOptionPane.showMessageDialog(null,message);
    }
}
