/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aanchal.ppproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author AANCHAL SINGH
 */
public class MessPage extends JFrame implements ActionListener{
JButton menu,fee,mess_complaint;
MessPage(){
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        menu=new JButton("Mess Menu"); 
        fee=new JButton("Fee Payment");
        mess_complaint=new JButton("Complaints"); 
        menu.addActionListener(this);
        mess_complaint.addActionListener(this);
        fee.addActionListener(this);
        menu.setBounds(200, 100, 200, 30);
        mess_complaint.setBounds(200, 200, 200, 30);
        fee.setBounds(200,300,200,30);
        add(menu);
        add(mess_complaint);
        add(fee);
        }

@Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==menu){
           new MessMenu(); 
        }
        else if(e.getSource()==fee){
           new FeePayment();
        }
        else if(e.getSource()==mess_complaint){
           new MessComplaint();
        }
    }
    
}
