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
@WebServlet(urlPatterns = {"/accountdetails"})
public class accountdetails extends HttpServlet {

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
                    if(!utype.equals("ADMIN"))
                    {
                        response.sendRedirect("index");
                    }
                    Connection con=(Connection)hs.getAttribute("CON");
                    PreparedStatement stmt;
                    ResultSet rs;
                    PrintWriter out=response.getWriter();
                    response.setContentType("text/html");
                    out.write("<html><body>");
                    out.write("<img src='banner1.jpg' width='100%' height='200px'><hr>");
                    out.write("<table width='100%'><tr><td><a href='admin'>Home</a></td><td><a href='empmgmt'>Employees Mgmt</a></td><td><a href='accountdetails'>Account Details</a></td><td><a href='achangepassword'>Change Password</a></td><td><a href='alltransactions'>All Transactions</a></td><td><a href='logout'>Logout</a></td></tr></table><hr>");
                    //------------Write Your Code Here
                    stmt=con.prepareStatement("Select * from customers");
                    rs=stmt.executeQuery();
                    out.write("<table align='center'>");
                    out.write("<tr><th>Account No</th><th>Name</th><th>Father</th><th>Mother</th><th>DOB</th><th>Address</th><th>State</th><th>City</th><th>Pin code</th><th>Mobile</th><th>Email</th><th>PAN</th><th>Aadhar</th><th>Balance</th><th>Photo</th><th>Signature</th><th>Id Proof</th></tr>");
                    while(rs.next())
                    {
                        String s11=rs.getString(1);
                        String s12=rs.getString(2);
                        String s13=rs.getString(3);
                        String s14=rs.getString(4);
                        String s15=rs.getString(5);
                        String s16=rs.getString(6);
                        String s17=rs.getString(7);
                        String s18=rs.getString(8);
                        String s19=rs.getString(9);
                        String s20=rs.getString(10);
                        String s21=rs.getString(11);
                        String s22=rs.getString(12);
                        String s23=rs.getString(13);
                        String s24=rs.getString(14);
                        out.write("<tr>");
                        out.write("<td>"+s11+"</td>");
                        out.write("<td>"+s12+"</td>");
                        out.write("<td>"+s13+"</td>");
                        out.write("<td>"+s14+"</td>");
                        out.write("<td>"+s15+"</td>");
                        out.write("<td>"+s16+"</td>");
                        out.write("<td>"+s17+"</td>");
                        out.write("<td>"+s18+"</td>");
                        out.write("<td>"+s19+"</td>");
                        out.write("<td>"+s20+"</td>");
                        out.write("<td>"+s21+"</td>");
                        out.write("<td>"+s22+"</td>");
                        out.write("<td>"+s23+"</td>");
                        out.write("<td>"+s24+"</td>");
                        out.write("<td><img src='getPhoto?accno="+s11+"&type=Photo' width='100'></td>");
                        out.write("<td><img src='getPhoto?accno="+s11+"&type=Sign' width='100'></td>");
                        out.write("<td><img src='getPhoto?accno="+s11+"&type=IdProof' width='100'></td>");
                        out.write("</tr>");
                    }
                    out.write("</table>");    
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
