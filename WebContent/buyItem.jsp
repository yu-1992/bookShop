<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BuyItem画面</title>
<style>
img{
width: 100px;
hight: 150px;
}
.right{
float:right
}
.left{
float:left
}
</style>
</head>
<body>
	<div id="header">

	</div>
	<div id="main">
		<div id="top">
			<p>BuyItem</p>
		</div>
	</div>
	<div class="right">
	<s:form action="BuyItemAction">
		<table>
		<s:iterator value="buyItemDTOList">
			<tr>
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
					<select name="count" >
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
			<div>
				<p>前画面に戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
				<p>マイページは<a href='<s:url action="MyPageAction"/>'>こちら</a></p>
			</div>
		</div>
		<div class="left">
			<table>
			<tr>
			<td>著者</td>
			</tr>
			<s:iterator value="buyItemDTOList">
			<tr>
			<td><s:property value="itemAuthor"/><br></td>
			</tr>
			</s:iterator>
			</table>
		</div>
		<div id="footer">

		</div>

</body>
</html>