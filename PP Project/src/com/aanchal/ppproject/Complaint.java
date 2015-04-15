package com.aanchal.ppproject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;


public class Complaint extends JFrame implements ActionListener{
    JLabel Complaint,type;
    TextField complaint;
    JButton submit;
    JRadioButton r1,r2,r3,r4;
    Complaint(){
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Complaint= new JLabel("Any Complaints/Suggestions??");
        type= new JLabel("Select the type of complaint");
        complaint= new TextField();
        submit=new JButton("Submit");
        submit.addActionListener(this);
        
        r1=new JRadioButton("Electricity");
        r2=new JRadioButton("Water");
        r3=new JRadioButton("Cleaning");
        r4=new JRadioButton("Furniture");
        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);
        group.add(r4);
      
        
        Complaint.setBounds(200, 30, 200, 60);
        type.setBounds(80, 110, 200, 30);
        r1.setBounds(300, 110, 200, 30);
        r2.setBounds(300, 150, 200, 30);
        r3.setBounds(300, 190, 200, 30);
        r4.setBounds(300, 230, 200, 30);
        complaint.setBounds(200, 300, 400, 30);
        submit.setBounds(200, 370, 200, 40);
        
        add(Complaint);
        add(complaint);
        add(type);
        add(submit);
        add(r1);
        add(r2);
        add(r3);
        add(r4);
    }
    
   
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submit){
               complaint.setText("");
               r1.setSelected(false);
               r2.setSelected(false);
               r3.setSelected(false);
               r4.setSelected(false);
               if(r1.isSelected()){
                   try {
                       Dbconnect.ElectricityComplaint(complaint.getText());
                   } catch (SQLException ex) {
                       Logger.getLogger(Complaint.class.getName()).log(Level.SEVERE, null, ex);
                   }
               }
               else  if(r2.isSelected()){
                   try {
                       Dbconnect.waterComplaint(complaint.getText());
                   } catch (SQLException ex) {
                       Logger.getLogger(Complaint.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   
               }
               else  if(r3.isSelected()){
                   try {
                       Dbconnect.CleaningComplaint(complaint.getText());
                   } catch (SQLException ex) {
                       Logger.getLogger(Complaint.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   
               }
               else  if(r4.isSelected()){
                   try {
                       Dbconnect.FurnitureComplaint(complaint.getText());
                   } catch (SQLException ex) {
                       Logger.getLogger(Complaint.class.getName()).log(Level.SEVERE, null, ex);
                   }
                   
               }
        }
    
    
}}