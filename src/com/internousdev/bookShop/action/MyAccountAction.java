package com.internousdev.bookShop.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class MyAccountAction extends ActionSupport implements SessionAware{


	//ログイン情報を格納
	private Map<String,Object> session;







	public String execute(){
		String result=SUCCESS;

		if(session.get("login_id")==null){
			result=ERROR;
		}
		else{
			result=SUCCESS;
		}
		return result;



	}




	public Map<String, Object> getSession() {
		return session;
	}




	public void setSession(Map<String, Object> session) {
		this.session = session;
	}










}
