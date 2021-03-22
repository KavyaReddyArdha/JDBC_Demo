import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletEx extends HttpServlet {
    String message;
    public void init(){
        message="Welcome to Servlet";

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
response.setContentType("text/html");
PrintWriter out= response.getWriter();
System.out.println("<h2>"+message + "</h2>");
    }
    public void destroy() {
    }
}
