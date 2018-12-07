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
@WebServlet(urlPatterns = {"/products"})
public class products extends HttpServlet {

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
                String cid=request.getParameter("cid");
                if(cid!=null)
                {
                    stmt=con.prepareStatement("select count(*) from Products where cid=?");
                    stmt.setString(1,cid);
                }
                else
                {
                    stmt=con.prepareStatement("select count(*) from Products");
                }
                int n=0;
                rs=stmt.executeQuery();
                if(rs.next()) n=rs.getInt(1);
                n=(int)Math.ceil(n/3.0);
                out.write("<table align='center'>");                
                if(cid!=null)
                {
                    stmt=con.prepareStatement("select * from Products where cid=?");
                    stmt.setString(1,cid);
                }
                else
                {
                    stmt=con.prepareStatement("select * from Products");
                    cid="0";
                }
                rs=stmt.executeQuery();
                for(int i=1;i<=n;i++)
                {
                    out.write("<tr align='center'>");
                    if(rs.next())
                    {
                        String pid=rs.getString(1);
                        String ccid=rs.getString(2);
                        String name=rs.getString(3);
                        String desc=rs.getString(4);
                        String price=rs.getString(5);
                        int qty=rs.getInt(6);
                        String photo=rs.getString(7);
                        out.write("<td>");
                        out.write("<img src='"+photo+"' width='300px' height='300px'>");
                        out.write("<br>"+name+"<br>"+desc+"<br>Rs "+price+"/-");
                        out.write("<br><a href='addinbasket?cid="+cid+"&pid="+pid+"'><img src='buynow.jpg' width='200px'></a>");
                        out.write("</td>");
                    }
                    else
                    {
                        out.write("<td></td>");
                    }
                    if(rs.next())
                    {
                       String pid=rs.getString(1);
                        String ccid=rs.getString(2);
                        String name=rs.getString(3);
                        String desc=rs.getString(4);
                        String price=rs.getString(5);
                        int qty=rs.getInt(6);
                        String photo=rs.getString(7);
                        out.write("<td>");
                        out.write("<img src='"+photo+"' width='300px' height='300px'>");
                        out.write("<br>"+name+"<br>"+desc+"<br>Rs "+price+"/-");
                        out.write("<br><a href='addinbasket?cid="+cid+"&pid="+pid+"'><img src='buynow.jpg' width='200px'></a>");
                        out.write("</td>");
                    }
                    else
                    {
                        out.write("<td></td>");
                    }
                    if(rs.next())
                    {
                       String pid=rs.getString(1);
                        String ccid=rs.getString(2);
                        String name=rs.getString(3);
                        String desc=rs.getString(4);
                        String price=rs.getString(5);
                        int qty=rs.getInt(6);
                        String photo=rs.getString(7);
                        out.write("<td>");
                        out.write("<img src='"+photo+"' width='300px' height='300px'>");
                        out.write("<br>"+name+"<br>"+desc+"<br>Rs "+price+"/-");
                        out.write("<br><a href='addinbasket?cid="+cid+"&pid="+pid+"'><img src='buynow.jpg' width='200px'></a>");
                        out.write("</td>");
                    }
                    else
                    {
                        out.write("<td></td>");
                    }
                    
                    out.write("</tr>");
                }
                out.write("</table>");
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
