package UserPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/UpdateProfileServlet")
public class UpdateProfileServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Get the session and check if the user is logged in
        HttpSession session = request.getSession(false);

        if (session != null && session.getAttribute("userId") != null) {
            // Retrieve user ID as Integer
            Integer userId = (Integer) session.getAttribute("userId");
            
            // Convert user ID to String for database query
            String userIdStr = String.valueOf(userId);

            // Fetch user details using the user ID
            UserModel user = UserController.getById(userIdStr); // Ensure this method accepts a String

            if (user != null) {
                // Set user details as request attribute and forward to update profile page
                request.setAttribute("user", user);
                request.getRequestDispatcher("UpdateProfile.jsp").forward(request, response);
            } else {
                response.sendRedirect("Login.jsp"); // Redirect if user not found
            }
        } else {
            response.sendRedirect("Login.jsp"); // Redirect if not logged in
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        HttpSession session = request.getSession(false);

        if (session != null && session.getAttribute("userId") != null) {
            // Retrieve user ID as Integer
            Integer userId = (Integer) session.getAttribute("userId");
            
            // Get updated user details from the request
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String email = request.getParameter("email");
            String contactNo = request.getParameter("contactNo");

            // Update user information in the database
            UserModel updatedUser = new UserModel();
            updatedUser.setId(userId); // Keep it as Integer
            updatedUser.setFirstName(firstName);
            updatedUser.setLastName(lastName);
            updatedUser.setEmail(email);
            updatedUser.setContactNo(contactNo);

            UserController.updateUser(updatedUser); // Implement this method in UserController
            
//            session.setAttribute("updateMessage", "Profile updated successfully!");
            // Redirect to the profile page or show a success message
//            response.sendRedirect("UserProfileServlet");
            
        	
			String alertMessage = "User Profile Update Successfully";
			response.getWriter().println("<script> alert('"+alertMessage+"'); window.location.href='UserProfileServlet' </script> ");
        } else {
            response.sendRedirect("Login.jsp");
        }
    }
}
