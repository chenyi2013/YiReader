package com.kevin.bean;

public class Articles {

	private int type;
	private ArticleInfo articleInfo;

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public ArticleInfo getArticleInfo() {
		return articleInfo;
	}

	public void setArticleInfo(ArticleInfo articleInfo) {
		this.articleInfo = articleInfo;
	}

	@Override
	public String toString() {
		return "Articles [type=" + type + ", articleInfo=" + articleInfo + "]";
	}

}
