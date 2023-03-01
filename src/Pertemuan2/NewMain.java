/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Asus
 */
public class NewMain {
    public static void main(String[] args){
        JFrame j = new JFrame("JFrame Pertama");
        JLabel username = new JLabel();
        username.setText("Username");
        username.setBounds(75, 100, 100, 30);
        j.add(username);
        
        JLabel password = new JLabel();
        password.setText("Password");
        password.setBounds(75, 145, 100, 30);
        j.add(password);
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(150, 100, 200, 30);
        j.add(usernameTxt);
        
        JPasswordField passwordTxt = new JPasswordField();
        passwordTxt.setBounds(150, 145, 200, 30);
        j.add(passwordTxt);
        
        JButton button = new JButton();
        button.setText("Login");
        button.setBounds(200, 190, 70, 24);
        j.add(button);
        
        j.setSize(500, 500);
        j.setLayout(null);
        j.setVisible(true);
        
    }
}
