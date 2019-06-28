package com.fse.boot.bean;
import java.io.Serializable;
import java.util.Set;


public class SubjectBean implements Serializable{
	

	private static final long serialVersionUID = -7879078597764206062L;
	private long subjectId;
	private String subtitle;
	private int durationInHours;
	
	private Set<BookBean> references ;
	
	
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
	public Set<BookBean> getReferences() {
		return references;
	}
	public void setReferences(Set<BookBean> references) {
		this.references = references;
	}

	
}
