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
	<div id="main">
		<p>AuthorItem</p>
	</div>

		<table>
		<tr>
		<td><span>著者情報</span></td>
		</tr>

		<tr><td><s:property value="authorItemDTOList.get(0).authorName"/></td></tr>
		<tr><td><s:property value="authorItemDTOList.get(0).authorYear"/></td></tr>
		<tr><td><s:property value="authorItemDTOList.get(0).authorBiography"/></td></tr>

	<s:form action="BuyItemAction">

		<s:iterator value="authorItemDTOList">

			<tr>
			<!-- ID -->
			<td><input type="hidden" name="ids" value="<s:property value="id"/>"/></td>
				<td>
					<span>商品名</span>
				</td>
				<td>
					<s:property value="itemName"/><br>
					<input type="hidden" name="itemNames" value="<s:property value="itemName"/>" />
				</td>
			</tr>
			<!-- 表紙画像-->
			<tr>
				<td><img src='<s:property value="itemImg"/>' alt="表紙画像">
					<input type="hidden" name="itemImgs" value="<s:property value="itemImg"/>"/>
			</tr>
				<td>
					<span>著者</span>
				</td>
				<td>
					<s:property value="authorName"/><br>
					<input type="hidden" name="itemAuthors" value="<s:property value="authorName"/>" />
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
		</s:form>
		</table>





</body>
</html>