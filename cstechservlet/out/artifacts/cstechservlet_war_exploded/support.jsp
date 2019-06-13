<%--
  Created by IntelliJ IDEA.
  User: sanjay
  Date: 6/12/2019
  Time: 12:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Help Form</title>
</head>
<body>
<form action='support' method='post'>
    Name: <input type='text' name='name' required/><br />
    Email address: <input type='email' name='email' required/><br />
    Problem: <input type='text' name='problem'/><br />
    Problem description:<textarea rows='20' cols='70' name='problemDesc'></textarea><br />
    <input type='submit' value='label'/>
     </form>

</body>
</html>
