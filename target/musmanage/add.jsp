<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/7/30 0030
  Time: 下午 5:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add</title>
</head>
<body>
    <form name="form1" action="<%= request.getContextPath()%>/music/add" method="post">
     id:   <input type="text" id="mid" name="mid">
     name:   <input type="text" id="mname" name="mname">
     author:   <input type="text" id="mauthor" name="mauthor">
     info:   <input type="text" id="minfo" name="minfo">
        <input type="submit" id="submit" name="submit">
    </form>
</body>
</html>
