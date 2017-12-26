<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserCreateConfirm画面</title>
  <link rel="stylesheet" href="css/style.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
</head>
<body>
<header class="header">
	<%@ include file="header.jsp" %>
</header>
<div class="wrapper">
	<div class="login">
			<div class="create-form">
			<table>
				<s:form action="UserCreateCompleteAction">
				<tr class="box">
					<td><label>ログインID:</label></td>
					<td><s:property value="loginId" escape="false"/></td>
				</tr>
				<tr class="box">
					<td><label>ログインPASS:</label></td>
					<td><s:property value="loginPass" escape="false"/></td>
				</tr>
				<tr class="box">
					<td><label>ユーザー名:</label></td>
					<td><s:property value="userName" escape="false"/></td>
				</tr>
				<tr class="box">
					<td><label>メールアドレス:</label></td>
					<td><s:property value="userMail" escape="false"/></td>
				</tr>
				<tr>
					<td><s:submit value="完了"/></td>
				</s:form>
			</table>

	</div>
	<div class="text-link">
				<span>前画面に戻る場合は</span><a href='<s:url action="HomeAction"/>'>こちら</a>
			</div>
	</div>
</div>
		<div id="footer">

		</div>

</body>
</html>