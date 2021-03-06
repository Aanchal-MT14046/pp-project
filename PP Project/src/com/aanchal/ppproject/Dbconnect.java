package com.aanchal.ppproject;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AANCHAL SINGH
 */

public class Dbconnect {
    
static final String MyDriver="com.mysql.jdbc.Driver";  
static final String MyDbUrl="jdbc:mysql://localhost/HostelData";
static final String dbuser = "root";
static final String password = "social";
static private Connection connection= null;
static private Statement st= null;
static private PreparedStatement pst=null;
    
     public static void Addata(String name, String rollno, String Email,String phone,String State) throws SQLException
       {
           System.out.println("entered appdat");
            String Name = name;
            String Rollno = rollno;
            String EmailID=Email;
            String PhoneNo=phone;
            String state = State;
           
              try {
               	Class.forName(MyDriver);
               	connection = DriverManager.getConnection(MyDbUrl,dbuser,password);
               	
                   String sqlstatement;
                   sqlstatement = "INSERT INTO appdata VALUES(?,?,?,?,?)";
                   pst= connection.prepareStatement(sqlstatement);
                   pst.setString(1,Name);
                   pst.setString(2,Rollno);
                   pst.setString(3,EmailID);
                   pst.setString(4,PhoneNo);
                   pst.setString(5,state);
                   
                   int rows =pst.executeUpdate();
                   System.out.println("Rows impacted : " + rows );
                   pst.close();
                   connection.close();
                   
       			
       			
       		} catch (ClassNotFoundException | SQLException e) {
       			// TODO Auto-generated catch block
       			e.printStackTrace();
       		}
               finally{
                   
                   try{
                      if(pst!=null)
                         pst.close();
                   }catch(SQLException se2){
                   }
                   try{
                      if(connection!=null)
                      connection.close();
                   }catch(SQLException se){
                      se.printStackTrace();
                   }
                
                } 
      
       }

     
    public static void ElectricityComplaint (String complaint) throws SQLException
       {
            String Complaint = complaint;
           try {
               	Class.forName(MyDriver);
               	connection = DriverManager.getConnection(MyDbUrl,dbuser,password);
               	
                   String sqlstatement;
                   sqlstatement = "INSERT INTO electricitycomplaints VALUES(?)";
                   pst= connection.prepareStatement(sqlstatement);
                   pst.setString(1,Complaint);
                   
                   int rows =pst.executeUpdate();
                   System.out.println("Rows impacted : " + rows );
                   pst.close();
                   connection.close();
                   
       			
       			
       		} catch (ClassNotFoundException | SQLException e) {
       			// TODO Auto-generated catch block
       			e.printStackTrace();
       		}
               finally{
                   
                   try{
                      if(pst!=null)
                         pst.close();
                   }catch(SQLException se2){
                   }
                   try{
                      if(connection!=null)
                      connection.close();
                   }catch(SQLException se){
                      se.printStackTrace();
                   }
                
                } 
      
       }
      public static void waterComplaint (String complaint) throws SQLException
       {
           
            String Complaint = complaint;
           
              try {
               	Class.forName(MyDriver);
               	connection = DriverManager.getConnection(MyDbUrl,dbuser,password);
               	
                   String sqlstatement;
                   sqlstatement = "INSERT INTO watercomplaint VALUES(?)";
                   pst= connection.prepareStatement(sqlstatement);
                   pst.setString(1,Complaint);
                   
                   int rows =pst.executeUpdate();
                   System.out.println("Rows impacted : " + rows );
                   pst.close();
                   connection.close();
                   
       			
       			
       		} catch (ClassNotFoundException | SQLException e) {
       			// TODO Auto-generated catch block
       			e.printStackTrace();
       		}
               finally{
                   
                   try{
                      if(pst!=null)
                         pst.close();
                   }catch(SQLException se2){
                   }
                   try{
                      if(connection!=null)
                      connection.close();
                   }catch(SQLException se){
                      se.printStackTrace();
                   }
                
                } 
      
       }
       public static void CleaningComplaint(String complaint) throws SQLException
       {
            String Complaint = complaint;
           
              try {
               	Class.forName(MyDriver);
               	connection = DriverManager.getConnection(MyDbUrl,dbuser,password);
               	
                   String sqlstatement;
                   sqlstatement = "INSERT INTO cleaningcomplaint VALUES(?)";
                   pst= connection.prepareStatement(sqlstatement);
                   pst.setString(1,Complaint);
                   
                   int rows =pst.executeUpdate();
                   System.out.println("Rows impacted : " + rows );
                   pst.close();
                   connection.close();
                   
       			
       			
       		} catch (ClassNotFoundException | SQLException e) {
       			// TODO Auto-generated catch block
       			e.printStackTrace();
       		}
               finally{
                   
                   try{
                      if(pst!=null)
                         pst.close();
                   }catch(SQLException se2){
                   }
                   try{
                      if(connection!=null)
                      connection.close();
                   }catch(SQLException se){
                      se.printStackTrace();
                   }
                
                } 
      
       }
        public static void FurnitureComplaint(String complaint) throws SQLException
       {
           
            String Complaint = complaint;
           
              try {
               	Class.forName(MyDriver);
               	connection = DriverManager.getConnection(MyDbUrl,dbuser,password);
               	
                   String sqlstatement;
                   sqlstatement = "INSERT INTO furniturecomplaint VALUES(?)";
                   pst= connection.prepareStatement(sqlstatement);
                   pst.setString(1,Complaint);
                   
                   int rows =pst.executeUpdate();
                   System.out.println("Rows impacted : " + rows );
                   pst.close();
                   connection.close();
                   
       			
       			
       		} catch (ClassNotFoundException | SQLException e) {
       			// TODO Auto-generated catch block
       			e.printStackTrace();
       		}
               finally{
                   
                   try{
                      if(pst!=null)
                         pst.close();
                   }catch(SQLException se2){
                   }
                   try{
                      if(connection!=null)
                      connection.close();
                   }catch(SQLException se){
                      se.printStackTrace();
                   }
                
                } 
      
       }
        
