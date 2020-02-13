<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@  taglib prefix="fmt"  uri="http://java.sun.com/jsp/jstl/fmt"   %>
	<%@  taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- 引入 css -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/css/bootstrap.css">
<!-- 引入js -->
<script type="text/javascript" src="${pageContext.request.contextPath}/resource/js/jquery-3.2.1.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>


	<input type="button" value="首页" onclick="gopage(${pg.navigateFirstPage})">
	<input type="button" value="上一页" onclick="gopage(${pg.prePage==0?1:pg.prePage})">
	<input type="button" value="下一页" onclick="gopage(${pg.nextPage==0?pg.pages:pg.nextPage})">
	<input type="button" value="尾页" onclick="gopage(${pg.navigateLastPage})">

	当前页 ${pg.pageNum }   总页数 ${pg.pages } 


</body>
</html>