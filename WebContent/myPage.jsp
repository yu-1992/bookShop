<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>MyPage画面</title>
  <link rel="stylesheet" href="css/style.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">

<style>
img{
height: 201px;
}
</style>
</head>
<body>
<header class="header">
	<%@ include file="header.jsp" %>
</header>
	<div class="wrapper">
		<div class="mypage">
			<p>MyPage</p>
		</div>
	<s:if test="myPageList==null">
		<h3>ご購入情報はありません。</h3>
	</s:if>
	<s:elseif test="message==null">
		<h3>ご購入情報は以下になります。</h3>
		<table border="1">
		<tr>
			<th>商品名</th>
			<th>著者</th>
			<th>商品イメージ</th>
			<th>購入個数</th>
			<th>合計金額</th>
			<th>支払い方法</th>
			<th>購入日</th>
		</tr>
	<s:iterator value="myPageList">
			<tr>
				<td><s:property value="itemName"/></td>
				<td><s:property value="itemAuthor"/></td>
				<td><img src=<s:property value="itemImg" /> alt="表紙画像">
				<td><s:property value="totalCount"/></td>
				<td><s:property value="totalPrice"/>円</td>
				<td><s:property value="payment"/></td>
				<td><s:property value="insert_date"/></td>
			</tr>
		</s:iterator>
		</table>
		<s:form action="MyPageAction">
			<input type="hidden" name="deleteFlg" value="1">
			<s:submit value="削除" method="delete"/>
		</s:form>
	</s:elseif>
		<s:if test="message!=null">
			<h3><s:property value="message"/></h3>
		</s:if>

			<div class="text-link">
			<p>Homeへ戻る場合は<a href='<s:url action="HomeAction"/>'>こちら</a></p>
			<p>ログアウトする場合は<a href='<s:url action="LogoutAction"/>'>こちら</a></p>
		</div>
	</div>
</body>
</html>