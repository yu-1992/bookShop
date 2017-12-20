package com.internousdev.bookShop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.bookShop.util.DBConnector;
import com.internousdev.bookShop.util.DateUtil;




public class UserCreateCompleteDAO {

	private DBConnector db=new DBConnector();

	private Connection con=db.getConnection();

	//現在時刻取得
	private DateUtil dateUtil=new DateUtil();

	private String sql="insert into login_user_transaction(login_id,login_pass,user_name,user_mail,insert_date) values(?,?,?,?,?)";

	/*
	 * 新規ユーザー作成メソッド
	 */
	public void createUser(String loginId,String loginPass,String userName,String userMail)throws SQLException{


	try{
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,loginId);
		ps.setString(2,loginPass);
		ps.setString(3,userName);
		ps.setString(4,userMail);
		ps.setString(5,dateUtil.getDate());

		ps.execute();

	}catch(Exception e){
		e.printStackTrace();
	}finally{
		con.close();
	}
}
}