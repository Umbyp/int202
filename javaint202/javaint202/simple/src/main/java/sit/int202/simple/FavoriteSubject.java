package sit.int202.simple;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

@WebServlet(name = "FavoriteSubject", value = "/favoriteSubject")
public class FavoriteSubject extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPocesss(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPocesss(request,response);
    }

    private void doPocesss(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String id = request.getParameter("id");
        String subject[] = request.getParameterValues("subject");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> Your Favorite Subjects</h1><hr>" );
        out.println("Student Id :"+id+"<br>");
        out.println("Student name :"+name+"<br>");
        out.println(" YourFavorite Subjects:<br>" );
        for(String subjects : subject) {
            out.println("&nbsp; &nbsp; -"+subjects+"<br>");
        }
        Map<String,String[]> params = request.getParameterMap();
        out.println(" <br> Requset Parameters from Map:<br>" );
        out.println("-------------------------------------------<br>");
        out.println("Student Id :"+params.get("id")[0]+"<br>");
        out.println("Student name :"+params.get("name")[0]+"<br>");
        out.println(" YourFavorite Subjects:<br>" );
        for(String subjects : params.get("subject")) {
            out.println("&nbsp; &nbsp; -"+subjects+"<br>");
        }
        out.println("<hr>");
        out.println("<a href ='Favorite_subject.html'>Back</a>");
        out.println("</body></html>");
    }
}
 
