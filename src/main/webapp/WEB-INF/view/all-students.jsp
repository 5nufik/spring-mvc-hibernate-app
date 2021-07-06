<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>

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
                <th>Почта</th>
                <th>Группа</th>
                <th>Операции</th>
            </tr>
            <c:forEach var="student" items="${allStudents}">

                <c:url var="editStudent" value="/students/edit">
                    <c:param name="studentID" value="${student.studentID}"/>
                </c:url>

                <c:url var="deleteStudent" value="/students/delete">
                    <c:param name="studentID" value="${student.studentID}"/>
                </c:url>

                <tr>
                    <td>${student.studentSurname}</td>
                    <td>${student.studentName}</td>
                    <td>${student.studentPatronymic}</td>
                    <td>${student.studentDateOfBirth}</td>
                    <td>${student.studentEmail}</td>
                    <td>${student.studentGroup.groupName}</td>
                    <td>
                        <input type="button" value="Изменить" onclick="window.location.href = '${editStudent}'"/>

                        <input type="button" value="Удалить" onclick="window.location.href = '${deleteStudent}'"/>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>