

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Apply")
public class Apply extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Apply() {
        super();
     
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String firstname=request.getParameter("firstname");
		String email=request.getParameter("email");
		String msg=request.getParameter("msg");
		String CV=request.getParameter("CV");
		if((firstname!=null)&&(email!=null)&&(msg!=null)&&(CV!=null))
		{
			response.sendRedirect("success.jsp");
		}
		else
		{
			response.sendRedirect("wrong.jsp");
		}
		doGet(request, response);
	}

}
