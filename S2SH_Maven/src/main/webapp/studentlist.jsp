<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生列表</title>
</head>
<body>
<h1>学生列表</h1>
<h3><a href="/queryList">刷新数据</a> </h3>
<table>
    <tr>
        <th>序号</th>
        <th>姓名</th>
        <th>头像</th>
        <th>性别</th>
        <th>家乡</th>
        <th>操作</th>
    </tr>
    <%--循环--%>
    <s:iterator value="#request.list" var="s">
        <tr>
            <td><s:property value="#s.id"></s:property> </td>
            <td><s:property value="#s.name"></s:property> </td>
            <td><img src="../s2shimgs/${s.imgUrl}" width="100px" height="100px"/> </td>
            <td><s:property value="#s.sex"></s:property> </td>
            <td><s:property value="#s.home"></s:property> </td>
            <td><a href="#">删除</a><a href="#">修改</a> </td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
