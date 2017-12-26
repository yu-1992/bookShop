<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AuthorItem画面</title>
  <link rel="stylesheet" href="css/style.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
<style>
img{
width: 100px;
hight: 150px;
}
</style>
</head>
<body>
	<header class="header">
	<%@ include file="header.jsp" %>
	</header>
	<div class="wrapper">
	 <div class="userAccount">
	 	<div class="account-logo"><i class="fa fa-key"></i></div>
	 	<ul class="userAccount-table">
	 		<li class="id">ログインID:<s:property value="session.login_id"/></li>
			<li class="name">ユーザー名:<s:property value="session.userName"/></li>
			<li class="mail">メールアドレス:<s:property value="session.userMail"/></li>
		</ul>
	</div>
	<div class="text-link">
	<p>Homeへ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
  	</div>
   </div>
</body>
</html>