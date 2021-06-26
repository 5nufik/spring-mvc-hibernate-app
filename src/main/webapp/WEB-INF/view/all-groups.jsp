<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
    <head>
        <title>Группы</title>
        <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="header.jsp"/>

        <h2>Список групп</h2>

        <table>
            <tr>
                <th>Название</th>
            </tr>
            <c:forEach var="group" items="${allGroups}">
                <tr>
                    <th>${group.groupName}</th>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>