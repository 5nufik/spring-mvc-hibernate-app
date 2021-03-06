<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Создание группы</title>
        <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="header.jsp"/>

        <h2>${group.groupID == 0 ? 'Создание группы' : 'Изменение группы'}</h2>

        <form:form action="save" modelAttribute="group">
            <form:hidden path="groupID"/>
            <table>
                <tr>
                    <td>Название группы</td>
                    <td><form:input path="groupName"/></td>
                    <td><form:errors path="groupName"/></td>
                </tr>
            </table>

            <br>

            <input type="submit" value="${group.groupID == 0 ? 'Создать' : 'Применить'}">
        </form:form>
    </body>
</html>