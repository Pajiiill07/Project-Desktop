/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Asus
 */
public class FormRegistrasi {
    public static void main (String[] Args){
        JFrame j = new JFrame("Form Registrasi");
        JLabel judul = new JLabel();
        judul.setText("Form Registrasi");
        judul.setBounds(200, 30, 100, 45);
        j.add(judul);
                
        JLabel name = new JLabel();
        name.setText("Nama");
        name.setBounds(75, 100, 100, 30);
        j.add(name);
        
        JLabel username = new JLabel();
        username.setText("Username");
        username.setBounds(75, 145, 100, 30);
        j.add(username);
        
        JLabel password = new JLabel();
        password.setText("Password");
        password.setBounds(75, 190, 100, 30);
        j.add(password);
        
        JLabel email = new JLabel();
        email.setText("Email");
        email.setBounds(75, 235, 100, 30);
        j.add(email);
        
        JLabel nomorhp = new JLabel();
        nomorhp.setText("Nomor HP");
        nomorhp.setBounds(75, 280, 100, 30);
        j.add(nomorhp);
        
        JTextArea alamat = new JTextArea();
        alamat.setText("Alamat");
        alamat.setBounds(75, 325, 100, 30);
        j.add(alamat);
        
        JTextField nameTxt = new JTextField();
        nameTxt.setBounds(160, 100, 200, 30);
        j.add(nameTxt);
        
        JTextField usernameTxt = new JTextField();
        usernameTxt.setBounds(160, 145, 200, 30);
        j.add(usernameTxt);
        
        JPasswordField passwordTxt = new JPasswordField();
        passwordTxt.setBounds(160, 190, 200, 30);
        j.add(passwordTxt);
        
        JTextField emailTxt = new JTextField();
        emailTxt.setBounds(160, 235, 200, 30);
        j.add(emailTxt);
        
        JTextField hpTxt = new JTextField();
        hpTxt.setBounds(160, 280, 200, 30);
        j.add(hpTxt);
        
        JTextArea alamatTxt = new JTextArea();
        alamatTxt.setBounds(160, 325, 200, 100);
        j.add(alamatTxt);
                
        JButton button = new JButton();
        button.setText("Register");
        button.setBounds(280, 450, 83, 24);
        j.add(button);
        
        j.setSize(500, 750);
        j.setLayout(null);
        j.setVisible(true);
        
    }
}
