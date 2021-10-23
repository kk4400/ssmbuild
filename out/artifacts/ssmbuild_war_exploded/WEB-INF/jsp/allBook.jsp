<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->

    <script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->

    <script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
<div class="container">
    <div class="row clearfix">
       <div class="col-md-12 column">
           <div class="page-header">
               <h1>
                   <small>书籍列表---显示书籍</small>
               </h1>
           </div>
       </div>
        <div class="row">
          <div class="col-md-4 column ">
<%--              toAddBook--%>
              <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/toAddBook">新增书籍</a>
              <a class="btn btn-primary" href="${pageContext.request.contextPath}/book/allbook">显示全部书籍</a>
          </div>
            <div class="col-md-4 column ">
                <%--              查询书籍--%>
               <form class="form-inline" action="${pageContext.request.contextPath}/book/queryBook" method="post" style="float: right">
                   <span style="color: red;font-weight: bold">${error}</span>
                   <input type="text" name="BookName" class="form-control" placeholder="请输入要查询的书籍名称">
                   <input type="submit" value="提交" class="btn btn-primary">
               </form>
            </div>
        </div>
    </div>

    <div class="row clearfix">
        <table class="table table-hover" table-striped>
            <thead>
                 <tr>
                     <th>书籍编号</th>
                     <th>书籍名称</th>
                     <th>书籍数量</th>
                     <th>书籍详情</th>
                     <th>操作</th>
                 </tr>
            </thead>
            <tbody>
            <c:forEach items="${list}" var="book">
                <tr>
                    <th>${book.bookID}</th>
                    <th>${book.bookName}</th>
                    <th>${book.bookCounts}</th>
                    <th>${book.detail}</th>
                    <th>
                        <a href="${pageContext.request.contextPath}/book/toupdatepage/${book.bookID}" >修改</a>
                        &nbsp;|&nbsp;
                       <a href="${pageContext.request.contextPath}/book/del/${book.bookID}">删除</a>
                    </th>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>

</body>
</html>
