package com.example.topicosweb;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "somadorServlet", value = "/somador-servlet")
public class SomadorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int result = Integer.parseInt(req.getParameter("firstValue")) + Integer.parseInt(req.getParameter("secondValue"));
        PrintWriter writer = resp.getWriter();

        String htmlResponse = "<html>";
        htmlResponse += "<h2>A soma dos valores é " + result + "</h2>";
        htmlResponse += "</html>";

        writer.println(htmlResponse);
    }

    public void destroy() {
    }
}