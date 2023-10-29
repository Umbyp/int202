package sit.int202.register.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "SetThemeServlet", value = "/set-theme")
public class SetThemeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/set_theme.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String bgColor = request.getParameter("bgColor");
        Cookie ck = new Cookie("bg_color_cookie",bgColor);
        ck.setMaxAge(8*60*60*24);
        response.addCookie(ck);
        response.sendRedirect("index.jsp");//คือ การresponse กับไปที่clientก่อนเพื่อเอาไปเก็บแล้วพิมพ์urlกลับมาหาเราใหม่
    }
}
 
