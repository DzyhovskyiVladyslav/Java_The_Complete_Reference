import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

class ColorPostServlet extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String color = request.getParameter("color");
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("<B>The selected color is: ");
		pw.println(color);
		pw.close();
	}
}