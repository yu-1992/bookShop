package com.internousdev.bookShop.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.bookShop.dto.AuthorDTO;
import com.internousdev.bookShop.util.DBConnector;

public class AuthorDAO {

	private DBConnector db=new DBConnector();

	private Connection con=db.getConnection();

	private AuthorDTO authorDTO;

	private List<AuthorDTO> authorDTOList;


	/**
	 * 著者情報取得メソッド
	 * @return
	 */
	private List<AuthorDTO> getAuthorInfo(){
		String sql="select id,author_name,author_year,author_biography";

		try{
			PreparedStatement ps=con.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();


			authorDTOList=new ArrayList<AuthorDTO>();

			while(rs.next()){

				authorDTO=new AuthorDTO();

				authorDTO.setId(rs.getInt("id"));
				authorDTO.setAuthorName(rs.getString("author_name"));
				authorDTO.setAuthorYear(rs.getString("author_year"));
				authorDTO.setAuthorBiography(rs.getString("author_biography"));
				authorDTOList.add(authorDTO);

				System.out.println(authorDTO.getId());
			}


		}
		authorDTO.setId(rs.getInt("id"));

	}


	public AuthorDTO getAuthorDTO() {
		return authorDTO;
	}


	public void setAuthorDTO(AuthorDTO authorDTO) {
		this.authorDTO = authorDTO;
	}


	public List<AuthorDTO> getAuthorDTOList() {
		return authorDTOList;
	}


	public void setAuthorDTOList(List<AuthorDTO> authorDTOList) {
		this.authorDTOList = authorDTOList;
	}

}
