<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: quackk
  Date: 25.06.2021
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
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