package com.internousdev.bookShop.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport implements SessionAware {

	// ログイン情報格納
	public Map<String, Object> session;

	/**
	 * ログイン情報セッションの削除メソッド
	 */
	public String execute() {

		String result = SUCCESS;
		session.clear();
		return result;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
