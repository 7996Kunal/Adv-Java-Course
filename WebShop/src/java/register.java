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
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Administrator
 */
@WebServlet(urlPatterns = {"/register"})
public class register extends HttpServlet {

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
                Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/DBShop","root","");
                PreparedStatement stmt;
                ResultSet rs;
                String msg="";
                if(request.getParameter("b1")!=null)
                {
                    stmt=con.prepareStatement("Insert into members values(?,?,?,?,?,?,?,?,?)");
                    stmt.setString(1,request.getParameter("t1"));
                    stmt.setString(2,request.getParameter("t4"));
                    stmt.setString(3,request.getParameter("t5"));
                    stmt.setString(4,request.getParameter("t6"));
                    stmt.setString(5,request.getParameter("t7"));
                    stmt.setString(6,request.getParameter("t8"));
                    stmt.setString(7,request.getParameter("t9"));
                    stmt.setString(8,request.getParameter("t10"));
                    stmt.setString(9,request.getParameter("t11"));
                    stmt.executeUpdate();
                    stmt=con.prepareStatement("Insert into users values(?,?,'MEMBER')");
                    stmt.setString(1,request.getParameter("t1"));
                    stmt.setString(2,request.getParameter("t2"));
                    stmt.executeUpdate();
                    msg="Registration Complete";
                }
                HttpSession hs=request.getSession(false);
                String ss="<a href='login'>Login</a>";
                if(hs!=null)
                {
                    ss="<a href='logout'>Logout</a>";
                }
                PrintWriter out=response.getWriter();
                response.setContentType("text/html");
                out.write("<html><body>");
                out.write("<img src='banner.jpg' width='100%' height='200px'><hr>");
                out.write("<table width='100%'><tr><td><a href='index'>Home</a></td><td><a href='categories'>Categories</a></td><td><a href='products'>Products</a></td><td><a href='help'>Contact Us/Help</a></td><td><a href='myaccount'>My Account</a></td><td><a href='register'>Register</a></td><td>"+ss+"</td><td><a href='basket'>Basket</a></td></tr></table><hr>");
                out.write("<form method='post'>");
                out.write("<table align='center'>");
                out.write("<tr><td>Email:</td><td><input type='email' name='t1'></td><td></td></tr>");
                out.write("<tr><td>Password:</td><td><input type='password' name='t2'></td><td></td></tr>");
                out.write("<tr><td>Re-Type Password:</td><td><input type='password' name='t3'></td><td></td></tr>");
                out.write("<tr><td>Name:</td><td><input type='text' name='t4'></td><td></td></tr>");
                out.write("<tr><td>Mobile:</td><td><input type='text' name='t5'></td><td></td></tr>");
                out.write("<tr><td>Address:</td><td><textarea name='t6'></textarea></td><td></td></tr>");
                out.write("<tr><td>State:</td><td><select name='t7'><option>Uttar Pradesh</option><option>Pinjab</option><option>Delhi</option><option>Madhya Pradesh</option></select></td><td></td></tr>");
                out.write("<tr><td>City:</td><td><select name='t8'><option>Meerut</option><option>Kanpur</option><option>Delhi</option></select></td><td></td></tr>");
                out.write("<tr><td>Pin Code:</td><td><input type='text' name='t9'></td><td></td></tr>");
                out.write("<tr><td>Security Question:</td><td><select name='t10'><option>Pet Name?</option><option>Favorite Destination?</option><option>First School?</option></select></td><td></td></tr>");
                out.write("<tr><td>Answer:</td><td><input type='text' name='t11'></td><td></td></tr>");
                out.write("<tr><td></td><td><input type='submit' name='b1' value='Register'></td><td></td></tr>");
                out.write("<tr><td></td><td><font color='red'>"+msg+"</font></td><td></td></tr>");
                out.write("</table>");
                out.write("</form>");
                out.write("<hr><img src='footer.jpg' width='100%' height='150px'>");
                out.write("</body></html>");
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
