package com.internousdev.bookShop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.internousdev.bookShop.dto.LoginDTO;
import com.internousdev.bookShop.util.DBConnector;

public class LoginDAO {

	private DBConnector db=new DBConnector();

	private Connection con=db.getConnection();

	private LoginDTO loginDTO=new LoginDTO();

	/**
	 * ログインユーザ情報取得メソッド
	 *
	 */
	public LoginDTO getLoginUserInfo(String loginId,String loginPass){

		String sql="select * from login_user_transaction where login_id=? and login_pass=?";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1, loginId);
			ps.setString(2,loginPass);

			ResultSet rs=ps.executeQuery();

			if(rs.next()){
				loginDTO.setLoginId(rs.getString("login_id"));
				loginDTO.setLoginPass(rs.getString("login_pass"));
				loginDTO.setUserName(rs.getString("user_name"));
				loginDTO.setUserMail(rs.getString("user_mail"));

				if(!(rs.getString("login_id").equals(null))){
					loginDTO.setLoginFlg(true);
				}
			}

		}catch(Exception e){
			e.printStackTrace();
		}

		return loginDTO;
	}

	public LoginDTO getLoginDTO(){
		return loginDTO;
	}
}
