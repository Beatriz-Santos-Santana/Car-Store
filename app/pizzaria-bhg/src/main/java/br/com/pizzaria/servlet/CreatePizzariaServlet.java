package br.com.pizzaria.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/localizar-pedido")
public class CreatePizzariaServlet  extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String idPedido = request.getParameter("id");

        System.out.println(idPedido);

        request.getRequestDispatcher("index.html").forward(request, response);

    }


}
