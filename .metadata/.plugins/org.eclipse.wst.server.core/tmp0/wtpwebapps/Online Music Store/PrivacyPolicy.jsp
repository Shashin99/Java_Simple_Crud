<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Privacy Policy - Online Music Store</title>
<style>
    /* General Styles */
    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f4f4f4;
    }
    header {
        background-color: #282828;
        padding: 20px;
        text-align: center;
        color: white;
    }
    header h1 {
        margin: 0;
        font-size: 2.5rem;
    }
    nav {
        margin: 20px 0;
    }
    nav a {
        color: white;
        padding: 14px 20px;
        text-decoration: none;
        text-transform: uppercase;
        font-weight: bold;
        margin: 0 10px;
        border-radius: 5px;
    }
    nav a:hover {
        background-color: #ff6b6b;
    }
    section {
        padding: 40px;
        max-width: 800px;
        margin: 20px auto;
        background-color: white;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    section h2 {
        font-size: 2rem;
        margin-bottom: 20px;
    }
    section p {
        font-size: 1.2rem;
        margin-bottom: 20px;
    }
    /* Back to Home Button */
    .home-button {
        display: inline-block;
        padding: 15px 30px;
        background-color: #282828;
        color: white;
        text-decoration: none;
        border-radius: 5px;
        font-size: 1.2rem;
        transition: background-color 0.3s;
        margin-top: 20px;
    }
    .home-button:hover {
        background-color: #ff6b6b;
    }
    footer {
        background-color: #282828;
        color: white;
        text-align: center;
        padding: 20px;
        position: fixed;
        width: 100%;
        bottom: 0;
    }
    footer a {
        color: white;
        text-decoration: none;
        margin: 0 10px;
    }
    footer a:hover {
        text-decoration: underline;
    }
</style>
</head>
<body>

<!-- Header Section -->
<header>
    <h1>Online Music Store</h1>
    <nav>
        <a href="home.jsp">Home</a>
        <a href="browse.jsp">Browse Music</a>
        <a href="account.jsp">Your Account</a>
        <a href="addfeedback.jsp">Give Feedback</a>
    </nav>
</header>

<!-- Privacy Policy Section -->
<section>
    <h2>Privacy Policy</h2>
    <p>Welcome to the Online Music Store! Your privacy is very important to us. This Privacy Policy outlines how we collect, use, and protect your information.</p>
    
    <h3>Information We Collect</h3>
    <p>We may collect the following types of information:</p>
    <ul>
        <li>Personal Information: Name, email address, and any other information you provide.</li>
        <li>Usage Data: Information about how you use our website.</li>
    </ul>

    <h3>How We Use Your Information</h3>
    <p>Your information helps us to:</p>
    <ul>
        <li>Provide and improve our services.</li>
        <li>Personalize your experience.</li>
        <li>Communicate with you.</li>
    </ul>

    <h3>Data Security</h3>
    <p>We take data security seriously and implement various measures to protect your information.</p>

    <h3>Your Rights</h3>
    <p>You have the right to:</p>
    <ul>
        <li>Access your personal data.</li>
        <li>Request correction of your data.</li>
        <li>Request deletion of your data.</li>
    </ul>

    <h3>Changes to This Privacy Policy</h3>
    <p>We may update our Privacy Policy from time to time. We will notify you of any changes by posting the new Privacy Policy on this page.</p>

    <h3>Contact Us</h3>
    <p>If you have any questions about this Privacy Policy, please contact us.</p>

    <a href="Home.jsp" class="home-button">Back to Home</a>
</section>


</body>
</html>
