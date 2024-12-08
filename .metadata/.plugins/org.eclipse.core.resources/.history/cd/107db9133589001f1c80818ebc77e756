<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>All Users</title>
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

        .no-users {
            text-align: center;
            color: #dc3545;
            font-size: 18px;
            margin: 20px 0;
        }

        .back-btn {
            display: block;
            width: 200px;
            margin: 0 auto;
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

        .delete-btn {
            background-color: #ff4757; /* Red background for delete button */
            color: white; /* White text */
            border: none; /* No border */
            padding: 6px 12px; /* Padding for better appearance */
            border-radius: 4px; /* Rounded corners */
            cursor: pointer; /* Pointer cursor on hover */
        }

        .delete-btn:hover {
            background-color: darkred; /* Darker shade on hover */
        }
    </style>
    
<script>
    function searchUser() {
        let input = document.getElementById("searchInput").value.toLowerCase();
        let tableRows = document.getElementById("userTable").getElementsByTagName("tr");

        for (let i = 1; i < tableRows.length; i++) {
            // Get the first name, last name, and email from the table cells
            let firstName = tableRows[i].getElementsByTagName("td")[0].textContent.toLowerCase();
            let lastName = tableRows[i].getElementsByTagName("td")[1].textContent.toLowerCase();
            let email = tableRows[i].getElementsByTagName("td")[2].textContent.toLowerCase();

            // Check if the input matches any of the fields
            if (firstName.includes(input) || lastName.includes(input) || email.includes(input)) {
                tableRows[i].style.display = ""; // Show row if it matches
            } else {
                tableRows[i].style.display = "none"; // Hide row if it doesn't match
            }
        }
    }
</script>

    
</head>
<body>
    <div class="container">
        <h2>All Users</h2>
        
         <!-- Search Form -->
        <div class="search-container">
            <input type="text" id="searchInput" class="search-input" onkeyup="searchUser()" placeholder="Search by FirtsName or LastName or Email">
        </div>
        
        <c:choose>
            <c:when test="${not empty userList}">
                <table id = "userTable">
                    <thead>
                        <tr>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Email</th>
                            <th>Gender</th>
                            <th>Contact No</th>
                            <th>Action</th> <!-- New Action Column -->
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="user" items="${userList}">
                            <tr>
                                <td>${user.firstName}</td>
                                <td>${user.lastName}</td>
                                <td>${user.email}</td>
                                <td>${user.gender}</td>
                                <td>${user.contactNo}</td>
                                <td>
                                    <!-- Delete Button -->
                                    <form action="DeleteUserServlet" method="post" style="display:inline;">
                                        <input type="hidden" name="id" value="${user.id}" />
                                        <input type="submit" value="Delete" class="delete-btn" 
                                               onclick="return confirm('Are you sure you want to delete this user?');" />
                                    </form>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </c:when>
            <c:otherwise>
                <p class="no-users">No users found in the system.</p>
            </c:otherwise>
        </c:choose>

        <!-- Back Button to Navigate to Dashboard -->
        <a href="AdminDashboardServlet" class="back-btn">Back to Dashboard</a>
    </div>
</body>
</html>
