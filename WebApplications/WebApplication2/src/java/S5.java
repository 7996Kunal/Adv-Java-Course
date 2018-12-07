/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Administrator
 */
@WebServlet(urlPatterns = {"/S5"})
public class S5 extends HttpServlet {

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
            String s=request.getParameter("err");
            if(s==null) s="";
            Cookie[] ck=request.getCookies();
            String v="";
            if(ck!=null)
            {
                for(int i=0;i<ck.length;i++)
                {
                    String nm=ck[i].getName();
                    if(nm.equals("UN"))
                    {
                        v=ck[i].getValue();
                    }
                }
            }
            PrintWriter out=response.getWriter();
            response.setContentType("text/html");
            out.println("<html><body>");
            out.write("<form method=post action=S6>");
            out.write("<table align=center>");
            out.write("<tr><td>Login:</td><td><input type='text' name='t1' value='"+v+"'></td></tr>");
            out.write("<tr><td>Password:</td><td><input type='password' name='t2'></td></tr>");
            out.write("<tr><td></td><td><input type='checkbox' name='c1'>Remember Me</td></tr>");
            out.write("<tr><td></td><td><input type='submit' name='b1' value='Login'></td></tr>");
            out.write("<tr><td></td><td><font color=red>"+s+"</font></td></tr>");
            out.write("</table></form>");
            out.println("</body></html>");
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
