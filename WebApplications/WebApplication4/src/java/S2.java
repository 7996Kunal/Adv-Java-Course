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
                out.write("<html><body>");
                Class.forName("org.gjt.mm.mysql.Driver");
                Connection con;
                con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/db1","root","");
                PreparedStatement stmt;
                stmt=con.prepareStatement("Insert into emp1 values(101,'Abhay Kumar','CEO',32000,'9685458787','2017-5-25')");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Insert into emp values(102,'Rajesh Kumar','Manager',30000,'7458965874','2017-5-25')");
                stmt.executeUpdate(); 
                stmt=con.prepareStatement("Insert into emp values(103,'Amit Kumar','Manager',31000,'7458965854','2017-6-5')");
                stmt.executeUpdate(); 
                stmt=con.prepareStatement("Delete from emp where eid=104");
                stmt.executeUpdate(); 
                stmt=con.prepareStatement("Insert into users values('a1','a2')");                
                stmt.executeUpdate(); 
                stmt=con.prepareStatement("Insert into users values('b1','b2')");                
                stmt.executeUpdate(); 
                stmt=con.prepareStatement("Insert into users values('c1','c2')");                
                stmt.executeUpdate(); 
                out.write("Done");
                out.write("</body></html>");
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
