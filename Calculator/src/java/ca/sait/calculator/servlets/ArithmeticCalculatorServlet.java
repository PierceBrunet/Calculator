/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sait.calculator.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Brune
 */

public class ArithmeticCalculatorServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

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
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
        if(request.getParameter("firstNumber") != "" || request.getParameter("secondNumber") != ""){  
            try{
                String firstString = request.getParameter("firstNumber");
                int firstNumber = Integer.parseInt(firstString);
                String secondString = request.getParameter("secondNumber");
                int secondNumber = Integer.parseInt(secondString);
                String buttonString = request.getParameter("button");
                int result = 0;
                if ("addition".equals(buttonString)){
                    result = firstNumber + secondNumber;                    
                }else if("subtraction".equals(buttonString)){
                    result = firstNumber - secondNumber;  
                }else if("multiplication".equals(buttonString)){
                    result = firstNumber * secondNumber;  
                }else if("modulus".equals(buttonString)){
                    result = firstNumber % secondNumber;  
                }                
                request.setAttribute("message", result);
                
            }catch(Exception ex){
                request.setAttribute("message", "invalid");
            }           
                                
        }else{
            request.setAttribute("message", "---");
        } 
        
                     
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

}
