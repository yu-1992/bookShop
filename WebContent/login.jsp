<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login画面</title>
  <link rel="stylesheet" href="css/style.css">
  <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
</head>
<body>
<header class="header">
	<%@ include file="header.jsp" %>
</header>
	<div class="wrapper">
	<div class="login">

			<h4>商品を購入する際にはログインをお願いします。</h4>
			<div class="login-form">
			<s:form action="LoginAction" onSubmit="return checkForm()">
				<s:textfield name="loginId" placeholder="ログインID"/>
				<s:password name="loginPass"  placeholder="ログインPASS"/>
				<s:submit value="ログイン"/>
			</s:form>
			</div>
			<br/>
			<div class="text-link">
				<p>新規ユーザー登録は<a href='<s:url action="UserCreateAction"/>'>こちら</a></p>
				<p>Homeへ戻る場合は<a href='<s:url action="GoHomeAction"/>'>こちら</a></p>
			</div>
	</div>
</div>
	<div id="footer">
	</div>
<script>
/*文字数チェック(16文字以内)
 * falseの場合、アラート表示
 *	結果を送信しない
 */
	function checkForm(){
	if(document.LoginAction.loginId.value==""||document.LoginAction.loginPass.value==""){
		window.alert("未入力の項目があります");
		return false;
	}else if(document.LoginAction.loginId.value.length>16){
			window.alert("ログインIDは16文字以内です");
			return false;
		}
	else if(document.LoginAction.loginPass.value.length>=16){
		window.alert("ログインパスワードは16文字以内です");
		return false;
	}
	else{return true;
	}
	}

</script>
</body>
</html>