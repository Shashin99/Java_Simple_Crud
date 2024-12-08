package UserPackage;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Retrieve email and password from form
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        // Authenticate user and retrieve user ID
        int userId = authenticateUser(email, password);

        if (userId > 0) {
            // Login successful, store user ID in session and navigate to home page
            HttpSession session = request.getSession();
            session.setAttribute("userId", userId);
            
            // Redirect to home page or user profile page
            response.sendRedirect("HomeServlet");
        } else {
            // Login failed, show error message and redirect back to login page
            request.setAttribute("errorMessage", "Invalid Email or Password");
            RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
            dispatcher.forward(request, response);
        }
    }

    // Method to authenticate the user and return their user ID if valid
    private int authenticateUser(String email, String password) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int userId = -1;

        try {
            // Get a connection to the database
            conn = DBconnection.getConnection();

            // SQL query to check if the email and password are valid
            String sql = "SELECT id FROM User WHERE email = ? AND password = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, password); // Consider hashing the password in a real application

            // Execute the query
            rs = stmt.executeQuery();

            // If a record exists with matching email and password, return the user ID
            if (rs.next()) {
                userId = rs.getInt("id");
            }
        } catch (Exception e) {
            // Log the exception (for debugging purposes)
            e.printStackTrace();
        } finally {
            // Close resources to prevent leaks
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return userId; // return -1 if authentication fails
    }
}
