<%--
  Created by IntelliJ IDEA.
  User: Fly0923
  Date: 2021/6/12
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form>
    <table width="100%" border="1">

        <tr>
            <td>商品名称</td>
            <td>${item.name}</td>
        </tr>
        <tr>
            <td>商品价格</td>
            <td>${item.price}</td>
        </tr>
        <tr>
            <td>生产日期</td>
            <td><fmt:formatDate value="${item.createtime}" pattern="yyyy-MM-dd HH:mm:ss" /></td>
        </tr>
        <tr>
            <td>商品简介</td>
            <td>${item.name}</td>
        </tr>


    </table>

</form>

</body>
</html>
