<<<<<<< HEAD
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Asus
 */
public class Latihan2 {
    public static void main(String[]Args){
        JFrame j = new JFrame();
        JLabel judul = new JLabel();
        judul.setText("Form Buku");
        judul.setBounds(270, 30, 100, 30);
        j.add(judul);
        
        JLabel buku = new JLabel();
        buku.setText("Judul Buku");
        buku.setBounds(125, 100, 100, 30);
        j.add(buku);
        
        JTextField bukuTxt = new JTextField();
        bukuTxt.setBounds(225, 100, 200, 30);
        j.add(bukuTxt);
        
        JLabel kode = new JLabel();
        kode.setText("Kode Buku");
        kode.setBounds(125, 145, 100, 30);
        j.add(kode);
        
        JTextField ISBNTxt = new JTextField();
        ISBNTxt.setBounds(225, 145, 200, 30);
        j.add(ISBNTxt);
        
        JLabel pengarang = new JLabel();
        pengarang.setText("Pengarang");
        pengarang.setBounds(125, 190, 100, 30);
        j.add(pengarang);
        
        JTextField pengarangTxt = new JTextField();
        pengarangTxt.setBounds(225, 190, 200, 30);
        j.add(pengarangTxt);
        
        JLabel penerbit = new JLabel();
        penerbit.setText("Penerbit");
        penerbit.setBounds(125, 235, 100, 30);
        j.add(penerbit);
        
        JTextField penerbitTxt = new JTextField();
        penerbitTxt.setBounds(225, 235, 200, 30);
        j.add(penerbitTxt);
        
        JLabel tahun = new JLabel();
        tahun.setText("Tahun Terbit");
        tahun.setBounds(125, 280, 100, 30);
        j.add(tahun);
        
        String tahun1[] = new String[2023];
        int n = 1990;
        for(int i = 0; i < 2023; i++){
            tahun1[i] = n + "";
            n++;
        }
        JComboBox tahuncb = new JComboBox(tahun1);
        tahuncb.setBounds(225, 280, 200, 30);
        j.add(tahuncb);
        
        JLabel jenis = new JLabel();
        jenis.setText("Jenis Buku");
        jenis.setBounds(125, 325, 100, 30);
        j.add(jenis);
        
        JRadioButton jenisradio1 = new JRadioButton("Fiksi");
        jenisradio1.setBounds(225, 325, 65, 30);
        j.add(jenisradio1);
        
        JRadioButton jenisradio2 = new JRadioButton("Non Fiksi");
        jenisradio2.setBounds(290, 325, 100, 30);
        j.add(jenisradio2);
        
        ButtonGroup G1 = new ButtonGroup();
        G1.add(jenisradio1);
        G1.add(jenisradio2);
        
        JLabel ket = new JLabel();
        ket.setText("Keterangan");
        ket.setBounds(125, 370, 100, 30);
        j.add(ket);
        
        JTextArea ketTxt = new JTextArea();
        ketTxt.setBounds(225, 370, 200, 100);
        j.add(ketTxt);
        
        JButton button = new JButton();
        button.setText("Save");
        button.setBounds(355, 490, 70, 24);
        j.add(button);
        
        j.setSize(600, 750);
        j.setLayout(null);
        j.setVisible(true);
    }
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan2;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Asus
 */
public class Latihan2 {
    public static void main(String[]Args){
        JFrame j = new JFrame();
        JLabel judul = new JLabel();
        judul.setText("Form Buku");
        judul.setBounds(270, 30, 100, 30);
        j.add(judul);
        
        JLabel buku = new JLabel();
        buku.setText("Judul Buku");
        buku.setBounds(125, 100, 100, 30);
        j.add(buku);
        
        JTextField bukuTxt = new JTextField();
        bukuTxt.setBounds(225, 100, 200, 30);
        j.add(bukuTxt);
        
        JLabel kode = new JLabel();
        kode.setText("Kode Buku");
        kode.setBounds(125, 145, 100, 30);
        j.add(kode);
        
        JTextField ISBNTxt = new JTextField();
        ISBNTxt.setBounds(225, 145, 200, 30);
        j.add(ISBNTxt);
        
        JLabel pengarang = new JLabel();
        pengarang.setText("Pengarang");
        pengarang.setBounds(125, 190, 100, 30);
        j.add(pengarang);
        
        JTextField pengarangTxt = new JTextField();
        pengarangTxt.setBounds(225, 190, 200, 30);
        j.add(pengarangTxt);
        
        JLabel penerbit = new JLabel();
        penerbit.setText("Penerbit");
        penerbit.setBounds(125, 235, 100, 30);
        j.add(penerbit);
        
        JTextField penerbitTxt = new JTextField();
        penerbitTxt.setBounds(225, 235, 200, 30);
        j.add(penerbitTxt);
        
        JLabel tahun = new JLabel();
        tahun.setText("Tahun Terbit");
        tahun.setBounds(125, 280, 100, 30);
        j.add(tahun);
        
        String tahun1[] = {"2023","2022","2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008"};
        JComboBox tahuncb = new JComboBox(tahun1);
        tahuncb.setBounds(225, 280, 200, 30);
        j.add(tahuncb);
        
        JLabel jenis = new JLabel();
        jenis.setText("Jenis Buku");
        jenis.setBounds(125, 325, 100, 30);
        j.add(jenis);
        
        JRadioButton jenisradio1 = new JRadioButton("Fiksi");
        jenisradio1.setBounds(225, 325, 65, 30);
        j.add(jenisradio1);
        
        JRadioButton jenisradio2 = new JRadioButton("Non Fiksi");
        jenisradio2.setBounds(290, 325, 100, 30);
        j.add(jenisradio2);
        
        ButtonGroup G1 = new ButtonGroup();
        G1.add(jenisradio1);
        G1.add(jenisradio2);
        
        JLabel keterangan = new JLabel();
        keterangan.setText("Keterangan");
        keterangan.setBounds(125, 370, 100, 30);
        j.add(ket);
        
        JTextArea keteranganTxt = new JTextArea();
        keteranganTxt.setBounds(225, 370, 200, 100);
        j.add(keteranganTxt);
        
        JButton button = new JButton();
        button.setText("Save");
        button.setBounds(355, 490, 70, 24);
        j.add(button);
        
        j.setSize(600, 750);
        j.setLayout(null);
        j.setVisible(true);
    }
}
>>>>>>> origin/master
