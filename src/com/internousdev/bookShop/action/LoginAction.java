package com.internousdev.bookShop.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.bookShop.dao.AuthorDAO;
import com.internousdev.bookShop.dao.BuyItemDAO;
import com.internousdev.bookShop.dao.LoginDAO;
import com.internousdev.bookShop.dto.AuthorDTO;
import com.internousdev.bookShop.dto.BuyItemDTO;
import com.internousdev.bookShop.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * ログイン認証処理
 * Login.jspからログインID,ログインパスワードを受け取り
 * DBへ問い合わせを行う
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
	private AuthorDTO authorDTO=new AuthorDTO();


	//著者情報を取得
	private AuthorDAO authorDAO=new AuthorDAO();

	//AuthorDTOリストに著者情報を格納
	private List<AuthorDTO> authorDTOList=new ArrayList<AuthorDTO>();






	//実行メソッド
	public String execute(){
		String result=ERROR;

		//ログイン実行
		loginDTO=loginDAO.getLoginUserInfo(loginId, loginPass);

		session.put("loginUser",loginDTO);

		//ログイン情報を比較
		if(((LoginDTO)session.get("loginUser")).isLoginFlg()){
			result=SUCCESS;

		//アイテム情報を取得
			buyItemDTOList=buyItemDAO.getBuyItemInfo();
			session.put("login_id",loginDTO.getLoginId());
			//session.put("id",buyItemDTO.getId());
			//session.put("buyItem_name",buyItemDTO.getItemName());
			//session.put("buyItem_author",buyItemDTO.getItemAuthor());
			//session.put("buyItem_price",buyItemDTO.getItemPrice());
			session.put("buyItemDTOList",buyItemDTOList);
			System.out.println(buyItemDTOList.get(0).getItemName());

		//著者情報を取得
			authorDTOList=authorDAO.getAuthorInfo();
			//session.put("authorId",authorDTO.getId());
			session.put("authorDTOList",authorDTOList);
			System.out.println(authorDTOList.get(0).getAuthorName());


			return result;
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




	public List<AuthorDTO> getAuthorDTOList() {
		return authorDTOList;
	}


	public void setAuthorDTOList(List<AuthorDTO> authorDTOList) {
		this.authorDTOList = authorDTOList;
	}


	public AuthorDAO getAuthorDAO() {
		return authorDAO;
	}


	public void setAuthorDAO(AuthorDAO authorDAO) {
		this.authorDAO = authorDAO;
	}


	public AuthorDTO getAuthorDTO() {
		return authorDTO;
	}


	public void setAuthorDTO(AuthorDTO authorDTO) {
		this.authorDTO = authorDTO;
	}



}
