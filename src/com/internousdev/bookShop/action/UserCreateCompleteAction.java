package com.internousdev.bookShop.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bookShop.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	private String loginId;

	private String loginPass;

	private String userName;

	private String userMail;

	//登録内容を格納
	public Map<String,Object> session;

	private UserCreateCompleteDAO userCreateCompleteDAO=new UserCreateCompleteDAO();

	public String execute() throws SQLException{

		/**
		 * 新規ユーザー作成メソッドに、セッションで受け取った
		 * 各値をセットして実行
		 */
		System.out.println(session.get("loginId"));
		System.out.println(session.get("loginPass"));
		System.out.println(session.get("userName"));
		System.out.println(session.get("userMail"));

		userCreateCompleteDAO.createUser(session.get("loginId").toString(),session.get("loginPass").toString(),session.get("userName").toString(),session.get("userMail").toString());

		String result=SUCCESS;

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

	public UserCreateCompleteDAO getUserCreateCompleteDAO() {
		return userCreateCompleteDAO;
	}

	public void setUserCreateCompleteDAO(UserCreateCompleteDAO userCreateCompleteDAO) {
		this.userCreateCompleteDAO = userCreateCompleteDAO;
	}




}
