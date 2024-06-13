package com.railworld.MappingTheory;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	@Id
	private int Lid;
	private String Lname;
	
	
	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	
	public Laptop(int lid, String lname) {
		super();
		Lid = lid;
		Lname = lname;
	}
	@Override
	public String toString() {
		return "Laptop [Lid=" + Lid + ", Lname=" + Lname + "]";
	}
	
}
