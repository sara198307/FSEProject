package com.fse.boot.bean;
import java.io.Serializable;
import java.util.Date;

public class BookBean implements Serializable {

	
	private static final long serialVersionUID = 7624505964698021198L;
	private long bookId;
	private String title;
	private double price;
	private int volume;
	private Date publishDate;
	
	
	public long getBookId() {
		return bookId;
	}
	public void setBookId(long bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	
	
}
