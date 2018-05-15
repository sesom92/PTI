/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.Mahasiswa;
import Control.C_Mahasiswa;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Bagas
 */
@WebServlet(name = "signUpServlet", urlPatterns = {"/signUpServlet"})
public class signUpServlet extends HttpServlet {

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
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet signUpServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet signUpServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        try {
//            if (Mahasiswa.getDaftarMember().isEmpty()) {
//                C_Mahasiswa.setDaftar_member();
//            }

//            String id_mhs = "155314085";
//            String nama = "155314085";
//            String password = "155314085";
//            String password2 = "155314085";
//            String jk = "155314085";
//            String Prodi = "155314085";
//            String no_telp = "155314085";
//            String email = "155314085";
            String id_mhs = request.getParameter("nim");
            String nama = request.getParameter("nama");
            String password = request.getParameter("password1");
            String password2 = request.getParameter("password2");
            String jk = request.getParameter("jk");
            String Prodi = request.getParameter("prodi");
            String no_telp = request.getParameter("notlp");
            String email = request.getParameter("email");

            int pos = -1;
//            if (nim.equals(C_Mahasiswa.cariUser(nim))) {
//                pos = C_Mahasiswa.cariPosisi(nim);
//            }

            if (pos == -1) {
                if (password.equals(password2)) {
                    Mahasiswa mhs = new Mahasiswa(id_mhs, nama, password, no_telp, email, Prodi, jk);
                    C_Mahasiswa.inputDatadiri(mhs);

                    response.sendRedirect("view/signup.jsp?error=n");

                } else {
                    response.sendRedirect("view/signup.jsp?error=y");
                }
            } else {
                response.sendRedirect("view/signup.jsp?error=y");
            }
        } catch (Exception ex) {
            response.sendRedirect("view/signup.jsp?" + ex.getMessage());
        }
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
