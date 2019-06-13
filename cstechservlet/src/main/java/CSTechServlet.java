import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;
import java.util.Timer;

@WebServlet("/support")
public class CSTechServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      String ticked_id = new Date().toString();
       String name = req.getParameter("name");
       String email = req.getParameter("email");
       String problem = req.getParameter("problem");
        ServletContext context = this.getServletContext();
        String contextparaName = context.getInitParameter("support-email");
       PrintWriter out = resp.getWriter();
        out.print("<html><head><title>Test</title></head><body>");
        out.print("<p>");
        out.print("Thank you! "+name+ " for contacting us. " +
                "We should receive reply from us with in 24 hrs in your email address " + email+
                " Let us know in our support email "+ contextparaName+" if you don’t receive reply within 24 hrs. " +
                "Please be sure to attach your reference "+ticked_id+" in your email.");
        out.print("</p>");
        out.print("</body></html>");

    }
}
