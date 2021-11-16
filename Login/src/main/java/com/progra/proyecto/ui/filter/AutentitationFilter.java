package com.progra.proyecto.ui.filter;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "AutentitationFilter", urlPatterns="/admin/*")
public class AutentitationFilter implements Filter{
    private FilterConfig fc;
    public void init(FilterConfig config) throws ServletException {
        this.fc = config;
    }
    public void destroy() {
        this.fc = null;
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpR = (HttpServletRequest)request;
        HttpServletResponse httpResp = (HttpServletResponse) response;
        HttpSession session = httpR.getSession();
        System.out.println("session==="+session.getAttribute("usuario"));
        if(null==session.getAttribute("usuario")) {
            request.setAttribute ("tips", "Primero debe de iniciar sesion");
            System.out.println("tips==============");
            httpResp.sendRedirect(httpR.getContextPath() + "/index.html");
        }else {
            chain.doFilter(request, response);
        }
    }
}
