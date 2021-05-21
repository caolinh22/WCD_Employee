<%@ page import="java.util.ArrayList" %>
<%@ page import="entity.Employee" %><%--
  Created by IntelliJ IDEA.
  User: ling
  Date: 21/05/2021
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new student</title>
</head>
<body>
<h1>Student form</h1>
<form action="employee/create" method="post">
    <div>
        ID <input type="text" name="id">
    </div>
    <div>
        Fullname <input type="text" name="fullName">
    </div>
    <div>
        Address <input type="text" name="address">
    </div>
    <div>
        Birthday <input type="text" name="birthday">
    </div>
    <div>
        Position <input type="text" name="position">
    </div>
    <div>
        Department <input type="text" name="department">
    </div>
    <div>
        <input type="submit" value="Submit">
        <input type="reset" value="Reset">
    </div>
</form>
</body>
</html>