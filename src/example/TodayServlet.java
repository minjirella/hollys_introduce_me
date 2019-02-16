package example;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodayServlet
 */
@WebServlet("/today")
public class TodayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		Date nowdat = new Date();
		SimpleDateFormat ft = 
				new SimpleDateFormat ("yyyy/MM/dd  hh:mm:ss");
		String docType = "<!DOCTYPE html> \n";
		out.println(docType +
	        "<html>\n" +
	        "<head><title>현재시간</title></head>\n" +
	        "<body bgcolor=\"#f0f0f0\"><a href=\"index.html\" style=\"text-decoration:none\">메인화면</a>\n" +
	        "<h2 align=\"center\">" + ft.format(nowdat) + "</h2>\n" +
	        "</body></html>");
	}

}
