<%@ page language="java" %>
<%-- This is a JSP comment --%>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="css/style2.css" />
    </head>
    <body>
        <h1>Welcome to My Web Application</h1>
        <p>This is a simple JSP page.</p>
        <p>Current date and time: <%= new java.util.Date() %></p>
        <form action="addAlien" method="post">
            <input type="text" id="aid" name="aid" placeholder="Enter Id :"/><br/>
            <input type="text" id="aname" name="aname" placeholder="Enter your name :"/><br/>
            <input type="submit" value="Submit"/>
        </form>
    </body>
</html>
