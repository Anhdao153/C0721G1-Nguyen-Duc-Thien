<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 6/28/2021
  Time: 3:52 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1>Products</h1>
<p>
    <a href="/products?action=create">Create new Products</a>
</p>
<p>
    <a href="/products?action=find">Find Products</a>
</p>

<table border="1">
    <tr>
        <td>Name product</td>
        <td>Brand </td>
        <td>Price</td>
        <td>Edit</td>
        <td>Delete</td>
    </tr>
    <c:forEach items='${requestScope["products"]}' var="product">
        <tr>
            <td><a href="/products?action=view&id=${product.getId()}">${product.getNameProduct()}</a></td>
            <td>${product.getBrandProduct()}</td>
            <td>${product.getPrice()}</td>
            <td><a href="/products?action=edit&id=${product.getId()}">edit</a></td>
            <td><a href="/products?action=delete&id=${product.getId()}">delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
