package com.fse.boot.model;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class Book implements Serializable {

	
	private static final long serialVersionUID = 7624505964698021198L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "BOOKID")
	private long bookId;
	
	@Column(name = "TITLE")
	private String title;
	
	@Column(name = "PRICE")
	private double price;
	
	@Column(name = "VOLUME")
	private int volume;
	
	@Column(name = "PUBLISHDATE")
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
