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
@WebServlet(urlPatterns = {"/debitcredit"})
public class debitcredit extends HttpServlet {

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
                    if(!utype.equals("EMPLOYEE"))
                    {
                        response.sendRedirect("index");
                    }
                    Connection con=(Connection)hs.getAttribute("CON");
                    PreparedStatement stmt;
                    ResultSet rs;
                    if(request.getParameter("b1")!=null)
                    {
                        String s1=request.getParameter("t1");
                        String s2=request.getParameter("t2");
                        String s3=request.getParameter("t3");
                        String s4=request.getParameter("t4");
                        stmt=con.prepareStatement("select count(*)+1 from banktrans");
                        rs=stmt.executeQuery();
                        int tid=0;
                        if(rs.next()) tid=rs.getInt(1);
                        stmt=con.prepareStatement("Insert into banktrans values(?,?,?,?,?,?)");
                        stmt.setInt(1,tid);
                        stmt.setString(2,s1);
                        stmt.setString(3,s2);
                        stmt.setString(4,s3);
                        stmt.setString(5,s4);
                        stmt.setString(6,p1.MyClass.getDate());
                        stmt.executeUpdate();
                        if(s3.equals("C"))
                        {
                            stmt=con.prepareStatement("Update customers set balanceamt=balanceamt+? where accno=?");
                            stmt.setString(1,s2);
                            stmt.setString(2,s1);
                            stmt.executeUpdate();
                        }
                        if(s3.equals("D"))
                        {
                            stmt=con.prepareStatement("Update customers set balanceamt=balanceamt-? where accno=?");
                            stmt.setString(1,s2);
                            stmt.setString(2,s1);
                            stmt.executeUpdate();
                        }
                    }
                    PrintWriter out=response.getWriter();
                    response.setContentType("text/html");
                    out.write("<html><body>");
                    out.write("<img src='banner1.jpg' width='100%' height='200px'><hr>");
                    out.write("<table width='100%'><tr><td><a href='employee'>Home</a></td><td><a href='newaccount'>New Account</a></td><td><a href='debitcredit'>Debit/Credit</a></td><td><a href='echangepassword'>Change Password</a></td><td><a href='ctransactions'>Transactions/Passbook</a></td><td><a href='logout'>Logout</a></td></tr></table><hr>");
                    //------------Write Your Code Here
                    out.write("<form method=post>");
                    out.write("<table align=center>");
                    out.write("<tr><td>Account No:</td><td><input type='text' name='t1'></td><td></td></tr>");
                    out.write("<tr><td>Amount:</td><td><input type='text' name='t2'></td><td></td></tr>");
                    out.write("<tr><td></td><td><input type='radio' name='t3' value='D'>Debit <input type='radio' name='t3' value='C'>Credit</td><td></td></tr>");
                    out.write("<tr><td>Details:</td><td><textarea name='t4'></textarea></td><td></td></tr>");
                    out.write("<tr><td></td><td></td><td></td></tr>");
                    out.write("<tr><td></td><td><input type='submit' name='b1' value='Submit'></td><td></td></tr>");
                    out.write("<tr><td></td><td></td><td></td></tr>");
                    out.write("</table>");
                    out.write("</form>");
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
