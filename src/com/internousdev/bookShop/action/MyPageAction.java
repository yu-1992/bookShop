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

		//buyItemDTOList=(ArrayList<BuyItemDTO>) session.get("list");
		//System.out.println("MyPageActionてすと"+buyItemDTOList.size());

		//選択個数文回す
		//for(int i=0; i<buyItemDTOList.size();i++){
			//MyPageDTO myPageDTO=new MyPageDTO();

		//System.out.println("MyPageAction商品ID"+session.get("itemId"));
		System.out.println("MyPageActionログインID"+session.get("login_id").toString());
		//String item_transaction_id=list.get(i).getId()
		String user_master_id=session.get("login_id").toString();

	//マイページリストが空！！！？？？？
		myPageList=myPageDAO.getMyPageUserInfo(user_master_id);
		//myPageDTO.setId(id);
		System.out.println("MyPageActionのテスト");
		System.out.println(myPageList);


		/*
		 * イテレータの取得
		 *もしMyPageDTOListが殻なら
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
		String item_transaction_id=session.get("id").toString();
		String user_master_id=session.get("login_id").toString();

		int res=myPageDAO.buyItemHistoryDelete(item_transaction_id,user_master_id);

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