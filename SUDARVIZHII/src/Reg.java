

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Reg")
public class Reg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Reg() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String text= request.getParameter("text");
	String usrmail= request.getParameter("usrmail");
	String usrtel= request.getParameter("usrtel");
	String password= request.getParameter("password");
	
	if(text.equals("sudarvizhi")&&(password.equals("divyakrish")))
	{
		response.sendRedirect("home.jsp");
	}
	else
	{
		response.sendRedirect("error.jsp");
	}
		doGet(request, response);
	}

}
