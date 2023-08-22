<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new student</title>
    <style>
        .message{
            color:green;
        }
    </style>
</head>
<body>
<h1>Create new student</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
    <a href="/students">Back to student list</a>
</p>
<form method="post">
    <fieldset>
        <legend>Student information</legend>
        <table>
            <tr>
                <td>Name: </td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>Email: </td>
                <td><input type="text" name="point" id="point"></td>
            </tr>
            <tr>
                <td>Address: </td>
                <td><input type="text" name="date" id="date"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create student"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>