/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 *
 * @author Administrator
 */
@WebServlet(urlPatterns = {"/S8"})
public class S8 extends HttpServlet {

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
                Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1/db8am","root","");
                PreparedStatement stmt;
                ResultSet rs;
                PrintWriter out=response.getWriter();
                response.setContentType("text/html");
                String s=request.getParameter("b1");
                String s1=request.getParameter("t1");
                String s2=request.getParameter("t2");
                String s3=request.getParameter("t3");
                String s4=request.getParameter("t4");
                String s5=request.getParameter("t5");
                String s6=request.getParameter("t6");
                out.write("<html><body>");
                String msg="";
                if(s!=null && s.equals("Insert"))
                {
                    stmt=con.prepareStatement("Insert into employees values(?,?,?,?,?,?)");
                    stmt.setString(1,s1);
                    stmt.setString(2,s2);
                    stmt.setString(3,s3);
                    stmt.setString(4,s4);
                    stmt.setString(5,s5);
                    stmt.setString(6,s6);
                    stmt.executeUpdate();
                    msg="Data Inserted";
                }
                if(s!=null && s.equals("Delete"))
                {
                    stmt=con.prepareStatement("Delete from Employees where eid=?");
                    stmt.setString(1,s1);
                    stmt.executeUpdate();
                    msg="Data Deleted";
                }
                if(s!=null && s.equals("Update"))
                {
                    stmt=con.prepareStatement("Update Employees set designation=?,salary=? where eid=?");
                    stmt.setString(1,s6);
                    stmt.setString(2,s3);
                    stmt.setString(3,s1);
                    stmt.executeUpdate();
                    msg="Data Updated";
                }
                String s11="",s12="",s13="",s14="",s15="",s16="";
                if(s!=null && s.equals("Search"))
                {
                    stmt=con.prepareStatement("Select * from employees where eid=?");
                    stmt.setString(1,s1);
                    rs=stmt.executeQuery();
                    
                    if(rs.next())
                    {
                        s11=rs.getString(1);
                        s12=rs.getString(2);
                        s13=rs.getString(3);
                        s14=rs.getString(4);
                        s15=rs.getString(5);
                        s16=rs.getString(6);
                        
                    }
                    else
                    {
                        msg="Data Not Found!!!";
                    }
                }
                out.write("<form method='post'>");
                out.write("<table align='center'>");
                out.write("<tr><td>Employee Id:</td><td><input type='text' name='t1' value='"+s11+"'></td></tr>");
                out.write("<tr><td>Name:</td><td><input type='text' name='t2' value='"+s12+"'></td></tr>");
                out.write("<tr><td>Salary:</td><td><input type='text' name='t3' value='"+s13+"'></td></tr>");
                out.write("<tr><td>Mobile:</td><td><input type='text' name='t4' value='"+s14+"'></td></tr>");
                out.write("<tr><td>DOA:</td><td><input type='text' name='t5' value='"+s15+"'></td></tr>");
                out.write("<tr><td>Designation:</td><td><input type='text' name='t6' value='"+s16+"'></td></tr>");
                out.write("<tr><td></td><td><input type='submit' name='b1' value='Insert'> <input type='submit' name='b1' value='Delete'></td></tr>");
                out.write("<tr><td></td><td><input type='submit' name='b1' value='Update'> <input type='submit' name='b1' value='Search'></td></tr>");
                out.write("<tr><td></td><td>"+msg+"</td></tr>");
                out.write("</table></form><hr>");
                stmt=con.prepareStatement("Select * from Employees");
                rs=stmt.executeQuery();
                out.write("<table align=center border='1'>");
                out.write("<tr><th>EID</th><th>Name</th><th>Salary</th><th>Mobile</th><th>DOA</th><th>Designation</th></tr>");
                while(rs.next())
                {
                    out.write("<tr>");
                    out.write("<td>"+rs.getString(1)+"</td>");
                    out.write("<td>"+rs.getString(2)+"</td>");
                    out.write("<td>"+rs.getString(3)+"</td>");
                    out.write("<td>"+rs.getString(4)+"</td>");
                    out.write("<td>"+rs.getString(5)+"</td>");
                    out.write("<td>"+rs.getString(6)+"</td>");
                    out.write("</tr>");
                }
                out.write("</table>");
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
