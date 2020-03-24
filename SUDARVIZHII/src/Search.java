

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Search() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String key=request.getParameter("key");
		String designation=request.getParameter("designation");
		String company=request.getParameter("company");
		String location=request.getParameter("location");
		String band=request.getParameter("band");
		String fresher=request.getParameter("fresher");
		if((key!=null)&&(designation!=null)&&(company!=null)&&(location!=null)&&(band!=null)&&(fresher!=null))
		{
	response.sendRedirect("apply.jsp");
	}
		else
		{
			response.sendRedirect("wrong.jsp");
			}
	
	doGet(request, response);
}
}
