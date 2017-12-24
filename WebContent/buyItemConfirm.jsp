<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
  <link rel="stylesheet" href="css/style.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
<title>BuyItemConfirm画面</title>
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
	<div id="main">
		<div id="top">
			<p>BuyItemConfirm</p>
		</div>
		<div>
			<s:form>
				<s:iterator value="buyItemDTOList">
					<tr>
						<td>商品名</td>
						<td><s:property value="itemName"/></td>
						<td>
					</tr>
					<tr>
						<td><img src=<s:property value="itemImg" /> alt="表紙画像">

					</tr>
					<tr>
						<td>著者</td>
						<td><s:property value="itemAuthor"/></td>

					</tr>
					<tr>
						<td>購入個数</td>
						<td><s:property value="count"/></td>
					</tr>
					<tr>
						<td>値段</td>
						<td><s:property value="totalPrice"/></td>

					</tr>
				</s:iterator>

					<tr>
						<td>支払い方法</td>
						<td><s:property value="session.pay"/></td>
					</tr>
					<tr>
					<td><input type="button" value="戻る" onclick="submitAction('HomeAction')" /></td>
					<td><input type="button" value="完了" onclick="submitAction('BuyItemConfirmAction')" /></td>
					</tr>
			</s:form>
		</div>
	</div>
	<div id="footer">

	</div>
	<script>
		function submitAction(url) {
			$('form').attr('action', url);
			$('form').submit();
		}
</script>

</body>
</html>