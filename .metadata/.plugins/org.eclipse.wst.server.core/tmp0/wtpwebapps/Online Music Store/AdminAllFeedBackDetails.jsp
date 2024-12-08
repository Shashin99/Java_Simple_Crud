<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h2 {
            text-align: center;
            margin-bottom: 20px;
            color: #333;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }

        table th, table td {
            padding: 12px;
            text-align: left;
            border-bottom: 1px solid #ddd;
        }

        table th {
            background-color: #007bff;
            color: white;
        }

        table tr:nth-child(even) {
            background-color: #f2f2f2;
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

        /* Button */
        .back-btn {
            display: block;
            width: 200px;
            margin: 20px auto;
            padding: 10px 0;
            background-color: gray;
            color: white;
            text-align: center;
            text-decoration: none;
            border-radius: 5px;
            font-size: 16px;
        }

        .back-btn:hover {
            background-color: #0056b3;
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

        /* Update Button */
        .update-btn {
            background-color: #fff9c4;
            color: #333;
            border: 1px solid #f7d358;
            padding: 5px 10px;
            border-radius: 5px;
            cursor: pointer;
            font-size: 14px;
        }

        .update-btn:hover {
            background-color: #fff176;
        }

        /* Delete Button */
        .delete-btn {
            background-color: #f8d7da;
            color: #721c24;
            border: 1px solid #f5c6cb;
            padding: 5px 10px;
            border-radius: 5px;
            cursor: pointer;
            font-size: 14px;
        }

        .delete-btn:hover {
            background-color: #f5b7b1;
        }
    </style>

    <script>
        function searchFeedback() {
            let input = document.getElementById("searchInput").value.toLowerCase();
            let tableRows = document.getElementById("feedbackTable").getElementsByTagName("tr");

            for (let i = 1; i < tableRows.length; i++) {
                let name = tableRows[i].getElementsByTagName("td")[0].textContent.toLowerCase();
                let email = tableRows[i].getElementsByTagName("td")[1].textContent.toLowerCase();

                if (name.includes(input) || email.includes(input)) {
                    tableRows[i].style.display = "";
                } else {
                    tableRows[i].style.display = "none";
                }
            }
        }
    </script>

</head>
<body>
    <div class="container">
        <h2>All Feedback From Customers</h2>

        <!-- Search Form -->
        <div class="search-container">
            <input type="text" id="searchInput" class="search-input" onkeyup="searchFeedback()" placeholder="Search by Name or Email">
        </div>

        <table id="feedbackTable">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Description</th>
                    <th>Rate</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="feedback" items="${allFeedbacks}">
                    <tr>
                        <td>${feedback.name}</td>
                        <td>${feedback.email}</td>
                        <td>${feedback.description}</td>
                        <td class="rate">${feedback.rate} / 5</td>
                        <td>
                            <form action="FeedBackDeleteServlet" method="post" style="display:inline;">
                                <input type="hidden" name="id" value="${feedback.id}">
                                <button type="submit" class="delete-btn">Delete</button>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>

        <!-- Back Button to Navigate to dashboard.jsp -->
        <a href="AdminDashboardServlet" class="back-btn">Back to Dashboard</a>
    </div>
</body>
</html>
