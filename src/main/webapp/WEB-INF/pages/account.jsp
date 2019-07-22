<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>account</title>
</head>
<body>
<h1>account</h1>
<table border="2px">
    <c:forEach items="${accounts}" var="account">
        <tr>
            <td>ID:</td>&nbsp;&nbsp;
            <td>${account.id}</td>
            <td>name:</td>&nbsp;&nbsp;
            <td>${account.name}</td>
            <td>money:</td>&nbsp;&nbsp;
            <td>${account.money}</td>
        </tr>

    </c:forEach>

</table>
</body>
</html>
