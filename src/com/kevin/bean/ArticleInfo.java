package com.kevin.bean;

import java.util.ArrayList;

public class ArticleInfo {

	private String itemID;
	private String title;
	private String source;
	private String sourceID;
	private long time;
	private int type;
	private int commentCount;
	private int praiseCount;
	private String template;
	private String summary;
	private ArrayList<String> imagesArray;
	private int statusType;
	private String style;
	private String url;
	private int coverW;
	private int coverH;

	public String getItemID() {
		return itemID;
	}

	public void setItemID(String itemID) {
		this.itemID = itemID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSourceID() {
		return sourceID;
	}

	public void setSourceID(String sourceID) {
		this.sourceID = sourceID;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getCommentCount() {
		return commentCount;
	}

	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}

	public int getPraiseCount() {
		return praiseCount;
	}

	public void setPraiseCount(int praiseCount) {
		this.praiseCount = praiseCount;
	}

	public String getTemplate() {
		return template;
	}

	public void setTemplate(String template) {
		this.template = template;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public ArrayList<String> getImagesArray() {
		return imagesArray;
	}

	public void setImagesArray(ArrayList<String> imagesArray) {
		this.imagesArray = imagesArray;
	}

	public int getStatusType() {
		return statusType;
	}

	public void setStatusType(int statusType) {
		this.statusType = statusType;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public int getCoverW() {
		return coverW;
	}

	public void setCoverW(int coverW) {
		this.coverW = coverW;
	}

	public int getCoverH() {
		return coverH;
	}

	public void setCoverH(int coverH) {
		this.coverH = coverH;
	}

	@Override
	public String toString() {
		return "ArticleInfo [itemID=" + itemID + ", title=" + title
				+ ", source=" + source + ", sourceID=" + sourceID + ", time="
				+ time + ", type=" + type + ", commentCount=" + commentCount
				+ ", praiseCount=" + praiseCount + ", template=" + template
				+ ", summary=" + summary + ", imagesArray=" + imagesArray
				+ ", statusType=" + statusType + ", style=" + style + ", url="
				+ url + ", coverW=" + coverW + ", coverH=" + coverH + "]";
	}

}
