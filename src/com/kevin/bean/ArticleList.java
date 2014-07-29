package com.kevin.bean;

import java.util.ArrayList;

public class ArticleList {
	private int flag;
	private int resCode;
	private ArrayList<Articles> list;

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public int getResCode() {
		return resCode;
	}

	public void setResCode(int resCode) {
		this.resCode = resCode;
	}

	public ArrayList<Articles> getList() {
		return list;
	}

	public void setList(ArrayList<Articles> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "ArticleList [flag=" + flag + ", resCode=" + resCode + ", list="
				+ list + "]";
	}

}
