/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
@WebServlet(urlPatterns = {"/DB"})
public class DB extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    {
        try{
                Class.forName("org.gjt.mm.mysql.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1","root","");
                PreparedStatement stmt;
                stmt=con.prepareStatement("Create Database BankAppDB");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Use BankAppDB");
                stmt.executeUpdate();
                stmt=con.prepareStatement("CREATE TABLE ACCOUNTS(ACODE INT,ACCDETAILS VARCHAR(30))");
                stmt.executeUpdate();
                stmt=con.prepareStatement("INSERT INTO ACCOUNTS VALUES(11,'SAVING ACCOUNT')");                
                stmt.executeUpdate();
                stmt=con.prepareStatement("INSERT INTO ACCOUNTS VALUES(12,'CURRENT ACCOUNT')");                
                stmt.executeUpdate();
                stmt=con.prepareStatement("INSERT INTO ACCOUNTS VALUES(13,'SALARY ACCOUNT')");                
                stmt.executeUpdate();
                stmt=con.prepareStatement("INSERT INTO ACCOUNTS VALUES(14,'LOAN ACCOUNT')");                
                stmt.executeUpdate();
                stmt=con.prepareStatement("CREATE TABLE CUSTOMERS(ACCNO VARCHAR(7) PRIMARY KEY,NAME VARCHAR(30),FATHER VARCHAR(30),MOTHER VARCHAR(30),DOB DATE,ADDRESS  VARCHAR(30),STATE  VARCHAR(30),CITY VARCHAR(30),PINCODE VARCHAR(6),MOBILE VARCHAR(10),EMAIL VARCHAR(30),PANNO VARCHAR(10),AADHAR VARCHAR(12),BALANCEAMT INT)");                
                stmt.executeUpdate();
                stmt=con.prepareStatement("CREATE TABLE CUSTOMERDETAILS(ACCNO VARCHAR(7),PHOTO MEDIUMBLOB,PHOTOTYPE VARCHAR(20))");                
                stmt.executeUpdate();
                stmt=con.prepareStatement("CREATE TABLE USERS(ULOGIN VARCHAR(20),UPASS VARCHAR(20),UTYPE VARCHAR(10))");                
                stmt.executeUpdate();
                stmt=con.prepareStatement("INSERT INTO USERS VALUES('ADMIN','ADMIN123','ADMIN')");                
                stmt.executeUpdate();
                stmt=con.prepareStatement("CREATE TABLE EMP(EID VARCHAR(10),NAME VARCHAR(20),DESIGNATON VARCHAR(20),DOA DATE,SALARY INT)");                
                stmt.executeUpdate();
                stmt=con.prepareStatement("CREATE TABLE BANKTRANS(TID INT,ACCNO VARCHAR(7),AMT INT,TTYPE VARCHAR(1),DETAILS VARCHAR(30),TDATE DATE)");                
                stmt.executeUpdate();
                PrintWriter out=response.getWriter();
                out.write("Done");
        }catch(Exception ee){System.out.println(ee);}
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
