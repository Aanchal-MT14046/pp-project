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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Complaint extends JFrame implements ActionListener{
    JLabel CLabel;
    TextField cText;
    JButton submit;
    
   Complaint(){
        setVisible(true);
        setSize(700, 700);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Complaint");
         
       
       cText=new TextField();
       submit=new JButton("Submit");
       CLabel= new JLabel("Any Complaints/Suggestions??");
       
        CLabel.setBounds(80, 110, 200, 30);
         cText.setBounds(300, 110, 200, 30);
         submit.setBounds(80, 350, 100, 30);
       add(CLabel);
       add(cText);
       submit.addActionListener(this);
        add(submit);
        
        
        
    }
    
    public static void main (String agrd[])
    {
       new Complaint();
    }    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==submit){
            try {
                Dbconnect.Adddata(cText.getText());
            } catch (SQLException ex) {
                Logger.getLogger(Complaint.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
    
}}