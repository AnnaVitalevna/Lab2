/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author yanut_000
 */
public class Lab2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int passwordLength;
        System.out.print("Enter your password length:  ");
        Scanner scan = new Scanner(System.in);
        passwordLength = scan.nextInt();
        PasswordGenerator password = new PasswordGenerator();
        System.out.println(password.generate(passwordLength));
    }
}
 
