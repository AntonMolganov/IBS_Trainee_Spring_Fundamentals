package ru.ibs.trainee.spring.ioc;

import javax.servlet.*;
import java.io.IOException;


/*
*
* Иллюстрация IoC
* Мы загружаем нашу программу во внешнюю среду исполнения (контейнер сервлетов, например, Tomcat), которая сама решает в какой момент вызывать методы предоставленные нами
*
* */
public class MyServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
