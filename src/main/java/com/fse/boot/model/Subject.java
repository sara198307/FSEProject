package com.fse.boot.model;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Subject")
public class Subject implements Serializable{
	

	private static final long serialVersionUID = -7879078597764206062L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "SUBJECTID")
	private long subjectId;
	
	@Column(name = "SUBTITLE")
	private String subtitle;
	
	@Column(name = "DURATION")
	private int durationInHours;
	
	
	
	public long getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(long subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(String subtitle) {
		this.subtitle = subtitle;
	}
	public int getDurationInHours() {
		return durationInHours;
	}
	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}
	
}
