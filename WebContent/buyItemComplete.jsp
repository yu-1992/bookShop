<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BuyItemComplete画面</title>
  <link rel="stylesheet" href="css/style.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
</head>
<body>
<header class="header">
	<%@ include file="header.jsp" %>
</header>
<div class="wrapper">
 <div class="buyitem-complete">
	<div class="buy-complete">
		購入手続きが完了致しました。
	</div>
	<div class="buy-complete-link">
			<a href='<s:url action="MyPageAction"/>'>マイページ</a><span>から購入履歴の確認が可能です。</span>
			<p>Homeへ戻る場合は<a href='<s:url action="HomeAction"/>'>こちら</a></p>
	</div>
	</div>
	</div>
</body>
</html>