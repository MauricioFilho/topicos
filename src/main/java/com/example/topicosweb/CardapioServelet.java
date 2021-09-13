package com.example.topicosweb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

@WebServlet(name = "cardapioServelet", value = "/cardapio-servlet")
public class CardapioServelet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        String[] itens = req.getParameterValues("opcaoCardapio");
        int valorTotal = 0;

        if (itens != null) {
            for (String s: itens) {
                valorTotal += Integer.parseInt(s);
            }

            String htmlResponse = "<html>";
            htmlResponse += "<h2>Valor total do pedido: R$" + valorTotal + ",00</h2>";
            htmlResponse += "</html>";

            writer.println(htmlResponse);
        } else {
            String htmlResponse = "<html>";
            htmlResponse += "<h2>Nenhum item do cardapio selecionado!</h2>";
            htmlResponse += "</html>";

            writer.println(htmlResponse);
        }
    }

    public void destroy() {
    }
}
