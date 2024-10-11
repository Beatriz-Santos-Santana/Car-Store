package br.com.pizzaria.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-login")
public class CreatePizzariaServlet  extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String pizzaEmail = request.getParameter("email");

        System.out.println(pizzaEmail);

        request.getRequestDispatcher("index.html").forward(request, response);

    }


}
