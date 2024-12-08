<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User and Feedback Dashboard</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(to right, #f0f4f7, #d1e8ff);
            display: flex;
            flex-direction: column; /* Allowing vertical stacking of elements */
            align-items: center;
            height: 100vh;
            margin: 0;
            padding: 20px;
        }

        .logout-button {
            background-color: #ff4757; /* Bright red */
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 10px; /* Rounded corners for a modern look */
            font-size: 18px;
            cursor: pointer;
            margin-bottom: 30px; /* Space below the logout button */
            transition: background-color 0.3s, transform 0.2s;
            width: 250px;
        }

        .logout-button:hover {
            background-color: #ff6b81; /* Lighter red on hover */
            transform: scale(1.05); /* Slightly enlarge on hover */
        }

        .container {
            display: flex;
            gap: 30px; /* Space between boxes */
            justify-content: center; /* Center boxes */
        }

        .box {
            background-color: #ffffff; /* White background */
            border-radius: 15px;
            padding: 30px; /* Increased padding */
            width: 250px; /* Slightly wider boxes */
            box-shadow: 0 10px 20px rgba(0, 0, 0, 0.1); /* More pronounced shadow */
            text-align: center;
            position: relative;
            transition: transform 0.3s, box-shadow 0.3s; /* Smooth transitions */
        }

        .box:hover {
            transform: translateY(-5px);
            box-shadow: 0 15px 30px rgba(0, 0, 0, 0.2); /* Shadow change on hover */
        }

        .box h3 {
            margin: 10px 0;
            color: #333; /* Darker text for readability */
            font-size: 24px; /* Larger title */
        }

        .count {
            font-size: 3em; /* Larger count */
            font-weight: bold;
            margin: 20px 0;
            color: #555;
        }

        .button {
            background-color: #007bff; /* Bootstrap primary blue */
            color: white;
            padding: 10px;
            border: none;
            border-radius: 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background-color 0.3s, transform 0.2s;
            width: 100%;
        }

        .button:hover {
            background-color: #0056b3; /* Darker blue on hover */
            transform: translateY(-2px); /* Lift effect on hover */
        }

        /* Colorful Box Styles */
        .users-box {
            background-color: #e0f7fa; /* Light cyan */
        }

        .feedbacks-box {
            background-color: #ffe0b2; /* Light amber */
        }
    </style>
</head>
<body>
    <br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
    <div class="container">
        <!-- Users Box -->
        <div class="box users-box">
            <h3>All Users</h3>
            <div class="count">
		<%= request.getAttribute("userCount") != null ? (Integer) request.getAttribute("userCount") : 0 %>

            </div>
            <button class="button" onclick="window.location.href='FetchUserServlet'">View Users</button>
        </div>

        <!-- Feedbacks Box -->
        <div class="box feedbacks-box">
            <h3>All Feedbacks</h3>
            <div class="count">
                <%= request.getAttribute("feedbackCount") != null ? (Integer) request.getAttribute("feedbackCount") : 0 %>
            </div>
            <button class="button" onclick="window.location.href='AdminGetAllFeedBackServlet'">View Feedbacks</button>
        </div>

    </div>

    <!-- Logout Button -->
    <br/><br/><br/> 
    <button class="logout-button" onclick="window.location.href='AdminLogin.jsp'">Logout</button>
</body>
</html>
