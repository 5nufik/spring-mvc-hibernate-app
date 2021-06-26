<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: quackk
  Date: 26.06.2021
  Time: 17:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Создание группы</title>
        <link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet">
    </head>
    <body>
        <jsp:include page="header.jsp"/>

        <h2>Создание группы</h2>

        <form:form action="save" modelAttribute="group">
            <table>
                <tr>
                    <td>Название группы</td>
                    <td><form:input path="groupName" required="required"/></td>
                </tr>
            </table>
            <input type="submit" value="Создать">
        </form:form>
    </body>
</html>
