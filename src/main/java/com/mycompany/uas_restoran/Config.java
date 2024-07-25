/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uas_restoran;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Ritz
 */
public class Config {
    
    private String nama_karyawan;

    public String getNama_karyawan() {
        return this.nama_karyawan;
    }

    public void setNama_karyawan(String nama_karyawan) {
        this.nama_karyawan = nama_karyawan;
        
        System.out.println("user: "+ this.nama_karyawan);
    }
    
    
    public static void FilterHuruf(KeyEvent a){
        if(Character.isDigit(a.getKeyChar())){
            a.consume();
            JOptionPane.showMessageDialog(null, "Input huruf!", "Warning", 
           JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public static void FilterAngka(KeyEvent a){
        if(Character.isAlphabetic(a.getKeyChar())){
            a.consume();
            JOptionPane.showMessageDialog(null, "Input angka!", "Warning", 
       JOptionPane.WARNING_MESSAGE);
        }
    }
}
