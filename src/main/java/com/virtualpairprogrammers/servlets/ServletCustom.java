package com.virtualpairprogrammers.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ServletCustom
{

    public void service (HttpServletRequest request,
                         HttpServletResponse response)
            throws ServletException,IOException;

}