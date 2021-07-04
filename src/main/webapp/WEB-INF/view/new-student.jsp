<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Добавление студента</title>
        <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="header.jsp"/>

        <h2>Добавление студента</h2>

        <br>

        <form:form action="save" modelAttribute="student">
            <form:hidden path="studentID"/>

            <table>
                <tr>
                    <td>Имя</td>
                    <td><form:input path="studentName" required="true"/></td>
                </tr>
                <tr>
                    <td>Фамилия</td>
                    <td><form:input path="studentSurname" required="true"/></td>
                </tr>
                <tr>
                    <td>Отчество</td>
                    <td><form:input path="studentPatronymic" required="true"/></td>
                </tr>
                <tr>
                    <td>Почта</td>
                    <td><form:input path="studentEmail" type="email" required="true"/></td>
                </tr>
                <tr>
                    <td>Дата рождения</td>
                    <td><form:input type="date" path="studentDateOfBirth" required="true"/></td>
                </tr>
                <tr>
                    <td>Группа</td>
                    <td>
                        <form:select path="studentGroup" required="true">
                            <form:option value="" label="--Выберите группу--"/>
                            <c:forEach items="${groups}" var="group">
                                <form:option value="${group.groupName}"  selected="${student.studentGroup.groupName.equals(group.groupName) ? 'selected' : ''}"/>
                            </c:forEach>
                        </form:select>
                    </td>
                </tr>
            </table>

            <br>

            <input type="submit" value="Добавить">

        </form:form>
    </body>
</html>