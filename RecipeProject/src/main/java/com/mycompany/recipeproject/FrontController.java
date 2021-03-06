package com.mycompany.recipeproject;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "FrontController", urlPatterns = {"/FrontController"})
public class FrontController extends HttpServlet {

    Controller c = new Controller();

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

        String origin = request.getParameter("origin");
        if (origin != null) {
            switch (origin) {
                case "recipe":
                    RecipeHandler(request, response);
                    break;
                case "allrecipes":
                    List<RecipeDTO> recipes = c.getAllRecipes();
                    request.setAttribute("recipes", recipes);
                    request.getRequestDispatcher("AllRecipes.jsp").forward(request, response);
                    break;
                case "register":
                    request.getRequestDispatcher("Register.jsp").forward(request, response);
                    break;
                case "login":
                    request.getRequestDispatcher("Login.jsp").forward(request, response);
                    break;
                case "createrecipe":
                    request.getRequestDispatcher("CreateRecipe.jsp").forward(request, response);
                    break;
                default:
                    response.sendRedirect("index.html");
            }
        } else {
            response.sendRedirect("index.html");
        }
    }

    private void RecipeHandler(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = 1;
        try {
            id = Integer.parseInt(request.getParameter("recipe_id"));
        } catch (NumberFormatException e) {
        }
        RecipeDTO recipeDTO = c.getRecipeById(id);
        UserDTO userDTO = c.getUserById(recipeDTO.getUserId());
        request.setAttribute("recipe", recipeDTO);
        request.setAttribute("user", userDTO);
        request.getRequestDispatcher("Recipe.jsp").forward(request, response);
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
