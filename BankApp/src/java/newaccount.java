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
@WebServlet(urlPatterns = {"/newaccount"})
public class newaccount extends HttpServlet {

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
                    String msg="",msg1="";
                    if(request.getParameter("b1")!=null)
                    {
                        String s1=request.getParameter("t0");
                        String s2=request.getParameter("t1");
                        String s3=request.getParameter("t2");
                        String s4=request.getParameter("t3");
                        String s5=request.getParameter("t4");
                        String s6=request.getParameter("t5");
                        String s7=request.getParameter("t6");
                        String s8=request.getParameter("t7");
                        String s9=request.getParameter("t8");
                        String s10=request.getParameter("t9");
                        String s11=request.getParameter("t10");
                        String s12=request.getParameter("t11");
                        String s13=request.getParameter("t12");
                        stmt=con.prepareStatement("Select count(*)+1 from customers");
                        String id="";
                        rs=stmt.executeQuery();
                        if(rs.next()) id=rs.getString(1);
                        int n=5-id.length();
                        String accno=s1;
                        for(int i=1;i<=n;i++) accno=accno+"0";
                        accno=accno+id;
                        stmt=con.prepareStatement("Insert into Customers values(?,?,?,?,?,?,?,?,?,?,?,?,?,0)");
                        stmt.setString(1,accno);
                        stmt.setString(2,s2);
                        stmt.setString(3,s3);
                        stmt.setString(4,s4);
                        stmt.setString(5,s5);
                        stmt.setString(6,s6);
                        stmt.setString(7,s7);
                        stmt.setString(8,s8);
                        stmt.setString(9,s9);
                        stmt.setString(10,s10);
                        stmt.setString(11,s11);
                        stmt.setString(12,s12);
                        stmt.setString(13,s13);
                        stmt.executeUpdate();
                        String p=p1.MyClass.getPassword();
                        stmt=con.prepareStatement("Insert into users values(?,?,'CUSTOMER')");
                        stmt.setString(1,accno);
                        stmt.setString(2,p);
                        stmt.executeUpdate();
                        msg="Login:"+accno+",Password:"+p; 
                        msg1="<a href='uploaddocuments?accno="+accno+"'>Upload Documents</a>";
                    }
                    PrintWriter out=response.getWriter();
                    response.setContentType("text/html");
                    out.write("<html><body>");
                    out.write("<img src='banner1.jpg' width='100%' height='200px'><hr>");
                    out.write("<table width='100%'><tr><td><a href='employee'>Home</a></td><td><a href='newaccount'>New Account</a></td><td><a href='debitcredit'>Debit/Credit</a></td><td><a href='echangepassword'>Change Password</a></td><td><a href='ctransactions'>Transactions/Passbook</a></td><td><a href='logout'>Logout</a></td></tr></table><hr>");
                    //------------Write Your Code Here
                    out.write("<form method='post'>");
                    out.write("<table align='center'>");
                    out.write("<tr><th colspan='3'>Customer Details</th></tr>");
                    out.write("<tr><td>Account Type:</td><td><select name='t0'>");
                    stmt=con.prepareStatement("Select * from accounts");
                    rs=stmt.executeQuery();
                    while(rs.next())
                    {
                        String s1=rs.getString(1);
                        String s2=rs.getString(2);
                        out.write("<option value='"+s1+"'>"+s2+"</option>");
                    }
                    out.write("</select></td><td></td></tr>");
                    out.write("<tr><td>Name:</td><td><input type='text' name='t1'></td><td></td></tr>");
                    out.write("<tr><td>Father:</td><td><input type='text' name='t2'></td><td></td></tr>");
                    out.write("<tr><td>Mother:</td><td><input type='text' name='t3'></td><td></td></tr>");
                    out.write("<tr><td>Date of Birth:</td><td><input type='date' name='t4'></td><td></td></tr>");
                    out.write("<tr><td>Address:</td><td><textarea name='t5'></textarea></td><td></td></tr>");
                    out.write("<tr><td>State:</td><td><input type='text' name='t6'></td><td></td></tr>");
                    out.write("<tr><td>City:</td><td><input type='text' name='t7'></td><td></td></tr>");
                    out.write("<tr><td>Pin code:</td><td><input type='text' name='t8'></td><td></td></tr>");
                    out.write("<tr><td>Mobile:</td><td><input type='text' name='t9'></td><td></td></tr>");
                    out.write("<tr><td>Email:</td><td><input type='email' name='t10'></td><td></td></tr>");
                    out.write("<tr><td>PAN No.:</td><td><input type='text' name='t11'></td><td></td></tr>");
                    out.write("<tr><td>Aadhar No:</td><td><input type='text' name='t12'></td><td></td></tr>");
                    out.write("<tr><td></td><td><input type='submit' name='b1' value='Create Account'></td><td></td></tr>");
                    out.write("<tr><td></td><td><font color='red'>"+msg+"</font></td><td></td></tr>");                    
                    out.write("<tr><td></td><td>"+msg1+"</td><td></td></tr>");                    
                    out.write("</table></form>");
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
