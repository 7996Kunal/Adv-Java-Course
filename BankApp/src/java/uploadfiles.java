/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
@WebServlet(urlPatterns = {"/uploadfiles"})
public class uploadfiles extends HttpServlet {

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
                InputStream in=request.getInputStream();
                int size=request.getContentLength();
                byte[] data=new byte[size];
                int byteRead = 0;
                int totalBytesRead = 0;
                while (totalBytesRead < size)
                {
                    byteRead = in.read(data, totalBytesRead,size);
                    totalBytesRead += byteRead;
                }
                String ctype=request.getContentType();
                PrintWriter out=response.getWriter();
                response.setContentType("text/html");
                int p=ctype.indexOf("boundary=")+9;
                String bndry=ctype.substring(p);
                String str=new String(data);
                p=str.indexOf("name=\"t1\"")+13;
                int p1=str.indexOf("\r\n",p+1);
                String accno=str.substring(p,p1);                
                p=str.indexOf("name=\"t2\"")+13;
                p=str.indexOf("Content-Type",p+1);
                p=str.indexOf("\r\n\r\n",p+1)+4;
                p1=str.indexOf(bndry,p)-5;
                int size1=p1-p+1;
                byte[] first=new byte[size1];
                for(int i=0;i<size1;i++)
                {
                    first[i]=data[p+i];
                } 
                System.out.println(size1);
                
                p=str.indexOf("name=\"t3\"")+13;
                p=str.indexOf("Content-Type",p+1);
                p=str.indexOf("\r\n\r\n",p+1)+4;
                p1=str.indexOf(bndry,p)-5;
                int size2=p1-p+1;
                System.out.println(size2);
                byte[] second=new byte[size2];
                for(int i=0;i<size2;i++)
                {
                    second[i]=data[p+i];
                }
                
                p=str.indexOf("name=\"t4\"")+13;
                p=str.indexOf("Content-Type",p+1);
                p=str.indexOf("\r\n\r\n",p+1)+4;
                p1=str.indexOf(bndry,p)-5;
                int size3=p1-p+1;
                System.out.println(size3);
                byte[] third=new byte[size3];
                for(int i=0;i<size3;i++)
                {
                    third[i]=data[p+i];
                }
                HttpSession hs=request.getSession(false);
                Connection con=(Connection)hs.getAttribute("CON");
                PreparedStatement stmt=con.prepareStatement("Insert into customerdetails values(?,?,?)");
                stmt.setString(1,accno);
                stmt.setBytes(2,first);
                stmt.setString(3,"Photo");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Insert into customerdetails values(?,?,?)");
                stmt.setString(1,accno);
                stmt.setBytes(2,second);
                stmt.setString(3,"Sign");
                stmt.executeUpdate();
                stmt=con.prepareStatement("Insert into customerdetails values(?,?,?)");
                stmt.setString(1,accno);
                stmt.setBytes(2,third);
                stmt.setString(3,"IDProof");
                stmt.executeUpdate();
                response.sendRedirect("newaccount");
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
