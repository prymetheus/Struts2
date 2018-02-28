<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>struts自定义标签及ognl表达式的使用</title>
</head>
<body>
<div>
    <h1>struts的自定义标签</h1>
    <%--防抖动--%>
    <s:token/>
    <s:actionerror/>
    <s:form action="/ll">
        <s:label>用户名</s:label><s:textfield name="username"/><br>
        <s:label value="用户名"/><s:password name="password"/><br>
        <s:label value="登录信息:"/><s:property value="#session.user.username"/><br>
        <s:submit value="登录"/>
    </s:form>
</div>
</body>
</html>
