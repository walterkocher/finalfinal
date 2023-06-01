package com.example.finalfinal.tarea_web.controller;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "registroUsuarioServlet", value = "/registroUsuario")
public class registroUsarioServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//La respuesta que le vamos a devolver, va a ser la dirección del archivo JSP registroUsuario. jsp
        RequestDispatcher respuesta = req.getRequestDispatcher("/registroUsuario.jsp");
//envia la respuesta
        respuesta.forward(req, resp);
    }
}

    

