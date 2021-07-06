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
                <th>Операции</th>
            </tr>
            <c:forEach var="group" items="${allGroups}">
                <c:url var="editGroup" value="/groups/edit">
                    <c:param name="groupID" value="${group.groupID}"/>
                </c:url>
                <tr>
                    <td>${group.groupName}</td>
                    <td>
                        <input type="button" value="Изменить" onclick="window.location.href = '${editGroup}'"/>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>