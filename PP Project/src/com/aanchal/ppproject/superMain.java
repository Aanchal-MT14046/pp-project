package com.aanchal.ppproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AANCHAL SINGH
 */
public class superMain extends JFrame implements ActionListener {
    
    JButton b1,b2,b3;
  
    superMain(){
        
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        b1=new JButton("Hostel Section"); 
        b2=new JButton("Mess Section"); 
        b3=new JButton("Exit"); 
        
       
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        
        b1.setBounds(200, 100, 200, 30);
        b2.setBounds(200, 150, 200, 30);
        b3.setBounds(200, 200, 200, 30);
        
        
        add(b1);
        add(b2);
        add(b3);
            }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
             new main(); 
            
        }
        else if(e.getSource()==b2){
            //new mess
        }
        else if(e.getSource()==b3){
           //exit button
        }
        
    }
    public static void main(String arg[])
    {
        new superMain();
    }
}
