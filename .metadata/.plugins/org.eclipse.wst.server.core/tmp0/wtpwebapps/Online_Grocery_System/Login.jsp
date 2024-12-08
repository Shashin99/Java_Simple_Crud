<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login Here</title>
    
    <style>
        * {
            box-sizing: border-box;
        }

        body {
            font-family: 'Roboto', sans-serif;
            background: linear-gradient(135deg, #74ebd5 0%, #ACB6E5 100%);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .container {
            background: #ffffff;
            padding: 50px 40px;
            border-radius: 15px;
            box-shadow: 0 6px 20px rgba(0, 0, 0, 0.1);
            max-width: 350px;
            width: 100%;
            position: relative;
            overflow: hidden;
        }

        .container::before {
            content: '';
            position: absolute;
            width: 250px;
            height: 250px;
            background-color: rgba(114, 181, 234, 0.5);
            border-radius: 50%;
            top: -100px;
            left: -100px;
            z-index: 1;
        }

        .container h2 {
            text-align: center;
            color: #333;
            margin-bottom: 40px;
            z-index: 2;
            position: relative;
        }

        .form-group {
            margin-bottom: 25px;
        }

        label {
            font-weight: 500;
            color: #666;
            display: block;
            margin-bottom: 5px;
        }

        input {
            width: 100%;
            padding: 12px;
            border: 1px solid #ddd;
            border-radius: 8px;
            font-size: 16px;
            outline: none;
            transition: 0.3s;
        }

        input:focus {
            border-color: #74ebd5;
            box-shadow: 0 0 5px rgba(114, 181, 234, 0.7);
        }

        .btn {
            width: 100%;
            padding: 12px;
            background: #74ebd5;
            color: #fff;
            border: none;
            border-radius: 8px;
            font-size: 18px;
            cursor: pointer;
            transition: 0.3s;
        }

        .btn:hover {
            background-color: #4fc3f7;
        }

        .error {
            color: red;
            text-align: center;
            margin-bottom: 15px;
            font-size: 14px;
        }

        .signup-link {
            text-align: center;
            margin-top: 20px;
            font-size: 14px;
            color: #666;
        }

        .signup-link a {
            color: #4fc3f7;
            text-decoration: none;
        }

        .signup-link a:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Login</h2>

        <!-- Server-side error message display -->
        <div class="error">
            <%
                String errorMessage = (String) request.getAttribute("errorMessage");
                if (errorMessage != null) {
                    out.println(errorMessage);
                }
            %>
        </div>

        <!-- Client-side error display -->
        <div id="error-message" class="error" style="display:none;">Please fill in both fields.</div>

        <form id="loginForm" action="LoginServlet" method="post" onsubmit="return validateForm()">
            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" id="email" name="email" placeholder="Enter your email">
            </div>
            <div class="form-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" placeholder="Enter your password">
            </div>
            <button type="submit" class="btn">Login</button>
        </form>

        <div class="signup-link">
            <p>Don't have an account? <a href="Register.jsp">Sign up here</a>.</p>
        </div>
    </div>

    <script>
        function validateForm() {
            var email = document.getElementById('email').value;
            var password = document.getElementById('password').value;
            var errorMessage = document.getElementById('error-message');
            
            if (email === "" || password === "") {
                errorMessage.style.display = "block";
                return false;
            }
            return true;
        }
    </script>
</body>
</html>
