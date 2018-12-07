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
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Administrator
 */
@WebServlet(urlPatterns = {"/orderconfirm"})
public class orderconfirm extends HttpServlet {

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
                String val="";
                Cookie[] ck=request.getCookies();
                if(ck!=null)
                {
                    for(int i=0;i<ck.length;i++)
                    {
                        String nm=ck[i].getName();
                        if(nm.equals("BASKET"))
                        {
                            val=ck[i].getValue();
                        }
                    }
                }
                stmt=con.prepareStatement("Select count(*)+1 from orders");
                String oid="";
                rs=stmt.executeQuery();
                if(rs.next()) oid=rs.getString(1);
                java.util.Date d=new java.util.Date();
                String dt=(d.getYear()+1900)+"-"+(d.getMonth()+1)+"-"+d.getDate();
                
                String[] pids=val.split("#");
                int sum=0;
                for(int i=1;i<pids.length;i++)
                {
                    stmt=con.prepareStatement("Select * from products where pid=?");
                    stmt.setString(1,pids[i]);
                    rs=stmt.executeQuery();
                    if(rs.next())
                    {
                        int price=rs.getInt("price");
                        sum=sum+price;
                        stmt=con.prepareStatement("Insert into orderdetails values(?,?,?,?,?,?)");
                        stmt.setString(1,oid);    
                        stmt.setString(2,pids[i]);    
                        stmt.setString(3,rs.getString("pname"));    
                        stmt.setInt(4,price);    
                        stmt.setString(5,"1");    
                        stmt.setInt(6,price);    
                        stmt.executeUpdate();
                    }
                    
                }
                stmt=con.prepareStatement("Insert into orders values(?,?,?,?,?)");
                stmt.setString(1,oid);    
                stmt.setString(2,dt);    
                stmt.setObject(3,hs.getAttribute("EMAIL"));    
                stmt.setInt(4,sum);    
                stmt.setString(5,"New");                    
                stmt.executeUpdate();
                Cookie c=new Cookie("BASKET","XYZ");
                c.setMaxAge(-1);
                response.addCookie(c);
                out.write("<center><h3>Thanks for your Order</h3></center>");
                out.write("<center><h3>All Orders will be deliver in Cash On Delivery</h3></center>");
                out.write("<center><h3>No Extra Charges</h3></center>");
                out.write("<center><h3>Your Order No is "+oid+"</h3></center>");
                out.write("<center><h3>In case of any problem please contact us</h3></center>");
                out.write("<center><h3>Happy Shooping</h3></center>");
                out.write("<hr><img src='footer.jpg' width='100%' height='150px'>");
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
