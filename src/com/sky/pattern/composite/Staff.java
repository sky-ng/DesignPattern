package com.sky.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Staff {
	private int id;
	
	private String name;
	
	private String dept;
	
	private List<Staff> subordinateList;

	public Staff(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		subordinateList = new ArrayList<Staff>();
	}
	
	public void addSubordinate(Staff staff) {
		subordinateList.add(staff);
	}

	public List<Staff> getSubordinateList() {
		return subordinateList;
	}

	@Override
	public String toString() {
		return "Staff [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}

}
