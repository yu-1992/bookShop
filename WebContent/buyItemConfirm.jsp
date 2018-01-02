
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
</head>
<body>
<header class="header">
	<%@ include file="header.jsp" %>
</header>
	<div class="wrapper">
	<div class="buyitem-confirm">
		<div class="item-confirm">
			購入確認画面
		</div>
		</div>

				<s:iterator value="buyItemDTOList">
				<div class="item-block">
				<div class="item-img">
					<img src=<s:property value="itemImg" /> alt="表紙画像"><br>
				</div>
				<div class="item-name">
					<s:property value="itemName"/>
				</div>
				<div class="author-name">
					著者:&nbsp;
					<s:property value="itemAuthor"/>
				</div>
				<div class="item-count">
					購入個数:&nbsp;
					<s:property value="count"/>
				</div>

					合計値段:&nbsp;
					<s:property value="totalPrice"/>円

				</div>
				</s:iterator>
				<br>
				<form>
				<div class="pay-form">
				<div class="pay-confirm">
						支払い方法<br>
						<s:property value="session.pay"/><br>
						<br>

				<input type="button" value="戻る" onclick="submitAction('HomeAction')" />
				<input type="button" value="完了" onclick="submitAction('BuyItemConfirmAction')" />
		</div>
		</div>
		</form>
	</div>



<script>
		function submitAction(url) {
			$('form').attr('action', url);
			$('form').submit();
		}
</script>

</body>
</html>