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
                PreparedStatement stmt=con.prepareStatement("Create Database DBShop");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Use DBShop");
                stmt.executeUpdate();
                 stmt=con.prepareStatement("Create Table Users(Email varchar(30),upass varchar(20),utype varchar(15))");
                 stmt.executeUpdate();
                 stmt=con.prepareStatement("Insert into users values('admin@admin.com','admin123','ADMIN')");
                 stmt.executeUpdate();
                 stmt=con.prepareStatement("Create Table Categories(cid int primary key,cname varchar(20),description varchar(30),photo varchar(20))");
                 stmt.executeUpdate();
                 stmt=con.prepareStatement("Create Table Products(pid int primary key,cid int,pname varchar(20),description varchar(30),price int,qty int,photo varchar(20))");
                 stmt.executeUpdate();
                 stmt=con.prepareStatement("Create Table Members(Email varchar(30) Primary Key,Name varchar(30),Mobile varchar(10),Address varchar(40),State varchar(30),City varchar(20),pincode varchar(6),SecretQuestion varchar(40),answer varchar(20))");
                 stmt.executeUpdate();
                 stmt=con.prepareStatement("Create Table Orders(orderid int primary key,odate date,email varchar(30),totalamt int,status varchar(10))");
                 stmt.executeUpdate();
                 stmt=con.prepareStatement("Create Table OrderDetails(orderid int,pcode int,pname varchar(30),price int,qty int,amt int)");
                 stmt.executeUpdate();
                 PrintWriter out=response.getWriter();
                 out.write("Done");
        }catch(Exception ee){}
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
