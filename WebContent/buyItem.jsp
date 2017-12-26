
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
<style>
img{
width: 100px;
hight: 150px;
}
.left{
float:left
}
</style>
</head>
<header class="header">
	<%@ include file="header.jsp" %>
</header>
	<div class="wrapper">
	<div class="clearfix">
	<div class="main">

<div class="item-info">
	<s:form action="BuyItemAction">

		<table>
		<s:iterator value="buyItemDTOList">

			<tr>
				<td>
				<!-- ID -->
			<td><input type="hidden" name="ids" value="<s:property value="id"/>"/></td>
				<td>
			</tr>
			<tr>
				<td><span>商品名</span></td>
				<td><s:property value="itemName"/><br>
					<input type="hidden" name="itemNames" value="<s:property value="itemName"/>" />
				</td>
			</tr>
			<!-- 表紙画像-->
			<tr>
				<td><img src='<s:property value="itemImg"/>' alt="表紙画像"><input type="hidden" name="itemImgs" value="<s:property value="itemImg"/>"/></td>
			</tr>
				<td>
					<span>著者</span>
				</td>
				<td>
					<s:property value="itemAuthor"/><br>
					<input type="hidden" name="itemAuthors" value="<s:property value="itemAuthor"/>" />
				</td>
			<tr>
				<td>
					<span>値段</span>
				</td>
				<td>
					<s:property value="itemPrice"/><span>円</span>
					<input type="hidden" name="itemPrices" value="<s:property value="itemPrice"/>"/>
				</td>
			</tr>

			<tr>
				<td>

					<span>購入個数</span>
				</td>
				<td>


					<select name="counts" >
						<option value="0" selected="selected">0</option>
						<option value="1">1</option>
						<option value="2">2</option>
						<option value="3">3</option>
						<option value="4">4</option>
						<option value="5">5</option>
					</select>

				</td>
			</tr>

			</s:iterator>

						<tr>
				<td>
					<span>支払い方法</span>
				</td>
				<td>
					<input type="radio" name="pay" value="1" checked="checked">現金払い
					<input type="radio" name="pay" value="2">クレジットカード
				</td>
			</tr>
			<tr>
				<td>
					<s:submit value="購入"/>
				</td>
			</tr>
		</table>
		</s:form>

		</div>
</div>


		<div class="sidemenu">

		<table>
			<tr>
			<th>著者</th>
			</tr>
		<s:iterator value="authorItemDTOList">
			<tr>
				<td><a href='AuthorItemAction?authorName=<s:property value="authorName"/>'><s:property value="authorName"/></a></td>
			</s:iterator>
			</table>
		</div>
			</div>
			</div>
	<div class="text-link">
	<p>マイページは<a href='<s:url action="MyPageAction"/>'>こちら</a></p>
				<p>前画面に戻る場合は<a href='<s:url action="HomeAction"/>'>こちら</a></p>
			</div>

</body>
</html>