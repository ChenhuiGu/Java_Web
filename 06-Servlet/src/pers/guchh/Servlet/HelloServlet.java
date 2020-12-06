package pers.guchh.Servlet;

import javax.servlet.*;
import java.io.IOException;

public class HelloServlet implements Servlet {
    //重写接口所有方法
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        String contentType = servletRequest.getContentType();
        System.out.println(contentType);
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
