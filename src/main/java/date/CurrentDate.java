package date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet("/CurrentDate")
public class CurrentDate extends HttpServlet {
    private final static String INDEX = "date.jsp";
    public CurrentDate() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Date date = new Date();
        String valueDate = date.toString();
        request.setAttribute("date",valueDate);
        request.getRequestDispatcher(INDEX).forward(request, response);
    }

}
