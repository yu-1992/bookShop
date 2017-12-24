package com.internousdev.bookShop.dto;

/**
 * ログイン情報一覧
 * @author yuu
 *
 */

public class LoginDTO {

	//ID
	private String loginId;

	//パスワード
	private String loginPass;

	//ユーザー名
	private String userName;

	//ユーザーメール
	private String userMail;

	//ログインフラグ
	private boolean loginFlg=false;


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

	public boolean isLoginFlg() {
		return loginFlg;
	}

	public void setLoginFlg(boolean loginFlg) {
		this.loginFlg = loginFlg;
	}




}
