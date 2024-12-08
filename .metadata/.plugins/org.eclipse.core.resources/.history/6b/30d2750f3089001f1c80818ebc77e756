package FeedBackPackage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FeedBackInsertServlet")
public class FeedBackInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FeedBackInsertServlet() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String description = request.getParameter("description");
		String rate = request.getParameter("rate");
		
		boolean isTrue;
		
		isTrue = FeedBackController.insertData(name, email, description,rate);
		
		if(isTrue == true) {
			String alertMessage = "Data Insert Successfully";
			response.getWriter().println("<script> alert('"+alertMessage+"'); window.location.href='GetAllFeedBackServlet' </script> ");
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("wrong.jsp");
			dis2.forward(request, response);
		}
				
	}


}
