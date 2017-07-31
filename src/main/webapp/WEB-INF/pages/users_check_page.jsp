<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Master
  Date: 28.07.2017
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
      <spring:form modelAttribute="UserFromServer" method="post" action="/user-system/users/check">
          <spring:input path="login"/>
          <spring:input path="password"/>
          <spring:button>Check user</spring:button>
      </spring:form>
</body>
</html>
