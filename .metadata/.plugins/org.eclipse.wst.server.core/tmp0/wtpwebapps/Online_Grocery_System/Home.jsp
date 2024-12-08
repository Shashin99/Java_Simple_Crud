<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Online Music Store - Home</title>
    <style>
        /* General Styles */
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
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
            transition: background-color 0.3s;
        }
        nav a:hover {
            background-color: #ff6b6b;
        }
        section {
            padding: 40px;
            text-align: center;
            flex: 1; /* Allow section to grow */
        }
        section h2 {
            font-size: 2rem;
            margin-bottom: 20px;
        }
        section p {
            font-size: 1.2rem;
            margin-bottom: 30px;
        }

        /* Slideshow container */
        .slideshow-container {
            width: 100%;
            overflow: hidden;
            position: relative;
        }

        /* Slideshow content */
        .slideshow {
            display: flex;
            transition: transform 0.5s ease-in-out;
        }

        /* Slide */
        .slide {
            min-width: 560px;
            margin-right: 20px;
            display: inline-block;
        }

        .slideshow iframe {
            border: none;
            border-radius: 10px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.2);
            width: 560px;
            height: 315px;
        }

        /* Slideshow buttons */
        .prev, .next {
            position: absolute;
            top: 50%;
            background-color: rgba(0, 0, 0, 0.5);
            color: white;
            padding: 10px;
            cursor: pointer;
            border: none;
            border-radius: 50%;
            transform: translateY(-50%);
        }

        .prev {
            left: 10px;
        }

        .next {
            right: 10px;
        }

        footer {
            background-color: #282828;
            color: white;
            text-align: center;
            padding: 20px;
            position: relative;
        }
        footer a {
            color: white;
            text-decoration: none;
            margin: 0 10px;
        }
        footer a:hover {
            text-decoration: underline;
        }

        .lyrics-container {
            display: flex;
            justify-content: center;
            gap: 20px; /* Space between cards */
            flex-wrap: wrap; /* Wrap cards to next line */
        }

        .card {
            background-image: url('https://source.unsplash.com/featured/?music');
            background-size: cover;
            background-position: center;
            color: white;
            border-radius: 10px;
            padding: 20px;
            width: 300px; /* Adjust width as needed */
            height: 200px; /* Adjust height as needed */
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            display: flex;
            flex-direction: column;
            justify-content: flex-end; /* Align content to the bottom */
            text-align: left;
            transition: transform 0.3s; /* Smooth scale effect */
        }

        .card:hover {
            transform: scale(1.05); /* Slightly enlarge on hover */
        }

        .card h3 {
            margin: 0;
        }

        .card p {
            margin: 10px 0 0; /* Margin for paragraph */
            font-size: 0.9rem; /* Smaller font size for description */
        }

        .card:nth-child(1) {
            background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRriCUqX5W-QflNJoKd7_GefUxC3BHL8HaC-Q&s');
        }

        .card:nth-child(2) {
            background-image: url('data:image/jpeg;base64,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');
        }

        .card:nth-child(3) {
            background-image: url('https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQNBvFM3UD1FXCAD66xCsAGs7IKWkyICvr9lQ&s');
        }

    </style>
</head>
<body>

<!-- Header Section -->
<header>
    <h1>Online Music Store</h1>
    <nav>
        <a href="Home.jsp">Home</a>
        <a href="UserProfileServlet">Your Account</a>
        <a href="InsertFeedback.jsp">Give Feedback</a>
        <a href="GetAllFeedBackServlet">All Feedbacks</a>
    </nav>
</header>

<!-- Main Section with YouTube Slideshow -->
<section>
    <h2>Latest Music Videos</h2>
    <p>Watch the top trending music videos now!</p>

    <!-- Slideshow Container -->
    <div class="slideshow-container">
        <div class="slideshow" id="slideshow">
            <!-- Slide 1 -->
            <div class="slide">
                <iframe src="https://www.youtube.com/embed/3tmd-ClpJxA" 
                        allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" 
                        allowfullscreen>
                </iframe>
            </div>

            <!-- Slide 2 -->
            <div class="slide">
                <iframe src="https://www.youtube.com/embed/8j741TUIET0" 
                        allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" 
                        allowfullscreen>
                </iframe>
            </div>

            <!-- Slide 3 -->
            <div class="slide">
                <iframe src="https://www.youtube.com/embed/JGwWNGJdvx8" 
                        allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" 
                        allowfullscreen>
                </iframe>
            </div>
            
            <!-- Slide 4 - Believer by Imagine Dragons -->
            <div class="slide">
                <iframe src="https://www.youtube.com/embed/7wtfhZwyrcc" 
                        allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" 
                        allowfullscreen>
                </iframe>
            </div>

            <!-- Slide 5 - Akon - Lonely -->
            <div class="slide">
                <iframe src="https://www.youtube.com/embed/6EEW-9NDM5k" 
                        allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" 
                        allowfullscreen>
                </iframe>
            </div>

            <!-- Slide 6 - Akon - Smack That -->
            <div class="slide">
                <iframe src="https://www.youtube.com/embed/bKDdT_nyP54" 
                        allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" 
                        allowfullscreen>
                </iframe>
            </div>
        </div>
    </div>
</section>

<!-- Lyrics Section -->
<section>
    <h2>Featured Lyrics</h2>
    <p>Check out the lyrics of trending songs!</p>
    <div class="lyrics-container">
        <div class="card">
            <h3>Believer</h3>
            <p>Imagine Dragons</p>
        </div>
        <div class="card">
            <h3>Lonely</h3>
            <p>Akon</p>
        </div>
        <div class="card">
            <h3>Smack That</h3>
            <p>Akon</p>
        </div>
    </div>
</section>

<!-- Footer Section -->
<footer>
    <p>&copy; 2024 Online Music Store. All rights reserved.</p>
    <a href="PrivacyPolicy.jsp">Privacy Policy</a> | <a href="Terms.jsp">Terms of Service</a> | <a href="ContactUs.jsp">Contact Us</a> 
</footer>

<script>
    let slideIndex = 0;

    function showSlides() {
        const slides = document.querySelector('.slideshow');
        const slideCount = slides.children.length;

        if (slideIndex >= slideCount) {
            slideIndex = 0;
        }

        slides.style.transform = `translateX(${-slideIndex * 580}px)`;
        slideIndex++;
        setTimeout(showSlides, 3000); // Change image every 3 seconds
    }

    function moveSlide(n) {
        const slides = document.querySelector('.slideshow');
        const slideCount = slides.children.length;

        slideIndex += n;

        if (slideIndex < 0) {
            slideIndex = slideCount - 1; // Go to last slide
        } else if (slideIndex >= slideCount) {
            slideIndex = 0; // Go to first slide
        }

        slides.style.transform = `translateX(${-slideIndex * 580}px)`;
    }

    showSlides(); // Start the slideshow
</script>

</body>
</html>
