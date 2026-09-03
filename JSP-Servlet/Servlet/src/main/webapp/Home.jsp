<%--
  Created by IntelliJ IDEA.
  User: AMRITA
  Date: 01-09-2026
  Time: 15:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% Cookie []cokkie=request.getCookies();
String name=null;
for(Cookie ck : cokkie){
    if("email".equals(ck.getName()))
}
<% String username= "Amrita"; %>
<h1><%=username%> </h1>
</body>
</html>
