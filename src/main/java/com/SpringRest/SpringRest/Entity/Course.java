package com.SpringRest.SpringRest.Entity;

import javax.persistence.Id;

@javax.persistence.Entity
public class Course {

	@Id
	private long id;
	private String name;
	private String descroption;

	public Course(long id, String name, String descroption) {
		super();
		this.id = id;
		this.name = name;
		this.descroption = descroption;
	}

	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescroption() {
		return descroption;
	}

	public void setDescroption(String descroption) {
		this.descroption = descroption;
	}

	@Override
	public String toString() {
		return "course [id=" + id + ", name=" + name + ", descroption=" + descroption + "]";
	}

}
