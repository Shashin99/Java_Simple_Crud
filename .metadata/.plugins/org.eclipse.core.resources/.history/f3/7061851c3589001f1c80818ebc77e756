<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Us - Online Music Store</title>
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
    /* Contact Form */
    .contact-form {
        display: flex;
        flex-direction: column;
    }
    .contact-form input, 
    .contact-form textarea {
        margin-bottom: 15px;
        padding: 10px;
        border-radius: 5px;
        border: 1px solid #ccc;
    }
    .contact-form button {
        padding: 10px;
        background-color: #282828;
        color: white;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        transition: background-color 0.3s;
    }
    .contact-form button:hover {
        background-color: #ff6b6b;
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
        <a href="Home.jsp">Home</a>
        <a href="browse.jsp">Browse Music</a>
        <a href="account.jsp">Your Account</a>
        <a href="InsertFeedback.jsp">Give Feedback</a>
    </nav>
</header>

<!-- Contact Us Section -->
<section>
    <h2>Contact Us</h2>
    <p>If you have any questions or feedback, feel free to reach out to us!</p>

    <h3>Contact Details</h3>
    <p><strong>Email:</strong> Minioc@onlinemusicstore.com</p>
    <p><strong>Phone:</strong> 0111 567 987 </p>
    <p><strong>Address:</strong> 123 , Gemenupura, Kothalawala, Kaduwela</p>

    <h3>Send Us a Message</h3>
    <form class="contact-form" action="sendContact.jsp" method="post">
        <input type="text" name="name" placeholder="Your Name" required>
        <input type="email" name="email" placeholder="Your Email" required>
        <textarea name="message" rows="5" placeholder="Your Message" required></textarea>
        <button type="submit">Send Message</button>
    </form>

    <a href="Home.jsp" class="home-button">Back to Home</a>
</section>


</body>
</html>
