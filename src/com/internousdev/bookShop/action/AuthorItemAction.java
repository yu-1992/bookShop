package com.internousdev.bookShop.action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bookShop.dao.AuthorDAO;
import com.internousdev.bookShop.dto.AuthorItemDTO;
import com.internousdev.bookShop.dto.BuyItemDTO;
import com.opensymphony.xwork2.ActionSupport;

public class AuthorItemAction extends ActionSupport implements SessionAware{


	private String authorName;
	 // ログイン情報格納
	private Map<String,Object> session;

	//アイテム情報取得DTO
	private BuyItemDTO buyItemDTO=new BuyItemDTO();

	//アイテム情報格納DTO
	private List<BuyItemDTO> buyItemDTOList=new ArrayList<>();

	//著者情報取得DTO
	private AuthorItemDTO authorItemDTO=new AuthorItemDTO();

	private AuthorDAO authorDAO=new AuthorDAO();

	private List<AuthorItemDTO> authorItemDTOList=new ArrayList<>();
	/**
	 * 著者情報・著者商品情報取得メソッド
	 */
	public String execute() throws SQLException{

		String result=SUCCESS;

		//ログイン状態になければERRORを返してerror.jspを表示
		if(!session.containsKey("login_id")){
		return ERROR;
	}

		//著者情報を取得
		System.out.println(authorName);
		authorItemDTOList=authorDAO.getAuthorInfoDetail(authorName);

		return result;

	}

	public String getAuthorName() {
		return authorName;
	}





	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}





	public Map<String, Object> getSession() {
		return session;
	}





	public void setSession(Map<String, Object> session) {
		this.session = session;
	}





	public BuyItemDTO getBuyItemDTO() {
		return buyItemDTO;
	}





	public void setBuyItemDTO(BuyItemDTO buyItemDTO) {
		this.buyItemDTO = buyItemDTO;
	}





	public List<BuyItemDTO> getBuyItemDTOList() {
		return buyItemDTOList;
	}





	public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList) {
		this.buyItemDTOList = buyItemDTOList;
	}

	public AuthorItemDTO getAuthorItemDTO() {
		return authorItemDTO;
	}

	public void setAuthorItemDTO(AuthorItemDTO authorItemDTO) {
		this.authorItemDTO = authorItemDTO;
	}

	public AuthorDAO getAuthorDAO() {
		return authorDAO;
	}

	public void setAuthorDAO(AuthorDAO authorDAO) {
		this.authorDAO = authorDAO;
	}

	public List<AuthorItemDTO> getAuthorItemDTOList() {
		return authorItemDTOList;
	}

	public void setAuthorItemDTOList(List<AuthorItemDTO> authorItemDTOList) {
		this.authorItemDTOList = authorItemDTOList;
	}




}
