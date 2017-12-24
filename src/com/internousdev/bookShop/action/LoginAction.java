package com.internousdev.bookShop.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bookShop.dao.AuthorDAO;
import com.internousdev.bookShop.dao.BuyItemDAO;
import com.internousdev.bookShop.dao.LoginDAO;
import com.internousdev.bookShop.dto.AuthorItemDTO;
import com.internousdev.bookShop.dto.BuyItemDTO;
import com.internousdev.bookShop.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ログイン認証処理
 * login.jspからログインID,ログインパスワードを受け取り
 * DBへ問い合わせを行う。
 * ログイン成功なら、全てのアイテム情報と、著者情報を、
 * DAOクラスから取得
 * @author yu
 *
 */
public class LoginAction extends ActionSupport implements SessionAware{

	//ログインID
	private String loginId;

	//ログインパスワード
	private String loginPass;

	//ログイン情報を格納
	public Map<String,Object> session;

	//ログイン情報取得DAO
	private LoginDAO loginDAO=new LoginDAO();

	//ログイン情報格納DTO
	private LoginDTO loginDTO=new LoginDTO();

	//アイテム情報を取得
	private BuyItemDAO buyItemDAO=new BuyItemDAO();

	//BuyItemDTOリストにアイテム情報を格納
	private List<BuyItemDTO> buyItemDTOList=new ArrayList<BuyItemDTO>();

	//著者情報格納DTO
	private AuthorItemDTO authorItemDTO=new AuthorItemDTO();

	//著者情報を取得
	private AuthorDAO authorDAO=new AuthorDAO();

	//AuthorDTOリストに著者情報を格納
	private List<AuthorItemDTO> authorItemDTOList=new ArrayList<AuthorItemDTO>();



	//実行メソッド
	public String execute(){
		String result=ERROR;

		//ログイン実行
		loginDTO=loginDAO.getLoginUserInfo(loginId, loginPass);

		//ログイン情報をセッションに保存
		session.put("loginUser",loginDTO);

		//ログイン情報を比較
		if(((LoginDTO)session.get("loginUser")).isLoginFlg()){
			result=SUCCESS;

		//アイテム情報を取得
			buyItemDTOList=buyItemDAO.getBuyItemInfo();

		//ID、商品情報をセッションに保存
			session.put("login_id",loginDTO.getLoginId());
			session.put("buyItemDTOList",buyItemDTOList);

		//著者情報を取得
			authorItemDTOList=authorDAO.getAuthorInfo();

		//著者情報をセッションに保存
			session.put("authorItemDTOList",authorItemDTOList);

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


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public LoginDAO getLoginDAO() {
		return loginDAO;
	}


	public void setLoginDAO(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}


	public LoginDTO getLoginDTO() {
		return loginDTO;
	}


	public void setLoginDTO(LoginDTO loginDTO) {
		this.loginDTO = loginDTO;
	}


	public BuyItemDAO getBuyItemDAO() {
		return buyItemDAO;
	}


	public void setBuyItemDAO(BuyItemDAO buyItemDAO) {
		this.buyItemDAO = buyItemDAO;
	}

	public List<BuyItemDTO> getBuyItemDTOList() {
		return buyItemDTOList;
	}


	public void setBuyItemDTOList(List<BuyItemDTO> buyItemDTOList) {
		this.buyItemDTOList = buyItemDTOList;
	}




	public AuthorDAO getAuthorDAO() {
		return authorDAO;
	}


	public void setAuthorDAO(AuthorDAO authorDAO) {
		this.authorDAO = authorDAO;
	}


	public AuthorItemDTO getAuthorItemDTO() {
		return authorItemDTO;
	}


	public void setAuthorItemDTO(AuthorItemDTO authorItemDTO) {
		this.authorItemDTO = authorItemDTO;
	}


	public List<AuthorItemDTO> getAuthorItemDTOList() {
		return authorItemDTOList;
	}


	public void setAuthorItemDTOList(List<AuthorItemDTO> authorItemDTOList) {
		this.authorItemDTOList = authorItemDTOList;
	}




}
