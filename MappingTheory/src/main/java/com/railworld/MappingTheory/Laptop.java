package com.railworld.MappingTheory;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Laptop {
	@Id
	private int id;
	private String Lname;
	
	
	public int getId() {
		return id;
	}
	public void setId(int Id) {
		id = Id;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	
	@Override
	public String toString() {
		return "Laptop [Lid=" + id + ", Lname=" + Lname + "]";
	}
	
}
