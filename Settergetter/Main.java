/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Settergetter;

/**
 *
 * @author UsEr
 */
public class Main {
    public static void main(String[]args){
                User user = new User();
        user.SetUsername("Alif Khoirun Nisa");
        user.Setpassword("Loveyou");
        
        System.out.println("Usernamenya = "+user.GetUsername());
        System.out.println("Passowrdnya = "+user.GetPassword());
    }

    }
