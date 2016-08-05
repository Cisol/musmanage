<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/8/3 0003
  Time: 下午 4:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>get</title>
</head>

<body>
<table border="1">
    <tr>
        <td>序号</td>
        <td>名称</td>
        <td>作者</td>
        <td>信息</td>
<c:forEach items="${data}" var="ms">
    <tr>
        <td>${ms.mid}</td>
        <td>${ms.mname}</td>
        <td>${ms.mauthor}</td>
        <td>${ms.minfo}</td>
    </tr>
</c:forEach>
</table>
</body>
</html>
