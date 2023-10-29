package sit.int202.simple.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "MultipilcationServlet", value = "/multipilcation_table")
public class MultipilcationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String numberStr =request.getParameter("number");
            if(numberStr==null || numberStr.length()==0 || !isNumber(numberStr)){
                request.setAttribute("error","Invalid number or parameter !!!");
            }
            request.getRequestDispatcher("/multiplication_table.jsp").forward(request,response);
    } //funtion ดูว่าข้อมููลถูกหรือไม่
    private boolean isNumber(String nStr) {
        for (int i = 0; i < nStr.length(); i++) {
            if (!Character.isDigit(nStr.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
 
