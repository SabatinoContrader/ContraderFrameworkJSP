package com.virtualpairprogrammers.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet
{

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {



    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String scelta=request.getParameter("bott");

        switch (scelta)
        {

            case "Login":
            {
                HttpSession session = request.getSession(true);
                session.setAttribute("servlet","Home");
                session.setAttribute("role",null);
                session.setAttribute("firstname",null);
                MainDispatcherServlet.getInstance().callAction(request,response);
            }
            case "Registrati":
            {
                /*HttpSession session = request.getSession(true);
                session.setAttribute("view","SignedUpMenu.jsp");
                MainDispatcherServlet.getInstance().callView(request,response);*/
            }
        }
    }
}



