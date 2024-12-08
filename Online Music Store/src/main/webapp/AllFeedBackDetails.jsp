<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>All Feedback From Customers</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f8f9fa;
            margin: 0;
            padding: 0;
        }

        .container {
            width: 80%;
            margin: 30px auto;
            padding: 20px;
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        .feedback-card {
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.1);
            margin-bottom: 20px;
            transition: transform 0.2s;
        }

        .feedback-card:hover {
            transform: translateY(-5px);
        }

        .feedback-card h3 {
            margin: 0;
            color: #007bff;
        }

        .feedback-card p {
            margin: 10px 0;
            color: #555;
        }

        .rate {
            font-weight: bold;
            color: #28a745;
        }

        .no-feedback {
            text-align: center;
            color: #dc3545;
            font-size: 18px;
            margin: 20px 0;
        }

        /* Search Bar Styles */
        .search-container {
            text-align: center;
            margin-bottom: 20px;
        }

        .search-input {
            width: 50%;
            padding: 10px;
            font-size: 16px;
            border-radius: 5px;
            border: 1px solid #ccc;
        }

        .search-button {
            padding: 10px 20px;
            font-size: 16px;
            background-color: #28a745;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            margin-left: 10px;
        }

        .search-button:hover {
            background-color: #218838;
        }

        /* Back Button */
        .back-btn {
            display: block;
            width: 200px;
            margin: 30px auto;
            padding: 10px 0;
            background-color: #007bff;
            color: white;
            text-align: center;
            text-decoration: none;
            border-radius: 5px;
            font-size: 16px;
        }

        .back-btn:hover {
            background-color: #0056b3;
        }
    </style>

    <script>
        function searchFeedback() {
            let input = document.getElementById("searchInput").value.toLowerCase();
            let feedbackCards = document.getElementsByClassName("feedback-card");

            for (let i = 0; i < feedbackCards.length; i++) {
                let name = feedbackCards[i].getElementsByTagName("h3")[0].textContent.toLowerCase();
                let email = feedbackCards[i].getElementsByClassName("feedback-email")[0].textContent.toLowerCase();

                if (name.includes(input) || email.includes(input)) {
                    feedbackCards[i].style.display = "";
                } else {
                    feedbackCards[i].style.display = "none";
                }
            }
        }
    </script>

</head>
<body>
    <div class="container">
        <h2>All Feedbacks</h2>

        <!-- Search Form -->
        <div class="search-container">
            <input type="text" id="searchInput" class="search-input" onkeyup="searchFeedback()" placeholder="Search by Name or Email">
            <button class="search-button" onclick="searchFeedback()">Search</button>
        </div>

        <c:choose>
            <c:when test="${not empty allFeedbacks}">
                <c:forEach var="feedback" items="${allFeedbacks}">
                    <div class="feedback-card">
                        <h3>${feedback.name}</h3>
                        <p class="feedback-email"><strong>Email:</strong> ${feedback.email}</p>
                        <p><strong>Description:</strong> ${feedback.description}</p>
                        <p class="rate"><strong>Rate:</strong> ${feedback.rate} / 5</p>
                    </div>
                </c:forEach>
            </c:when>
            <c:otherwise>
                <div class="no-feedback">No feedback available.</div>
            </c:otherwise>
        </c:choose>

        <a href="Home.jsp" class="back-btn">Back</a> <!-- Adjust the link as needed -->
    </div>
</body>
</html>
