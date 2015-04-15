/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aanchal.ppproject;

import java.awt.Desktop;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author AANCHAL SINGH
 */
public class FeePayment {
    
    FeePayment()
    {
         URL url = null;
            try {
                url = new URL("https://erp.iiitd.edu.in/loginIndex.action");
            } catch (MalformedURLException ex) {
                Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
            }
            openWebpage(url);
    }
   public static void openWebpage(URI uri) {
    Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
    if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
        try {
            desktop.browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public static void openWebpage(URL url) {
    try {
        openWebpage(url.toURI());
    } catch (URISyntaxException e) {
        e.printStackTrace();
    }
}



    
    
    
}