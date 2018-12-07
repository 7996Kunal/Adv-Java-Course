/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import javax.servlet.http.HttpSession;
/**
 *
 * @author Administrator
 */
@WebServlet(urlPatterns = {"/dologin"})
public class dologin extends HttpServlet {

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
                String s1=request.getParameter("t1");
                String s2=request.getParameter("t2");
                Class.forName("org.gjt.mm.mysql.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/BankAppDB","root","");
                PreparedStatement stmt;
                ResultSet rs;
                stmt=con.prepareStatement("Select * from Users where ulogin=? and upass=?");
                stmt.setString(1,s1);
                stmt.setString(2,s2);
                rs=stmt.executeQuery();
                if(rs.next())
                {
                    String type=rs.getString("utype");
                    HttpSession hs=request.getSession(true);
                    hs.setAttribute("UID",s1);
                    hs.setAttribute("UTYPE",type);
                    hs.setAttribute("CON",con);
                    if(type.equals("ADMIN"))
                    {
                        response.sendRedirect("admin");
                    }
                    if(type.equals("EMPLOYEE"))
                    {
                        response.sendRedirect("employee");
                    }
                    if(type.equals("CUSTOMER"))
                    {
                        response.sendRedirect("customer");
                    } 
                }
                else
                {
                    response.sendRedirect("index");
                }
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
