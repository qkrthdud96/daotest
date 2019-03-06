<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>글등록</h1>
<c:url value="/daotest.html" var="ifrom" />
<form action="${ifrom}" method="post">
<ul>
    <li>이름 : <input type="text" name="s_name" placeholder="예>홍길동" required="required" /></li>
    <li>나이 : <input type="text" name="s_age" placeholder="예>27" required="required" /></li>
    <li><button>전송</button></li>
</ul>
</form>

</body>
</html>