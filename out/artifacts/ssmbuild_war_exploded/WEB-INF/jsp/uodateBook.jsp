<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
<
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>

        <form action="${pageContext.request.contextPath}/book/toupdate" method="post">
            <input type="hidden" name="bookID" value="${bbooks.bookID}">
            <div class="form-group">
                <label>书籍名称</label>
                <input type="text" name="bookName" class="form-control" value="${bbooks.bookName}"  required>
            </div>
            <div class="form-group">
                <label>书籍数量</label>
                <input type="text" name="bookCounts" class="form-control" value="${bbooks.bookCounts}" required>
            </div>
            <div class="form-group">
                <label>书籍描述</label>
                <input type="text" name="detail" class="form-control" value="${bbooks.detail}" required>
            </div>
            <button type="submit" class="btn btn-primary">添加</button>
        </form>
</body>
</html>
