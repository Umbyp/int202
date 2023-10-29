package sit.int202.simple.servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import sit.int202.simple.entities.Subject;
import sit.int202.simple.repositories.SubjectRepository;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "SubjectlistServlet", value = "/Subject_list")
public class SubjectlistServlet extends HttpServlet {

    private  long startTime;

    @Override
    public void destroy() {
        System.out.println("---------------------------------");
       System.out.println( "Duration of SubjextListServlet is" +
               (System.currentTimeMillis() - startTime)+"milli seconds");
        System.out.println("---------------------------------");
    }

    @Override
    public void init() throws ServletException {
        startTime = System.currentTimeMillis();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        SubjectRepository subjectRepository=new SubjectRepository();
        List<Subject> subjects = subjectRepository.findAll();
        request.setAttribute("subjects",subjects);
        request.getRequestDispatcher("subjectlist.jsp").forward(request,response);// ตัวอันนี้เป็นสำคัญgetRequestDispatcherจะเป็นในตัวเดี่ยวกันจะดีแต่ถ้าservletcontext จะใช้กับroot


//        PrintWriter out = response.getWriter();
//        out.println("<html><body>");
//        out.println("<h1>Subject List :: </h1><hr>");
//        for(Subject subject :subjectRepository.findAll()){
//            out.println(subject.getId());
//            out.println(" ");
//            out.println(subject.getTitle());
//            out.println(" ");
//            out.println(subject.getCredit());
//            out.println(" </br> ");
//        }
//        out.println("</hr>");
//        out.rintln("</body></html>");
//    }
}

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @WebServlet(name = "helloServlet", value = "/hello")
    public static class HelloServlet extends HttpServlet {
        private String message;

        public void init() {
            message = "Hello World!";
        }

        public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
            response.setContentType("text/html");

            // Hello
            String browser =request.getHeader("User-Agent");

            PrintWriter out = response.getWriter();
            out.println("<html><body>");
            out.println("<h1>" + message + "</h1>");
            out.println("<h3>Your browser is"+browser+"</h3>");
            out.println("<p>my id 65130500040");
            out.println("</body></html>");
        }

        public void destroy() {
        }
    }
}
 
