
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BuyItem画面</title>
  <link rel="stylesheet" href="css/style.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
</head>
<header class="header">
	<%@ include file="header.jsp" %>
</header>
	<div class="wrapper">
	<div class="clearfix">
	<div class="main">

<div class="item-info">
	<s:form action="BuyItemAction">


		<s:iterator value="buyItemDTOList">
		<div class="item-block">
			<!-- ID -->
			<input type="hidden" name="ids" value="<s:property value="id"/>"/>

			<!-- 表紙画像-->
			<div class="item-img">
			<img src='<s:property value="itemImg"/>' alt="表紙画像"><input type="hidden" name="itemImgs" value="<s:property value="itemImg"/>"/>
			</div>

			<!-- 商品名 -->
			<div class="item-name">
				<s:property value="itemName"/><br>
					<input type="hidden" name="itemNames" value="<s:property value="itemName"/>" />
			</div>

				<div class="author-name">
				著者:&nbsp;
					<s:property value="itemAuthor"/><br>
					<input type="hidden" name="itemAuthors" value="<s:property value="itemAuthor"/>" />
				</div>

				<div class="item-price">
				値段:&nbsp;
					<s:property value="itemPrice"/><span>円</span>
					<input type="hidden" name="itemPrices" value="<s:property value="itemPrice"/>"/>
				</div>
				<div class="item-count">
				購入個数
					<select name="counts" >
						<option value="0" selected="selected">0</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
					</select>
				</div>

</div>
			</s:iterator>
			<br>
			<div class="pay-form">
			<div class="pay">
					支払い方法
					<input type="radio" name="pay" value="1" checked="checked">現金払い
					<input type="radio" name="pay" value="2">クレジットカード
			<div class="submit">
					<s:submit value="購入"/>
			</div>
			</div>
			</div>
		</s:form>
		</div>
		<div class="form">
			<p>マイページは<a href='<s:url action="MyPageAction"/>'>こちら</a></p>
				<p>前画面に戻る場合は<a href='<s:url action="HomeAction"/>'>こちら</a></p>
		</div>
</div>


		<div class="sidemenu">

	<div class="author-list">
	<div class="author-menu">
		著者<br>
	</div>
		<s:iterator value="authorItemDTOList">
			<div class="author-link">
			<a href='AuthorItemAction?authorName=<s:property value="authorName"/>'><s:property value="authorName"/></a>
			</div>
			</s:iterator>
		</div>
			</div>
			</div>
			</div>



</body>
</html>