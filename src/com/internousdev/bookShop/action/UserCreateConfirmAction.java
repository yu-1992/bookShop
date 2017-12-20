package com.internousdev.bookShop.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{

	//ログインID
	private String loginId;

	//ログインPASS
	private String loginPass;

	//ユーザー名
	private String userName;

	//ユーザーMAIL
	private String userMail;

	//登録内容を格納
	private Map<String,Object> session;

	//エラーメッセージ
	private String errorMessage;

	public String execute(){

		String result=SUCCESS;

		if(!(loginId.equals("")&&!(loginPass.equals(""))&&!(userName.equals(""))&&!(userMail.equals("")))){
			session.put("loginId",loginId);
			session.put("loginPass", loginPass);
			session.put("userName",userName);
			session.put("userMail", userMail);
		}else{
			setErrorMessage("未入力の項目があります。");
			result=ERROR;
		}

		return result;

	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPass() {
		return loginPass;
	}

	public void setLoginPass(String loginPass) {
		this.loginPass = loginPass;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserMail() {
		return userMail;
	}

	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
