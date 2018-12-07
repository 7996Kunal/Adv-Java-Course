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
@WebServlet(urlPatterns = {"/empmgmt"})
public class empmgmt extends HttpServlet {

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
                    String s=request.getParameter("b1");
                    String s1=request.getParameter("t1");
                    String s2=request.getParameter("t2");
                    String s3=request.getParameter("t3");
                    String s4=request.getParameter("t4"); 
                    String msg="";
                    if(s!=null && s.equals("Save"))
                    {
                        stmt=con.prepareStatement("Select count(*)+1 from emp");
                        rs=stmt.executeQuery();
                        String id="";
                        if(rs.next())
                        {
                            id=rs.getString(1);
                        }
                        int n=3-id.length();
                        String eid="EMP";
                        for(int i=1;i<=n;i++)
                        {
                            eid=eid+"0";
                        }
                        eid=eid+id;
                        stmt=con.prepareStatement("Insert into emp values(?,?,?,?,?)");
                        stmt.setString(1,eid);
                        stmt.setString(2,s1);
                        stmt.setString(3,s2);
                        stmt.setString(4,s3);
                        stmt.setString(5,s4);
                        stmt.executeUpdate();
                        String p=p1.MyClass.getPassword();
                        stmt=con.prepareStatement("Insert into users values(?,?,'EMPLOYEE')");
                        stmt.setString(1,eid);
                        stmt.setString(2,p);
                        stmt.executeUpdate();
                        msg="Login:"+eid+",Password:"+p;
                    }
                    if(s!=null && s.equals("Update"))
                    {
                        stmt=con.prepareStatement("Update emp set designaton=?,salary=? where eid=?");
                        stmt.setString(1,request.getParameter("t2"));
                        stmt.setString(2,request.getParameter("t4"));
                        stmt.setString(3,request.getParameter("t0"));
                        stmt.executeUpdate();
                        msg="Data Updated";
                    }
                    String s20="",s21="",s22="",s23="",s24="";
                    if(request.getParameter("eid")!=null)
                    {
                        stmt=con.prepareStatement("Select * from emp where eid=?");
                        stmt.setString(1,request.getParameter("eid"));
                        rs=stmt.executeQuery();
                        if(rs.next())
                        {
                            s20=rs.getString(1);
                            s21=rs.getString(2);
                            s22=rs.getString(3);
                            s23=rs.getString(4);
                            s24=rs.getString(5);
                        }
                    }
                    response.setContentType("text/html");
                    out.write("<html><body>");
                    out.write("<img src='banner1.jpg' width='100%' height='200px'><hr>");
                    out.write("<table width='100%'><tr><td><a href='admin'>Home</a></td><td><a href='empmgmt'>Employees Mgmt</a></td><td><a href='accountdetails'>Account Details</a></td><td><a href='achangepassword'>Change Password</a></td><td><a href='alltransactions'>All Transactions</a></td><td><a href='logout'>Logout</a></td></tr></table><hr>");
                    //------------Write Your Code Here
                    out.write("<form method='post'><table align='center'>");
                    out.write("<tr><th colspan='3'>Employee Details</th></tr>");
                    out.write("<tr><td></td><td><input type='hidden' name='t0' value='"+s20+"'></td><td></td></tr>");
                    out.write("<tr><td>Name:</td><td><input type='text' name='t1' value='"+s21+"'></td><td></td></tr>");
                    out.write("<tr><td>Designation:</td><td><input type='text' name='t2' value='"+s22+"'></td><td></td></tr>");
                    out.write("<tr><td>Appointment Date:</td><td><input type='date' name='t3' value='"+s23+"'></td><td></td></tr>");
                    out.write("<tr><td>Salary:</td><td><input type='text' name='t4' value='"+s24+"'></td><td></td></tr>");
                    out.write("<tr><td></td><td><input type='submit' name='b1' value='Save'><input type='submit' name='b1' value='Update'></td><td></td></tr>");
                    out.write("<tr><td></td><td><font color='red'>"+msg+"</font></td><td></td></tr>");
                    out.write("</table></form>");
                    out.write("<hr>");
                    stmt=con.prepareStatement("Select * from emp");
                    rs=stmt.executeQuery();
                    out.write("<table align='center'>");
                    out.write("<tr><th>Employee Code</th><th>Name</th><th>Designation</th><th>Date of Appointment</th><th>Salary</th><th></th></tr>");
                    while(rs.next())
                    {
                        String s11=rs.getString(1);
                        String s12=rs.getString(2);
                        String s13=rs.getString(3);
                        String s14=rs.getString(4);
                        String s15=rs.getString(5);
                        out.write("<tr>");
                        out.write("<td>"+s11+"</td>");
                        out.write("<td>"+s12+"</td>");
                        out.write("<td>"+s13+"</td>");
                        out.write("<td>"+s14+"</td>");
                        out.write("<td>"+s15+"</td>");
                        out.write("<td><a href='empmgmt?eid="+s11+"'>Show Details</a></td>");
                        out.write("</tr>");
                    }
                    out.write("</table>");
                    //------------End
                    out.write("<hr><img src='footer.jpg' width='100%' height='200px'>");
                    out.write("</body></html>");
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
