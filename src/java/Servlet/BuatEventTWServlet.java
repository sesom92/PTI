/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Control.C_Event;
import Model.Event_TW;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sesom92
 */
@WebServlet(name = "Buat_event_tw", urlPatterns = {"/Buat_event_tw"})
public class BuatEventTWServlet extends HttpServlet {

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
            out.println("<title>Servlet Buat_event_tw</title>");
            out.println("</head>");
            out.println("<body>");
            String tgl_event_tw= request.getParameter("tanggalevent");
            out.println("<h1>Servlet Buat_event_tw at " + tgl_event_tw + "</h1>");
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

            String id_event_tw="tes";
            String nama_event_tw = request.getParameter("nama");
            String tmpt_event = request.getParameter("tempat");
            String tgl_event_tw= request.getParameter("tanggalevent");
            String bts_dftr= request.getParameter("batasdaftar");
            String kuota = request.getParameter("kouta");
            String deskripsi = request.getParameter("des");
//            String id_event_tw = "1555555555";
//            String nama_event_tw = "15555555555";
//            String tmpt_event = "155555555555";
//            String tgl_event_tw = "12/05/2018";
//            String bts_dftr = "18/05/2018";
//            String kuota = "1555555555555";
//            String deskripsi = "15555555555";

            SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");

            Event_TW etw = new Event_TW(id_event_tw, nama_event_tw, tmpt_event, (Date) ft.parse(tgl_event_tw), (Date) ft.parse(bts_dftr), Double.parseDouble(kuota), deskripsi);
            C_Event.InsertEvent(etw);

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
