/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.party;
import javax.swing.*;
/**
 *
 * @author lab_services_student
 */
public class Party {

    public static void main(String[] args) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Please enter your age"));
        String gender = JOptionPane.showInputDialog("Please enter your gender");
        int price = 0;
        int people = Integer.parseInt(JOptionPane.showInputDialog("How many people are entering"));
        
        if(age < 18)
        {
            JOptionPane.showMessageDialog(null, "Denied. \nToo Young");
        }
        else if( age >= 18 &&  age  < 35)
        {
            JOptionPane.showMessageDialog(null, "Access granted");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Denied. \nToo Old");
        }
        if(gender.equalsIgnoreCase("male"))
        {
            price = 10;
        }
        price = price * people;
        JOptionPane.showMessageDialog(null, "Please pay: R" + price);
    }
}
