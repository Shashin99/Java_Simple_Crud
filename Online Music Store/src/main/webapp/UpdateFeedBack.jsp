<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Submit Feedback</title>
    <style>
        /* General Styles */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f0f4f7;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .container {
            background-color: #fff;
            border-radius: 10px;
            padding: 30px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 500px;
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 20px;
        }

        .form-group {
            margin-bottom: 15px;
        }

        label {
            display: block;
            margin-bottom: 5px;
            font-weight: bold;
        }

        input, textarea, select {
            width: 100%;
            padding: 10px;
            border-radius: 5px;
            border: 1px solid #ccc;
            font-size: 16px;
        }

        textarea {
            resize: vertical;
            height: 100px;
        }

        button {
            background-color: #5cb85c;
            color: white;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            margin-top: 20px;
            width: 100%;
        }

        button:hover {
            background-color: #4cae4c;
        }

        .feedback-message {
            text-align: center;
            font-size: 14px;
            color: #d9534f;
            margin-top: 10px;
        }
    </style>
</head>
<body>
<%
String id = request.getParameter("id");
String name = request.getParameter("name");
String email = request.getParameter("email");
String description = request.getParameter("description");
String rate = request.getParameter("rate");
%>
<div class="container">
        <h2>Submit Your Feedback</h2>
        <form action="FeedBackUpdateServlet" method="post">
        <div class="form-group">
                <label for="id">ID</label>
                <input type="text" id="id" name="id" value="<%=id%>" readonly>
            </div>
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" value="<%=name%>">
            </div>
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" value="<%=email%>">
            </div>
            <div class="form-group">
                <label for="description">Description:</label>
                <textarea id="description" name="description"><%=description %></textarea>
            </div>
            <div class="form-group">
                <label for="rate">Rate Us:</label>
                <select id="rate" name="rate">
                <option value="" disabled>Select a rating</option>
                <option value="1" <%= "1".equals(rate) ? "selected" : "" %>>1 - Poor</option>
                <option value="2" <%= "2".equals(rate) ? "selected" : "" %>>2 - Fair</option>
                <option value="3" <%= "3".equals(rate) ? "selected" : "" %>>3 - Good</option>
                <option value="4" <%= "4".equals(rate) ? "selected" : "" %>>4 - Very Good</option>
                <option value="5" <%= "5".equals(rate) ? "selected" : "" %>>5 - Excellent</option>
            </select>
            </div>
            <button type="submit">Update Feedback</button>
        </form>

        <!-- Display feedback messages if needed -->
        <% 
        String message = request.getParameter("message");
        if (message != null) {
        %>
            <p class="feedback-message"><%= message %></p>
        <% 
        }
        %>
    </div>
</body>
</html>