<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="UserPackage.UserModel" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Profile</title>
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

        .profile-group {
            margin-bottom: 15px;
        }

        label {
            display: block;
            font-weight: bold;
            color: #555;
        }

        .profile-detail {
            margin-bottom: 5px;
            padding: 12px;
            background-color: #f0f0f0;
            border-radius: 5px;
        }

        button {
            padding: 10px;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            width: 100%;
            margin-bottom: 10px; /* Space between buttons */
            transition: background-color 0.3s; /* Smooth transition */
        }

        /* Styles for the Update Profile button */
        .update-button {
            background-color: blue;
            color: white;
        }

        .update-button:hover {
            background-color: darkblue;
        }

        /* Styles for the Home button */
        .home-button {
            background-color: gray; /* Changed to gray */
            color: white;
        }

        .home-button:hover {
            background-color: darkgray; /* Darker shade on hover */
        }

        /* Styles for the Logout button */
        .logout-button {
            background-color: #ff4757; /* Bright red color */
            color: white;
        }

        .logout-button:hover {
            background-color: #ff6b81; /* Lighter red on hover */
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>User Profile</h2>
        
        <%
            UserModel user = (UserModel) request.getAttribute("user");
        %>

        <div class="profile-group">
            <label>First Name:</label>
            <div class="profile-detail"><%= (user != null) ? user.getFirstName() : "N/A" %></div>
        </div>
        <div class="profile-group">
            <label>Last Name:</label>
            <div class="profile-detail"><%= (user != null) ? user.getLastName() : "N/A" %></div>
        </div>
        <div class="profile-group">
            <label>Email:</label>
            <div class="profile-detail"><%= (user != null) ? user.getEmail() : "N/A" %></div>
        </div>
        <div class="profile-group">
            <label>Contact Number:</label>
            <div class="profile-detail"><%= (user != null) ? user.getContactNo() : "N/A" %></div>
        </div>

        <button class="update-button" onclick="window.location.href='UpdateProfileServlet'">Update Profile</button>
        <button class="home-button" onclick="window.location.href='Home.jsp'">Home</button>
        <button class="logout-button" onclick="window.location.href='Login.jsp'">Logout</button>
    </div>
</body>
</html>
