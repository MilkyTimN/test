package RegexPractice;

import RegexPractice.User;
import RegexPractice.WrongLoginException;
import RegexPractice.WrongPasswordException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User user = new User();
        register(user);
        authorize(user);

    }



    public static User register(User user) {

        Scanner scanner = new Scanner(System.in);

        //Checking login
        String tempLogin = "";
        while (true){
            System.out.println("Enter login");
            tempLogin = scanner.nextLine();
            if (tempLogin.matches("[A-z^0-9[@$!%*#?&]]{8,}"))
                break;
            else {
                try {
                    throw new WrongLoginException("Login has incorrect symbol or not enough symbols");
                } catch (WrongLoginException e) {
                    e.printStackTrace();
                }
            }
        }

        //Checking password
        String tempPassword = "";
        while (true){
            System.out.println("Enter password");
            tempPassword = scanner.nextLine();
            if (tempPassword.matches("[A-z^0-9[@$!%*#?&]]{8,}"))
                break;
            else {
                try {
                    throw new WrongPasswordException("Password has incorrect symbol or not enough symbols");
                } catch (WrongPasswordException e) {
                    e.printStackTrace();
                }
            }
        }

        //Confirm password
        String tempConfirmPassword = "";
        while (true){
            System.out.println("Confirm password");
            tempConfirmPassword = scanner.nextLine();
            if (tempConfirmPassword.equals(tempPassword)){
                break;
            } else {
                try {
                    throw new WrongPasswordException("Passwords not same");
                } catch (WrongPasswordException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("You are registered successfully");

        user.setLogin(tempLogin);
        user.setPassword(tempPassword);
        user.setConfirmPassword(tempConfirmPassword);

        return user;
    }

    public static void authorize(User user){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Authorization");


        //Authorize login
        while (true) {
            System.out.println("Enter your login");
            String authLogin = scanner.nextLine();
            if (authLogin.equals(user.getLogin()))
                break;
            else {
                try {
                    throw new WrongLoginException("Login " + authLogin + " not found");
                } catch (WrongLoginException e) {
                    e.printStackTrace();
                }
            }
        }

        //Authorize password
        while (true){
            System.out.println("Enter your password");
            String authPassword = scanner.nextLine();

            if (authPassword.equals(user.getPassword()))
                break;
            else {
                try {
                    throw new WrongPasswordException("Incorrect password");
                } catch (WrongPasswordException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("You are logged in");
        System.out.println("Welcome!");
    }
}
