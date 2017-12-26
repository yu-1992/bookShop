<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserCreateComplete画面</title>
  <link rel="stylesheet" href="css/style.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
</head>
<body>
<header class="header">
	<%@ include file="header.jsp" %>
</header>
	<div class="wrapper">
		<div class="create-complete">
		<div class="finish">


				<a href='<s:url action="HomeAction" />'>ユーザーの登録が完了しました。<br>ログインへ</a>

		</div>
		</div>
	</div>
	<div id="footer">

	</div>
</body>
</html>