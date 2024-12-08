package UserPackage;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UserProfileServlet")
public class UserProfileServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Get the session and check if user is logged in
        HttpSession session = request.getSession(false);

        if (session != null && session.getAttribute("userId") != null) {
            // Retrieve user ID from session and convert it to String
            String userId = String.valueOf(session.getAttribute("userId")); // Ensure userId is a String

            // Fetch user details using the user ID
            UserModel user = UserController.getById(userId); // Call getById with String argument
            if (user != null) {
                // Set user details as request attribute and forward to profile page
                request.setAttribute("user", user);
                RequestDispatcher dispatcher = request.getRequestDispatcher("UserProfile.jsp");
                dispatcher.forward(request, response);
            } else {
                // If user is not found, redirect to login page
                response.sendRedirect("Login.jsp");
            }
        } else {
            // If no session or no user ID, redirect to login page
            response.sendRedirect("Login.jsp");
        }
    }

}
