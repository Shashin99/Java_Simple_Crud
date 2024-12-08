<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="userProfilePackage.UserModel" %> <!-- Add this import statement -->
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Profile</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f0f4f7;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background-color: #fff;
            padding: 40px;
            border-radius: 10px;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 600px;
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        .form-group {
            margin-bottom: 15px;
        }

        label {
            display: block;
            font-weight: bold;
            color: #555;
        }

        input[type="text"], input[type="email"] {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        button {
            background-color: blue;
            color: white;
            padding: 10px;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            width: 100%;
        }

        button:hover {
            background-color: darkblue;
        }
    </style>
    
</head>
<body>
    <div class="container">
        <h2>Update Profile</h2>
        
        <%
            // Retrieve the UserModel object from the request
            UserModel user = (UserModel) request.getAttribute("user");
        %>

        <form action="UpdateProfileServlet" method="post">
            <div class="form-group">
                <label for="firstName">First Name:</label>
                <input type="text" id="firstName" name="firstName" value="<%= (user != null) ? user.getFirstName() : "" %>" required>
            </div>
            <div class="form-group">
                <label for="lastName">Last Name:</label>
                <input type="text" id="lastName" name="lastName" value="<%= (user != null) ? user.getLastName() : "" %>" required>
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" value="<%= (user != null) ? user.getEmail() : "" %>" required>
            </div>
            <div class="form-group">
                <label for="contactNo">Contact Number:</label>
                <input type="text" id="contactNo" name="contactNo" value="<%= (user != null) ? user.getContactNo() : "" %>" required>
            </div>
            <button type="submit">Update Profile</button>
        </form>
    </div>
</body>
</html>
