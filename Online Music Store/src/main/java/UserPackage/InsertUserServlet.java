package UserPackage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InsertUserServlet")
public class InsertUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public InsertUserServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String contactNo = request.getParameter("contactNo");
        String password = request.getParameter("password");

        // Get the UserController instance
        UserController userController = UserController.getInstance();
        
        boolean isTrue = false;
        String resultMessage = ""; // Message to hold error/success info

        // Validate email uniqueness
        if (!UserController.isEmailUnique(email)) {
            resultMessage = "Email is already in use.";
        } 
        // Validate contact number
        else if (!contactNo.matches("\\d{10}")) {
            resultMessage = "Contact number must be 10 digits long and contain only numbers.";
        } 
        // Proceed with registration if validations pass
        else {
            isTrue = userController.insertData(firstName, lastName, gender, email, contactNo, password);
            if (isTrue) {
                resultMessage = "Register Successfully"; // Successful registration message
                response.getWriter().println("<script>alert('" + resultMessage + "'); window.location.href='Login.jsp';</script>");
                return; // Exit after successful registration
            } else {
                resultMessage = "Registration failed. Please try again.";
            }
        }

        // If we reach here, it means there was a validation error or registration failed
        request.setAttribute("errorMessage", resultMessage); // Set the error message as a request attribute
        RequestDispatcher dis2 = request.getRequestDispatcher("Register.jsp"); // Redirect back to the sign-up page
        dis2.forward(request, response);

    }
}
