<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UserCreate画面</title>
  <link rel="stylesheet" href="css/style.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">

</head>
<body>
<header class="header">
	<%@ include file="header.jsp" %>
</header>
<div class="wrapper">
		<div class="login">
			<s:if test="errorMessage!=''">
				<s:property value="errorMessage" escape="false"/>
			</s:if>
			<div class="login-form">
			<table>
				<s:form action="UserCreateConfirmAction">
					<tr>
						<td><label>ログインID:</label></td>
						<td><input type="text" name="loginId" value="" maxlength="16"/></td>
					</tr>
					<tr>
						<td><label>ログインPASS:</label></td>
						<td><input type="password" name="loginPass" value="" maxlength="16"/></td>
					</tr>
					<tr>
						<td><label>ユーザー名:</label></td>
						<td><input type="text" name="userName" value="" maxlength="50"/></td>
					</tr>
					<tr>
						<td><label>メールアドレス:</label></td>
						<td><input type="email" name="userMail" value="" maxlength="50"/></td>
					</tr>
						<s:submit value="登録"/>
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
	<script>

	</script>

</body>
</html>