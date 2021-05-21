<%@ page import="entity.Employee" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: ling
  Date: 21/05/2021
  Time: 19:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    ArrayList<Employee> listEmployee = (ArrayList<Employee>) request.getAttribute("listEmployee");
%>
<html>
<head>
    <title>List Employee</title>
</head>
<body>
<h1>List Employee</h1>
<ul>
    <% if(listEmployee != null && listEmployee.size() > 0){
        for(int i = 0; i < listEmployee.size(); i++){
    %>
    <li>
        <%= listEmployee.get(i).getId()%>
    </li>
    <li>
        <%= listEmployee.get(i).getFullName()%>
    </li>
    <li>
        <%= listEmployee.get(i).getAddress()%>
    </li>
    <li>
        <%= listEmployee.get(i).getBirthday()%>
    </li>
    <li>
        <%= listEmployee.get(i).getPosition()%>
    </li>
    <li>
        <%= listEmployee.get(i).getDepartment()%>
    </li>
    <%
            }
        }
    %>
</ul>
</body>
</html>
