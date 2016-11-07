<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Login page</title>
    <form action="/j_spring_security_check" method="post">
        <p>Login: <input type="text" required name = "j_username"> </p>
        <p>Password: <input type="password" required name = "j_password"> </p>
        <input type="submit" value="OK"/>
    </form>
</head>
<body>

</body>
</html>
