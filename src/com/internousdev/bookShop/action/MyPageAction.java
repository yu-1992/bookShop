package com.internousdev.bookShop.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bookShop.dao.MyPageDAO;
import com.internousdev.bookShop.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{

	/**
	 * ログイン情報を格納
	 */
	private Map<String,Object> session;

	/**
	 * マイページ情報取得DAO
	 */
	private MyPageDAO myPageDAO=new MyPageDAO();

	/**
	 * マイページ情報格納DTO
	 */
	private List<MyPageDTO> myPageList=new ArrayList<MyPageDTO>();

	/**
	 * 削除フラグ
	 */
	private String deleteFlg;

	/**
	 * 削除メッセージ
	 */
	private String message;



	/**
	 * 商品履歴取得メソッド
	 *
	 */

	public String execute() throws SQLException{

		//ログイン状態になければERRORを返してerror.jspを表示
		if(!session.containsKey("login_id")){
		return ERROR;
	}

	//商品履歴を削除しない場合
	if(deleteFlg==null){
		/*
		 * ログインIDをセッションから取得し、
		 * 取得したIDを使って商品履歴取得メソッドを起動
		 */
		String user_master_id=session.get("login_id").toString();
		myPageList=myPageDAO.getMyPageUserInfo(user_master_id);

		/*
		 * イテレータの取得
		 *もしMyPageDTOListが空なら
		 *myPageList=null
		 *myPage.jspで記述の、ご購入情報はありません。が表示
		 *
		 */
		Iterator<MyPageDTO> it=myPageList.iterator();
		if(!(it.hasNext())){
			myPageList=null;
		}
		//商品履歴を削除する場合
	}else if(deleteFlg.equals("1")){
		delete();
	}

	String result=SUCCESS;
	return result;
}

/**
 * 商品履歴削除メソッド
 */
	public void delete() throws SQLException{
		String user_master_id=session.get("login_id").toString();

		int res=myPageDAO.buyItemHistoryDelete(user_master_id);

		//削除された数が1以上なら削除成功
		if(res>0){
			myPageList=null;
			setMessage("商品情報を正しく削除しました。");
		}else if(res==0){
			setMessage("商品情報の削除に失敗しました。");
		}
}

public Map<String, Object> getSession() {
	return session;
}

public void setSession(Map<String, Object> session) {
	this.session = session;
}

public MyPageDAO getMyPageDAO() {
	return myPageDAO;
}

public void setMyPageDAO(MyPageDAO myPageDAO) {
	this.myPageDAO = myPageDAO;
}

public List<MyPageDTO> getMyPageList() {
	return myPageList;
}

public void setMyPageList(List<MyPageDTO> myPageList) {
	this.myPageList = myPageList;
}

public String getDeleteFlg() {
	return deleteFlg;
}

public void setDeleteFlg(String deleteFlg) {
	this.deleteFlg = deleteFlg;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
}