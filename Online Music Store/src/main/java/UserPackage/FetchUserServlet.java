package UserPackage;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FetchUserServlet")
public class FetchUserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Use UserController to fetch all users
        UserController userController = new UserController();
        List<UserModel> userList = userController.getAllUsers(); // Fetching all users
        
        // Set the user list to request attribute
        request.setAttribute("userList", userList);
        
        // Forward to JSP to display users
        request.getRequestDispatcher("AdminAllUsers.jsp").forward(request, response);
    }
}
