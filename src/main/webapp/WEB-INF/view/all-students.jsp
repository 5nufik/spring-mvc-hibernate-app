<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: quackk
  Date: 25.06.2021
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Студенты</title>
        <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="header.jsp"/>

        <h2>Список студентов</h2>

        <table>
            <tr>
                <th>Фамилия</th>
                <th>Имя</th>
                <th>Отчество</th>
                <th>Дата рождения</th>
                <th>Группа</th>
            </tr>
            <c:forEach var="student" items="${allStudents}">
                <tr>
                    <th>${student.studentSurname}</th>
                    <th>${student.studentName}</th>
                    <th>${student.studentPatronymic}</th>
                    <th>${student.studentDateOfBirth}</th>
                    <th>${student.studentGroup.groupName}</th>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>