package com.fvgprinc.ctrlconsodont.servlets;

import com.fvgprinc.ctrlconsodont.logica.Controladora;
import com.fvgprinc.ctrlconsodont.logica.Usuario;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author garfi
 */
@WebServlet(name = "SvEditUsuario", urlPatterns = {"/SvEditUsuario"})
public class SvEditUsuario extends HttpServlet {

    Controladora control = new Controladora();

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
        
        int id = Integer.parseInt(request.getParameter("id"));
        
        Usuario usu = control.traerUsuario(id);
        
        HttpSession miSession = request.getSession();
        miSession.setAttribute("usuEditar", usu);
        System.out.println("El Usuario es: " + usu.getNombreUsuario());
        response.sendRedirect("editarUsuario.jsp");
        
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
        String nombreUsu = request.getParameter("nombreusu");
        String contrasenia = request.getParameter("contrasenia");
        String rol = request.getParameter("rol");
        
        Usuario usu = (Usuario)request.getSession().getAttribute("usuEditar");
        usu.setNombreUsuario(nombreUsu);
        usu.setContrasenia(contrasenia);
        usu.setRol(rol);
        
        control.editarUsuario(usu);
        
        response.sendRedirect("SvUsuarios");   // recordar aquí sendRedirect hace un post (sino se dice otra cosa)
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
