<%@ page language="java" %>
<%-- This is a JSP comment --%>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/style.css" />
    </head>
    <body>
        <h1>Welcome to My Web Application</h1>
        <p>This is a simple JSP page.</p>
        <p>Current date and time: <%= new java.util.Date() %></p>
        <form action="submitForm" method="post">
            <input type="text" id="num1" name="numberOne" placeholder="Enter first number"/><br/>
            <input type="text" id="num2" name="numberTwo" placeholder="Enter second number"/><br/>
            <input type="submit" value="Submit"/>
        </form>
    </body>
</html>
