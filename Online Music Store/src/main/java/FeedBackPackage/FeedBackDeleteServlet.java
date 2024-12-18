package FeedBackPackage;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FeedBackDeleteServlet")
public class FeedBackDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FeedBackDeleteServlet() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		boolean isTrue;
		
		isTrue = FeedBackController.deleteData(id);
		
		if(isTrue == true) {
			String alertMessage = "Feedback Delete Successfully";
			response.getWriter().println("<script> alert('"+alertMessage+"'); window.location.href='AdminGetAllFeedBackServlet' </script> ");
		}
		else {
			
			List<FeedBackModel> feedbackdetails = FeedBackController.getById(id);
			request.setAttribute("feedbackdetails", feedbackdetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("wrong.jsp");
			dispatcher.forward(request, response);
		}
		
		}

}