        public static void foodComplaint (String complaint) throws SQLException
       {
            String Complaint = complaint;
           try {
               	Class.forName(MyDriver);
               	connection = DriverManager.getConnection(MyDbUrl,dbuser,password);
               	
                   String sqlstatement;
                   sqlstatement = "INSERT INTO foodcomplaints VALUES(?)";
                   pst= connection.prepareStatement(sqlstatement);
                   pst.setString(1,Complaint);
                   
                   int rows =pst.executeUpdate();
                   System.out.println("Rows impacted : " + rows );
                   pst.close();
                   connection.close();
                   
       			
       			
       		} catch (ClassNotFoundException | SQLException e) {
       			// TODO Auto-generated catch block
       			e.printStackTrace();
       		}
               finally{
                   
                   try{
                      if(pst!=null)
                         pst.close();
                   }catch(SQLException se2){
                   }
                   try{
                      if(connection!=null)
                      connection.close();
                   }catch(SQLException se){
                      se.printStackTrace();
                   }
                
                } 
      
       }
      public static void MesswaterComplaint (String complaint) throws SQLException
       {
           
            String Complaint = complaint;
           
              try {
               	Class.forName(MyDriver);
               	connection = DriverManager.getConnection(MyDbUrl,dbuser,password);
               	
                   String sqlstatement;
                   sqlstatement = "INSERT INTO messwatercomplaint VALUES(?)";
                   pst= connection.prepareStatement(sqlstatement);
                   pst.setString(1,Complaint);
                   
                   int rows =pst.executeUpdate();
                   System.out.println("Rows impacted : " + rows );
                   pst.close();
                   connection.close();
                   
       			
       			
       		} catch (ClassNotFoundException | SQLException e) {
       			// TODO Auto-generated catch block
       			e.printStackTrace();
       		}
               finally{
                   
                   try{
                      if(pst!=null)
                         pst.close();
                   }catch(SQLException se2){
                   }
                   try{
                      if(connection!=null)
                      connection.close();
                   }catch(SQLException se){
                      se.printStackTrace();
                   }
                
                } 
      
       }
      public static void MessCleaningComplaint (String complaint) throws SQLException
       {
            String Complaint = complaint;
           try {
               	Class.forName(MyDriver);
               	connection = DriverManager.getConnection(MyDbUrl,dbuser,password);
               	
                   String sqlstatement;
                   sqlstatement = "INSERT INTO mcleancomplaints VALUES(?)";
                   pst= connection.prepareStatement(sqlstatement);
                   pst.setString(1,Complaint);
                   
                   int rows =pst.executeUpdate();
                   System.out.println("Rows impacted : " + rows );
                   pst.close();
                   connection.close();
                   
       			
       			
       		} catch (ClassNotFoundException | SQLException e) {
       			// TODO Auto-generated catch block
       			e.printStackTrace();
       		}
               finally{
                   
                   try{
                      if(pst!=null)
                         pst.close();
                   }catch(SQLException se2){
                   }
                   try{
                      if(connection!=null)
                      connection.close();
                   }catch(SQLException se){
                      se.printStackTrace();
                   }
                
                } 
      
       }
      public static void messMenuComplaint (String complaint) throws SQLException
       {
           
            String Complaint = complaint;
           
              try {
               	Class.forName(MyDriver);
               	connection = DriverManager.getConnection(MyDbUrl,dbuser,password);
               	
                   String sqlstatement;
                   sqlstatement = "INSERT INTO menucomplaint VALUES(?)";
                   pst= connection.prepareStatement(sqlstatement);
                   pst.setString(1,Complaint);
                   
                   int rows =pst.executeUpdate();
                   System.out.println("Rows impacted : " + rows );
                   pst.close();
                   connection.close();
                   
       			
       			
       		} catch (ClassNotFoundException | SQLException e) {
       			// TODO Auto-generated catch block
       			e.printStackTrace();
       		}
               finally{
                   
                   try{
                      if(pst!=null)
                         pst.close();
                   }catch(SQLException se2){
                   }
                   try{
                      if(connection!=null)
                      connection.close();
                   }catch(SQLException se){
                      se.printStackTrace();
                   }
                
                } 
      
       }
    
}
