package UserPackage;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import FeedBackPackage.FeedBackController;

import java.io.IOException;

@WebServlet("/AdminDashboardServlet")
public class AdminDashboardServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserController userController = new UserController();
        FeedBackController feedbackController = new FeedBackController();

        int userCount = userController.getUserCount();
        int feedbackCount = feedbackController.getFeedbackCount();

        System.out.println("User Count: " + userCount); // Debugging
        System.out.println("Feedback Count: " + feedbackCount); // Debugging

        // Set attributes to be accessed in JSP
        request.setAttribute("userCount", userCount);
        request.setAttribute("feedbackCount", feedbackCount);

        // Forward to dashboard JSP
        request.getRequestDispatcher("dashboard.jsp").forward(request, response);
    }
}

