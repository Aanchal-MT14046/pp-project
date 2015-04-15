/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aanchal.ppproject;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AANCHAL SINGH
 */
public class MessMenu {
    MessMenu(){
    File file = new File("C:/Users/AANCHAL SINGH/Downloads/Menu_April.pdf");
  try{  
    if (file.toString().endsWith(".pdf")) 
        try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + file);
    } catch (IOException ex) {
        Logger.getLogger(MessMenu.class.getName()).log(Level.SEVERE, null, ex);
    }
    else {
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.open(file);
        } catch (IOException ex) {
            Logger.getLogger(MessMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
}}

    catch(Exception e)
    {
        
    }}

}