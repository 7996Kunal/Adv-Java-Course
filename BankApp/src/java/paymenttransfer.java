/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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
@WebServlet(urlPatterns = {"/paymenttransfer"})
public class paymenttransfer extends HttpServlet {

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
                HttpSession hs=request.getSession(false);
                if(hs==null)
                    response.sendRedirect("index");
                else
                {
                    String uid=hs.getAttribute("UID").toString();
                    String utype=hs.getAttribute("UTYPE").toString();
                    if(!utype.equals("CUSTOMER"))
                    {
                        response.sendRedirect("index");
                    }
                    Connection con=(Connection)hs.getAttribute("CON");
                    PreparedStatement stmt;
                    ResultSet rs;
                    if(request.getParameter("b2")!=null)
                    {
                        String s1=request.getParameter("t1");
                        String s2=request.getParameter("t3");
                        int tid=p1.MyClass.getTransactionId();
                        String dt=p1.MyClass.getDate();
                        stmt=con.prepareStatement("Insert into banktrans values(?,?,?,?,?,?)");
                        stmt.setInt(1,tid);
                        stmt.setString(2,s1);
                        stmt.setString(3,s2);
                        stmt.setString(4,"C");
                        stmt.setString(5,"Online Transfer from "+uid);
                        stmt.setString(6,dt);
                        stmt.executeUpdate();
                        tid=p1.MyClass.getTransactionId();
                        stmt=con.prepareStatement("Insert into banktrans values(?,?,?,?,?,?)");
                        stmt.setInt(1,tid);
                        stmt.setString(2,uid);
                        stmt.setString(3,s2);
                        stmt.setString(4,"D");
                        stmt.setString(5,"Online Transfer to "+s1);
                        stmt.setString(6,dt);
                        stmt.executeUpdate();
                        stmt=con.prepareStatement("Update Customers set balanceamt=balanceamt+? where accno=?");
                        stmt.setString(1,s2);
                        stmt.setString(2,s1);
                        stmt.executeUpdate();
                        stmt=con.prepareStatement("Update Customers set balanceamt=balanceamt-? where accno=?");
                        stmt.setString(1,s2);
                        stmt.setString(2,uid);
                        stmt.executeUpdate();
                        response.sendRedirect("customer");
                    }
                    PrintWriter out=response.getWriter();
                    response.setContentType("text/html");
                    out.write("<html><body>");
                    out.write("<img src='banner1.jpg' width='100%' height='200px'><hr>");
                    out.write("<table width='100%'><tr><td><a href='customer'>Home</a></td><td><a href='mytransactions'>My Transactions</a></td><td><a href='paymenttransfer'>Payment Transfer</a></td><td><a href='changepassword'>Change Password</a></td><td><a href='myprofile'>My Profile</a></td><td><a href='logout'>Logout</a></td></tr></table><hr>");
                    //------------Write Your Code Here
                    out.write("<form method=post>");
                    out.write("<table align='center'>");
                    out.write("<tr><td>Account No:<td><td><input type='text' name='t1'><td><td><td></tr>");
                    out.write("<tr><td>Amount:<td><td><input type='text' name='t2'><td><td><td></tr>");
                    out.write("<tr><td><td><td><input type='submit' value='Transfer' name='b1'><td><td><td></tr>");
                    out.write("</table>");
                    out.write("</form><hr>");
                    String msg="";
                    String s=request.getParameter("b1");
                    if(s!=null && s.equals("Transfer"))
                    {
                        boolean valid=true;
                        String s1=request.getParameter("t1");
                        String s2=request.getParameter("t2");
                        String name="";
                        stmt=con.prepareStatement("Select * from customers where accno=?");
                        stmt.setString(1,s1);
                        rs=stmt.executeQuery();
                        if(rs.next()) 
                            name=rs.getString("name");
                        else
                        {
                            msg="Invalid Account Details";
                            valid=false;
                        }
                        stmt=con.prepareStatement("Select * from customers where accno=?");
                        stmt.setString(1,uid);
                        rs=stmt.executeQuery();
                        int amt=0;
                        if(rs.next()) amt=rs.getInt("BALANCEAMT");
                        if(Integer.parseInt(s2)>amt)
                        {
                            msg="Insufficient Balance!!";
                            valid=false;
                        }                        
                        out.write("<form method=post>");
                        out.write("<table align='center'>");
                        out.write("<tr><td>Account No:<td><td><input type='text' name='t1' value='"+s1+"' readonly><td><td><td></tr>");
                        out.write("<tr><td>Name:<td><td><input type='text' name='t2' value='"+name+"'  readonly><td><td><td></tr>");
                        out.write("<tr><td>Amount:<td><td><input type='text' name='t3' value='"+s2+"' readonly><td><td><td></tr>");
                        if(valid)
                        {
                            out.write("<tr><td><td><td><input type='submit' value='Confirm' name='b2'><td><td><td></tr>");
                        }
                        out.write("<tr><td><td><td><font color='red'>"+msg+"</font><td><td><td></tr>");
                        out.write("</table>");
                        out.write("</form>");
                    }
                    //------------End
                    out.write("<hr><img src='footer.jpg' width='100%' height='200px'>");
                    out.write("</body></html>");
                }
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
