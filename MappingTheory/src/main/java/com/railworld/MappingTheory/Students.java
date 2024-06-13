package com.railworld.MappingTheory;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Students {
	@Id
	private int id;
	private String Sname;
	private int marks;
	
	@OneToOne
	private Laptop lap;
	
	
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Students(int id, String sname, int marks, Laptop lap) {
		super();
		this.id = id;
		Sname = sname;
		this.marks = marks;
		this.lap = lap;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	public Laptop getLap() {
		return lap;
	}
	public void setLap(Laptop lap) {
		this.lap = lap;
	}
	
	@Override
	public String toString() {
		return "Students [id=" + id + ", Sname=" + Sname + ", marks=" + marks + ", lap=" + lap + "]";
	}
	
}
