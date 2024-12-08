package UserPackage;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteUserServlet")
public class DeleteUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String id = request.getParameter("id"); // Get the user ID from the request
        boolean isDeleted = UserController.deleteData(id); // Call the deleteData method in UserController

        if (isDeleted) {
            // Redirect back to the user list with a success message
        	String alertMessage = "Data Delete Successfully";
            response.getWriter().println("<script> alert('"+alertMessage+"'); window.location.href='FetchUserServlet' </script> ");
        } else {
            // Redirect back to the user list with an error message
            response.sendRedirect("FetchUserServlet?message=Failed to delete user.");
        }
    }
}
