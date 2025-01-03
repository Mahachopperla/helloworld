package com.coveros.demo.helloworld;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/helloworld")  // Mapping the servlet to /helloworld
public class HelloWorld extends javax.servlet.http.HttpServlet {

    @Override
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws ServletException, IOException {
        // Set the content type to HTML
        response.setContentType("text/html");

        // Get the PrintWriter to send content back to the client
        PrintWriter out = response.getWriter();

        // Output the message
        out.println("<html><body>");
        out.println("<h1>Hello, World!</h1>");
        out.println("</body></html>");
    }
}

