package FeedBackPackage;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AdminGetAllFeedBackServlet")
public class AdminGetAllFeedBackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;      

    public AdminGetAllFeedBackServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List <FeedBackModel> allFeedbacks = FeedBackController.getByAll();
		request.setAttribute("allFeedbacks", allFeedbacks);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("AdminAllFeedBackDetails.jsp");
		dispatcher.forward(request, response);

	}

}
