<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>新增学生</title>
</head>
<body>
<h1>请天下第一程序员新增学生</h1>
<s:form action="/add" method="POST" enctype="multipart/form-data">
    <s:textfield name="name" label="姓名" ></s:textfield><br/>
    <s:radio name="sex" label="性别" list="#{'男':'男','女':'女'}" ></s:radio><br/>
    <s:select label="家乡" list="#{'北京':'北京','上海':'上海'}" name="home" ></s:select><br/>
    <s:file label="头像" name="headerImg" ></s:file><br/>
    <s:token></s:token>
    <s:submit value="新增学生"></s:submit>
</s:form>
</body>
</html>
