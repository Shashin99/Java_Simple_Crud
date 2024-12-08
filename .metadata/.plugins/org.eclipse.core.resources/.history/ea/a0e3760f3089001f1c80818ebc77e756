package FeedBackPackage;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FeedBackUpdateServlet")
public class FeedBackUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FeedBackUpdateServlet() {
        super();

    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String description = request.getParameter("description");
		String rate = request.getParameter("rate");
		
		boolean isTrue;
		
		isTrue = FeedBackController.updateData(id, name, email, description, rate);
		
		if(isTrue == true) {
			
			List<FeedBackModel> feedbackdetails = FeedBackController.getById(id);
			request.setAttribute("feedbackdetails", feedbackdetails);
			
			String alertMessage = "Data Update Successfully";
			response.getWriter().println("<script> alert('"+alertMessage+"'); window.location.href='GetAllFeedBackServlet' </script> ");
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("wrong.jsp");
			dis2.forward(request, response);
		}
		
	}

}
