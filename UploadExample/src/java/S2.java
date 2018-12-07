/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.sql.*;
/**
 *
 * @author Administrator
 */
@WebServlet(urlPatterns = {"/S2"})
public class S2 extends HttpServlet {

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
                PrintWriter out=response.getWriter();
                response.setContentType("text/html");
                int size=request.getContentLength();
                //String s2=request.getContentType();
                byte[] data=new byte[size];
                InputStream inr=request.getInputStream();
                int read=0;
                int remaining=size;
                while(remaining>0)
                {
                    int x=inr.read(data,read,remaining);
                    read=read+x;
                    remaining=remaining-x;
                }
                String str=new String(data);
                int p1=str.indexOf("\r\n");
                String bndry=str.substring(0,p1);
                
                p1=str.indexOf("name=\"t1\"")+13;
                int p2=str.indexOf(bndry,p1)-2;
                String s1=str.substring(p1,p2);
                
                p1=str.indexOf("name=\"t2\"")+13;
                p2=str.indexOf(bndry,p1)-2;
                String s2=str.substring(p1,p2);
                //Extraction of File Details
                p1=str.indexOf("name=\"t3\"");
                p1=str.indexOf("filename=",p1)+10;
                p2=str.indexOf("\"",p1);
                String filename=str.substring(p1,p2);
                
                p1=str.indexOf("Content-Type:",p1)+14;
                p2=str.indexOf("\r\n\r\n",p1);
                String filetype=str.substring(p1,p2);
                
                int filestart=p2+4;
                int fileend=str.indexOf(bndry,filestart)-3;
                int filesize=fileend-filestart+1;
                byte[] filedata=new byte[filesize];
                System.arraycopy(data, filestart,filedata ,0,filesize);              
                //FileOutputStream fout=new FileOutputStream("d:/"+filename);
                //fout.write(filedata);
                //fout.close();
                Class.forName("org.gjt.mm.mysql.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/dbshop","root","");
                PreparedStatement stmt=con.prepareStatement("Insert into product values(?,?,?)");
                stmt.setString(1,s1);
                stmt.setString(2,s2);
                stmt.setBytes(3,filedata);
                stmt.executeUpdate();
                con.close();
                response.sendRedirect("S1");
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
