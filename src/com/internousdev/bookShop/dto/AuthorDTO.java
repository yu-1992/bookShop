package com.internousdev.bookShop.dto;

/**
 * 著者情報一覧
 * @author yu
 *
 */

public class AuthorDTO {

	//id
	private int id;

	//著者
	private String authorName;

	//出生
	private String authorYear;

	//略歴
	private String authorBiography;

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorYear() {
		return authorYear;
	}

	public void setAuthorYear(String authorYear) {
		this.authorYear = authorYear;
	}

	public String getAuthorBiography() {
		return authorBiography;
	}

	public void setAuthorBiography(String authorBiography) {
		this.authorBiography = authorBiography;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


}
