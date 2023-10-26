/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Settergetter;

/**
 *
 * @author UsEr
 */
public class Maintugassettergetter {
    public static void main(String[]args){
        Tugassettergatter customer = new Tugassettergatter();
        customer.SetNama("Alif Khoirun Nisa");
        customer.SetNo_Pelanggan("52437689078");
        
        System.out.println("Nama pelanggan : "+customer.GetNama());
        System.out.println("Nomor Pelanggan : "+customer.GetNo_Pelanggan());
    }
}
