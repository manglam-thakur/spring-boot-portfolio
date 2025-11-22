package templates;

<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Contact – Kumar Manglam</title>
    <link rel="stylesheet" th:href="@{/css/styles.css}">
</head>
<body>
    <header class="site-header">
        <div class="container">
            <h1 class="logo">Kumar Manglam</h1>
            <nav class="main-nav">
                <a th:href="@{/}">Home</a>
                <a th:href="@{/about}">About</a>
                <a th:href="@{/projects}">Projects</a>
                <a th:href="@{/contact}">Contact</a>
            </nav>
        </div>
    </header>
    <main class="container">
        <section>
            <h2>Contact Me</h2>
            <form th:action="@{/contact}" method="post" class="contact-form">
                <label for="name">Name:</label>
                <input type="text" id="name" name="name" required>
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
                <label for="message">Message:</label>
                <textarea id="message" name="message" rows="5" required></textarea>
                <button type="submit">Send</button>
            </form>
        </section>
    </main>
    <footer class="site-footer">
        <div class="container">
            <p>© 2025 Kumar Manglam</p>
        </div>
    </footer>
    <script th:src="@{/js/main.js}"></script>
</body>
</html>
