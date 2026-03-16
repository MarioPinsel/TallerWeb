<%-- 
    Document   : response
    Created on : 28 feb 2026, 16:52:06
    Author     : User
--%>



<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:useBean id="mybean" scope="session" class="org.mypackage.hello.PersonInfo" />
        <jsp:useBean id="clock" class="java.util.Date" />
        <jsp:setProperty name="mybean" property="name"/>
        <jsp:setProperty name="mybean" property="birthDate"/>
        <jsp:setProperty name="mybean" property="age"/>
        <h1>Hello, <jsp:getProperty name="mybean" property="name" />!</h1>
        <h1> Your age is: <jsp:getProperty name="mybean" property="age"/> </h1>

        <c:choose>
            <c:when test="${clock.hours < 12 && clock.hours > 0}"> Buenos días </c:when>
            <c:when test="${clock.hours > 12 && clock.hours < 18}"> Buenas tardes </c:when>
            <c:otherwise> Buenas noches </c:otherwise>
        </c:choose>


    </body>
</html>